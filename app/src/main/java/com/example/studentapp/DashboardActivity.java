package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class DashboardActivity extends AppCompatActivity {
    AppCompatButton b1,b2,b3,b4,b5;
    SharedPreferences mypreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        mypreferences=getSharedPreferences("logout",MODE_PRIVATE);
        b1=(AppCompatButton) findViewById(R.id.addco);
        b2=(AppCompatButton) findViewById(R.id.addfac);
        b3=(AppCompatButton) findViewById(R.id.addxam);
        b4=(AppCompatButton) findViewById(R.id.viewweb);
        b5=(AppCompatButton) findViewById(R.id.logout);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),ViewActivity.class);
                startActivity(i);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor myedit=mypreferences.edit();
                myedit.clear();
                myedit.commit();
                Toast.makeText(getApplicationContext(), "successfully logout", Toast.LENGTH_SHORT).show();

                Intent i =new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);

            }
        });
    }
}