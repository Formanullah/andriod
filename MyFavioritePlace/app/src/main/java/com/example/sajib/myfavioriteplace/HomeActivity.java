package com.example.sajib.myfavioriteplace;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    Button btnSaintMartin,btnCox,btnNilgiri,btnSajek;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnCox=findViewById(R.id.btn_coxsbazar);
        btnSaintMartin=findViewById(R.id.btn_saintmartin);
        btnNilgiri=findViewById(R.id.btn_nilgiri);
        btnSajek=findViewById(R.id.btn_sajek);


        btnSaintMartin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(HomeActivity.this,DetailsActivity.class);
                i.putExtra("place","Saint Martin");
                Toast.makeText(HomeActivity.this, "Saint Martin", Toast.LENGTH_SHORT).show();

                startActivity(i);

            }
        });
        btnCox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(HomeActivity.this,DetailsActivity.class);
                i.putExtra("place","Cox's Bazar");
                Toast.makeText(HomeActivity.this, "Cox's Bazar", Toast.LENGTH_SHORT).show();

                startActivity(i);

            }
        });
        btnNilgiri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(HomeActivity.this,DetailsActivity.class);
                i.putExtra("place","Nilgiri");
                Toast.makeText(HomeActivity.this, "Nilgiri", Toast.LENGTH_SHORT).show();

                startActivity(i);

            }
        });
        btnSajek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(HomeActivity.this,DetailsActivity.class);
                i.putExtra("place","Sajek Valley");
                Toast.makeText(HomeActivity.this, "Sajek Valley", Toast.LENGTH_SHORT).show();

                startActivity(i);

            }
        });
    }
}
