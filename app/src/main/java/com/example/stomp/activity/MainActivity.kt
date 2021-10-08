package com.example.stomp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.stomp.databinding.ActivityMainBinding
import com.example.stomp.viewmodel.AuthViewModel
import com.example.stomp.R

class MainActivity : AppCompatActivity() {

    private val viewModel = AuthViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = viewModel
    }
}