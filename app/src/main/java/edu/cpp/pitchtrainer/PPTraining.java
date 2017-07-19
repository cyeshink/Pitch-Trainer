package edu.cpp.pitchtrainer;

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
import android.widget.Toast;


public class PPTraining extends AppCompatActivity {

    String[] pitchArr = {"c", "csharp", "d", "dsharp", "e", "f", "fsharp", "g", "gsharp", "a", "asharp", "b"};
    MediaPlayer mp = new MediaPlayer();
    Random rand = new Random();
    int ans;
    boolean valid = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pp);

        final Button buttonc = (Button) findViewById(R.id.buttonc);
        final Button buttoncsharp = (Button) findViewById(R.id.buttoncsharp);
        final Button buttond = (Button) findViewById(R.id.buttond);
        final Button buttondsharp = (Button) findViewById(R.id.buttondsharp);
        final Button buttone = (Button) findViewById(R.id.buttone);
        final Button buttonf = (Button) findViewById(R.id.buttonf);
        final Button buttonfsharp = (Button) findViewById(R.id.buttonfsharp);
        final Button buttong = (Button) findViewById(R.id.buttong);
        final Button buttongsharp = (Button) findViewById(R.id.buttongsharp);
        final Button buttona = (Button) findViewById(R.id.buttona);
        final Button buttonasharp = (Button) findViewById(R.id.buttonasharp);
        final Button buttonb = (Button) findViewById(R.id.buttonb);
        final Button buttonppnp = (Button) findViewById(R.id.buttonppnp);
        final Button buttonhint = (Button) findViewById(R.id.buttonhint);

        valid = false;
        ans = rand.nextInt(12);
        playPitch(ans);


        buttonc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                playPitch(0);
                if(ans == 0){
                    buttonc.setBackgroundColor(Color.GREEN);
                    valid=true;
                    buttonppnp.setText("Next");
                }
                else{
                    buttonc.setBackgroundColor(Color.rgb(255,100,100));
                }

            }
        });

        buttoncsharp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                playPitch(1);
                if(ans == 1){
                    valid=true;
                    buttoncsharp.setBackgroundColor(Color.GREEN);
                    buttonppnp.setText("Next");
                }
                else{
                    buttoncsharp.setBackgroundColor(Color.rgb(255,100,100));
                }

            }
        });

        buttond.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                playPitch(2);
                if(ans == 2){
                    valid=true;
                    buttond.setBackgroundColor(Color.GREEN);
                    buttonppnp.setText("Next");
                }
                else{
                    buttond.setBackgroundColor(Color.rgb(255,100,100));
                }

            }
        });

        buttondsharp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                playPitch(3);
                if(ans == 3){
                    valid=true;
                    buttondsharp.setBackgroundColor(Color.GREEN);
                    buttonppnp.setText("Next");
                }
                else{
                    buttondsharp.setBackgroundColor(Color.rgb(255,100,100));
                }

            }
        });

        buttone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                playPitch(4);
                if(ans == 4){
                    valid=true;
                    buttone.setBackgroundColor(Color.GREEN);
                    buttonppnp.setText("Next");
                }
                else{
                    buttone.setBackgroundColor(Color.rgb(255,100,100));
                }

            }
        });

        buttonf.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                playPitch(5);
                if(ans == 5){
                    valid=true;
                    buttonf.setBackgroundColor(Color.GREEN);
                    buttonppnp.setText("Next");
                }
                else{
                    buttonf.setBackgroundColor(Color.rgb(255,100,100));
                }

            }
        });

        buttonfsharp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                playPitch(6);
                if(ans == 6){
                    valid=true;
                    buttonfsharp.setBackgroundColor(Color.GREEN);
                    buttonppnp.setText("Next");
                }
                else{
                    buttonfsharp.setBackgroundColor(Color.rgb(255,100,100));
                }

            }
        });

        buttong.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                playPitch(7);
                if(ans == 7){
                    valid=true;
                    buttong.setBackgroundColor(Color.GREEN);
                    buttonppnp.setText("Next");
                }
                else{
                    buttong.setBackgroundColor(Color.rgb(255,100,100));
                }

            }
        });

        buttongsharp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                playPitch(8);
                if(ans == 8){
                    valid=true;
                    buttongsharp.setBackgroundColor(Color.GREEN);
                    buttonppnp.setText("Next");
                }
                else{
                    buttongsharp.setBackgroundColor(Color.rgb(255,100,100));
                }

            }
        });

        buttona.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                playPitch(9);
                if(ans == 9){
                    valid=true;
                    buttona.setBackgroundColor(Color.GREEN);
                    buttonppnp.setText("Next");
                }
                else{
                    buttona.setBackgroundColor(Color.rgb(255,100,100));
                }

            }
        });

        buttonasharp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                playPitch(10);
                if(ans == 10){
                    valid=true;
                    buttonasharp.setBackgroundColor(Color.GREEN);
                    buttonppnp.setText("Next");
                }
                else{
                    buttonasharp.setBackgroundColor(Color.rgb(255,100,100));
                }

            }
        });

        buttonb.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                playPitch(11);
                if(ans == 11){
                    valid=true;
                    buttonb.setBackgroundColor(Color.GREEN);
                    buttonppnp.setText("Next");
                }
                else{
                    buttonb.setBackgroundColor(Color.rgb(255,100,100));
                }

            }
        });

        buttonppnp.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(valid == true){
                    mp.release();
                    Intent myIntent = new Intent(PPTraining.this, PPTraining.class);
                    startActivity(myIntent);
                    finish();
                }
                else {
                    playPitch(ans);
                }
            }
        });

        buttonhint.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                playPitch(0);
            }
        });




    }



    void playPitch(int pitch) {
        mp.release();
        switch (pitch) {
            case 0:
                mp = MediaPlayer.create(getApplicationContext(), R.raw.c);
                mp.start();
                break;
            case 1:
                mp = MediaPlayer.create(getApplicationContext(), R.raw.csharp);
                mp.start();
                break;
            case 2:
                mp = MediaPlayer.create(getApplicationContext(), R.raw.d);
                mp.start();
                break;
            case 3:
                mp = MediaPlayer.create(getApplicationContext(), R.raw.dsharp);
                mp.start();
                break;
            case 4:
                mp = MediaPlayer.create(getApplicationContext(), R.raw.e);
                mp.start();
                break;
            case 5:
                mp = MediaPlayer.create(getApplicationContext(), R.raw.f);
                mp.start();
                break;
            case 6:
                mp = MediaPlayer.create(getApplicationContext(), R.raw.fsharp);
                mp.start();
                break;
            case 7:
                mp = MediaPlayer.create(getApplicationContext(), R.raw.g);
                mp.start();
                break;
            case 8:
                mp = MediaPlayer.create(getApplicationContext(), R.raw.gsharp);
                mp.start();
                break;
            case 9:
                mp = MediaPlayer.create(getApplicationContext(), R.raw.a);
                mp.start();
                break;
            case 10:
                mp = MediaPlayer.create(getApplicationContext(), R.raw.asharp);
                mp.start();
                break;
            case 11:
                mp = MediaPlayer.create(getApplicationContext(), R.raw.b);
                mp.start();
                break;

            default:
                mp = MediaPlayer.create(getApplicationContext(), R.raw.c);
                mp.start();


        }
    }


}
