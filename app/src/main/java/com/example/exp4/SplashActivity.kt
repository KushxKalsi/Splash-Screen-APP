package com.example.exp4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.content.Intent

class SplashActivity : AppCompatActivity() {

    private val splashDelay: Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            // Start main activity after delay
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, splashDelay)
    }
}

