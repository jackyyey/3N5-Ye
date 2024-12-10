package org.ye

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.ye.databinding.ActivityDetailsBinding
import org.ye.databinding.ActivityMainBinding

class DetailsActivity : AppCompatActivity() {
    lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        var view = binding.root
        title = "Details"
        if (intent.hasExtra("Item")){
            binding.txNom.text = intent.getStringExtra("Item")
            binding.txDonnees.text = "kaput"
        }
        setContentView(view)
    }
}