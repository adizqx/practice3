package com.example.practice3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.practice3.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val text = binding.editText.text.toString()
            when (text) {
                "1" -> {
                    openMainActivity2(R.drawable.ic_baseline_4k_24)
                }
                "2" -> {
                    openMainActivity2(R.drawable.ic_baseline_ac_unit_24)
                }
                "3" -> {
                    openMainActivity2(R.drawable.ic_baseline_accessibility_new_24)
                }
                else -> openMainActivity2(R.drawable.ic_baseline_image_not_supported_24)
            }
        }
    }

    fun openMainActivity2(image: Int){
        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("IMAGE", image)
        startActivity(intent)
    }
}