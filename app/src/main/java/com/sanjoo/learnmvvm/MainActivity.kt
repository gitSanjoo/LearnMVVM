package com.sanjoo.learnmvvm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.sanjoo.learnmvvm.databinding.ActivityMainBinding
import java.util.logging.LogManager

class MainActivity : AppCompatActivity() {
    val songList= listOf<String>("tum se hi","ajnabee","madhaniya","vo lamhe","tum se hi","ajnabee","agar tum sath ho","dilbaro","madhaniya","vo lamhe")

    private lateinit var binding:ActivityMainBinding
    val car=Car("mustang",34)
    val car2=Car("BALENO",56)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        car.name="fortuner"
        car2.fullName="q"
        Log.d("car_name","car name is :${car.name}")
        Log.d("full_name","full car name is :${car2.fullName}")
        car.distanceCovered()
        binding.nextBtn.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
        })

        //recyclerview 2 start
        val songsObject= mutableListOf<Songs>()
        songsObject.add(Songs("tum se hi","descp"))
        songsObject.add(Songs("agar tum sath ho","descp"))
        songsObject.add(Songs("dilbaro","descp"))
        songsObject.add(Songs("madhaniya","descp"))
        songsObject.add(Songs("vo lamhe","descp"))
        songsObject.add(Songs("tum se hi","descp"))
        songsObject.add(Songs("agar tum sath ho","descp"))
        songsObject.add(Songs("dilbaro","descp"))
        songsObject.add(Songs("madhaniya","descp"))
        songsObject.add(Songs("vo lamhe","descp"))
        songsObject.add(Songs("tum se hi","descp"))
        songsObject.add(Songs("agar tum sath ho","descp"))
        songsObject.add(Songs("dilbaro","descp"))
        songsObject.add(Songs("madhaniya","descp"))
        songsObject.add(Songs("vo lamhe","descp"))

        binding.recyclerViewAct1.adapter=SongAdapter(songsObject)
        binding.recyclerViewAct1.layoutManager=LinearLayoutManager(this)

        //recyclerview 1 start
    }
}
class Car(var name:String,var distance:Int){

    var fullName = "full name"
        get()="${name} is my car"
        set(value) {
            if(value.length<2){
                Log.d("set_name","try again")
            }else {
                field = value
            }
        }
    fun distanceCovered(){
        println("distance in km : ")
    }

}