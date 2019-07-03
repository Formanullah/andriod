package com.example.sajib.imageloadfromserver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnImage1,BtnImage2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnImage1=findViewById(R.id.btn_image1);
        BtnImage2=findViewById(R.id.btn_image2);

        btnImage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,ImageLoadActivity.class);
                i.putExtra("url","https://as01.epimg.net/en/imagenes/2018/03/04/football/1520180124_449729_noticia_normal.jpg");
                startActivity(i);
            }
        });

        BtnImage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,ImageLoadActivity.class);
                i.putExtra("url","https://dj0j0ofql4htg.cloudfront.net/cms2/image_manager/uploads/News/287934/7/1517840080_3edae.jpg");
                startActivity(i);
            }
        });
    }
}
