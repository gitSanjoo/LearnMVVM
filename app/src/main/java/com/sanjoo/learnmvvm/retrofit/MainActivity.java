package com.sanjoo.learnmvvm.retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;

import com.sanjoo.learnmvvm.R;
import com.sanjoo.learnmvvm.retrofit.models.User;

import java.io.IOException;
import java.util.List;

import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getUsersFromApi();
    }

    NetworkApi initRetrofitApiService(){
        Retrofit retrofit = RetrofitInstance.getRetrofitInstance(this);
        NetworkApi api=retrofit.create(NetworkApi.class);

        return api;
    }

    private List<User> getUsersFromApi(){
        try {
            initRetrofitApiService().getUser().execute().body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}