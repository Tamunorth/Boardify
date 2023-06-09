package com.example.boardify

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.WindowManager
import com.example.boardify.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {


    private var binding: ActivitySplashBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        binding = ActivitySplashBinding.inflate(layoutInflater)


        setContentView(binding?.root)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
        )


        val typeFace: Typeface = Typeface.createFromAsset(assets, "Raleway.ttf")


        binding?.tvAppName?.typeface = typeFace
    }
}