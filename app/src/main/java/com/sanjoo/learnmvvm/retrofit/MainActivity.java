package com.sanjoo.learnmvvm.retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

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

    private NetworkApi initRetrofitApiService(){
        Retrofit retrofit = RetrofitInstance.getRetrofitInstance();
        NetworkApi api=retrofit.create(NetworkApi.class);
        return api;
    }

    private List<User> getUsersFromApi(){
        try {
            List<User> users = initRetrofitApiService().getUsers().execute().body();
            Log.d("getUsersFromApiResult",users.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}