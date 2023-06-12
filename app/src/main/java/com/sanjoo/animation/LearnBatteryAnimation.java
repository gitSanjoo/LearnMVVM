package com.sanjoo.animation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;

import com.sanjoo.learnmvvm.R;
import com.sanjoo.learnmvvm.databinding.ActivityLearnBatteryAnimationBinding;

public class LearnBatteryAnimation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityLearnBatteryAnimationBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_learn_battery_animation);

        binding.batteryImage.setBackgroundResource(R.drawable.battery_items);

        AnimationDrawable animationDrawable=(AnimationDrawable) binding.batteryImage.getBackground();
        animationDrawable.start();
    }
}