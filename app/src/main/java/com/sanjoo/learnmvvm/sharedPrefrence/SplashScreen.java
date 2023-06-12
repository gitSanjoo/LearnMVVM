package com.sanjoo.learnmvvm.sharedPrefrence;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import com.sanjoo.learnmvvm.R;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SessionManager sessionManager=new SessionManager(getApplicationContext());
                boolean b=sessionManager.checkSession();

                if(b=false){
                    Log.d("pro","this is pro");
                    Intent intent=new Intent(getApplicationContext(),Profile.class);
                    startActivity(intent);
                }
                else {
                    Intent intent=new Intent(getApplicationContext(),Login.class);
                    startActivity(intent);
                }
            }
        }, 5000);

    }

}