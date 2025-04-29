package com.example.lanciodadipersichetti

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivityTre : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_tre)

        val TAG = "MainActivityTre"
        val mioRandom = intent.getIntExtra("NUMERO", -1)
        Log.d(TAG, "mioRandom: " + mioRandom)
        val risultato = findViewById<TextView>(R.id.risultato)
        val numeriFortunati = listOf(2, 4)

        if(mioRandom in numeriFortunati){ // Numeri fortunati
            risultato.text = "Hai vinto!!!!"
        }
        else{
            risultato.text = "Ritenta sarai più fortuanto"
        }

    }
}