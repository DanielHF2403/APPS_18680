package edu.iest.calificacionesybotones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Tercera_vista : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tercera_vista)

        var califRecibida = intent.getStringExtra("Calificación")
        val tvCalifR = findViewById<TextView>(R.id.tvReprobado)
        tvCalifR.text = "Obtuviste un $califRecibida"

        var bnRegresar = findViewById<Button>(R.id.bnRegresar1)
        bnRegresar.setOnClickListener{
            var s = Intent(this, MainActivity::class.java)
            startActivity(s)
            finish()
        }
    }
}