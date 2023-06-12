package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class finish : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        var menu_Btn:Button = findViewById(R.id.menu_btn)


        val score =  intent.getIntExtra("score1",-1)

        var tv_score:TextView = findViewById(R.id.tv_score)
        tv_score.text = "You have scored $score out of 5"


        menu_Btn.setOnClickListener(){
            val intent1 = Intent(this, Homepage::class.java)
            startActivity(intent1)
        }




    }
}