package com.example.sajib.agecalculator;

import android.app.DatePickerDialog;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {

    TextView txtAge;
    Button btnCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnCalculate=findViewById(R.id.btn_calculate);
        txtAge=findViewById(R.id.txtage);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {

                DatePickerFragment datePiker=new DatePickerFragment();
                datePiker.show(getSupportFragmentManager(),"date picker");

                //LocalDate today = LocalDate.now();
               // LocalDate birthday = LocalDate.parse(etxtBirthDate.getText());
                //Log.d("value",birthday.toString());

                //Period p = Period.between(birthday, today);
                //String age="Days="+p.getDays()+"/"+"Months="+p.getMonths()+"/"+"Years="+p.getYears();
                //txtAge.setText(age);

//Now access the values as below
                //System.out.println(p.getDays());
               // System.out.println(p.getMonths());
               // System.out.println(p.getYears());

            }
        });
    }

    @Override
    public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {

        Calendar pikDate=Calendar.getInstance();
        pikDate.set(Calendar.YEAR,year);
        pikDate.set(Calendar.MONTH,month);
        pikDate.set(Calendar.DAY_OF_MONTH,dayOfMonth);

        Calendar todayDate = Calendar.getInstance();



    }
}
