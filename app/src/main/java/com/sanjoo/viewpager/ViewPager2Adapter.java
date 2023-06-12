package com.sanjoo.viewpager;

import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPager2Adapter extends FragmentStateAdapter {
    public ViewPager2Adapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

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
    public int getItemCount() {
        return 3;
    }
}
