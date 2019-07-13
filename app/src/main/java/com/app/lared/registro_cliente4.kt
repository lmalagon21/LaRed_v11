package com.app.lared

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_registro_cliente4.*

class registro_cliente4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_cliente4)

        val nombrecompletobundle: Bundle? = intent.extras
        nombre_completocliente.text = nombrecompletobundle!!.getString("nombrecompleto")

        val movilclientecompletobundle: Bundle? = intent.extras
        movil_clientecompleto.text = movilclientecompletobundle!!.getString("movilclientecompleto")

        val documentocompletobundle: Bundle? = intent.extras
        documentocompleto_cliente.text = documentocompletobundle!!.getString("documentocompleto")

        val emailclientecompletobundle: Bundle? = intent.extras
        emailclientecompleto.text = emailclientecompletobundle!!.getString("emailclientecompleto")

        val paisclientecompletobundle: Bundle? = intent.extras
        paiscompleto_cliente.text = paisclientecompletobundle!!.getString("paisclientecompleto")

        val departamentoclientecompletobundle: Bundle? = intent.extras
        departamentocompleto_cliente.text = departamentoclientecompletobundle!!.getString("departamentoclientecompleto")

        val ciudadclientecompletobundle: Bundle? = intent.extras
        ciudadcompleto_cliente.text = ciudadclientecompletobundle!!.getString("ciudadclientecompleto")

        val barrioclientecompletobundle: Bundle? = intent.extras
        barriocompleto_cliente.text = barrioclientecompletobundle!!.getString("barrioclientecompleto")

        val atras_registroclientecompleto : Button = findViewById(R.id.atras_registrarclientecompleto)
        atras_registroclientecompleto.setOnClickListener {
            val intent = Intent(this, registro_cliente2::class.java)
            startActivity(intent)
        }

        val registrarcliente_completo : Button = findViewById(R.id.registrarcliente_completo)
        registrarcliente_completo.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            Toast.makeText(
                this, "Bienvenido a LaRed - Registro Exitoso",
                Toast.LENGTH_LONG
            ).show();
        }
    }
}
