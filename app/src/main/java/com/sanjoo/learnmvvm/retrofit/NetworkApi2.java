package com.sanjoo.learnmvvm.retrofit;

import com.sanjoo.learnmvvm.retrofit.models.Photos;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NetworkApi2 {

    @GET("/photos")
    Call<List<Photos>> getPhotos();
}
