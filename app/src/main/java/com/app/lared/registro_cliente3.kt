package com.app.lared

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_registro_cliente3.*

class registro_cliente3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_cliente3)

        val atras_registrocliente2 : Button = findViewById(R.id.atras_registrocliente2)
        atras_registrocliente2.setOnClickListener {
            val intent = Intent(this, registro_cliente1 :: class.java)
            startActivity(intent)
        }

        val cont_regcliente2 : Button = findViewById(R.id.cont_regcliente2)
        cont_regcliente2.setOnClickListener {
            val pregunta1_cliente = this.pregunta1_cliente.getText().toString()
            val respuesta1_cliente = this.respuesta1_cliente.getText().toString()
            val pregunta2_cliente = this.pregunta2_cliente.getText().toString()
            val respuesta2_cliente = this.respuesta2_cliente.getText().toString()
            if (pregunta1_cliente.equals("")) {
                Toast.makeText(this, "Debe escoger la pregunta 1",
                    Toast.LENGTH_LONG).show();
            } else {
                if (respuesta1_cliente.equals("")) {
                    Toast.makeText(
                        this, "Debe digitar la respuesta 1",
                        Toast.LENGTH_LONG
                    ).show();
                } else {
                    if (pregunta2_cliente.equals("")) {
                        Toast.makeText(
                            this, "Debe escoger la pregunta 2",
                            Toast.LENGTH_LONG
                        ).show();
                    } else {
                        if (respuesta2_cliente.equals("")) {
                            Toast.makeText(
                                this, "Debe digitar la respuesta 2",
                                Toast.LENGTH_LONG
                            ).show();
                        } else {
                            val intent = Intent(this, registro_cliente2 :: class.java)
                            startActivity(intent)
                        }
                    }
                }
            }
        }
    }
}
