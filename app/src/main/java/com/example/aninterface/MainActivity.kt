package com.example.aninterface

import android.app.Activity
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.aninterface.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    var interactionInterface:InteractionInterface?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.btn1.setOnClickListener(){
           interactionInterface?.changeColor1()
        }
        binding.btn2.setOnClickListener(){
            interactionInterface?.changeColor2()
        }
        binding.btn3.setOnClickListener(){
            interactionInterface?.changeColor3()
        }

    }
    fun changeText1(){
        binding.btn1.setText("Changed by fragmment Button1")
    }
    fun changeText2(){
        binding.btn2.setText("Changed by fragmment Button2")
    }
    fun changeText3(){
        binding.btn3.setText("Changed by fragmment Button3")
    }

}