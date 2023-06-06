package com.example.everymovethecodemonsterpartapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.ktx.Firebase;

import java.util.HashMap;
import java.util.Map;

public class AddData extends AppCompatActivity {
    private EditText name, course, email, purl;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_data);

        name = (EditText) findViewById(R.id.txtName);
        course = (EditText) findViewById(R.id.txtCourse);
        email = (EditText) findViewById(R.id.txtEmail);
        purl = (EditText) findViewById(R.id.txtProfileURL);

        submit = (Button) findViewById(R.id.firebaseBtn);
    }

    @Override
    public void onResume(){
        super.onResume();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processinsert();
            }
        });
    }

    private void processinsert(){
        Map<String, Object> map = new HashMap<>();
        map.put("name", name.getText().toString());
        map.put("course", course.getText().toString());
        map.put("email", email.getText().toString());
        map.put("purl", purl.getText().toString());

        FirebaseDatabase.getInstance().getReference().child("Students").push()
                .setValue(map)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void unused) {
                        name.setText("");
                        course.setText("");
                        email.setText("");
                        purl.setText("");
                        Toast.makeText(getApplicationContext(), "Datas are successfully inserted to database", Toast.LENGTH_SHORT).show();
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        name.setText("");
                        course.setText("");
                        email.setText("");
                        purl.setText("");
                        Toast.makeText(getApplicationContext(), "Insertion to database is fail", Toast.LENGTH_SHORT).show();
                    }
                });
    }
}