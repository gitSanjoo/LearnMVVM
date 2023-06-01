package com.sanjoo.learnmvvm.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.sanjoo.learnmvvm.R;


public class fragment3 extends Fragment {

    Button btn;
  View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =inflater.inflate(R.layout.fragment_fragment3, container, false);
        btn=view.findViewById(R.id.btn5);
        Fragment fragment=new fragment4();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction=getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container,fragment);
                fragmentTransaction.commit();
                btn.setVisibility(View.GONE);
            }
        });

     return view;
}
    private void replaceFragment(Fragment fragment){

    }

}