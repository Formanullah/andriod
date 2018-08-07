package com.example.sajib.myfavouritenewspaper;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CardView banglaNews,englishNews,sportsNews,techNews,othersNews;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        banglaNews=findViewById(R.id.banglanews_card);
        englishNews=findViewById(R.id.englishnews_card);
        sportsNews=findViewById(R.id.sportsnews_card);
        techNews=findViewById(R.id.technews_card);
        othersNews=findViewById(R.id.others_card);
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();

        banglaNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,HomeActivity.class);
                i.putExtra("type","bangla_news");
                Toast.makeText(MainActivity.this, "Bangla News", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
        englishNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,HomeActivity.class);
                i.putExtra("type","english_news");
                Toast.makeText(MainActivity.this, "English News", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
        sportsNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,HomeActivity.class);
                i.putExtra("type","sports_news");
                Toast.makeText(MainActivity.this, "Sports News", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
        techNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,HomeActivity.class);
                i.putExtra("type","tech_news");
                Toast.makeText(MainActivity.this, "Tech News", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
        othersNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,HomeActivity.class);
                i.putExtra("type","others");
                Toast.makeText(MainActivity.this, "Others News", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
    }
}
