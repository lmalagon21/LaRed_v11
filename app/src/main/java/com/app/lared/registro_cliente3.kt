package com.app.lared

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class registro_cliente3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_cliente3)

        val registroNuevoCliente : Button = findViewById(R.id.cont_regcliente2)
        registroNuevoCliente.setOnClickListener {
            val intent = Intent(this, registro_cliente2 :: class.java)
            startActivity(intent)
        }
    }
}
