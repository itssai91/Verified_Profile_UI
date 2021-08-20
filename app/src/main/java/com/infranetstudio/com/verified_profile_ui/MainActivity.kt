package com.infranetstudio.com.verified_profile_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val verify_image = findViewById<ImageView>(R.id.ivVerify)
        val verify_button = findViewById<Button>(R.id.btnVerify)

        verify_button.setOnClickListener {
            verify_image.visibility = View.VISIBLE

        }
    }
}