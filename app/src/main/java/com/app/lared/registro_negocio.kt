package com.app.lared

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import androidx.core.view.get
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_registro_negocio.*

class registro_negocio : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_negocio)


        val cancelar_registronegocio: Button = findViewById(R.id.cancelar_registronegocio)
        cancelar_registronegocio.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val registroNuevoNegocio: Button = findViewById(R.id.continuar_reg_neg2)
        registroNuevoNegocio.setOnClickListener {
            val nombre_negocio = this.nombrenegocio.getText().toString()
            val valor_tipo_negocio = this.tipo_negocio.getSelectedItem().toString()
            if (nombre_negocio.equals("")) {
                Toast.makeText(
                    this, "Debe ingresar el nombre de su negocio",
                    Toast.LENGTH_LONG
                ).show();
            } else {
                if (valor_tipo_negocio.equals("Escoja su tipo de negocio")) {
                    Toast.makeText(
                        this, "Debe escoger el tipo de negocio",
                        Toast.LENGTH_LONG
                    ).show();
                } else {
                    val intent = Intent(this, registro_negocio2::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}
