package com.example.deliverly

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.deliverly.databinding.ActivityLoginBinding
import com.example.deliverly.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.toMap.setOnClickListener{
            val intent = Intent(this, ToMap::class.java)
            startActivity(intent)
        }
        binding.personalProfile.setOnClickListener {
            val intent = Intent(this, PersonalProfile::class.java)
            startActivity(intent)
        }
    }
}