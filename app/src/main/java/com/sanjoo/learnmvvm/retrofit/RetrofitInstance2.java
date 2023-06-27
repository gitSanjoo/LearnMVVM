package com.sanjoo.learnmvvm.retrofit;

import org.jetbrains.annotations.NotNull;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance2 {

    public RetrofitInstance2(){
    }

    public static Retrofit retrofit;
    private static final String B_url="https://jsonplaceholder.typicode.com";

    public static Retrofit getRetrofitInstance2(){

        if(retrofit==null){
            retrofit=new Retrofit.Builder()
                    .baseUrl(B_url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
