package org.ye

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.ye.databinding.ActivityMainBinding

private lateinit var binding : ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        val view = binding.root
        setContentView(view)
        title = "Accueil"

        binding.btnArticle.setOnClickListener{
            val intent = Intent(this,ArticleActivity::class.java)
            startActivity(intent)
        }
        binding.btnContact.setOnClickListener{
            val intent = Intent(this,ContactActivity::class.java)
            startActivity(intent)
        }
    }
}