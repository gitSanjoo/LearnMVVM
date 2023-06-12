package com.sanjoo.retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.sanjoo.learnmvvm.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LearnRetrofit extends AppCompatActivity {

    public static String api="https://jsonplaceholder.typicode.com";
    List<userModel> allUsersList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_retrofit);

        RetrofitInstance.getInstance().apiInterface.getUser().enqueue(new Callback<List<userModel>>() {
            @Override
            public void onResponse(Call<List<userModel>> call, Response<List<userModel>> response) {

                allUsersList=response.body();
                for(int i=0;i<allUsersList.size();i++){
                    Log.e("api","onResponse"+allUsersList.get(i).getTitle());

                }
            }

            @Override
            public void onFailure(Call<List<userModel>> call, Throwable t) {

                Log.e("api","onFailure"+t.getLocalizedMessage());
            }
        });



    }
}