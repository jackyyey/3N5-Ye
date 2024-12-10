package org.ye

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import org.ye.adapters.AndroidItemAdapter
import org.ye.databinding.ActivityMainBinding
import org.ye.models.AndroidItems

lateinit var binding: ActivityMainBinding
private lateinit var adapter: AndroidItemAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setupRecycler()
        fillRecycler()
        setContentView(view)
    }
    private fun setupRecycler(){
        adapter = AndroidItemAdapter()
        binding.rvAndroidItemAdapter.adapter = adapter
        binding.rvAndroidItemAdapter.setHasFixedSize(true)
        binding.rvAndroidItemAdapter.addItemDecoration(DividerItemDecoration(binding.rvAndroidItemAdapter.context,DividerItemDecoration.VERTICAL))
    }

    private fun fillRecycler(){
        val items: MutableList<AndroidItems> = mutableListOf(
            AndroidItems("1.5","Petit Four"),
            AndroidItems("1.1","Cupcake"),
            AndroidItems("2.0", "Eclair"),
            AndroidItems("3.0","Honeycomb"),
            AndroidItems("4.0","Ice cream sandwich"),
            AndroidItems("5.0", "Lollipop")
        )
        adapter.submitList(items)
    }
}