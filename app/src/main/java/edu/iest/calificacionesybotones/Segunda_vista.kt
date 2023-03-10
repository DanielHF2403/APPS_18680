package edu.iest.calificacionesybotones

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Segunda_vista : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_vista)

        var califRecibida = intent.getStringExtra("Calificación")
        val tvCalifA = findViewById<TextView>(R.id.tvAprobado)
        tvCalifA.text = "Felicidades aprobaste con $califRecibida"

        var bnRegresar = findViewById<Button>(R.id.bnRegresar)
        bnRegresar.setOnClickListener{
            var s = Intent(this, MainActivity::class.java)
            startActivity(s)
            finish()
        }
    }
}