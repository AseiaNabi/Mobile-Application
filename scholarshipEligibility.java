package com.example.myauaf;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class scholarshipEligibility extends AppCompatActivity {
    Button mailer;
    String editTextTo ="Scholarship/FA application";
    EditText editTextMessage, editTextMessage2, editTextMessage3, editTextMessage4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scholarship_eligibility);


        editTextMessage=(EditText)findViewById(R.id.et1);
        editTextMessage2=(EditText)findViewById(R.id.et2);
        editTextMessage3=(EditText)findViewById(R.id.et3);
        editTextMessage4=(EditText)findViewById(R.id.et4);

        mailer=(Button)findViewById(R.id.formsubmit);
        mailer.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {


                String message=editTextMessage.getText().toString();
                String message2=editTextMessage2.getText().toString();
                String message3=editTextMessage3.getText().toString();
                String message4=editTextMessage4.getText().toString();


                Intent email = new Intent(Intent.ACTION_SEND);

                email.putExtra(Intent.EXTRA_SUBJECT, editTextTo);
                email.putExtra(Intent.EXTRA_TEXT, message);
                email.putExtra(Intent.EXTRA_TEXT, message2);
                email.putExtra(Intent.EXTRA_TEXT, message3);
                email.putExtra(Intent.EXTRA_TEXT, message4);



                //need this to prompts email client only
                email.setType("message/rfc822");
                email.setType("message2/rfc822");
                email.setType("message3/rfc822");
                email.setType("message4/rfc822");

                startActivity(Intent.createChooser(email, "nabiaseia@gmail.com"));


            }

        });



    }

    public void submit(View view) {
    }
}