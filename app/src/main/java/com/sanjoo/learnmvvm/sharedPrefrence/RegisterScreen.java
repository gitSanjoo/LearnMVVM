package com.sanjoo.learnmvvm.sharedPrefrence;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.sanjoo.learnmvvm.R;

public class RegisterScreen extends AppCompatActivity {

    SessionManager sessionManager;

    EditText name1,email1,password1,phno1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_screen);

        sessionManager=new SessionManager(getApplicationContext());

        name1=findViewById(R.id.name1);
        email1=findViewById(R.id.email1);
        password1=findViewById(R.id.password1);
        phno1=findViewById(R.id.phno1);
    }

    public void register(View view){
        String name=name1.getText().toString();
        String email=email1.getText().toString();
        String password=password1.getText().toString();
        String phNo=phno1.getText().toString();


        sessionManager.createSession(name,email,phNo);
        Intent intent=new Intent(this,Profile.class);
        startActivity(intent);
    }

    public void openLoginScreen(View view){
        Intent intent=new Intent(this,Login.class);
        startActivity(intent);
    }
}