package com.example.remember

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.remember.databinding.LauncherScreenBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: LauncherScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LauncherScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}