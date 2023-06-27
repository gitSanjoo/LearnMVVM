package com.sanjoo.learnmvvm.retrofit.Tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.google.android.material.tabs.TabLayout;
import com.sanjoo.learnmvvm.R;
import com.sanjoo.learnmvvm.databinding.ActivityTabLayoutBinding;

public class LearnTabLayout extends AppCompatActivity {
//    LearnTabLayout tabLayout;
//    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_tab_layout);

//        tabLayout=(LearnTabLayout) findViewById(R.id.tab_layout);

        ActivityTabLayoutBinding binding= DataBindingUtil.setContentView(this, R.layout.activity_tab_layout);

//        TabLayout tabLayout=binding.tabLayout;
//
//                TabLayout.Tab tabOne=binding.tabLayout.newTab();
//                tabOne.setText("chat");
//                tabOne.setIcon(R.drawable.baseline_agriculture_24);
//                binding.tabLayout.addTab(tabOne);
//
//                TabLayout.Tab tabTwo=binding.tabLayout.newTab();
//                 tabTwo.setText("chat");
//                 tabTwo.setIcon(R.drawable.baseline_agriculture_24);
//                 binding.tabLayout.addTab(tabTwo);
//
//
//                TabLayout.Tab tabThree=binding.tabLayout.newTab();
//                tabThree.setText("chat");
//                tabThree.setIcon(R.drawable.baseline_agriculture_24);
//                binding.tabLayout.addTab(tabThree);
//
//
//        Fragment fragment1=new BlankFragment1();
//        FragmentManager fragmentManager=getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
//        fragmentTransaction.add(R.id.frame_layout,fragment1);
//        fragmentTransaction.commit();
//
//        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//                Fragment fragment=null;
//
//                switch (tab.getPosition()){
//                    case 0:
//                         fragment=new BlankFragment1();
//                         break;
//                    case 1:
//                        fragment=new BlankFragment2();
//                        break;
//                    case 2:
//                        fragment=new BlankFragment3();
//                        break;
//
//                }
//                FragmentManager fragmentManager=getSupportFragmentManager();
//                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
//                fragmentTransaction.replace(R.id.frame_layout,fragment);
//                fragmentTransaction.commit();
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//
//            }
//        });
//

        TabAdapter adapter=new TabAdapter(getSupportFragmentManager(),getLifecycle());
//        binding.viewPager.setAdapter(adapter);

    }
}