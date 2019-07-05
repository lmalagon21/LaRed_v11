package com.app.lared

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_cargar_puntos.*

class cargar_puntos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cargar_puntos)
        val cancelar_cargar : Button = findViewById(R.id.cancelar_cargar)
        cancelar_cargar.setOnClickListener {
            val intent = Intent(this, uso_app_negocio :: class.java)
            startActivity(intent)
        }
        val cargar_puntos : Button = findViewById(R.id.cargar_puntos)
        cargar_puntos.setOnClickListener {
            val movil = this.movil_a_cargar.getText().toString()
            val valor = this.valor_carga.getText().toString()
            if (movil.equals("")) {
                Toast.makeText(this, "Debe ingresar el número móvil a cargar",
                    Toast.LENGTH_LONG).show();
            } else {
                if (movil.equals(" ")) {
                    Toast.makeText(
                        this, "Debe ingresar el número móvil a cargar",
                        Toast.LENGTH_LONG
                    ).show();
                } else {
                    if (valor.equals("")) {
                        Toast.makeText(
                            this, "Debe ingresar el valor de la compra en $",
                            Toast.LENGTH_LONG
                        ).show();
                    } else {
                        val intent = Intent(this, uso_app_negocio::class.java)
                        startActivity(intent)
                        Toast.makeText(
                            this, "Carga de puntos exitosa",
                            Toast.LENGTH_LONG
                        ).show();
                    }
                }
            }
        }
    }
}
