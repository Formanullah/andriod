package com.example.sajib.worldsevenwonders;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView customList;
    String sevenwonders[]={"Taj Mahal","Giza Necropolis","Petra","Colosseum","Chichen Itza","Machu Picchu","Great Wall of China","Christ the Redeemer"};
    int flags[]={R.drawable.tag_mahal_icon,R.drawable.gazi_icon,R.drawable.petra_icon,R.drawable.colosseum_rome_icon,R.drawable.chichen_itza_mexico_icon,R.drawable.top_peru_express_icon,R.drawable.great_wall_of_china_icon,R.drawable.christ_the_redeemer_icon};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customList=findViewById(R.id.listview);

        CustomAdapter adapter=new CustomAdapter(MainActivity.this,sevenwonders,flags);
        customList.setAdapter(adapter);

        customList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int positon, long l) {
                Intent intent=new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("name",sevenwonders[positon]);
                Toast.makeText(MainActivity.this,sevenwonders[positon], Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

    }
}
