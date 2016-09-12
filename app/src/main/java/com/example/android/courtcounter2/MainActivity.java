package com.example.android.courtcounter2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void AddThreePointsForB(View v){
        scoreTeamB = scoreTeamB+3;
        displayForTeamB(scoreTeamB);

    }

    public void AddTwoPointsForB(View v){
        scoreTeamB = scoreTeamB+2;
        displayForTeamB(scoreTeamB);

    }

    public void AddOnePointForB(View v){
        scoreTeamB = scoreTeamB+1;
        displayForTeamB(scoreTeamB);

    }


    public void AddThreePointsForA(View v){
        scoreTeamA = scoreTeamA+3;
        displayForTeamA(scoreTeamA);

    }

    public void AddTwoPointsForA(View v){
        scoreTeamA = scoreTeamA+2;
        displayForTeamA(scoreTeamA);

    }

    public void AddOnePointForA(View v){
        scoreTeamA = scoreTeamA+1;
        displayForTeamA(scoreTeamA);

    }


    public void ResetTheScore(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


}
