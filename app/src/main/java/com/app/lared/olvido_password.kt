package com.app.lared

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Switch

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
            val intent = Intent(this, ingresar_nuevopwd_cliente :: class.java)
            startActivity(intent)
        }

        recuperar_pwd_negocio.setOnClickListener {
            val intent = Intent(this, ingresar_nuevopwd_negocio :: class.java)
            startActivity(intent)
        }
    }
}
