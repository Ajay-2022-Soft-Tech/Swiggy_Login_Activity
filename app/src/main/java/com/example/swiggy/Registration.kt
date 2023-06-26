package com.example.swiggy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Registration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val btn1 = findViewById<Button>(R.id.button2)

        btn1.setOnClickListener {
            val intent = Intent(this, finalRegi::class.java)
            startActivity(intent)
        }
    }
}