package com.example.everymovethecodemonsterpartapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

public class beginners_plan_activity extends AppCompatActivity {
    CheckBox pushupCountCheckBox;
    EditText pushupCount;
    Button increment1, decrement1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginners_plan2);

        pushupCountCheckBox = findViewById(R.id.checkBox1);
        pushupCount = (EditText) findViewById(R.id.pushupCount);

        increment1 = (Button) findViewById(R.id.increment1);
        decrement1 = (Button) findViewById(R.id.decrement1);
        pushupCount.setText("0");

        increment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pCountInt = Integer.parseInt(pushupCount.getText().toString().trim());
                pCountInt++;
                String pCountStr = Integer.toString(pCountInt);
                pushupCount.setText(pCountStr);
            }
        });

        decrement1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pCountInt = Integer.parseInt(pushupCount.getText().toString().trim());
                pCountInt--;
                String pCountStr = Integer.toString(pCountInt);
                pushupCount.setText(pCountStr);
            }
        });
        pushupCountCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Checkbox is checked
                    // Perform your logic here when the checkbox is clicked
                    pushupCount.setText("10");
                } else {
                    // Checkbox is not checked
                    // Perform your logic here when the checkbox is not clicked
                    pushupCount.setText("");
                }
            }
        });
    }
}