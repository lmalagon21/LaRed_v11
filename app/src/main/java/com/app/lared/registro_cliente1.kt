package com.app.lared

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_registro_cliente1.*
import kotlinx.android.synthetic.main.activity_registro_negocio2.*

class registro_cliente1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_cliente1)

        val atras_registrocliente1 : Button = findViewById(R.id.atras_registrocliente1)
        atras_registrocliente1.setOnClickListener {
            val intent = Intent(this, registro_cliente :: class.java)
            startActivity(intent)
        }

        val cont_regcliente1 : Button = findViewById(R.id.cont_regcliente1)
        cont_regcliente1.setOnClickListener {
            val tipo_doccliente = this.tipo_doc_cliente.getSelectedItem().toString()
            val numdoccliente = this.numdoccliente.getText().toString()
            val email_cliente = this.email_cliente.getText().toString()
            val pwd_cliente = this.pwd_cliente.getText().toString()
            val repetirpwd_cliente = this.repetirpwd_cliente.getText().toString()
            if (tipo_doccliente.equals("Escoja su tipo de documento")) {
                Toast.makeText(this, "Debe escoger el tipo de documento",
                    Toast.LENGTH_LONG).show();
            } else {
                if (numdoccliente.equals("")) {
                    Toast.makeText(
                        this, "Debe digitar el número de documento",
                        Toast.LENGTH_LONG
                    ).show();
                } else {
                    if (email_cliente.equals("")) {
                        Toast.makeText(
                            this, "Debe ingresar el correo electrónico",
                            Toast.LENGTH_LONG
                        ).show();
                    } else {
                        if (pwd_cliente.equals("")) {
                            Toast.makeText(
                                this, "Debe ingresar la contraseña",
                                Toast.LENGTH_LONG
                            ).show();
                        } else {
                            if (repetirpwd_cliente.equals("")) {
                                Toast.makeText(
                                    this, "Debe ingresar nuevamente la contraseña",
                                    Toast.LENGTH_LONG
                                ).show();
                            } else {
                                if (pwd_cliente.equals(repetirpwd_cliente)) {
                                    val intent = Intent(this, registro_cliente3 :: class.java)
                                    startActivity(intent)
                                } else {
                                    Toast.makeText(
                                        this, "Las contraseñas no coinciden",
                                        Toast.LENGTH_LONG
                                    ).show();
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

