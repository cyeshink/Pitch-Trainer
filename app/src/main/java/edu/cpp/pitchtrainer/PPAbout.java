package edu.cpp.pitchtrainer;

import android.os.Bundle;
import android.graphics.Color;
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

import java.util.Random;

import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PPAbout extends AppCompatActivity{


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_abt);

        Button buttonmm = (Button) findViewById(R.id.buttonmm);
        buttonmm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
                Intent myIntent = new Intent(PPAbout.this, MainActivity.class);
                startActivity(myIntent);
                finish();

            }
        });

    }




}
