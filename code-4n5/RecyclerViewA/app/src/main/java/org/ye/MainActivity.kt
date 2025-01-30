package org.ye

import android.os.Build
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import org.ye.adapters.SecretAdapter
import org.ye.databinding.ActivityMainBinding
import org.ye.model.Secret
import java.time.LocalDateTime
import java.util.Date
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var adapter: SecretAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)
        setupRecycler()
        fillRecycler()
    }
    private fun setupRecycler() {
        adapter = SecretAdapter() // Créer l'adapteur
        binding.rvSecretAdapter.adapter = adapter // Assigner l'adapteur au RecyclerView
        binding.rvSecretAdapter.setHasFixedSize(true) // Option pour améliorer les performances
        binding.rvSecretAdapter.addItemDecoration( // Ajouter un séparateur entre chaque élément
            DividerItemDecoration(
                binding.rvSecretAdapter.context, DividerItemDecoration.VERTICAL
            )
        )
    }
    private fun fillRecycler(){
        val items: MutableList<Secret> = mutableListOf()
        for (i in 1..1000) {
            items.add(Secret("Objet #$i", LocalDateTime.now(), Random.nextLong(1,700)))
        }
        adapter.submitList(items)
    }

}