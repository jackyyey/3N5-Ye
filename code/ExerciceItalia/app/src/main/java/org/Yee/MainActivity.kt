package org.Yee

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import org.Yee.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.i("YOYOYO", "balls")
    }
}