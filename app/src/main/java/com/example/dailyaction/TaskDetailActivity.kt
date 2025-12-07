package com.example.dailyaction

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dailyaction.databinding.ActivityTaskDetailBinding

class TaskDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTaskDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTaskDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.backFromTaskDetail.setOnClickListener{ finish() }
        binding.markAsCompleted.setOnClickListener { finish() }
    }
}