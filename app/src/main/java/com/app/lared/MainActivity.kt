package com.app.lared

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Switch
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val registroNuevoNegocio : Button = findViewById(R.id.negocio)
        registroNuevoNegocio.setOnClickListener {
            val intent = Intent(this, registro_negocio :: class.java)
            startActivity(intent)
        }

        val registroNuevoCliente : Button = findViewById(R.id.cliente)
        registroNuevoCliente.setOnClickListener {
            val intent = Intent(this, registro_cliente :: class.java)
            startActivity(intent)
        }

        val usoAppNegocio : Button = findViewById(R.id.entrar_red_negocio)
        usoAppNegocio.setOnClickListener {
            val movil = this.movil_negocio.getText().toString()
            val password = this.password.getText().toString()
            if (movil.equals("")) {
                Toast.makeText(this, "Debe ingresar el número móvil",
                    Toast.LENGTH_LONG).show();
            } else {
                if (movil.equals(" ")) {
                    Toast.makeText(
                        this, "Debe ingresar el número móvil",
                        Toast.LENGTH_LONG
                    ).show();
                } else {
                    if (password.equals("")) {
                        Toast.makeText(
                            this, "Debe ingresar la contraseña",
                            Toast.LENGTH_LONG
                        ).show();
                    } else {
                        val intent = Intent(this, uso_app_negocio::class.java)
                        startActivity(intent)
                    }
                }
            }
        }


        val usoAppCliente : Button = findViewById(R.id.entrar_red_cliente)
        usoAppCliente.setOnClickListener {
            val movil = this.movil_negocio.getText().toString()
            val password = this.password.getText().toString()
            if (movil.equals("")) {
                Toast.makeText(this, "Debe ingresar el número móvil",
                    Toast.LENGTH_LONG).show();
            } else {
                if (movil.equals(" ")) {
                    Toast.makeText(
                        this, "Debe ingresar el número móvil",
                        Toast.LENGTH_LONG
                    ).show();
                } else {
                    if (password.equals("")) {
                        Toast.makeText(
                            this, "Debe ingresar la contraseña",
                            Toast.LENGTH_LONG
                        ).show();
                    } else {
                        val intent = Intent(this, uso_app_cliente::class.java)
                        startActivity(intent)
                    }
                }
            }
        }

        val swC = findViewById<Switch>(R.id.es_cliente)
        val swN = findViewById<Switch>(R.id.es_negocio)
        val swPW = findViewById<Switch>(R.id.olvido_pwd)
        val swNR = findViewById<Switch>(R.id.sw_nuevo_enlared)

        swC?.setOnClickListener {
            if (swC.isChecked) {
                swN.isEnabled = (false)
                usoAppCliente.isEnabled = (true)
                usoAppNegocio.isEnabled = (false)
                usoAppCliente.visibility = (View.VISIBLE)
                usoAppNegocio.visibility = (View.INVISIBLE)
            }  else {
                swN.isEnabled = (true)
                usoAppCliente.isEnabled = (false)
                usoAppNegocio.isEnabled = (false)
                }
        }

        swN?.setOnClickListener {
            if (swN.isChecked) {
                swC.isEnabled = (false)
                usoAppCliente.isEnabled = (false)
                usoAppNegocio.isEnabled = (true)
                usoAppCliente.visibility = (View.INVISIBLE)
                usoAppNegocio.visibility = (View.VISIBLE)
            }  else {
                swC.isEnabled = (true)
                usoAppCliente.isEnabled = (false)
                usoAppNegocio.isEnabled = (false)
                }
        }

        swPW?.setOnClickListener {
            if (swPW.isChecked) {
                swC.isEnabled = (false)
                swN.isEnabled = (false)
                swNR.isEnabled = (false)
                usoAppCliente.isEnabled = (false)
                usoAppNegocio.isEnabled = (false)
                swN.isChecked = (false)
                swC.isChecked = (false)
                swNR.isChecked = (false)
                val intent = Intent(this, olvido_password :: class.java)
                startActivity(intent)
            }  else {
                swC.isEnabled = (true)
                swN.isEnabled = (true)
                swN.isChecked = (false)
                swC.isChecked = (false)
                swNR.isEnabled = (true)
                swNR.isChecked = (false)
            }

        }

        swNR?.setOnClickListener {
            if (swNR.isChecked) {
                registroNuevoNegocio.isEnabled = (true)
                registroNuevoCliente.isEnabled = (true)
                registroNuevoNegocio.visibility = (View.VISIBLE)
                registroNuevoCliente.visibility = (View.VISIBLE)
                usoAppCliente.isEnabled = (false)
                usoAppNegocio.isEnabled = (false)
                swN.isChecked = (false)
                swC.isChecked = (false)
                swC.isEnabled = (false)
                swN.isEnabled = (false)
                swPW.isEnabled = (false)
                swPW.isChecked = (false)
            }  else {
                swC.isEnabled = (true)
                swN.isEnabled = (true)
                swPW.isEnabled = (true)
                registroNuevoNegocio.visibility = (View.GONE)
                registroNuevoCliente.visibility = (View.GONE)
            }

        }
    }
}