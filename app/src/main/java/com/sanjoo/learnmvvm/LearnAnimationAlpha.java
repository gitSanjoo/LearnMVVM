package com.sanjoo.learnmvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.sanjoo.learnmvvm.databinding.ActivityLearnAnnimationBinding;

public class LearnAnimationAlpha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityLearnAnnimationBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_learn_annimation);

        Animation animation1 =AnimationUtils.loadAnimation(this,R.anim.fadein);
        binding.alphaImage1.startAnimation(animation1);

        Animation animation2=AnimationUtils.loadAnimation(this,R.anim.fadeout);
        binding.alphaImage2.startAnimation(animation2);

        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                binding.alphaImage1.setVisibility(View.GONE);
            }
        }, 6000);
    }
}