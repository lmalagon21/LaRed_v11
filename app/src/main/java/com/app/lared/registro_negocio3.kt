package com.app.lared

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_registro_negocio2.*
import kotlinx.android.synthetic.main.activity_registro_negocio3.*

class registro_negocio3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_negocio3)
        val registroNuevoNegocio: Button = findViewById(R.id.registrar_neg)
        registroNuevoNegocio.setOnClickListener {
            val pais_negocio = this.pais_negocio.getText().toString()
            val ciudad_negocio = this.ciudad_negocio.getText().toString()
            val barrio_negocio = this.barrio_negocio.getText().toString()
            val direccion_negocio = this.direccion_negocio.getText().toString()
            if (pais_negocio.equals("")) {
                Toast.makeText(
                    this, "Debe escoger el pais donde está ubicado el negocio",
                    Toast.LENGTH_LONG
                ).show();
            } else {
                if (ciudad_negocio.equals("")) {
                    Toast.makeText(
                        this, "Debe escoger la ciudad donde está ubicado el negocio",
                        Toast.LENGTH_LONG
                    ).show();
                } else {
                    if (barrio_negocio.equals("")) {
                        Toast.makeText(
                            this, "Debe escoger el barrio donde está ubicado el negocio",
                            Toast.LENGTH_LONG
                        ).show();
                    } else {
                        if (direccion_negocio.equals("")) {
                            Toast.makeText(
                                this, "Debe ingresar la dirección donde está ubicado el negocio",
                                Toast.LENGTH_LONG
                            ).show();
                        } else {
                            val intent = Intent(this, MainActivity::class.java)
                            startActivity(intent)
                            Toast.makeText(
                                this, "Se ha registrado su negocio de manera exitosa",
                                Toast.LENGTH_LONG
                            ).show();
                        }
                    }
                }
            }
        }
    }
}
