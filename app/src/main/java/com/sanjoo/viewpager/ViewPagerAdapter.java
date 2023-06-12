package com.sanjoo.viewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                Fragment1 one=new Fragment1();
                return one;
            case 1:
                Fragment2 two=new Fragment2();
                return two;
            case 2:
                fragment3 three=new fragment3();
                return three;

            default:
                return null;
        }

    }
    @Override
    public int getCount() {
        return 3;
    }
}
