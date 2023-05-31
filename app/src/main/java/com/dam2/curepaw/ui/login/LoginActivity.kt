package com.dam2.curepaw.ui.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dam2.curepaw.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //inflate binding
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}