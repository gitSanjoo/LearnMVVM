package com.sanjoo.learnmvvm.retrofit

import com.sanjoo.learnmvvm.retrofit.models.User
import retrofit2.Call
import retrofit2.http.GET

interface NetworkApi {
    @GET("users")
    fun getUsers(): Call<List<User?>?>
}