package com.sanjoo.learnmvvm.retrofit

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sanjoo.learnmvvm.R
import com.sanjoo.learnmvvm.databinding.ActivityMainBinding
import com.sanjoo.learnmvvm.retrofit.models.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.io.IOException




class MainActivity : AppCompatActivity() {

    lateinit var activityMainBinding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        activityMainBinding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        getUsersFromApi()
    }

    private fun initRetrofitApiService(): NetworkApi {
        val retrofit = RetrofitInstance.getRetrofitInstance()
        return retrofit.create(NetworkApi::class.java)
    }

    private fun getUsersFromApi() {
        lifecycleScope.launch(Dispatchers.IO) {
            try {
                val users = initRetrofitApiService().users.execute().body()
                Log.d("getUsersFromApiResult", users.toString())
                if (users != null) {
                    initAdaptor(users)
                }
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }
    }


    private fun initAdaptor(users : List<User>){
        lifecycleScope.launch(Dispatchers.Main) {
            val recyclerView = activityMainBinding.recyclerView
            recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
            val adapter = UsersAdapter(users)
            recyclerView.adapter = adapter
        }
    }
}