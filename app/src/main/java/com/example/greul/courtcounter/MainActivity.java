package com.example.greul.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int teamAScore = 0;

    public void addThreePointsA(View view){
        teamAScore += 3;
        displayForTeamA(teamAScore);
    }

    public void addTwoPointsA(View view){
        teamAScore += 2;
        displayForTeamA(teamAScore);
    }

    public void addFreeThrowA(View view){
        teamAScore += 1;
        displayForTeamA(teamAScore);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

}
