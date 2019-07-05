package com.app.lared

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ingresar_nuevopwd_negocio : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingresar_nuevopwd_negocio)
        val cancelar_recuperarpwd : Button = findViewById(R.id.cancelar_newpwd1)
        cancelar_recuperarpwd.setOnClickListener {
            val intent = Intent(this, MainActivity :: class.java)
            startActivity(intent)
        }
    }
}
