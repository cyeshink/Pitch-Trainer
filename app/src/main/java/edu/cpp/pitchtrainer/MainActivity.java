package edu.cpp.pitchtrainer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.media.MediaPlayer;
import android.widget.Button;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;


public class MainActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        // Locate the button in activity_main.xml
        Button ppbutton = (Button) findViewById(R.id.ppbutton);
        Button ptbutton = (Button) findViewById(R.id.ptbutton);
        Button abtbutton = (Button) findViewById(R.id.abtbutton);
        Button plbutton = (Button) findViewById(R.id.plbutton);
        // Capture button clicks
        ppbutton.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this, PPTraining.class);
                startActivity(myIntent);
            }
        });

        ptbutton.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this, PPTest.class);
                startActivity(myIntent);
            }
        });

        plbutton.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this, PPLadder.class);
                startActivity(myIntent);
            }
        });

        abtbutton.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this, PPAbout.class);
                startActivity(myIntent);
            }
        });

    }


}
