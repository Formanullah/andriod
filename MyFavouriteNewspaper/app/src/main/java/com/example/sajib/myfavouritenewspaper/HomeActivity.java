package com.example.sajib.myfavouritenewspaper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    ListView customList;
    String banglaNews[]={"প্রথম আলো","কালের কণ্ঠ","দৈনিক ইত্তেফাক","দৈনিক যুগান্তর","দৈনিক সমকাল","দৈনিক আজাদী","দৈনিক পূর্বকোণ"};
    int banglanewsflag[]={R.drawable.prothom_alo,R.drawable.kalerkonto_logo,R.drawable.ettifak_logo,R.drawable.jugantor_logo,R.drawable.samakal,R.drawable.azadi_logo,R.drawable.purbokone_logo};
    String banglaNewsPapweLink[]={"http://www.prothomalo.com/","http://www.kalerkantho.com","http://www.ittefaq.com.bd/","https://www.jugantor.com/","http://samakal.com/","http://dainikazadi.net/","http://www.dainikpurbokone.net/"};

    String englishNews[]={"The Daily Star","Daily Sun","The Independent","The Guardian (UK)","The New York Times","The Times Of India"};
    int engNewsLogo[]={R.drawable.dailystar,R.drawable.dailysun,R.drawable.theindependent,R.drawable.thegardian,R.drawable.new_york_times,R.drawable.times_of_india};
    String engnewslink[]={"https://www.thedailystar.net/","http://www.daily-sun.com/","http://www.theindependentbd.com/","https://www.theguardian.com","https://www.nytimes.com/","https://timesofindia.indiatimes.com/home/headlines"};

    String sportsNews[]={"ESPNCricinfo","Cricbuzz","SONY ESPN","Sky Sports"};
    int sportsNewsLogo[]={R.drawable.espn_crickinfo,R.drawable.crickbaz,R.drawable.sonyespn,R.drawable.skysports};
    String sportsNewsLinnk[]={"http://www.espncricinfo.com/","https://www.cricbuzz.com/","http://www.espn.in/","http://www.skysports.com/"};

    String techNews[]={"TechCrunch.com","The Next Web.com","Wired.com","Tech2.com","Gizmodo.com"};
    int techNewslogo[]={R.drawable.techcrunch_logo,R.drawable.the_next_web_logo,R.drawable.wired_logo,R.drawable.tech2_logo_final,R.drawable.gizmodo};
    String techNewsLink[]={"https://techcrunch.com/","https://thenextweb.com/","https://www.wired.com/","https://www.firstpost.com/tech","https://gizmodo.com/"};

    String others[]={"Elsevier","RefSeek"};
    int othersNewslogo[]={R.drawable.eesevier,R.drawable.resek};
    String othersNewslink[]={"https://www.elsevier.com/","https://www.refseek.com/"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        customList=findViewById(R.id.listview);

        String getNews=getIntent().getExtras().getString("type");
        if (getNews.equals("bangla_news"))
        {
            CustomAdapter adapter=new CustomAdapter(HomeActivity.this,banglaNews,banglanewsflag);
            customList.setAdapter(adapter);
            customList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int positon, long l) {
                    Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                    intent.putExtra("name",banglaNewsPapweLink[positon]);
                    Toast.makeText(HomeActivity.this,banglaNews[positon], Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }
            });
        }

        else if (getNews.equals("english_news"))
        {
            CustomAdapter adapter=new CustomAdapter(HomeActivity.this,englishNews,engNewsLogo);
            customList.setAdapter(adapter);
            customList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int positon, long l) {
                    Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                    intent.putExtra("name",engnewslink[positon]);
                    Toast.makeText(HomeActivity.this,englishNews[positon], Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }
            });
        }

        else if (getNews.equals("sports_news"))
        {
            CustomAdapter adapter=new CustomAdapter(HomeActivity.this,sportsNews,sportsNewsLogo);
            customList.setAdapter(adapter);
            customList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int positon, long l) {
                    Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                    intent.putExtra("name",sportsNewsLinnk[positon]);
                    Toast.makeText(HomeActivity.this,sportsNews[positon], Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }
            });
        }

        else if (getNews.equals("tech_news"))
        {
            CustomAdapter adapter=new CustomAdapter(HomeActivity.this,techNews,techNewslogo);
            customList.setAdapter(adapter);
            customList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int positon, long l) {
                    Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                    intent.putExtra("name",techNewsLink[positon]);
                    Toast.makeText(HomeActivity.this,techNews[positon], Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }
            });
        }

        else if (getNews.equals("others"))
        {
            CustomAdapter adapter=new CustomAdapter(HomeActivity.this,others,othersNewslogo);
            customList.setAdapter(adapter);
            customList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int positon, long l) {
                    Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                    intent.putExtra("name",othersNewslink[positon]);
                    Toast.makeText(HomeActivity.this,others[positon], Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }
            });
        }

    }
}
