package com.sanjoo.learnmvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.sanjoo.learnmvvm.databinding.ActivityBlinkBinding;

public class Blink extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityBlinkBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_blink);


        Animation animation= AnimationUtils.loadAnimation(this,R.anim.blink);
        binding.blinkImage.startAnimation(animation);


    }
}