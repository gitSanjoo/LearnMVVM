package com.sanjoo.learnmvvm.retrofit.Tablayout.service;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.sanjoo.learnmvvm.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent=new Intent(this,ServiceExample.class);
        ContextCompat.startForegroundService(this,intent);
    }
}