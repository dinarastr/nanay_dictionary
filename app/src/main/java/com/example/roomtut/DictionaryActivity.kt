package com.example.roomtut

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController

class DictionaryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        actionBar?.setDisplayHomeAsUpEnabled(false)


        val appBarConfiguration = AppBarConfiguration(
                setOf(
                        R.id.listFragment,
                        R.id.nanayDictFragment
                )
        )

        setupActionBarWithNavController(findNavController(R.id.fragment), appBarConfiguration)


    }


    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.fragment)
        return when(navController.currentDestination?.id) {

            R.id.nanayDictFragment -> {
                startActivity(Intent(this, MenuActivity::class.java))
                true
            } else -> {
                navController.navigateUp()
            }
        }
    }

    override fun onBackPressed() {
        startActivity(Intent(this, MenuActivity::class.java))
    }
}