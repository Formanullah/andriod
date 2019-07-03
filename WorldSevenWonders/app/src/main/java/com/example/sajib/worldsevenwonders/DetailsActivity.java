package com.example.sajib.worldsevenwonders;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    ImageView place;
    TextView txtName,txtDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        place=findViewById(R.id.img_place);
        txtName=findViewById(R.id.txt_name);
        txtDescription=findViewById(R.id.txt_description);

        String getname=getIntent().getExtras().getString("name");
        Log.d("name",getname);
        if (getname.equals("Taj Mahal"))
        {
            place.setImageResource(R.drawable.tag_mahal);
            txtName.setText("Taj Mahal");
            txtDescription.setText(R.string.taj_Mahal);
        }
        else if (getname.equals("Giza Necropolis"))
        {
            place.setImageResource(R.drawable.gazi);
            txtName.setText("Giza Necropolis");
            txtDescription.setText(R.string.giza_necropolis);
        }
        else if (getname.equals("Petra"))
        {
            place.setImageResource(R.drawable.petra);
            txtName.setText("Petra");
            txtDescription.setText(R.string.petra);
        }
        else if (getname.equals("Colosseum"))
        {
            place.setImageResource(R.drawable.colosseum_rome);
            txtName.setText("Colosseum");
            txtDescription.setText(R.string.colosseum);
        }
        else if (getname.equals("Chichen Itza"))
        {
            place.setImageResource(R.drawable.chichen_itza_mexico);
            txtName.setText("Chichen Itzan");
            txtDescription.setText(R.string.chichen_itza);
        }
        else if (getname.equals("Machu Picchu"))
        {
            place.setImageResource(R.drawable.top_peru_express);
            txtName.setText("Machu Picchu");
            txtDescription.setText(R.string.machu_picchu);
        }
        else if (getname.equals("Great Wall of China"))
        {
            place.setImageResource(R.drawable.great_wall_of_china);
            txtName.setText("Great Wall of China");
            txtDescription.setText(R.string.great_wall_of_china);
        }
        else if (getname.equals("Christ the Redeemer"))
        {
            place.setImageResource(R.drawable.christ_the_redeemer);
            txtName.setText("Christ the Redeemer");
            txtDescription.setText(R.string.christ_the_redeemer);
        }

       // String getname=getIntent().getExtras().getString("name");


    }
}
