package com.sanjoo.learnmvvm.retrofit.Tablayout.service;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.sanjoo.learnmvvm.R;
import com.sanjoo.learnmvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//       activity_main ActivityMainBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_main);

        Intent intent=new Intent(this,ServiceExample.class);
        ContextCompat.startForegroundService(this,intent);

//        binding.button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                startService(new Intent(MainActivity.this,MusicService.class));
//            }
//        });
//
//        binding.button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                stopService(new Intent(MainActivity.this,MusicService.class));
//            }
//        });
    }
}