package com.example.sajib.myphonebook;

import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.nio.Buffer;

public class MainActivity extends AppCompatActivity {

    EditText etxtID,etxtname,etxtCell;
    Button btnInsert,btnUpdate,btnDelete,btnView;
    MySQliteDB myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etxtCell=findViewById(R.id.etxt_cell);
        etxtID=findViewById(R.id.etxt_id);
        etxtname=findViewById(R.id.etxt_name);
        btnDelete=findViewById(R.id.btn_delete);
        btnInsert=findViewById(R.id.btn_insert);
        btnUpdate=findViewById(R.id.btn_update);
        btnView=findViewById(R.id.btn_view);
        myDb=new MySQliteDB(MainActivity.this);

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id=etxtID.getText().toString();
                String name=etxtname.getText().toString();
                String cell=etxtCell.getText().toString();

                if (id.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please Enter Id!", Toast.LENGTH_SHORT).show();
                }
                else if (name.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please Enter Name!", Toast.LENGTH_SHORT).show();
                }
                else if (cell.isEmpty() || cell.length()<11 || cell.length()>11 || cell.charAt(0)!='0' || cell.charAt(1)!='1' || cell.charAt(2)=='0' || cell.charAt(2)=='1' || cell.charAt(2)=='2' || cell.charAt(2)=='3' || cell.charAt(2)=='4')
                {
                    Toast.makeText(MainActivity.this, "Please Enter Correct Cell Number!", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    boolean check=myDb.addToTable(id,name,cell);
                    if (check==true)
                    {
                        Toast.makeText(MainActivity.this, "Insert Successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Insert Failed", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }

    public void viewData(View v)
    {
        Cursor getData=myDb.display();
        if (getData.getCount()==0)
        {
            Toast.makeText(this, "No Data Found", Toast.LENGTH_SHORT).show();
        }
        else
        {
            StringBuffer buffer=new StringBuffer();
            getData.moveToFirst();//curson object k first roew point kore deya
            do {
                buffer.append("ID: "+getData.getString(0)+"\n");
                buffer.append("Name: "+getData.getString(1)+"\n");
                buffer.append("Cell: "+getData.getString(2)+"\n");
            }
            while (getData.moveToNext());
            showData("My Contacts",buffer.toString());
        }
    }

    public void showData(String title, String data)
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle(title);
        builder.setIcon(R.drawable.contact_icon);
        builder.setMessage(data);
        builder.setCancelable(true);
        builder.show();
    }

    public void delete(View v)
    {
        String getId=etxtID.getText().toString();
        int check=myDb.deleteData(getId);
        if (check>0)
        {
            Toast.makeText(this, "Data Deleted Successfully", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Data Not Deleted!, Something Wrong! ", Toast.LENGTH_SHORT).show();
        }
    }

    public void update(View v)
    {
        String id=etxtID.getText().toString();
        String name=etxtname.getText().toString();
        String cell=etxtCell.getText().toString();

        if (id.isEmpty())
        {
            Toast.makeText(MainActivity.this, "Please Enter Id!", Toast.LENGTH_SHORT).show();
        }
        else if (name.isEmpty())
        {
            Toast.makeText(MainActivity.this, "Please Enter Name!", Toast.LENGTH_SHORT).show();
        }
        else if (cell.isEmpty() || cell.length()<11 || cell.length()>11 || cell.charAt(0)!='0' || cell.charAt(1)!='1' || cell.charAt(2)=='0' || cell.charAt(2)=='1' || cell.charAt(2)=='2' || cell.charAt(2)=='3' || cell.charAt(2)=='4')
        {
            Toast.makeText(MainActivity.this, "Please Enter Correct Cell Number!", Toast.LENGTH_SHORT).show();
        }
        else
        {
            boolean check=myDb.updateData(id,name,cell);
            if (check==true)
            {
                Toast.makeText(MainActivity.this, "Updated Successfully", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(MainActivity.this, "Updated Failed", Toast.LENGTH_SHORT).show();
            }
        }

    }
}
