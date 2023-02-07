package com.example.intentactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main1.*
import kotlinx.android.synthetic.main.activity_main7.*

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)
            b7.setOnClickListener {
            val intent = Intent(this@MainActivity7, MainActivity8::class.java)
            startActivity(intent)
        }
    }
}