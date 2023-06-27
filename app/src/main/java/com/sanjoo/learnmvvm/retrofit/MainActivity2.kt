package com.sanjoo.learnmvvm.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sanjoo.learnmvvm.R
import com.sanjoo.learnmvvm.retrofit.RetrofitInstance2.retrofit
import com.sanjoo.learnmvvm.retrofit.models.Photos
import com.sanjoo.learnmvvm.retrofit.models.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import java.io.IOException

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.acivity_main2);
    }
//    private fun initRetrofitApiService(): NetworkApi {
//        val retrofit = RetrofitInstance.getRetrofitInstance()
//        return retrofit.create(NetworkApi::class.java)
//    }

    private fun initRetrofitApiService2() : NetworkApi2{
        val retrofit=RetrofitInstance2.getRetrofitInstance2()
        return retrofit.create(NetworkApi2::class.java)
    }
//    private fun getUsersFromApi() {
//        lifecycleScope.launch(Dispatchers.IO) {
//            try {
//                val users = initRetrofitApiService().users.execute().body()
//                Log.d("getUsersFromApiResult", users.toString())
//                if (users != null) {
//                    initAdaptor(users)
//                }
//            } catch (e: IOException) {
//                e.printStackTrace()
//            }
//        }
//    }
//

    private fun getPhotosFromApi(){
        lifecycleScope.launch(Dispatchers.IO){
            try {
                val photo=initRetrofitApiService2().photos.execute().body()
                 Log.d("getUsersFromApiResult", photo.toString())
                if(photo!=null) {

                }
            }
            catch (e:IOException){
                e.printStackTrace()
            }
        }
    }
//    private fun initAdaptor(users : List<User>){
//        lifecycleScope.launch(Dispatchers.Main) {
//            val recyclerView = activityMainBinding.recyclerView
//            recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
//            val adapter = UsersAdapter(users)
//            recyclerView.adapter = adapter
//        }
//
    private fun initPhotoAdapter(photo : List<Photos>){
        lifecycleScope.launch(Dispatchers.Main){
            val recyclerView2=findViewById<RecyclerView>(R.id.recyclerView2)
            recyclerView2.layoutManager=LinearLayoutManager(this@MainActivity2)
            val adapter=PhotosAdapter(photo)
            recyclerView2.adapter=adapter
        }
    }
}