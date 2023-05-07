package com.example.everymovethecodemonsterpartapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class logInActivity extends AppCompatActivity {
    private Button btnDailyData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        //set title of the app
        getSupportActionBar().setTitle("Every Move");

        btnDailyData = (Button) findViewById(R.id.btnDailyDataAct);
    }

    @Override
    public void onResume(){
        super.onResume();

        btnDailyData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), DailyDataInput.class);
                Toast toast = Toast.makeText(logInActivity.this, "You are now entering Daily data input activity", Toast.LENGTH_SHORT);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.show();
                startActivity(i);
            }
        });
    }
}