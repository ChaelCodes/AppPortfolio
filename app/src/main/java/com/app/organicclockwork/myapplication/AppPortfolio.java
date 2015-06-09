package com.app.organicclockwork.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class AppPortfolio extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_portfolio);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.app_portfolio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /*
     *  Spotify Button Clicked
     */
    public void spotifyButton(View view)
    {
        Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my Spotify Streaming App.", Toast.LENGTH_SHORT);
        toast.show();
    }

    /*
     *  Scores Button Clicked
     */
    public void scoresButton(View view)
    {
        Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my Scores App.", Toast.LENGTH_SHORT);
        toast.show();
    }
    /*
     *  Library Button Clicked
     */
    public void libraryButton(View view)
    {
        Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my Library App.", Toast.LENGTH_SHORT);
        toast.show();
    }
    /*
     *   Build It Bigger Button Clicked
     */
    public void bibButton(View view)
    {
        Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my Build It Bigger App.", Toast.LENGTH_SHORT);
        toast.show();
    }

    /*
     *  XYZ Reader Button Clicked
     */
    public void xyzButton(View view)
    {
        Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my XYZ Reader App.", Toast.LENGTH_SHORT);
        toast.show();
    }

    /*
     *  Capstone Button Clicked
     */
    public void capstoneButton(View view)
    {
        Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my Capstone Project.", Toast.LENGTH_SHORT);
        toast.show();
    }
}
