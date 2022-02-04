package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddFaculty extends AppCompatActivity {
    EditText ed1, ed2, ed3, ed4;
    AppCompatButton b1, b2;
    String getfacultyename, getdepartment, getdesignation, getmobilenumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_faculty2);
        ed1 = (EditText) findViewById(R.id.fname);
        ed2 = (EditText) findViewById(R.id.dep);
        ed3 = (EditText) findViewById(R.id.desg);
        ed4 = (EditText) findViewById(R.id.mob);
        b1 = (AppCompatButton) findViewById(R.id.sub2);
        b2 = (AppCompatButton) findViewById(R.id.btdash2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), AddFaculty.class);
                startActivity(i);
            }

        });
    }
}
