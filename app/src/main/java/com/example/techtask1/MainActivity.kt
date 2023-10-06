package com.example.techtask1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.techtask1.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
//
//        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragment_cont)
//
//        binding.bottomNavigation.findNavController(navHostFragment.)
        binding.bottomNavigation.setupWithNavController(findNavController(R.id.fragment_cont))
    }
}