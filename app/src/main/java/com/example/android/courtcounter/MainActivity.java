package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    EditText teamA, teamB;
    String teamAName, teamBName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
        teamA = (EditText)findViewById(R.id.team_a_name);
        teamB = (EditText)findViewById(R.id.team_b_name);
        teamAName = teamA.getText().toString();
        teamBName = teamB.getText().toString();

          }
    /**
     * This is team A code
     * This method is called when the +3 points button is clicked.
     */
    public void three_points_a(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }
    /**
     * This method is called when the +2 points button is clicked.
     */
    public void two_points_a(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }
    /**
     * This method is called when the +1 points button is clicked.
     */
    public void one_point_a(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
        if (scoreTeamA >= 21) {
            Toast.makeText(getApplicationContext(), getString(R.string.congrats_text) + teamAName + getString(R.string.win_text) ,
                    Toast.LENGTH_LONG).show();
        }
            }
    /**
     * This is team B code
     * This method is called when the +3 points button is clicked.
     */
    public void three_points_b(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }
    /**
     * This method is called when the +2 points button is clicked.
     */
    public void two_points_b(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }
    /**
     * This method is called when the +1 points button is clicked.
     */
    public void one_point_b(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
        if (scoreTeamB >= 21) {
            Toast.makeText(getApplicationContext(), getString(R.string.congrats_text) + teamBName + getString(R.string.win_text) ,
                    Toast.LENGTH_LONG).show();
        }
    }
    // This method resets both teams' scores back to 0
    public void resetScore(View v) {
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);
 }


}