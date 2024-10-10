package org.ye

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import org.ye.adapters.AlbumAdapter
import org.ye.databinding.ActivityMainBinding
import org.ye.models.Album

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: AlbumAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupRecycler()
        fillRecycler()
    }
    private fun setupRecycler(){
        adapter = AlbumAdapter()
        binding.rvAlbumAdapter.adapter = adapter
        binding.rvAlbumAdapter.setHasFixedSize(true)
        binding.rvAlbumAdapter.addItemDecoration(
            DividerItemDecoration(binding.rvAlbumAdapter.context, DividerItemDecoration.VERTICAL)
        )
    }
    private fun fillRecycler() {
        val items: MutableList<Album> = mutableListOf()
        for (i in 1..10) {
            items.add(Album(i,"Album $i","Artiste $i"))
        }
        adapter.submitList(items) // Pour changer le contenu de la liste, utiliser submitList de l'adapteur
    }

}