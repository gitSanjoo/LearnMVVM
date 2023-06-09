package com.sanjoo.learnmvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.sanjoo.learnmvvm.databinding.ActivityZoomInOutBinding;

public class ZoomInOut extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityZoomInOutBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_zoom_in_out);


        Animation animationIn= AnimationUtils.loadAnimation(this,R.anim.zoomin);
        binding.zoominImage.startAnimation(animationIn);

        Animation animationOut=AnimationUtils.loadAnimation(this,R.anim.zoomout);
        binding.zoomOutImage.startAnimation(animationOut);
    }
}