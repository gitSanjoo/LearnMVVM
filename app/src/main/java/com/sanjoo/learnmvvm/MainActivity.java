package com.sanjoo.learnmvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

//import com.sanjoo.learnmvvm.databinding.ActivityMainBinding;
import com.sanjoo.learnmvvm.fragments.fragment1;
import com.sanjoo.learnmvvm.fragments.fragment2;
import com.sanjoo.learnmvvm.models.Customer;
import com.sanjoo.learnmvvm.viewmodels.Mainviewmodel;

public class MainActivity extends AppCompatActivity {
    Mainviewmodel mainviewmodel;
    Button firstFragmentBtn,secondFragmentBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ActivityMainBinding mainBinding= DataBindingUtil. setContentView(this,R.layout.activity_main);
//        Customer customer=new Customer("nxjndckjcnkjb hjbcvfjkbvck bkkfjvbk");
//
//
//        mainviewmodel= ViewModelProviders.of(this).get(Mainviewmodel.class);
//        mainBinding.setCustomer(mainviewmodel.getCustomer());

      Log.d("lifecycle","MainActivity::onCreate() method executed");
    }
    protected void onStart() {

        super.onStart();
        Log.d("lifecycle","MainActivity::onStart() method executed");
    }protected void onResume() {

        super.onResume();
        Log.d("lifecycle","MainActivity::onResume() method executed");
    }protected void onPause() {

        super.onPause();
        Log.d("lifecycle","MainActivity::onPause() method executed");
    }protected void onStop() {

        super.onStop();
        Log.d("lifecycle","MainActivity::onStop() method executed");
    }protected void onRestart() {

        super.onRestart();
        Log.d("lifecycle","MainActivity::onRestart() method executed");
    }protected void onDestroy() {

        super.onDestroy();
        Log.d("lifecycle","MainActivity::onDestroy() method executed");
    }
    public void goToFragment1(View view){
        replaceFragment(new fragment1());
    }
    public void goToFragment2(View view){
        replaceFragment(new fragment2());
    }
    public void goToNextActivity(View view){
        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent);
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout,fragment);
        fragmentTransaction.commit();
    }
}