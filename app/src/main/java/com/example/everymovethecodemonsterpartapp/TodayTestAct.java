package com.example.everymovethecodemonsterpartapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.FirebaseDatabase;

public class TodayTestAct extends AppCompatActivity {

    FloatingActionButton floatingButton;
    RecyclerView recview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today_test);

        floatingButton = findViewById(R.id.fadd);
        recview = (RecyclerView) findViewById(R.id.recview1);
    }

    @Override
    public void onResume(){
        super.onResume();

        floatingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), AddData.class);
                startActivity(i);
            }
        });

        recview.setLayoutManager(new LinearLayoutManager(this));

//        FirebaseRecylcerOptions<model> options=
//                new FirebaseRecyclerOptions.build<model>()
//                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Students", model.class))
//                        .build();
//        adepter = new myadepter(options);
    }
}