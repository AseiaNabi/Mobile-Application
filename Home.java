package com.example.myauaf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {


   Button applicationPage, locationPage, calenderPage, contactPage, viewPage, campusPage, eligibilityPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_home);
        applicationPage = findViewById(R.id.btnapplication);
        applicationPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenta = new Intent(Home.this, application.class);
                startActivity(intenta);
            }
        });

        locationPage = findViewById(R.id.btnlocation);
        locationPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentl = new Intent(Home.this, Location.class);
                startActivity(intentl);
            }
        });

        calenderPage = findViewById(R.id.btnCalender);
        calenderPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentl = new Intent(Home.this, Calender.class);
                startActivity(intentl);
            }
        });

        contactPage = findViewById(R.id.btnContact);
        contactPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentl = new Intent(Home.this, ContactActivity.class);
                startActivity(intentl);
            }
        });
        viewPage = findViewById(R.id.btnview);
        viewPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentl = new Intent(Home.this, pdfview.class);
                startActivity(intentl);
            }
        });
        campusPage = findViewById(R.id.btngallery);
        campusPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentl = new Intent(Home.this, CampusMainActivity.class);
                startActivity(intentl);
            }
        });
        eligibilityPage = findViewById(R.id.btnSE);
        eligibilityPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentl = new Intent(Home.this, scholarshipEligibility.class);
                startActivity(intentl);
            }
        });
    }




    public void btnapplication(View view) {
    }
}