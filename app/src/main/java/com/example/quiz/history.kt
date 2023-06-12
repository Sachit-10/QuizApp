package com.example.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.quiz.databinding.ActivityHistoryBinding

class history : AppCompatActivity() {
    var binding: ActivityHistoryBinding?=null

    private val historyviewmodel: history_viewmodel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHistoryBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        historyviewmodel.getalrecords().observe(this){
            binding?.rvHistory?.layoutManager = LinearLayoutManager(this)
            binding?.rvHistory?.adapter = history_adapter(this, it)

        }





    }
}

