package com.example.exp4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.random.Random
import android.graphics.Color
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val randomColor = getRandomColor()
        findViewById<LinearLayout>(R.id.activity_main).setBackgroundColor(randomColor)


    }
    private fun getRandomColor(): Int {
        val rnd = Random
        return Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))
    }
}




