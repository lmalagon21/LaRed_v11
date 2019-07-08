package com.app.lared

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_registro_cliente.*
import kotlinx.android.synthetic.main.activity_registro_negocio.*

class registro_cliente : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_cliente)

        val cancelar_registrocliente1 : Button = findViewById(R.id.cancelar_registrocliente1)
        cancelar_registrocliente1.setOnClickListener {
            val intent = Intent(this, MainActivity :: class.java)
            startActivity(intent)
        }

        val registroNuevoCliente : Button = findViewById(R.id.continuar_regcliente)
        registroNuevoCliente.setOnClickListener {
            val primernombre_cliente = this.primernombre_cliente.getText().toString()
            val primerapellido_cliente = this.primerapellido_cliente.getText().toString()
            val segundoapellido_cliente = this.segundoapellido_cliente.getText().toString()
            val movil_cliente = this.movil_cliente.getText().toString()
            if (primernombre_cliente.equals("")) {
                Toast.makeText(
                    this, "Debe ingresar su primer nombre",
                    Toast.LENGTH_LONG
                ).show();
            } else {
                if (primerapellido_cliente.equals("")) {
                    Toast.makeText(
                        this, "Debe ingresar su primer apellido",
                        Toast.LENGTH_LONG
                    ).show();
                } else {
                    if (segundoapellido_cliente.equals("")) {
                        Toast.makeText(
                            this, "Debe ingresar su segundo apellido",
                            Toast.LENGTH_LONG
                        ).show();
                    } else {
                        if (movil_cliente.equals("")) {
                            Toast.makeText(
                                this, "Debe ingresar el número de móvil",
                                Toast.LENGTH_LONG
                            ).show();
                        } else {
                            val intent = Intent(this, registro_cliente1::class.java)
                            startActivity(intent)
                        }
                    }
                }
            }
        }
    }
}
