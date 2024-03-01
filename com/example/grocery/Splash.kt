package com.example.grocery

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
class SplashActivity : AppCompatActivity() {

    private val splashTimeOut: Long = 5000 // 5 seconds

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Delayed execution of next activity after splashTimeOut milliseconds
        Handler().postDelayed({
            // Start your next activity here
            startActivity(Intent(this, MainActivity::class.java))
            finish() // close this activity
        }, splashTimeOut)
    }
}