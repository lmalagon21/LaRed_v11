package com.app.lared

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_registro_cliente2.*
import kotlinx.android.synthetic.main.activity_registro_negocio3.*

class registro_cliente2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_cliente2)

        val atras_finalcliente: Button = findViewById(R.id.atras_finalcliente)
        atras_finalcliente.setOnClickListener {
            val intent = Intent(this, registro_cliente3 :: class.java)
            startActivity(intent)
        }

        val registrar_cliente: Button = findViewById(R.id.registrar_cliente)
        registrar_cliente.setOnClickListener {
            val pais_cliente = this.pais_cliente.getText().toString()
            val ciudad_cliente = this.ciudad_cliente.getText().toString()
            val barrio_cliente = this.barrio_cliente.getText().toString()
            if (pais_cliente.equals("")) {
                Toast.makeText(
                    this, "Debe escoger el pais donde está ubicado",
                    Toast.LENGTH_LONG
                ).show();
            } else {
                if (ciudad_cliente.equals("")) {
                    Toast.makeText(
                        this, "Debe escoger la ciudad donde está ubicado",
                        Toast.LENGTH_LONG
                    ).show();
                } else {
                    if (barrio_cliente.equals("")) {
                        Toast.makeText(
                            this, "Debe escoger el barrio donde está ubicado",
                            Toast.LENGTH_LONG
                        ).show();
                    } else {
                        val intent = Intent(this, MainActivity :: class.java)
                        startActivity(intent)
                        Toast.makeText(
                            this, "Se ha registrado en LaRed de manera exitosa",
                            Toast.LENGTH_LONG
                        ).show();
                    }
                }
            }
        }
    }
}
