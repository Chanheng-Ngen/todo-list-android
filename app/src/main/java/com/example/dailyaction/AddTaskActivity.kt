package com.example.dailyaction

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dailyaction.databinding.ActivityAddTaskBinding

class AddTaskActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddTaskBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddTaskBinding.inflate(layoutInflater)
        setContentView(binding.root)

//      Even listener
        binding.backFromCreateTask.setOnClickListener { finish() }
        binding.cancel.setOnClickListener{ finish() }
        binding.createTask.setOnClickListener { finish()  }
    }
}