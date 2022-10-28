package com.example.praktika12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun radiobuttonapple(view: View) {
        val photo: ImageView = findViewById(R.id.imageView)
        val image: Int = R.drawable.apple
        photo.setImageResource(image)


    }

    fun radiobuttonpear(view: View) {
        val photo: ImageView = findViewById(R.id.imageView)
        val image: Int = R.drawable.pear
        photo.setImageResource(image)

    }
    fun radiobuttongrape(view: View) {
        val photo: ImageView = findViewById(R.id.imageView)
        val image: Int = R.drawable.grape
        photo.setImageResource(image)

    }
    fun checkboxapple(view: View) {
        val photo: ImageView = findViewById(R.id.imageView2)
        val image: Int = R.drawable.apple
        photo.setImageResource(image)

    }
    fun checkboxpear(view: View) {
        val photo: ImageView = findViewById(R.id.imageView3)
        val image: Int = R.drawable.pear
        photo.setImageResource(image)

    }
    fun checkboxgrape(view: View) {
        val photo: ImageView = findViewById(R.id.imageView4)
        val image: Int = R.drawable.grape
        photo.setImageResource(image)
    }
}