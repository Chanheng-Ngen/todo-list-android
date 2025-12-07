package com.example.dailyaction

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.dailyaction.databinding.ActivityWelcomeBinding

class MainActivity : AppCompatActivity(){
    private lateinit var binding: ActivityWelcomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//      Setup UI
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
//      Delay 2s for navigation to HomeActivity
        Handler().postDelayed({
            val intent = Intent(this@MainActivity, HomeActivity::class.java)
            startActivity(intent)
        }, 3000)
    }
}