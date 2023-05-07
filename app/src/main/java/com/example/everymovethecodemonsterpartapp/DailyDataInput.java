package com.example.everymovethecodemonsterpartapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.DatePicker;

public class DailyDataInput extends AppCompatActivity {

    private DatePickerDialog datePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_data_input);

        //set title of the app
        getSupportActionBar().setTitle("Every Move");


        datePickerDialog = (DatePickerDialog) findViewById(R.id.dailyDatePicker);
    }


    @Override
    public void onResume(){
        super.onResume();

        datePickerDialog.setOnDateSetListener(new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                // Create an Intent to start the new activity
                Intent intent = new Intent(getApplicationContext(), NewActivity.class);

                // Pass the selected date to the new activity as an extra
                String selectedDate = dayOfMonth + "/" + (monthOfYear + 1) + "/" + year;
                intent.putExtra("selected_date", selectedDate);

                // Start the new activity
                startActivity(intent);
            }
        });

    }
}