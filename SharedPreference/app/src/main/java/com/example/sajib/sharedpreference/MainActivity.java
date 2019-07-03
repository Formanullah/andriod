package com.example.sajib.sharedpreference;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txtHighScore,txtScore;
    Button btnPlay,btnReset;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    public String Pref_Game="com.example.sajib.sharedpreference.highscore";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHighScore=findViewById(R.id.txt_high_score);
        txtScore=findViewById(R.id.txt_score);
        btnPlay=findViewById(R.id.btn_play);
        btnReset=findViewById(R.id.btn_reset);
        preferences=getSharedPreferences(Pref_Game,MODE_PRIVATE);
        editor=preferences.edit();
        int highscore=preferences.getInt("high_score",0);
        txtHighScore.setText("High Score: "+highscore);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random=new Random();
                int score=random.nextInt(2000);
                txtScore.setText(String.valueOf(score));
                int getHighScore=preferences.getInt("high_score",0);
                if (score>getHighScore)
                {
                    txtHighScore.setText("High Score: "+score);
                    editor.putInt("high_score",score);
                    editor.commit();
                }
            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putInt("high_score",0);
                editor.commit();
                txtHighScore.setText("High Score: "+0);
                txtScore.setText("0");
            }
        });

    }
}
