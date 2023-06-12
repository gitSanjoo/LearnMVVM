package com.sanjoo.learnmvvm.sharedPrefrence;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.sanjoo.learnmvvm.R;

public class Profile extends AppCompatActivity {
    TextView profile_name;
    SessionManager sessionManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        sessionManager=new SessionManager(getApplicationContext());

        profile_name=findViewById(R.id.profile_name);

        String name=sessionManager.getSessionDetails("key_session_name");
        profile_name.setText(name);
    }

    public void Logout(View view){
        sessionManager.logoutSession();
        Intent intent=new Intent(this,Login.class);
        startActivity(intent);
    }
}