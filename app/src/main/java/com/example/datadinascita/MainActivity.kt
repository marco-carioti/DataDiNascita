package com.example.datadinascita

import android.app.ProgressDialog.show
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

import com.example.datadinascita.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onButtonClick()
    }

    private fun onButtonClick() {
        binding.button.setOnClickListener() {
            var data = binding.editText.text.toString().toInt()
            var eta = 2021 - data
        Toast.makeText(this,"$eta",Toast.LENGTH_SHORT).show()

        }
    }
}


