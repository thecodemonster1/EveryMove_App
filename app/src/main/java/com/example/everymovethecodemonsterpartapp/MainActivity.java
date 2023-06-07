package com.example.everymovethecodemonsterpartapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    private Button inputBtn;
    private TextView message;
    private String uParent;
    private String uChild;
    private String searchPlan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        DatabaseReference databaseReference = firebaseDatabase.getReference("Personal Plans").child("testID3");


        //set title of the app
        getSupportActionBar().setTitle("Every Move");


        //set the variables of buttons
        inputBtn = (Button) findViewById(R.id.buttonInput);
        message = (TextView) findViewById(R.id.textMessage);


//        // Perform the search query
        databaseReference.orderByChild(uParent).equalTo(searchPlan).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Data is retrieved successfully
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    // Process each retrieved data item
                    String data = snapshot.getValue(String.class);
                    // Perform actions with the retrieved data
                    // ...
                    Toast.makeText(MainActivity.this, data, Toast.LENGTH_LONG).show();
                    Intent iBig = new Intent(getApplicationContext(), beginners_plan_activity.class);
                    startActivity(iBig);

                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                // Error occurred while retrieving data
                // Handle the error
                Toast.makeText(MainActivity.this, "Error in Database", Toast.LENGTH_LONG).show();
            }
        });


//        inputBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent iBig = new Intent(getApplicationContext(), beginners_plan_activity.class);
//                startActivity(iBig);
//            }
//        });



        // Attach a ValueEventListener to retrieve data
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called when the data is changed or fetched for the first time
                // Retrieve the data from the snapshot

                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    // Access individual child nodes
                    String key = snapshot.getKey();
                    String value = snapshot.getValue(String.class);

                    // Do something with the data

                    Toast.makeText(MainActivity.this, key +" : "+ value, Toast.LENGTH_LONG).show();
                    if (key.equals("planName")) {
                        // Use the value associated with the key
                        message.setText("Your Workout Plan is : " + value);
                        searchPlan = value;
                        Toast.makeText(MainActivity.this, key +" : "+ value, Toast.LENGTH_LONG).show();
                        break; // Exit the loop if the key is found
                    }



                    Log.d("FirebaseData", "Value: " + value);
                }
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // This method is called if the retrieval is canceled or fails
                Toast.makeText(MainActivity.this, "Failed to retrieve data: " + error.getMessage(), Toast.LENGTH_LONG).show();
                Log.e("FirebaseData", "Failed to retrieve data: " + error.getMessage());
            }
        });

    }
}