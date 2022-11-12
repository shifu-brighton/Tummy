package com.example.tummy

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager

class page1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // If the Android version is lower than Jellybean, use this call to hide
        // the status bar.

        setContentView(R.layout.activity_page1)
    }
}