package com.sudipta.musicplay;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;

    //for playing music
    public void play(View view){
        mediaPlayer.start();
    }
    //for pauseing music
    public void pause(View view){
        mediaPlayer.pause();
    }
    //for stop music
    public void stop(View view){
        mediaPlayer.stop();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = MediaPlayer.create(this,R.raw.music);
    }
}