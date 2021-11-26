package com.example.practice3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView


class MainActivity2 : AppCompatActivity() {

    lateinit var imageView: ImageView
//    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
       imageView = findViewById(R.id.im)
//        button = findViewById(R.id.imbtn)

  val image = intent.getIntExtra("IMAGE", 0)
        imageView.setImageResource(image)

//        button.setOnClickListener{
//            onBackPressed()
//        }

    }
}