package com.example.sajib.audioplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnPlay,btnPause,btnStop;

    MediaPlayer player;
    Boolean isPlaying = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPause=findViewById(R.id.btn_pause);
        btnPlay=findViewById(R.id.btn_play);
        btnStop=findViewById(R.id.btn_stop);

        player=MediaPlayer.create(MainActivity.this,R.raw.audio);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 if (isPlaying==false)
                 {
                     player.start();
                     isPlaying=true;
                 }
            }
        });
        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (isPlaying==true)
                {
                    player.pause();
                    isPlaying=false;
                }
            }
        });
        btnStop .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (isPlaying==true)
                {
                    player.stop();
                    isPlaying=false;
                }
                MainActivity.this.finish();
            }
        });
    }
}
