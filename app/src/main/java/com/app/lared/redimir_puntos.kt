package com.app.lared

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_redimir_puntos.*


class redimir_puntos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_redimir_puntos)
        val cancelar_redimir : Button = findViewById(R.id.cancelar_redimir)
        cancelar_redimir.setOnClickListener {
            val intent = Intent(this, uso_app_negocio :: class.java)
            startActivity(intent)
        }
        val redimir_puntos : Button = findViewById(R.id.redimir_puntos)
        redimir_puntos.setOnClickListener {
            val movil = this.movil_redimir.getText().toString()
            val valor = this.valor_redimir.getText().toString()
            if (movil.equals("")) {
                Toast.makeText(this, "Debe ingresar el número móvil que desea redimir",
                    Toast.LENGTH_LONG).show();
            } else {
                if (movil.equals(" ")) {
                    Toast.makeText(
                        this, "Debe ingresar el número móvil que desea redimir",
                        Toast.LENGTH_LONG
                    ).show();
                } else {
                    if (valor.equals("")) {
                        Toast.makeText(
                            this, "Debe ingresar el valor de la redención en $",
                            Toast.LENGTH_LONG
                        ).show();
                    } else {
                        val intent = Intent(this, uso_app_negocio::class.java)
                        startActivity(intent)
                        Toast.makeText(
                            this, "Redención de puntos exitosa",
                            Toast.LENGTH_LONG
                        ).show();
                    }
                }
            }
        }
    }
}
