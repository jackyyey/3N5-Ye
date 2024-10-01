package org.ye

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.ye.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var listeBouttons: List<Button>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.tvTops.setOnClickListener(View.OnClickListener {
            binding.tvTops.setText("Lapin")
        })
        listeBouttons = listOf(binding.tvBtn1, binding.tvBtn2, binding.tvBtn3, binding.tvBtn4, binding.tvBtn5, binding.tvBtn6, binding.tvBtn7, binding.tvBtn8, binding.tvBtn9)
    }
    fun initialiser(){

    }
}
