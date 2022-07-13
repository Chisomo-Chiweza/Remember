package com.example.remember

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.remember.databinding.HomeBinding

class MainActivity : AppCompatActivity() {

    lateinit var homeBinding: HomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        homeBinding = HomeBinding.inflate(layoutInflater)
        val home = homeBinding.root
        setContentView(home)
    }
}