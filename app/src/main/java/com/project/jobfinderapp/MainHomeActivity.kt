package com.project.jobfinderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainHomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_home)

        val bottom_nav = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        // Set listener for BottomNavigationView item selection
        bottom_nav.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.menu_item1 -> {
                    // Handle item 1 selection
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.menu_item2 -> {
                    // Handle item 2 selection
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.menu_item3 -> {
                    // Handle item 2 selection
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.menu_item4 -> {
                    // Handle item 2 selection
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.menu_item5 -> {
                    // Handle item 2 selection
                    return@setOnNavigationItemSelectedListener true
                }
                // Add more cases for other items as needed
                else -> return@setOnNavigationItemSelectedListener false
            }
        }

        // Set default selection
        bottom_nav.selectedItemId = R.id.menu_item1
    }
}