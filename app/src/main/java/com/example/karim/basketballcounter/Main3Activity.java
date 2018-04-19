package com.example.karim.basketballcounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {

    EditText team1Name , team2Name;
    Button startBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        team1Name = (EditText) findViewById(R.id.team1_name);
        team2Name = (EditText) findViewById(R.id.team2_name);
        startBtn = (Button) findViewById(R.id.start_btn);

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*
                //1st Method to send:
                Intent startCalculating = new Intent(Main3Activity.this,MainActivity.class);
                startCalculating.putExtra("team1nameEntered" , team1Name.getText().toString());
                startCalculating.putExtra("team2nameEntered" , team2Name.getText().toString());
                startActivity(startCalculating);
                */


                //2nd Method to send:
                Intent startCalculating = new Intent(Main3Activity.this,MainActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("team1nameEntered",team1Name.getText().toString());
                bundle.putString("team2nameEntered",team2Name.getText().toString());
                startCalculating.putExtras(bundle);
                startActivity(startCalculating);
            }
        });
    }
}
