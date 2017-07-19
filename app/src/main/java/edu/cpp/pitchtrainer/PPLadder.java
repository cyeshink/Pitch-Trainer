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
import android.widget.TextView;
import android.widget.Toast;


public class PPLadder extends AppCompatActivity {

    MediaPlayer mp = new MediaPlayer();
    Random rand = new Random();
    int ans;
    static int correct = 0;
    static int count = 0;
    static boolean valid = false;
    static boolean finished = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(finished == true){

            finished = false;
            valid=false;
            correct=0;
            count=0;
        }
            if (valid == true) {
                setContentView(R.layout.pl_finish);
                finished = true;
                TextView cor = (TextView) findViewById(R.id.tvcorrect);
                cor.setText(Integer.toString(correct));

                Button buttonmm = (Button) findViewById(R.id.buttonmm);
                buttonmm.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        finish();
                        Intent myIntent = new Intent(PPLadder.this, MainActivity.class);
                        startActivity(myIntent);
                        finish();

                    }
                });

            } else {


                setContentView(R.layout.activity_pl);
                TextView counter = (TextView) findViewById(R.id.counter);
                counter.setText("Stage " + (count + 1));


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
                final Button buttonnext = (Button) findViewById(R.id.buttonnext);

                final Button bArr[] = new Button[12];
                bArr[0] = buttonc;
                bArr[1] = buttoncsharp;
                bArr[2] = buttond;
                bArr[3] = buttondsharp;
                bArr[4] = buttone;
                bArr[5] = buttonf;
                bArr[6] = buttonfsharp;
                bArr[7] = buttong;
                bArr[8] = buttongsharp;
                bArr[9] = buttona;
                bArr[10] = buttonasharp;
                bArr[11] = buttonb;


                ans = rand.nextInt(12);
                playPitch(ans);
                buttonnext.setEnabled(false);


                buttonc.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        playPitch(0);
                        for (int i = 0; i < 12; i++) {
                            bArr[i].setEnabled(false);
                        }
                        buttonnext.setEnabled(true);
                        if (ans == 0) {
                            buttonc.setBackgroundColor(Color.GREEN);
                            correct += 1;
                        } else {
                            buttonc.setBackgroundColor(Color.rgb(255, 100, 100));
                            valid = true;
                        }
                        count++;


                    }
                });

                buttoncsharp.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        playPitch(1);
                        for (int i = 0; i < 12; i++) {
                            bArr[i].setEnabled(false);
                        }
                        buttonnext.setEnabled(true);
                        if (ans == 1) {
                            buttoncsharp.setBackgroundColor(Color.GREEN);
                            correct += 1;
                        } else {
                            buttoncsharp.setBackgroundColor(Color.rgb(255, 100, 100));
                            valid = true;
                        }
                        count++;


                    }
                });

                buttond.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        playPitch(2);
                        for (int i = 0; i < 12; i++) {
                            bArr[i].setEnabled(false);
                        }
                        buttonnext.setEnabled(true);
                        if (ans == 2) {
                            buttond.setBackgroundColor(Color.GREEN);
                            correct += 1;
                        } else {
                            buttond.setBackgroundColor(Color.rgb(255, 100, 100));
                            valid = true;
                        }
                        count++;


                    }
                });

                buttondsharp.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        playPitch(3);
                        for (int i = 0; i < 12; i++) {
                            bArr[i].setEnabled(false);
                        }
                        buttonnext.setEnabled(true);
                        if (ans == 3) {
                            buttondsharp.setBackgroundColor(Color.GREEN);
                            correct += 1;
                        } else {
                            buttondsharp.setBackgroundColor(Color.rgb(255, 100, 100));
                            valid = true;
                        }
                        count++;


                    }
                });

                buttone.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        playPitch(4);
                        for (int i = 0; i < 12; i++) {
                            bArr[i].setEnabled(false);
                        }
                        buttonnext.setEnabled(true);
                        if (ans == 4) {
                            buttone.setBackgroundColor(Color.GREEN);
                            correct += 1;
                        } else {
                            buttone.setBackgroundColor(Color.rgb(255, 100, 100));
                            valid = true;
                        }
                        count++;


                    }
                });

                buttonf.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        playPitch(5);
                        for (int i = 0; i < 12; i++) {
                            bArr[i].setEnabled(false);
                        }
                        buttonnext.setEnabled(true);
                        if (ans == 5) {
                            buttonf.setBackgroundColor(Color.GREEN);
                            correct += 1;
                        } else {
                            buttonf.setBackgroundColor(Color.rgb(255, 100, 100));
                            valid = true;
                        }
                        count++;


                    }
                });

                buttonfsharp.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        playPitch(6);
                        for (int i = 0; i < 12; i++) {
                            bArr[i].setEnabled(false);
                        }
                        buttonnext.setEnabled(true);
                        if (ans == 6) {
                            buttonfsharp.setBackgroundColor(Color.GREEN);
                            correct += 1;
                        } else {
                            buttonfsharp.setBackgroundColor(Color.rgb(255, 100, 100));
                            valid = true;
                        }
                        count++;


                    }
                });

                buttong.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        playPitch(7);
                        for (int i = 0; i < 12; i++) {
                            bArr[i].setEnabled(false);
                        }
                        buttonnext.setEnabled(true);
                        if (ans == 7) {
                            buttong.setBackgroundColor(Color.GREEN);
                            correct += 1;
                        } else {
                            buttong.setBackgroundColor(Color.rgb(255, 100, 100));
                            valid = true;
                        }
                        count++;


                    }
                });

                buttongsharp.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        playPitch(8);
                        for (int i = 0; i < 12; i++) {
                            bArr[i].setEnabled(false);
                        }
                        buttonnext.setEnabled(true);
                        if (ans == 8) {
                            buttongsharp.setBackgroundColor(Color.GREEN);
                            correct += 1;
                        } else {
                            buttongsharp.setBackgroundColor(Color.rgb(255, 100, 100));
                            valid = true;
                        }
                        count++;


                    }
                });

                buttona.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        playPitch(9);
                        for (int i = 0; i < 12; i++) {
                            bArr[i].setEnabled(false);
                        }
                        buttonnext.setEnabled(true);
                        if (ans == 9) {
                            buttona.setBackgroundColor(Color.GREEN);
                            correct += 1;
                        } else {
                            buttona.setBackgroundColor(Color.rgb(255, 100, 100));
                            valid = true;
                        }
                        count++;


                    }
                });

                buttonasharp.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        playPitch(10);
                        for (int i = 0; i < 12; i++) {
                            bArr[i].setEnabled(false);
                        }
                        buttonnext.setEnabled(true);
                        if (ans == 10) {
                            buttonasharp.setBackgroundColor(Color.GREEN);
                            correct += 1;
                        } else {
                            buttonasharp.setBackgroundColor(Color.rgb(255, 100, 100));
                            valid = true;
                        }
                        count++;


                    }
                });

                buttonb.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        playPitch(11);
                        for (int i = 0; i < 12; i++) {
                            bArr[i].setEnabled(false);
                        }
                        buttonnext.setEnabled(true);
                        if (ans == 11) {
                            buttonb.setBackgroundColor(Color.GREEN);
                            correct += 1;
                        } else {
                            buttonb.setBackgroundColor(Color.rgb(255, 100, 100));
                            valid = true;
                        }
                        count++;

                    }
                });

                buttonnext.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        mp.release();
                        Intent myIntent = new Intent(PPLadder.this, PPLadder.class);
                        startActivity(myIntent);
                        finish();
                    }
                });


                buttonppnp.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {

                        playPitch(ans);

                    }
                });


            }



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
