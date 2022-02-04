package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddCourse extends AppCompatActivity {
    EditText ed1, ed2, ed3, ed4;
    AppCompatButton b1, b2;
    String getcoursename, getdescription, getduration, getremarks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_course);
        ed1 = (EditText) findViewById(R.id.cname);
        ed2 = (EditText) findViewById(R.id.des);
        ed3 = (EditText) findViewById(R.id.dur);
        ed4 = (EditText) findViewById(R.id.rem);
        b1 = (AppCompatButton) findViewById(R.id.sub1);
        b2 = (AppCompatButton) findViewById(R.id.btdash1);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), DashboardActivity.class);
                startActivity(i);
            }

        });
    }
}