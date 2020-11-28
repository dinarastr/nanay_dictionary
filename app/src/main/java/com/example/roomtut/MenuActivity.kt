package com.example.roomtut

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        speaking_button.setOnClickListener {
            val intent = Intent(this, SpeakingMenuActivity::class.java)
            startActivity(intent)
        }
        dictionary.setOnClickListener{
            val intent = Intent(this, DictionaryActivity::class.java)
            startActivity(intent)
        }

        app_info.setOnClickListener {
            val intent = Intent(this, InfoActivity::class.java)
            startActivity(intent)
        }

    }
}