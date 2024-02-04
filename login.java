package com.example.myauaf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {

    Button signup;
    EditText email, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

       Button login = (Button) findViewById(R.id.btnLogin);
       login.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(com.example.myauaf.login.this, Home.class));

           }
       });
        signup = findViewById(R.id.btnSignUp);

        email = findViewById(R.id.txtEmailAddress);
        password = findViewById(R.id.txtPassword);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(com.example.myauaf.login.this, com.example.myauaf.signup.class);
                startActivity(intent1);
            }
        });

    }

    public void signup(View view) {
    }

    public void btnLogin(View view) {
    }
}