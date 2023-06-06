package com.sanjoo.learnmvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.sanjoo.learnmvvm.databinding.ActivityTestingBinding;

public class TestingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ActivityTestingBinding binding= DataBindingUtil. setContentView(this,R.layout.activity_testing);

        binding.openWebBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url=binding.t1.getText().toString();
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        binding.btnToNxtAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),ImageSharingActivity.class);
                intent.putExtra("email","sawami@gmail");
                intent.putExtra("name","sanju");
                intent.putExtra("no","58659459847859");
                startActivity(intent);
            }
        });
    }
}