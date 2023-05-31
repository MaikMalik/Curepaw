package com.dam2.curepaw.ui.signup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dam2.curepaw.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}