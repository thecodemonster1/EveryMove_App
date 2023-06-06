package com.example.everymovethecodemonsterpartapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

public class beginners_plan_activity extends AppCompatActivity {
    CheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7;
    EditText Count1, Count2, Count3, Count4, Count5, Count6, Count7;
    Button increment1, increment2, increment3, increment4, increment5, increment6, increment7;
    Button decrement1, decrement2, decrement3, decrement4, decrement5, decrement6, decrement7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginners_plan2);


        // 1 =============================================================

        checkBox1 = findViewById(R.id.checkBox1);
        Count1 = (EditText) findViewById(R.id.Count1);

        increment1 = (Button) findViewById(R.id.increment1);
        decrement1 = (Button) findViewById(R.id.decrement1);

        Count1.setText("0");

        increment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pCountInt = Integer.parseInt(Count1.getText().toString().trim());
                pCountInt++;
                String pCountStr = Integer.toString(pCountInt);
                Count1.setText(pCountStr);
            }
        });

        decrement1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pCountInt = Integer.parseInt(Count1.getText().toString().trim());
                pCountInt--;
                String pCountStr = Integer.toString(pCountInt);
                Count1.setText(pCountStr);
            }
        });
        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Checkbox is checked
                    // Perform your logic here when the checkbox is clicked
                    Count1.setText("10");
                } else {
                    // Checkbox is not checked
                    // Perform your logic here when the checkbox is not clicked
                    Count1.setText("0");
                }
            }
        });


        // 2 =============================================================

        checkBox2 = findViewById(R.id.checkBox2);
        Count2 = (EditText) findViewById(R.id.Count2);

        increment2 = (Button) findViewById(R.id.increment2);
        decrement2 = (Button) findViewById(R.id.decrement2);

        Count2.setText("0");

        increment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pCountInt = Integer.parseInt(Count2.getText().toString().trim());
                pCountInt++;
                String pCountStr = Integer.toString(pCountInt);
                Count2.setText(pCountStr);
            }
        });

        decrement2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pCountInt = Integer.parseInt(Count2.getText().toString().trim());
                pCountInt--;
                String pCountStr = Integer.toString(pCountInt);
                Count2.setText(pCountStr);
            }
        });
        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Checkbox is checked
                    // Perform your logic here when the checkbox is clicked
                    Count2.setText("30");
                } else {
                    // Checkbox is not checked
                    // Perform your logic here when the checkbox is not clicked
                    Count2.setText("0");
                }
            }
        });



        // 3 =============================================================

        checkBox3 = findViewById(R.id.checkBox3);
        Count3 = (EditText) findViewById(R.id.Count3);

        increment3 = (Button) findViewById(R.id.increment3);
        decrement3 = (Button) findViewById(R.id.decrement3);

        Count3.setText("0");

        increment3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pCountInt = Integer.parseInt(Count3.getText().toString().trim());
                pCountInt++;
                String pCountStr = Integer.toString(pCountInt);
                Count3.setText(pCountStr);
            }
        });

        decrement3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pCountInt = Integer.parseInt(Count3.getText().toString().trim());
                pCountInt--;
                String pCountStr = Integer.toString(pCountInt);
                Count3.setText(pCountStr);
            }
        });
        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Checkbox is checked
                    // Perform your logic here when the checkbox is clicked
                    Count3.setText("5");
                } else {
                    // Checkbox is not checked
                    // Perform your logic here when the checkbox is not clicked
                    Count3.setText("0");
                }
            }
        });


        // 4 =============================================================


        checkBox4 = findViewById(R.id.checkBox4);
        Count4 = (EditText) findViewById(R.id.Count4);

        increment4 = (Button) findViewById(R.id.increment4);
        decrement4 = (Button) findViewById(R.id.decrement4);

        Count4.setText("0");

        increment4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pCountInt = Integer.parseInt(Count4.getText().toString().trim());
                pCountInt++;
                String pCountStr = Integer.toString(pCountInt);
                Count4.setText(pCountStr);
            }
        });

        decrement4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pCountInt = Integer.parseInt(Count4.getText().toString().trim());
                pCountInt--;
                String pCountStr = Integer.toString(pCountInt);
                Count4.setText(pCountStr);
            }
        });
        checkBox4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Checkbox is checked
                    // Perform your logic here when the checkbox is clicked
                    Count4.setText("5");
                } else {
                    // Checkbox is not checked
                    // Perform your logic here when the checkbox is not clicked
                    Count4.setText("0");
                }
            }
        });



        // 5 =============================================================


        checkBox5 = findViewById(R.id.checkBox5);
        Count5 = (EditText) findViewById(R.id.Count5);

        increment5 = (Button) findViewById(R.id.increment5);
        decrement5 = (Button) findViewById(R.id.decrement5);

        Count5.setText("0");

        increment5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pCountInt = Integer.parseInt(Count5.getText().toString().trim());
                pCountInt++;
                String pCountStr = Integer.toString(pCountInt);
                Count5.setText(pCountStr);
            }
        });

        decrement5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pCountInt = Integer.parseInt(Count5.getText().toString().trim());
                pCountInt--;
                String pCountStr = Integer.toString(pCountInt);
                Count5.setText(pCountStr);
            }
        });
        checkBox5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Checkbox is checked
                    // Perform your logic here when the checkbox is clicked
                    Count5.setText("10");
                } else {
                    // Checkbox is not checked
                    // Perform your logic here when the checkbox is not clicked
                    Count5.setText("0");
                }
            }
        });


        // 6 =============================================================

        checkBox6 = findViewById(R.id.checkBox6);
        Count6 = (EditText) findViewById(R.id.Count6);

        increment6 = (Button) findViewById(R.id.increment6);
        decrement6 = (Button) findViewById(R.id.decrement6);

        Count6.setText("0");

        increment6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pCountInt = Integer.parseInt(Count6.getText().toString().trim());
                pCountInt++;
                String pCountStr = Integer.toString(pCountInt);
                Count6.setText(pCountStr);
            }
        });

        decrement6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pCountInt = Integer.parseInt(Count6.getText().toString().trim());
                pCountInt--;
                String pCountStr = Integer.toString(pCountInt);
                Count6.setText(pCountStr);
            }
        });
        checkBox6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Checkbox is checked
                    // Perform your logic here when the checkbox is clicked
                    Count6.setText("500");
                } else {
                    // Checkbox is not checked
                    // Perform your logic here when the checkbox is not clicked
                    Count6.setText("0");
                }
            }
        });



        // 7 =============================================================

        checkBox7 = findViewById(R.id.checkBox7);
        Count7 = (EditText) findViewById(R.id.Count7);

        increment7 = (Button) findViewById(R.id.increment7);
        decrement7 = (Button) findViewById(R.id.decrement7);

        Count7.setText("0");

        increment7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pCountInt = Integer.parseInt(Count7.getText().toString().trim());
                pCountInt++;
                String pCountStr = Integer.toString(pCountInt);
                Count7.setText(pCountStr);
            }
        });

        decrement7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pCountInt = Integer.parseInt(Count7.getText().toString().trim());
                pCountInt--;
                String pCountStr = Integer.toString(pCountInt);
                Count7.setText(pCountStr);
            }
        });
        checkBox7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Checkbox is checked
                    // Perform your logic here when the checkbox is clicked
                    Count7.setText("2");
                } else {
                    // Checkbox is not checked
                    // Perform your logic here when the checkbox is not clicked
                    Count7.setText("0");
                }
            }
        });



    }
}