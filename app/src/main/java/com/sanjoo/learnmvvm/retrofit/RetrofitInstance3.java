package com.sanjoo.learnmvvm.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public  class  RetrofitInstance3{

    public  RetrofitInstance3(){

    }
    public static Retrofit retrofit3;

    public static final String base_url="https://jsonplaceholder.typicode.com";

    public static Retrofit getRetrofitInstance3(){
        if(retrofit3==null){
            retrofit3=new Retrofit.Builder()
                    .baseUrl(base_url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit3;
    }
}
