package com.sanjoo.learnmvvm.retrofit.Tablayout.dgdh;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class TabAdapter extends FragmentStateAdapter {
    public TabAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position){
            case 0:
                return new BlankFragment1();
                case 1:
                return new BlankFragment2();
                 case 2:
                return new BlankFragment3();
            default:
                return null;

        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
