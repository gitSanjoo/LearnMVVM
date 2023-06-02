package com.sanjoo.learnmvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.sanjoo.learnmvvm.fragments.fragment3;

public class MainActivity2 extends AppCompatActivity {
    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("lifecycle","MainActivity2::onCreate() method executed");

    }

    protected void onStart() {

        super.onStart();
        Log.d("lifecycle","MainActivity2::onStart() method executed");
    }protected void onResume() {

        super.onResume();
        Log.d("lifecycle","MainActivity2::onResume() method executed");
    }protected void onPause() {

        super.onPause();
        Log.d("lifecycle","MainActivity2::onPause() method executed");
    }protected void onStop() {

        super.onStop();
        Log.d("lifecycle","MainActivity2::onStop() method executed");
    }protected void onRestart() {

        super.onRestart();
        Log.d("lifecycle","MainActivity2::onRestart() method executed");
    }protected void onDestroy() {

        super.onDestroy();
        Log.d("lifecycle","MainActivity2::onDestroy() method executed");
    }
    public void goToFragment3(View view){
        replaceFragments(new fragment3());

    }
    private void replaceFragments(Fragment fragment){
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame,fragment);
        fragmentTransaction.commit();
    }


}