package com.example.everymovethecodemonsterpartapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.DatePicker;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Calendar;

public class DailyDataInput extends AppCompatActivity {

    public static DatePickerDialog datePickerDialog;
    private int year_x, month_x, day_x;
    private DatePickerDialog.OnDateSetListener dpickerListner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_data_input);

        //set title of the app
        getSupportActionBar().setTitle("Every Move");


//        datePickerDialog = findViewById(R.id.dailyDatePicker);
        final Calendar cal = Calendar.getInstance();
        year_x = cal.get(Calendar.YEAR);
        month_x = cal.get(Calendar.MONTH);
        day_x = cal.get(Calendar.DAY_OF_MONTH);
    }


    @Override
    public void onResume() {
        super.onResume();

        dpickerListner
                = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                year_x = year;
                month_x = monthOfYear + 1;
                day_x = dayOfMonth;

                Intent o = new Intent(getApplicationContext(), TodayTestAct.class);
                o.putExtra("Date", year_x + "/" + month_x + "/" + day_x + "/");
                startActivity(o);
            }
        };
    }
}