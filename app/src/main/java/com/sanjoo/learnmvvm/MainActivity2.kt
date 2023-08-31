package com.sanjoo.learnmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.sanjoo.learnmvvm.databinding.ActivityMain2Binding
import com.sanjoo.learnmvvm.fragments.Fragment1
import com.sanjoo.learnmvvm.fragments.Fragment2
import com.sanjoo.learnmvvm.fragments.Fragment3

class MainActivity2 : AppCompatActivity(), View.OnClickListener {
    val fragment1=Fragment1()
    val fragment2= Fragment2()
    val fragment3= Fragment3()
    var fragment=Fragment()

     private lateinit var binding:ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=DataBindingUtil.setContentView(this,R.layout.activity_main2)

        initClickListeners()
    }

    private fun initClickListeners(){
        binding.button1Act2.setOnClickListener(this)
        binding.button2Act2.setOnClickListener(this)
        binding.button3Act2.setOnClickListener(this)


        /*binding.button1Act2.setOnClickListener(View.OnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frame_layout,fragment1)
                    .addToBackStack(null)
                    .commit()
            }

        })
        binding.button2Act2.setOnClickListener(View.OnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frame_layout,fragment2)
                    .addToBackStack(null)
                    .commit()
            }

        })
        binding.button3Act2.setOnClickListener(View.OnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frame_layout,fragment3)
                    .addToBackStack(null)
                    .commit()
            }

        })*/
    }

    override fun onClick(view: View?) {
        when(view?.id){
            binding.button1Act2.id->fragment=fragment1
            binding.button2Act2.id->fragment=fragment2
            binding.button3Act2.id->fragment=fragment3
        }
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frame_layout,fragment)
                .addToBackStack(null)
                .commit()

        }

    }
}