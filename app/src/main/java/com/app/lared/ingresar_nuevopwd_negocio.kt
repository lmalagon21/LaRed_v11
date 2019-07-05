package com.app.lared

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_ingresar_nuevopwd_cliente.*
import kotlinx.android.synthetic.main.activity_ingresar_nuevopwd_negocio.*

class ingresar_nuevopwd_negocio : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingresar_nuevopwd_negocio)
        val cancelar_recuperarpwd : Button = findViewById(R.id.cancelar_newpwd1)
        cancelar_recuperarpwd.setOnClickListener {
            val intent = Intent(this, MainActivity :: class.java)
            startActivity(intent)
        }
        val cambiar_newpwd_negocio : Button = findViewById(R.id.cambiar_newpwd_negocio)
        cambiar_newpwd_negocio.setOnClickListener {
            val movil_newpwd_negocio = this.movil_newpwd_negocio.getText().toString()
            val password1 = this.newpwd_negocio1.getText().toString()
            val password2 = this.newpwd_negocio2.getText().toString()
            if (movil_newpwd_negocio.equals("")) {
                Toast.makeText(this, "Debe ingresar el número móvil",
                    Toast.LENGTH_LONG).show();
            } else {
                if (password1.equals("")) {
                    Toast.makeText(
                        this, "Ingrese la nueva contraseña",
                        Toast.LENGTH_LONG
                    ).show();
                } else {
                    if (password2.equals("")) {
                        Toast.makeText(
                            this, "Debe repetir la nueva contraseña",
                            Toast.LENGTH_LONG
                        ).show();
                    } else {
                        if (password1.equals(password2)) {
                            val intent = Intent(this, MainActivity::class.java)
                            startActivity(intent)
                            Toast.makeText(
                                this, "Se cambió la contraseña de manera correcta",
                                Toast.LENGTH_LONG
                            ).show();
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
