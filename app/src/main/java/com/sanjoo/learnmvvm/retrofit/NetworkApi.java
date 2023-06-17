package com.sanjoo.learnmvvm.retrofit;

import com.sanjoo.learnmvvm.retrofit.models.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NetworkApi {
    @GET("users")
    Call<List<User>> getUsers();
}
