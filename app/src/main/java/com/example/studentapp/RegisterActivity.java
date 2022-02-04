package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4,ed5,ed6;
    AppCompatButton b1,b2;
    String getname,getroll,getano,getuname,getpass,getcpass,getlobtn,getrebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ed1=(EditText) findViewById(R.id.name);
        ed2=(EditText) findViewById(R.id.roll);
        ed3=(EditText) findViewById(R.id.ano);
        ed4=(EditText) findViewById(R.id.uname);
        ed5=(EditText) findViewById(R.id.pass);
        ed6=(EditText) findViewById(R.id.cpass);
        b1=(AppCompatButton) findViewById(R.id.rebtn
        );
        b2=(AppCompatButton) findViewById(R.id.lobtn);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getname=ed1.getText().toString();
                getroll=ed1.getText().toString();
                getano=ed1.getText().toString();
                getuname=ed1.getText().toString();
                getpass=ed1.getText().toString();
                getcpass=ed1.getText().toString();
                if (getcpass.equals(getcpass))
                {
                    Toast.makeText(getApplicationContext(), getname, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), getroll, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), getano, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), getuname, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), getpass, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), getcpass, Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "password and confirm password does not match", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}