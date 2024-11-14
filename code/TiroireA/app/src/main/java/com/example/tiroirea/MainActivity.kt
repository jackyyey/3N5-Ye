package com.example.tiroirea

import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tiroirea.databinding.ActivityMainBinding
import com.example.tiroirea.databinding.NavHeaderBinding
import com.google.android.material.snackbar.Snackbar
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var actionBarDrawerToggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupDrawer()
    }
    private fun setupDrawer(){
        setupDrawerApplicationBar()
        setupDrawerItemSelected()
        setupDrawerApplicationBar()
    }
    private fun setupDrawerApplicationBar(){
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        actionBarDrawerToggle = ActionBarDrawerToggle(
            this,
            binding.dlTiroire,
            R.string.ouvert,
            R.string.ferme
        )
        binding.dlTiroire.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()
    }
    private fun setupDrawerItemSelected(){
        binding.nvTiroir.setNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.accueil_item -> {
                    finish()
                    exitProcess(1)
                }
                R.id.profil_item -> {
                    Toast.makeText(this, "jacky ye", Toast.LENGTH_SHORT).show()
                }
                R.id.deconnection_item -> {
                    Log.i("MainActivity", "Deconnection")
                }
            }
            false
        }
    }
    private fun setupDrawerHeader(){
        val headerBinding: NavHeaderBinding = NavHeaderBinding.bind(binding.nvTiroir.getHeaderView(0))
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }
    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        actionBarDrawerToggle.syncState()
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        actionBarDrawerToggle.onConfigurationChanged(newConfig)
        super.onConfigurationChanged(newConfig)
    }
}