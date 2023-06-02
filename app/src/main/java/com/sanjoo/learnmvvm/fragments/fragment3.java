package com.sanjoo.learnmvvm.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
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
        Log.d("lifecycle","fragment3::onActivityCreated() method executed");


        return view;
}
    private void replaceFragment(Fragment fragment){

    }
    public  void onAttach(Context context) {

        super.onAttach(context);
        Log.d("lifecycle","fragment13::onAttach() method executed");

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("lifecycle","fragment3::onActivityCreated() method executed");

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("lifecycle","fragment3::onCreate() method executed");

    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("lifecycle","fragment3::onStart() method executed");

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("lifecycle","fragment3::onResume() method executed");

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("lifecycle","fragment3::onPause() method executed");

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("lifecycle","fragment3::onStop() method executed");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle","fragment3::onDestroy() method executed");

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("lifecycle","fragment3::onDestroyView() method executed");

    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("lifecycle","fragment3::onDetach() method executed");

    }
}


