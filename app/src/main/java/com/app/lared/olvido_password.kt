package com.app.lared

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Switch
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_olvido_password.*

class olvido_password : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_olvido_password)

        val cancelar_recuperarpwd : Button = findViewById(R.id.recuperarpwd_cancelar)
        cancelar_recuperarpwd.setOnClickListener {
            val intent = Intent(this, MainActivity :: class.java)
            startActivity(intent)
        }

        val swRPC = findViewById<Switch>(R.id.recuperarpwd_escoger_cliente)
        val swRPN = findViewById<Switch>(R.id.recuperarpwd_escoger_negocio)
        val label_recuperarpwd_movil_cliente = findViewById<View>(R.id.label_recuperarpwd_movil_cliente)
        val recuperarpwd_movil_cliente = findViewById<View>(R.id.recuperarpwd_movil_cliente)
        val label_recuperarpwd_pregunta1_cliente = findViewById<View>(R.id.label_recuperarpwd_pregunta1_cliente)
        val recuperarpwd_pregunta1_cliente = findViewById<View>(R.id.recuperarpwd_pregunta1_cliente)
        val label_recuperarpwd_respuesta1_cliente = findViewById<View>(R.id.label_recuperarpwd_respuesta1_cliente)
        val recuperarpwd_respuesta1_cliente = findViewById<View>(R.id.recuperarpwd_respuesta1_cliente)
        val label_recuperarpwd_pregunta2_cliente = findViewById<View>(R.id.label_recuperarpwd_pregunta2_cliente)
        val recuperarpwd_pregunta2_cliente = findViewById<View>(R.id.recuperarpwd_pregunta2_cliente)
        val label_recuperarpwd_respuesta2_cliente = findViewById<View>(R.id.label_recuperarpwd_respuesta2_cliente)
        val recuperarpwd_respuesta2_cliente = findViewById<View>(R.id.recuperarpwd_respuesta2_cliente)
        val recuperar_pwd_cliente = findViewById<Button>(R.id.recuperar_pwd_cliente)

        val label_recuperarpwd_movil_negocio = findViewById<View>(R.id.label_recuperarpwd_movil_negocio)
        val recuperarpwd_movil_negocio = findViewById<View>(R.id.recuperarpwd_movil_negocio)
        val label_recuperarpwd_pregunta1_negocio = findViewById<View>(R.id.label_recuperarpwd_pregunta1_negocio)
        val recuperarpwd_pregunta1_negocio = findViewById<View>(R.id.recuperarpwd_pregunta1_negocio)
        val label_recuperarpwd_respuesta1_negocio = findViewById<View>(R.id.label_recuperarpwd_respuesta1_negocio)
        val recuperarpwd_respuesta1_negocio = findViewById<View>(R.id.recuperarpwd_respuesta1_negocio)
        val label_recuperarpwd_pregunta2_negocio = findViewById<View>(R.id.label_recuperarpwd_pregunta2_negocio)
        val recuperarpwd_pregunta2_negocio = findViewById<View>(R.id.recuperarpwd_pregunta2_negocio)
        val label_recuperarpwd_respuesta2_negocio = findViewById<View>(R.id.label_recuperarpwd_respuesta2_negocio)
        val recuperarpwd_respuesta2_negocio = findViewById<View>(R.id.recuperarpwd_respuesta2_negocio)
        val recuperar_pwd_negocio = findViewById<Button>(R.id.recuperar_pwd_negocio)

        swRPC?.setOnClickListener {
            if (swRPC.isChecked) {
                swRPN.visibility = (View.GONE)
                swRPC.visibility = (View.GONE)
                label_recuperarpwd_movil_cliente.visibility = (View.VISIBLE)
                recuperarpwd_movil_cliente.visibility = (View.VISIBLE)
                label_recuperarpwd_pregunta1_cliente.visibility = (View.VISIBLE)
                recuperarpwd_pregunta1_cliente.visibility = (View.VISIBLE)
                label_recuperarpwd_respuesta1_cliente.visibility = (View.VISIBLE)
                recuperarpwd_respuesta1_cliente.visibility = (View.VISIBLE)
                label_recuperarpwd_pregunta2_cliente.visibility = (View.VISIBLE)
                recuperarpwd_pregunta2_cliente.visibility = (View.VISIBLE)
                label_recuperarpwd_respuesta2_cliente.visibility = (View.VISIBLE)
                recuperarpwd_respuesta2_cliente.visibility = (View.VISIBLE)
                recuperar_pwd_cliente.visibility = (View.VISIBLE)
            }  else {
                swRPN.visibility = (View.VISIBLE)
                swRPC.visibility = (View.VISIBLE)
            }
        }

        swRPN?.setOnClickListener {
            if (swRPN.isChecked) {
                swRPN.visibility = (View.GONE)
                swRPC.visibility = (View.GONE)
                label_recuperarpwd_movil_negocio.visibility = (View.VISIBLE)
                recuperarpwd_movil_negocio.visibility = (View.VISIBLE)
                label_recuperarpwd_pregunta1_negocio.visibility = (View.VISIBLE)
                recuperarpwd_pregunta1_negocio.visibility = (View.VISIBLE)
                label_recuperarpwd_respuesta1_negocio.visibility = (View.VISIBLE)
                recuperarpwd_respuesta1_negocio.visibility = (View.VISIBLE)
                label_recuperarpwd_pregunta2_negocio.visibility = (View.VISIBLE)
                recuperarpwd_pregunta2_negocio.visibility = (View.VISIBLE)
                label_recuperarpwd_respuesta2_negocio.visibility = (View.VISIBLE)
                recuperarpwd_respuesta2_negocio.visibility = (View.VISIBLE)
                recuperar_pwd_negocio.visibility = (View.VISIBLE)
            }  else {
                swRPN.visibility = (View.VISIBLE)
                swRPC.visibility = (View.VISIBLE)
            }
        }

        recuperar_pwd_cliente.setOnClickListener {
            val movil_cliente = this.recuperarpwd_movil_cliente.getText().toString()
            val pregunta1_cliente = this.recuperarpwd_pregunta1_cliente.getText().toString()
            val respuesta1_cliente = this.recuperarpwd_respuesta1_cliente.getText().toString()
            val pregunta2_cliente = this.recuperarpwd_pregunta2_cliente.getText().toString()
            val respuesta2_cliente = this.recuperarpwd_respuesta2_cliente.getText().toString()
            if (movil_cliente.equals("")) {
                Toast.makeText(
                    this, "Debe ingresar el número móvil",
                    Toast.LENGTH_LONG
                ).show();
            } else {
                if (pregunta1_cliente.equals("")) {
                    Toast.makeText(
                        this, "Escoja la pregunta 1",
                        Toast.LENGTH_LONG
                    ).show();
                } else {
                    if (respuesta1_cliente.equals("")) {
                        Toast.makeText(
                            this, "Debe ingresar la respuesta 1",
                            Toast.LENGTH_LONG
                        ).show();
                    } else {
                        if (pregunta2_cliente.equals("")) {
                            Toast.makeText(
                                this, "Escoja la pregunta 2",
                                Toast.LENGTH_LONG
                            ).show();
                        } else {
                            if (respuesta2_cliente.equals("")) {
                                Toast.makeText(
                                    this, "Debe ingresar la respuesta 2",
                                    Toast.LENGTH_LONG
                                ).show();
                            } else {
                                val intent = Intent(this, ingresar_nuevopwd_cliente::class.java)
                                startActivity(intent)
                            }
                        }
                    }
                }
            }
        }

        recuperar_pwd_negocio.setOnClickListener {
            val movil_negocio = this.recuperarpwd_movil_negocio.getText().toString()
            val pregunta1_negocio = this.recuperarpwd_pregunta1_negocio.getText().toString()
            val respuesta1_negocio = this.recuperarpwd_respuesta1_negocio.getText().toString()
            val pregunta2_negocio = this.recuperarpwd_pregunta2_negocio.getText().toString()
            val respuesta2_negocio = this.recuperarpwd_respuesta2_negocio.getText().toString()
            if (movil_negocio.equals("")) {
                Toast.makeText(this, "Debe ingresar el número móvil",
                    Toast.LENGTH_LONG).show();
            } else {
                if (pregunta1_negocio.equals("")) {
                    Toast.makeText(
                        this, "Escoja la pregunta 1",
                        Toast.LENGTH_LONG
                    ).show();
                } else {
                    if (respuesta1_negocio.equals("")) {
                        Toast.makeText(
                            this, "Debe ingresar la respuesta 1",
                            Toast.LENGTH_LONG
                        ).show();
                    } else {
                        if (pregunta2_negocio.equals("")) {
                            Toast.makeText(
                                this, "Escoja la pregunta 2",
                                Toast.LENGTH_LONG
                            ).show();
                        } else {
                            if (respuesta2_negocio.equals("")) {
                                Toast.makeText(
                                    this, "Debe ingresar la respuesta 2",
                                    Toast.LENGTH_LONG
                                ).show();
                            } else {
                                val intent = Intent(this, ingresar_nuevopwd_negocio::class.java)
                                startActivity(intent)
                            }
                        }
                    }
                }
            }
        }
    }
}
