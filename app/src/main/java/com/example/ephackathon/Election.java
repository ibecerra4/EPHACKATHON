package com.example.ephackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Election extends AppCompatActivity {
    private Button buttonCE;
    private Button buttonED;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_election);

        buttonCE =(Button) findViewById(R.id.buttonCE);
        buttonCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openCurrentElection();
            }
        });

        buttonED = (Button) findViewById(R.id.buttonED);
        buttonED.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openElectionDates();
            }
        });
    }

    public void openElectionDates(){
        Intent intent;
        intent = new Intent(this, ElectionDate.class);
        startActivity(intent);
    }
    public void openCurrentElection(){
        Intent intent;
        intent = new Intent(this, CurrentElection.class);
        startActivity(intent);
    }
}
