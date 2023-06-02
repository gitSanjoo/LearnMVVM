package com.sanjoo.learnmvvm.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sanjoo.learnmvvm.R;

public class fragment4 extends Fragment {

    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_fragment4, container, false);
        Log.d("lifecycle","fragment4::onActivityCreated() method executed");

        return view;
    }
    public  void onAttach(Context context) {

        super.onAttach(context);
        Log.d("lifecycle","fragment4::onAttach() method executed");

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("lifecycle","fragment4::onActivityCreated() method executed");

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("lifecycle","fragment4::onCreate() method executed");

    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("lifecycle","fragment4::onStart() method executed");

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("lifecycle","fragment4::onResume() method executed");

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("lifecycle","fragment4::onPause() method executed");

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("lifecycle","fragment4::onStop() method executed");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle","fragment4::onDestroy() method executed");

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("lifecycle","fragment4::onDestroyView() method executed");

    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("lifecycle","fragment4::onDetach() method executed");

    }
}

