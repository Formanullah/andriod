package com.example.sajib.phonebook;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    ImageView imgIcon;
    TextView txtName;
    public static int splashTimeOut=4000;
    Animation uptodown,downtotop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        imgIcon=findViewById(R.id.img_icon);
        txtName=findViewById(R.id.txt_name);
        uptodown = AnimationUtils.loadAnimation(this,R.anim.uptodown);
        downtotop=AnimationUtils.loadAnimation(this,R.anim.downtotop);
        imgIcon.startAnimation(uptodown);
        txtName.startAnimation(downtotop);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(SplashActivity.this,HomeActivity.class);
                startActivity(i);
                finish();
            }
        },splashTimeOut);
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();


    }
}
