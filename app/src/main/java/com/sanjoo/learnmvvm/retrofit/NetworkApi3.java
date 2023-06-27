package com.sanjoo.learnmvvm.retrofit;

import com.sanjoo.learnmvvm.retrofit.models.Todo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface NetworkApi3 {
    @POST("/todos")
    Call<List<Todo>> getTodos();

}
