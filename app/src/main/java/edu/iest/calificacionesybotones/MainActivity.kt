package edu.iest.calificacionesybotones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var etCalif: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etCalif = findViewById(R.id.etCalif)
        var bnEnviar = findViewById<Button>(R.id.bnenviar)
        bnEnviar.setOnClickListener{
            if (obtenerCalif() <= "6.99"){
                val s = Intent(this, Tercera_vista::class.java).putExtra("Calificaión", obtenerCalif())
                startActivity(s)
                finish()
            } else {
                val s1 = Intent(this, Segunda_vista::class.java).putExtra("Calificación", obtenerCalif())
                startActivity(s1)
                finish()
            }
        }
    }

    private fun obtenerCalif() : String{
        return etCalif.text.toString()
    }

}