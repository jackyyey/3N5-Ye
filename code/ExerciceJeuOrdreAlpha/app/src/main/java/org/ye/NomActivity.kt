package org.ye

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.ye.databinding.ActivityAlbumBinding

class NomActivity : AppCompatActivity() {
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