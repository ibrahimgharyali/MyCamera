package com.ibrahim.demo.mycamera

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SpalshActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spalsh)
    }

    override fun onResume() {
        super.onResume()
        Handler().postDelayed({
            val intent = Intent(this@SpalshActivity,MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 1500)
    }
}
