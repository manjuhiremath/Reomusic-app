package com.example.reo_muzic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class playingsong extends AppCompatActivity {

    ImageView play;

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playingsong);
        play = findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer.isPlaying())
                {
                    mediaPlayer.pause();
                    play.setBackgroundResource(R.drawable.play);
                }
                else {
                    mediaPlayer.start();
                    play.setBackgroundResource(R.drawable.pause);
                }
            }
        });

    }
}