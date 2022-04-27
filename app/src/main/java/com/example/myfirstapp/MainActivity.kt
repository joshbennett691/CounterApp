package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.myButton)
//        btnClickMe.setOnClickListener{
//            btnClickMe.text =  "Haha you clicked me!"
//        }

        val txtView = findViewById<TextView>(R.id.textView)
        var timesClicked = 0
        btnClickMe.setOnClickListener{
            timesClicked += 1
            txtView.text = "You clicked the button " + timesClicked + " times!"
//            Toast.makeText(this, "Hey I'm a toast!", Toast.LENGTH_LONG).show()
        }
    }
}