package com.example.foreignlanguage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.lessonsFragment -> {
                    findNavController(R.id.nav_host_fragment).navigate(R.id.lessonsFragment)
                    true
                }
                R.id.exercisesFragment -> {
                    findNavController(R.id.nav_host_fragment).navigate(R.id.exercisesFragment)
                    true
                }
                R.id.dictionaryFragment -> {
                    findNavController(R.id.nav_host_fragment).navigate(R.id.dictionaryFragment)
                    true
                }
                R.id.settingsFragment -> {
                    findNavController(R.id.nav_host_fragment).navigate(R.id.settingsFragment)
                    true
                }
                else -> false
            }
        }
    }
}