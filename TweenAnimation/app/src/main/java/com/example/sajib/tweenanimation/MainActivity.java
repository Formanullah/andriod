package com.example.sajib.tweenanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtImage;
    ImageView imgAndroid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtImage=findViewById(R.id.txt_android);
        imgAndroid=findViewById(R.id.img_android);

        txtImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Animation rotare= AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
                txtImage.startAnimation(rotare);
            }
        });

        imgAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation rotare= AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
                imgAndroid.startAnimation(rotare);
            }
        });

        txtImage.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                txtImage.clearAnimation();
                return true;
            }
        });

        imgAndroid.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                imgAndroid.clearAnimation();
                return true;
            }
        });
    }
}
