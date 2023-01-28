package edu.iest.botones

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class SegundaActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        var fraseRecibida = intent.getStringExtra("frase")
        var edad = intent.getIntExtra("edad", 0)
        Log.d("Datos", "Datos recibidos con exito fueron $fraseRecibida y edad $edad")

        var bnAbrirPantalla = findViewById<Button>(R.id.bnPantalla)
        bnAbrirPantalla.setOnClickListener {
            val i = Intent(this,MainActivity::class.java)
            startActivity(i)
        }

        var bnCerrar = findViewById<Button>(R.id.bnCerrar)
        bnCerrar.setOnClickListener {
            finish()
        }
    }
}