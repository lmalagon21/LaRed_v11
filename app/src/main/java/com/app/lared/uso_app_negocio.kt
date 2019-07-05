package com.app.lared

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class uso_app_negocio : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uso_app_negocio)
        val terminarSesion : Button = findViewById(R.id.terminar_sesion_negocio)
        terminarSesion.setOnClickListener {
            val intent = Intent(this, MainActivity :: class.java)
            startActivity(intent)
        }

        val cargarPuntosCliente : Button = findViewById(R.id.gestion_cargar_puntos)
        cargarPuntosCliente.setOnClickListener {
            val intent = Intent(this, cargar_puntos :: class.java)
            startActivity(intent)
        }

        val redimirPuntosCliente : Button = findViewById(R.id.gestion_redimir_puntos)
        redimirPuntosCliente.setOnClickListener {
            val intent = Intent(this, redimir_puntos :: class.java)
            startActivity(intent)
        }
    }
}
