package com.example.hahaton

import android.R
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView


class DashBoard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.hahaton.R.layout.activity_list)

        // Initialize and assign variable
        val bottomNavigationView = findViewById<BottomNavigationView>(com.example.hahaton.R.id.bottom_navigation)
        // Set Home selected
        bottomNavigationView.selectedItemId = com.example.hahaton.R.id.dashboard
        // Perform item selected listener
        bottomNavigationView.setOnNavigationItemSelectedListener(BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    startActivity(Intent(applicationContext, MainActivity::class.java))
                    overridePendingTransition(0, 0)
                    return@OnNavigationItemSelectedListener true
                }
                com.example.hahaton.R.id.dashboard -> return@OnNavigationItemSelectedListener true
                com.example.hahaton.R.id.about -> {
                    startActivity(Intent(applicationContext, About::class.java))
                    overridePendingTransition(0, 0)
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        })
    }
}