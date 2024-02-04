package com.example.myauaf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signup extends AppCompatActivity {
    app_db appdb;
    EditText name, email, password, Id;
    Button signIn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_activity);
        appdb = new app_db(this, "sample.db", 1);
        try {
            appdb.checkdb();

        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            appdb.Opendatabse();
        }catch (Exception e){
            e.printStackTrace();
        }
        name =findViewById(R.id.txtfname);
        email =findViewById(R.id.txtemail);
        Id =findViewById(R.id.auafID);
        password =findViewById(R.id.txtpassword);



        signIn= findViewById(R.id.btnSignUp);



    }
}