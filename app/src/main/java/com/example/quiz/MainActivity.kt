package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var binding :ActivityMainBinding ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val intent = Intent(this,Homepage::class.java)
        startActivity(intent)

        binding?.loginBtn?.setOnClickListener() {
            val intent = Intent(this,Homepage::class.java)
            startActivity(intent)
        }

    }
}