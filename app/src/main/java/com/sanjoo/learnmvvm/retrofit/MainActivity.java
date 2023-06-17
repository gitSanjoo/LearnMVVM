package com.sanjoo.learnmvvm.retrofit

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.sanjoo.learnmvvm.R
import com.sanjoo.learnmvvm.retrofit.models.User
import java.io.IOException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getUsersFromApi()
    }

    private fun initRetrofitApiService(): NetworkApi {
        val retrofit = RetrofitInstance.getRetrofitInstance()
        return retrofit.create(NetworkApi::class.java)
    }

    private fun getUsersFromApi() {
        try {
            val users = initRetrofitApiService().users.execute().body()!!
            Log.d("getUsersFromApiResult", users.toString())
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}