package com.andreamw96.mysimplecleanarchitecture.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.andreamw96.mysimplecleanarchitecture.R
import com.andreamw96.mysimplecleanarchitecture.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val factory = MainViewModelFactory.getInstance()
        val mainViewModel = ViewModelProvider(this, factory)[MainViewModel::class.java]

        mainViewModel.setName("Andrea")
        mainViewModel.message.observe(this) {
            binding.tvWelcome.text = it.welcomeMessage
        }
    }
}