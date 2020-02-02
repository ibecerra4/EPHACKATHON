import urllib3
import requests
import ssl
import re

from requests.adapters import HTTPAdapter
from requests.packages.urllib3.poolmanager import PoolManager
from bs4 import BeautifulSoup


class MyAdapter(HTTPAdapter):
    def init_poolmanager(self, connections, maxsize, block=False):
        self.poolmanager = PoolManager(num_pools=connections,
                                       maxsize=maxsize,
                                       block=block,
                                       ssl_version=ssl.PROTOCOL_TLSv1)


def extractUserInfo(userURL,adapter):
    s = requests.Session()
    print(userURL)
    s.mount(userURL, adapter)
    r = s.get(url)
    src=r.content

    soup = BeautifulSoup(src, 'lxml')

    title = soup.title.get_text()
    links = soup.find("p").get_text()
    print(title)
    print()
    print(links)
    print("\n")
    return 

############################################################
#MAIN####
######################################################

url='https://www.elpasotexas.gov/government'


s = requests.Session()
s.mount(url, MyAdapter())

r = s.get(url)
src=r.content

soup = BeautifulSoup(src, 'lxml')

title = soup.find_all('p','electTitle',limit=9)

names = soup.find_all("p",'electName', limit=9)

'''
for link in soup.find_all('a',attrs={'href':re.compile('//www.elpasotexas.gov/')}):
    print(link.get('href'))
'''
for i in range(9):
    print(title[i].get_text())
    print(names[i].get_text())
    #adapter=MyAdapter()
    #extractUserInfo("https://www.elpasotexas.gov/"+title[i].get_text().lower(),adapter)
#print(names)
print("\n")

