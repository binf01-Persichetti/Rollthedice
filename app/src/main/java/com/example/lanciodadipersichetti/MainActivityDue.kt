package com.example.lanciodadipersichetti

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivityDue : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_due)

        val mioRandom = intent.getIntExtra("NUMERO", -1)
        val continua = findViewById<Button>(R.id.continua)

        continua.setOnClickListener {
            val mioToast = Toast.makeText(this, "Risultato:", Toast.LENGTH_LONG)
            mioToast.show()
        }

        val dado = findViewById<ImageView>(R.id.dado)
        val arrayDadi = when(mioRandom){
            1 -> R.drawable.dice_face_1
            2 -> R.drawable.dice_face_2
            3 -> R.drawable.dice_face_3
            4 -> R.drawable.dice_face_4
            5 -> R.drawable.dice_face_5
            else -> {R.drawable.dice_face_6}
        }
        dado.setImageResource(arrayDadi as Int)
    }
}