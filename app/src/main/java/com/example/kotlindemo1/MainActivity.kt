package com.example.kotlindemo1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//
//        btnAge.setOnClickListener {
//
//        }
    }

    fun btnFindAgeEvent(view:View){
        val yearOfBirth: Int = txtAge.text.toString().toInt()
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val myAge = currentYear - yearOfBirth
        txtShowAge.text = "Your Age is $myAge years old"
    }
}
