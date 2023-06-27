package com.sanjoo.learnmvvm.retrofit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.sanjoo.learnmvvm.R
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.create

class MainActivity3:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3);
    }
    private fun initRetrofitApiService3(): NetworkApi2 {
        val retrofit=RetrofitInstance3.getRetrofitInstance3()
        return retrofit.create(NetworkApi2::class.java)
    }
//    private fun getPhotosFromApi(){
//        lifecycleScope.launch(Dispatchers.IO){
//            try {
//                val photo=initRetrofitApiService2().photos.execute().body()
//                Log.d("getUsersFromApiResult", photo.toString())
//                if(photo!=null) {
//
//                }
//            }
//            catch (e:IOException){
//                e.printStackTrace()
//            }
//        }
//    }

//
    
}