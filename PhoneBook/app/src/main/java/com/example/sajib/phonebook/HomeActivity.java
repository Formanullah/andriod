package com.example.sajib.phonebook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    Button btnAdd,btnView,btnUpdate,btndelete;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btnAdd=findViewById(R.id.btn_add);
        btndelete=findViewById(R.id.btn_delete);
        btnView=findViewById(R.id.btn_view);
        btnUpdate=findViewById(R.id.btn_update);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(HomeActivity.this,MainActivity.class);
                i.putExtra("data","insert");
                Toast.makeText(HomeActivity.this, "Insert Page", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
        btndelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(HomeActivity.this,MainActivity.class);
                i.putExtra("data","delete");
                Toast.makeText(HomeActivity.this, "Delete Page", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(HomeActivity.this,MainActivity.class);
                i.putExtra("data","view");
                Toast.makeText(HomeActivity.this, "View Page", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(HomeActivity.this,MainActivity.class);
                i.putExtra("data","update");
                Toast.makeText(HomeActivity.this, "Update Page", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
    }
}
