package com.example.dailyaction

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dailyaction.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity(){
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
//      Even listener
        binding.createTask.setOnClickListener { openAddTask() }
        binding.setting.setOnClickListener { openSetting() }
        binding.task01.setOnClickListener { openTaskDetail() }
    }

    private  fun openAddTask(){
        val intent = Intent(this@HomeActivity, AddTaskActivity::class.java)
        startActivity(intent)
    }
    private  fun openSetting(){
        val intent = Intent(this@HomeActivity, SettingActivity::class.java)
        startActivity(intent)
    }

    private fun openTaskDetail(){
        val intent = Intent(this@HomeActivity, TaskDetailActivity::class.java)
        startActivity(intent)
    }
}