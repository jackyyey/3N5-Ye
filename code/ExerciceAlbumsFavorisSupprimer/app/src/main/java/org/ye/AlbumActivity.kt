package org.ye

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.ye.databinding.ActivityAlbumBinding

class AlbumActivity : AppCompatActivity() {
    public lateinit var binding: ActivityAlbumBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlbumBinding.inflate(layoutInflater)
        var view = binding.root
        if (intent.hasExtra("album")) {
            binding.titreAlbum.text = intent.getStringExtra("album")
        }

        if (intent.hasExtra("artist")) {
            binding.nomArtiste.text = intent.getStringExtra("artist")
        }
        setContentView(view)
    }
}