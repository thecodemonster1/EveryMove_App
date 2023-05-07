package com.example.everymovethecodemonsterpartapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnLogin;
    private Button btnReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set title of the app
        getSupportActionBar().setTitle("Every Move");


        //set the variables of buttons
        btnLogin = findViewById(R.id.button_login);
        btnReg = findViewById(R.id.button_register);

    }

    @Override
    public void onResume(){
        super.onResume();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), logInActivity.class);
                Toast.makeText(MainActivity.this, "Welcome to Register Activity", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), RegActivity.class);
                Toast.makeText(MainActivity.this, "Welcome to LogIn Activity", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
    }
}