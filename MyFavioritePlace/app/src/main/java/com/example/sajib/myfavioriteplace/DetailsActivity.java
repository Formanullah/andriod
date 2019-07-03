package com.example.sajib.myfavioriteplace;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    ImageView imgPlace;
    TextView txtName,txtDescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imgPlace=findViewById(R.id.img_place);
        txtName=findViewById(R.id.txt_name);
        txtDescription=findViewById(R.id.txt_description);

        String getplace=getIntent().getExtras().getString("place");
        Log.d("place",getplace);
        if (getplace.equals("Saint Martin"))
        {
            imgPlace.setImageResource(R.drawable.saintmartin);
            txtName.setText("Saint Martin");
            txtDescription.setText(R.string.saint_martin);
        }
        else if (getplace.equals("Cox's Bazar"))
        {
            imgPlace.setImageResource(R.drawable.coxbzar);
            txtName.setText("Cox's Bazar");
            txtDescription.setText(R.string.coxbazar);
        }
        else if (getplace.equals("Nilgiri"))
        {
            imgPlace.setImageResource(R.drawable.nilgiri_bandarban);
            txtName.setText("Nilgiri");
            txtDescription.setText(R.string.nilgiri);
        }
        else if (getplace.equals("Sajek Valley"))
        {
            imgPlace.setImageResource(R.drawable.sajek);
            txtName.setText("Sajek Valley");
            txtDescription.setText(R.string.sajekvalley);
        }
    }
}
