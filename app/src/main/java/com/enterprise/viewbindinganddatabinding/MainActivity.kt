package com.enterprise.viewbindinganddatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.enterprise.viewbindinganddatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val message: String = "Test Successful!"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.textViewMessage.text = message

    }



}