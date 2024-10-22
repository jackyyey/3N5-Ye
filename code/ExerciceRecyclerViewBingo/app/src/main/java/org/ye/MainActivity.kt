package org.ye

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import org.ye.adapters.BingoAdapter
import org.ye.databinding.ActivityMainBinding
import org.ye.models.Bingo
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: BingoAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupRecycler()
        fillRecycler()
    }
    private fun setupRecycler(){
        adapter = BingoAdapter()
        binding.rvAlbumAdapter.adapter = adapter
        binding.rvAlbumAdapter.setHasFixedSize(true)
        binding.rvAlbumAdapter.addItemDecoration(
            DividerItemDecoration(binding.rvAlbumAdapter.context, DividerItemDecoration.VERTICAL)
        )
    }
    private fun fillRecycler() {
        val items: MutableList<Bingo> = mutableListOf()
        for (i in 1..75) {
            items.add(Bingo(i,"Tirage #$i",  getrandomNumber(items)))
        }
        adapter.submitList(items) // Pour changer le contenu de la liste, utiliser submitList de l'adapteur
    }
    private fun getrandomNumber(pListe : List<Bingo>): Int {
        var number = Random.nextInt(1, 76)
        if (pListe.filter { it.numeroTire == number }.count() >= 1 && pListe.count() < 74)
        {
            return getrandomNumber(pListe)
        }
        else
        {
            return number
        }

    }

}