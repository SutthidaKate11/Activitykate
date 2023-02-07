package com.example.intentactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main1.*
import kotlinx.android.synthetic.main.activity_main10.*

class MainActivity10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main10)

        a10.setOnClickListener {
            val intent = Intent(this@MainActivity10, MainActivityFinish::class.java)
            startActivity(intent)
        }
    }
}