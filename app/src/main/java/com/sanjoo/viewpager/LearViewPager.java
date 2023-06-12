package com.sanjoo.viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.sanjoo.learnmvvm.R;

public class LearViewPager extends AppCompatActivity {

    ViewPager2 viewPager2;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lear_view_pager);

//        viewPager2=findViewById(R.id.v_p_2);
//
//        ViewPager2Adapter adapter=new ViewPager2Adapter(getSupportFragmentManager(),getLifecycle());
//        viewPager2.setAdapter(adapter);
//

        viewPager=findViewById(R.id.v_pager);
        ViewPagerAdapter viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(viewPagerAdapter);
    }
}