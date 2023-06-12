package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quiz.databinding.ActivityHomepageBinding

class Homepage : AppCompatActivity() {
    var binding: ActivityHomepageBinding ?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityHomepageBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.logoCard?.setOnClickListener(){
            var subject = "Logo"
            val intent = Intent(this,mathsquiz::class.java)
            intent.putExtra("subject", subject)
            startActivity(intent)
        }

        binding?.mathsCard?.setOnClickListener(){
            var subject = "Maths"
            val intent = Intent(this,mathsquiz::class.java)
            intent.putExtra("subject" , subject )
            startActivity(intent)
        }

        binding?.sportsCard?.setOnClickListener(){
            var subject = "Sports"
            val intent = Intent(this,mathsquiz::class.java)
            intent.putExtra("subject" , subject )
            startActivity(intent)
        }


        binding?.GKCard?.setOnClickListener(){
            var subject = "GK"
            val intent = Intent(this,mathsquiz::class.java)
            intent.putExtra("subject" , subject )
            startActivity(intent)
        }



        binding?.tvHistory?.setOnClickListener(){
            val intent = Intent(this,history::class.java)
            startActivity(intent)
        }

    }
}