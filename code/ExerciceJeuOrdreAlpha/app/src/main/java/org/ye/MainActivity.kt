package org.ye

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import org.ye.adapters.NameAdaptor
import org.ye.databinding.ActivityMainBinding
import org.ye.models.Album
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: NameAdaptor
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setupRecycler()
        fillRecycler()
        setContentView(binding.root)
    }
    private fun setupRecycler(){
        adapter = NameAdaptor()
        binding.rvNameAdaptor.adapter = adapter
        binding.rvNameAdaptor.setHasFixedSize(true)
        binding.rvNameAdaptor.addItemDecoration(
            DividerItemDecoration(binding.rvNameAdaptor.context, DividerItemDecoration.VERTICAL)
        )
    }
    private fun fillRecycler() {
        val items: MutableList<String> = mutableListOf(
            "Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Hank", "Ivy", "Jack",
            "Kathy", "Leo", "Mona", "Nina", "Oscar", "Paul", "Quincy", "Rita", "Steve", "Tina"
        )
        items.shuffle(Random(System.currentTimeMillis()))
        adapter.submitList(items)
    }

}