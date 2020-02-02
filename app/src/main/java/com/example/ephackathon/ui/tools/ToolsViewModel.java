package com.example.ephackathon.ui.tools;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.util.TypedValue;

import com.example.ephackathon.R;

//import java.util.ArrayList;

public class ToolsViewModel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String data[] = new String[21];
        data[0] = "Mayor";
        data[1] = "Dee Margo";
        data[2] = "Dee moved to El Paso in 1977 from Nashville where he attended Vanderbilt University, to join his father-in-law at John D. Williams Company (JDW). In February of 1981, 6 days after Dee’s 29th birthday, his father-in-law suffered a fatal heart attack. Dee purchased JDW from the estate, and expanded the company from 6 employees to 70, in the span of 30 years.";
        data[3] = "District 1";
        data[4] = "Peter Svarzbein";
        data[5] = "Thank you for affording me the privilege to serve as your public servant on the City of El Paso Council. I am honored to represent District 1. I look forward to teaming up with you to improve our neighborhoods, build a better future for our children and accomplish great things for our City.";
        data[6] = "District 2";
        data[7] = "Alexsandra Annello";
        data[8] = "As your elected City Representative for District 2, I look forward to working with my constituents to address the needs of District 2 and to enhance the quality of life for everyone in our great community. Together, we can build on El Paso’s successes to further improve our neighborhoods, strengthen the economy and provide outstanding services.";
        data[9] = "District 3";
        data[10] = "Cassandra Hernandez";
        data[11]  = "Thank you for electing me to be your Representative and I look forward to working with you to improve District 3. Please do not hesitate to reach out to our office if I can ever be of assistance. ";
        data[12] = "District 4";
        data[13] = "Dr. Sam Morgan";
        data[14] = "I am honored and humbled to represent District 4 on the El Paso City Council. As your representative, I will ensure our Northeast community has competent, committed and capable representation on City Council. I am determined to improve the Quality of Life (QOL) needs of Northeast El Paso, District 4. I look forward to working with the constituents of Northeast El Paso and my City Council Colleagues to secure lasting and meaningful Quality of Life improvement for all El Pasoans." ;
        data[15] = "District 5";
        data[16] = "Isabel Salcido";
        data[17] = "Thank you for affording me the privilege to serve as your public servant on the City of El Paso Council. I am honored to represent District 5. I look forward to teaming up with you to improve our neighborhoods, build a better future for our children and accomplish great things for our City. ";
        data[18] = "District 6";
        data[19] = "Claudia Ordaz-Perez";
        data[20] = "Thank you for electing me as your City Representative for District 6. I look forward to working with my constituents to build a better future for our children, accomplish great things for our city, and ensure the needs of District 6 are met.Please remember my door is always open if I may be of service in any way.";

        //BufferedReader br = new BufferedReader();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout layout = (LinearLayout) findViewById(R.id.linearLay);
        //IN PROGRESS
        // ArrayList<TextView> tv = new ArrayList<>;
        //TextView tt[] = new TextView[10];
        for(int i = 0; i < data.length-3; i=i+3){
            EditText t  = new EditText(this);
            t.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
            t.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,
                    LayoutParams.WRAP_CONTENT));
            t.setText(data[i]);
            layout.addView(t);

            TextView no = new TextView(this);
            no.setTextSize(TypedValue.COMPLEX_UNIT_SP, 5);
            no.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,
                    LayoutParams.WRAP_CONTENT));
            no.setText("\n");
            layout.addView(no);

            TextView n = new TextView(this);
            n.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
            n.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,
                    LayoutParams.WRAP_CONTENT));
            n.setText(data[i+1]);
            layout.addView(n);

            TextView noTwo = new TextView(this);
            noTwo.setTextSize(TypedValue.COMPLEX_UNIT_SP, 10);
            noTwo.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,
                    LayoutParams.WRAP_CONTENT));
            noTwo.setText("\n");
            layout.addView(noTwo);

            TextView p = new TextView(this);
            p.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
            p.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,
                    LayoutParams.WRAP_CONTENT));
            p.setText(data[i+2]);
            layout.addView(p);

            TextView noThree = new TextView(this);
            noThree.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
            noThree.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,
                    LayoutParams.WRAP_CONTENT));
            noThree.setText("\n");
            layout.addView(noThree);

            /*
            t.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
            t.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,
                    LayoutParams.WRAP_CONTENT));
            tt[i] = t;
            //tv.add(t);
            //ImageButton button = new ImageButton(context)
            //buttons.add(button);
            //optional: add your buttons to any layout if you want to see them in your screen
            layout.addView(t);
            */
        }
    }

}
