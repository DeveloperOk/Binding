package com.enterprise.viewbindinganddatabinding.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.enterprise.viewbindinganddatabinding.databinding.ActivityMainBinding
import com.enterprise.viewbindinganddatabinding.viewmodel.UserViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val message: String = "Test Successful!"
    private var userViewModel: UserViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        userViewModel = ViewModelProvider(this)[UserViewModel::class.java]
        binding.userViewModel = userViewModel

        setMessageTextView()

        addObservers()

    }

    private fun setMessageTextView() {

        binding.MessageTextView.text = message

    }
    private fun addObservers() {

        userViewModel?.id?.observe(this){
            onDataChange()
        }

        userViewModel?.name?.observe(this){
            onDataChange()
        }

        userViewModel?.surname?.observe(this){
            onDataChange()
        }

    }

    private fun onDataChange() {
        binding.userViewModel = userViewModel
    }

}