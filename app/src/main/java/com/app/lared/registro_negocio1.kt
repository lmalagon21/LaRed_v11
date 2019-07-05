package com.app.lared

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_registro_negocio1.*
import kotlinx.android.synthetic.main.activity_registro_negocio2.*

class registro_negocio1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_negocio1)

        val registroNuevoNegocio : Button = findViewById(R.id.cont_regnegocio2)
        registroNuevoNegocio.setOnClickListener {
            val pregunta1_negocio = this.pregunta1_negocio.getText().toString()
            val respuesta1_negocio = this.respuesta1_negocio.getText().toString()
            val pregunta2_negocio = this.pregunta2_negocio.getText().toString()
            val respuesta2_negocio = this.respuesta2_negocio.getText().toString()
            if (pregunta1_negocio.equals("")) {
                Toast.makeText(this, "Debe escoger la pregunta 1",
                    Toast.LENGTH_LONG).show();
            } else {
                if (respuesta1_negocio.equals("")) {
                    Toast.makeText(
                        this, "Debe digitar la respuesta 1",
                        Toast.LENGTH_LONG
                    ).show();
                } else {
                    if (pregunta2_negocio.equals("")) {
                        Toast.makeText(
                            this, "Debe escoger la pregunta 2",
                            Toast.LENGTH_LONG
                        ).show();
                    } else {
                        if (respuesta2_negocio.equals("")) {
                            Toast.makeText(
                                this, "Debe digitar la respuesta 2",
                                Toast.LENGTH_LONG
                            ).show();
                        } else {
                            val intent = Intent(this, registro_negocio3::class.java)
                            startActivity(intent)
                        }
                    }
                }
            }
        }
    }
}
