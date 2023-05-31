package com.dam2.curepaw.ui.introduction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dam2.curepaw.databinding.ActivityIntroductionBinding

class IntroductionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityIntroductionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //inflate binding
        binding = ActivityIntroductionBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}