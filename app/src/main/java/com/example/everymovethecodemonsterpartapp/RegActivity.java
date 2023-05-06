package com.example.everymovethecodemonsterpartapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class RegActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);

        //set title of the app
        getSupportActionBar().setTitle("Every Move");
    }
}