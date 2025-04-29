package com.example.lanciodadipersichetti

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val dadi = findViewById<ImageView>(R.id.dadi)
        val titolo = findViewById<TextView>(R.id.titolo)
        val lancia = findViewById<Button>(R.id.lancia)

        lancia.setOnClickListener {
            val mioToast = Toast.makeText(this, "Dado lanciato", Toast.LENGTH_LONG)
            mioToast.show()

            val mioRandom = numRandom()
            lanciaIntentDue(mioRandom)
        }
    }

    private fun lanciaIntentDue(mioRandom: Int){ //Richiama il secondo activity (Lancia) passando il numero random
        val mioIntent = Intent(this, MainActivityDue::class.java)
        mioIntent.putExtra("NUMERO", mioRandom)
        startActivity(mioIntent)
    }

    private fun numRandom(): Int{
        return (1..6).random()
    }
}