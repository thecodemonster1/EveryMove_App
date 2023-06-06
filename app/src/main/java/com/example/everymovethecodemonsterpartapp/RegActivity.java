package com.example.everymovethecodemonsterpartapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RegActivity extends AppCompatActivity {
    private Button btnSignUp;
    private TextView logInPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);


        //set title of the app
        getSupportActionBar().setTitle("Every Move");

        //set button variables
        btnSignUp =  findViewById(R.id.buttonAdd_plan_A);
        logInPage = (TextView) findViewById(R.id.loginRedirectTextLink);

    }

    @Override
    public void onResume(){
        super.onResume();

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                System.out.println("Button is working");
            }
        });

        logInPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), logInActivity.class);
                startActivity(i);
            }
        });
    }
}