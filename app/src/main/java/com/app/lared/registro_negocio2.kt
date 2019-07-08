package com.app.lared

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_ingresar_nuevopwd_cliente.*
import kotlinx.android.synthetic.main.activity_registro_negocio2.*

class registro_negocio2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_negocio2)

        val registroNuevoNegocio : Button = findViewById(R.id.continuar_reg_neg2)
        registroNuevoNegocio.setOnClickListener {
            val tipo_documento = this.tipo_documento.getText().toString()
            val numerodocnegocio = this.numerodocnegocio.getText().toString()
            val movil_negocio = this.movil_negocio.getText().toString()
            val email_negocio = this.email_negocio.getText().toString()
            val pwd_negocio = this.pwd_negocio.getText().toString()
            val repetirpwd_negocio = this.repetirpwd_negocio.getText().toString()
            if (tipo_documento.equals("")) {
                Toast.makeText(this, "Debe escoger el tipo de documento",
                    Toast.LENGTH_LONG).show();
            } else {
                if (numerodocnegocio.equals("")) {
                    Toast.makeText(
                        this, "Debe digitar el número de documento",
                        Toast.LENGTH_LONG
                    ).show();
                } else {
                    if (movil_negocio.equals("")) {
                        Toast.makeText(
                            this, "Debe ingresar el número de celular",
                            Toast.LENGTH_LONG
                        ).show();
                    } else {
                        if (email_negocio.equals("")) {
                            Toast.makeText(
                                this, "Debe ingresar el correo electrónico",
                                Toast.LENGTH_LONG
                            ).show();
                        } else {
                            if (pwd_negocio.equals("")) {
                            Toast.makeText(
                                this, "Debe ingresar la contraseña",
                                Toast.LENGTH_LONG
                            ).show();
                            } else {
                                if (repetirpwd_negocio.equals("")) {
                                    Toast.makeText(
                                        this, "Debe ingresar nuevamente la contraseña",
                                        Toast.LENGTH_LONG
                                    ).show();
                                } else {
                                    if (pwd_negocio.equals(repetirpwd_negocio)) {
                                        val intent = Intent(this, registro_negocio1 :: class.java)
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
}
