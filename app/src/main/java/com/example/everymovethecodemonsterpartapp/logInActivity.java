package com.example.everymovethecodemonsterpartapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class logInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        //set title of the app
        getSupportActionBar().setTitle("Every Move");
    }
}