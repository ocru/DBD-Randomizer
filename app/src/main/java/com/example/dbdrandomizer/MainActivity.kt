package com.example.dbdrandomizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val killerButton: Button = findViewById(R.id.killer_button)
        val survivorButton: Button = findViewById(R.id.surv_button)

        killerButton.setOnClickListener {
            val intent = Intent(this, killer_main::class.java)
            startActivity(intent)

        }

        survivorButton.setOnClickListener {
            val intent = Intent(this,survivor_main::class.java)
            startActivity(intent)
        }
    }
}