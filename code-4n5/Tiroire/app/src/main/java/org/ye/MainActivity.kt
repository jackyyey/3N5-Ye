package org.ye

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.ye.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var actionBarDrawerToggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        title = "Activity 1"

        setContentView(view)
        setupDrawer()
    }
    private fun setupDrawer(){
        setupDrawerApplicationBar()
        setupDrawerItemSelected()
    }
    private fun setupDrawerApplicationBar(){
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBarDrawerToggle = ActionBarDrawerToggle(this,binding.dlTiroire,R.string.Ouvert,R.string.Ferme)
        binding.dlTiroire.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()
    }
    private fun setupDrawerItemSelected(){
        binding.navTiroir.setNavigationItemSelectedListener { item -> when(item.itemId){
            R.id.activity1 -> {
                startActivity(Intent(this,MainActivity::class.java))
            }
            R.id.activity2 -> {
                startActivity(Intent(this,ActivityNo2::class.java))
            }
            R.id.activity3 -> {
                startActivity(Intent(this,ActivityNo3::class.java))
            }
        }
            false
        }

    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Réagir au clic sur le menu hamburger
        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
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

