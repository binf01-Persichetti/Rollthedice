package com.example.lanciodadipersichetti

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivityTre : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_tre)

        val mioRandom = intent.getIntExtra("NUMERO", -1)
        val risultato = findViewById<TextView>(R.id.risultato)

        if(mioRandom == 2 || mioRandom == 4){ // Numeri fortunati
            risultato.text = "Hai vinto!!!!"
        }
        else{
            risultato.text = "Ritenta sarai più fortuanto"
        }

    }
}