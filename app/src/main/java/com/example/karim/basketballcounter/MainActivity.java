package com.example.karim.basketballcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0, teamBScore = 0;
    TextView teamAScoreView, teamBScoreView;
    Button btn1A, btn2A, btn3A, btn1B, btn2B, btn3B;
    String TeamANamerecieved , TeamBNamerecieved;

    TextView team1Name, team2Name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        team1Name = (TextView) findViewById(R.id.team1_name);
        team2Name = (TextView) findViewById(R.id.team2_name);

        /*
        // 1st Method to receive:
        Intent receiver = getIntent();
        TeamANamerecieved = receiver.getStringExtra("team1nameEntered");
        TeamBNamerecieved = receiver.getStringExtra("team2nameEntered");
        */

        // 2nd Method to receive:
        Bundle bundleRec = getIntent().getExtras();
        TeamANamerecieved = bundleRec.getString("team1nameEntered");
        TeamBNamerecieved = bundleRec.getString("team2nameEntered");



        team1Name.setText(TeamANamerecieved);
        team2Name.setText(TeamBNamerecieved);


        teamAScoreView = (TextView) findViewById(R.id.display_score_A);
        teamBScoreView = (TextView) findViewById(R.id.display_score_B);

        btn1A = (Button) findViewById(R.id.free_throw_A);
        btn2A = (Button) findViewById(R.id.plus2A);
        btn3A = (Button) findViewById(R.id.plus3A);

        btn1B = (Button) findViewById(R.id.free_throw_B);
        btn2B = (Button) findViewById(R.id.plus2B);
        btn3B = (Button) findViewById(R.id.plus3B);
    }

    public void incrementBy1(View view) {
        if (view.equals(btn1A)) {
            teamAScore += 1;
            displayForA(teamAScore);
        } else if (view.equals(btn1B)) {
            teamBScore += 1;
            displayForB(teamBScore);
        }
    }

    public void incrementBy2(View view) {
        if (view.equals(btn2A)) {
            teamAScore += 2;
            displayForA(teamAScore);
        }
        if (view.equals(btn2B)) {
            teamBScore += 2;
            displayForB(teamBScore);
        }
    }

    public void incrementBy3(View view) {
        if (view.equals(btn3A)) {
            teamAScore += 3;
            displayForA(teamAScore);
        }
        if (view.equals(btn3B)) {
            teamBScore += 3;
            displayForB(teamBScore);
        }
    }

    public void reset(View view) {
        teamAScore = 0;
        teamBScore = 0;
        displayForA(teamAScore);
        displayForB(teamBScore);
    }

    public void displayForA(int currentScore) {
        teamAScoreView.setText(String.valueOf(currentScore));
    }

    public void displayForB(int currentScore) {
        teamBScoreView.setText(String.valueOf(currentScore));
    }
}
