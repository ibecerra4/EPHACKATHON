package com.example.ephackathon.ui.tools;
//package testing.the.localGov;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.util.TypedValue;

import com.example.ephackathon.R;

public class ToolsViewModel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_tools);

        LinearLayout layout = (LinearLayout) findViewById(R.id.linearLay);
        //IN PROGRESS
        // ArrayList<TextView> tv = new ArrayList<>;
        //TextView tt[] = new TextView[10];
        for(int i = 0; i < 5; i++){
            EditText t  = new EditText(this);
            t.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
            t.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,
                    LayoutParams.WRAP_CONTENT));
            t.setText("Title "+i+"      ");
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
            n.setText("Name");
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
            p.setText("paragraph: here information/ introduction of the mayor/council "+i+" will be displayed. ");
            layout.addView(p);

            TextView noThree = new TextView(this);
            noThree.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
            noThree.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,
                    LayoutParams.WRAP_CONTENT));
            noThree.setText("\n");
            layout.addView(noThree);

        }
    }
}
