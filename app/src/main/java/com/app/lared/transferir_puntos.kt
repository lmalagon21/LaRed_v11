package com.app.lared

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_redimir_puntos.*
import kotlinx.android.synthetic.main.activity_transferir_puntos.*

class transferir_puntos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transferir_puntos)
        val cancelar_transferir : Button = findViewById(R.id.cancelar_transferir)
        cancelar_transferir.setOnClickListener {
            val intent = Intent(this, uso_app_cliente :: class.java)
            startActivity(intent)
        }
        val transferirpuntos : Button = findViewById(R.id.transferir_puntos)
        transferirpuntos.setOnClickListener {
            val movil = this.transferir_movil.getText().toString()
            val valor = this.valor_transferir.getText().toString()
            if (movil.equals("")) {
                Toast.makeText(this, "Debe ingresar el número móvil a transferir",
                    Toast.LENGTH_LONG).show();
            } else {
                if (movil.equals(" ")) {
                    Toast.makeText(
                        this, "Debe ingresar el número móvil a transferir",
                        Toast.LENGTH_LONG
                    ).show();
                } else {
                    if (valor.equals("")) {
                        Toast.makeText(
                            this, "Debe ingresar la cantidad de puntos a transferir",
                            Toast.LENGTH_LONG
                        ).show();
                    } else {
                        val intent = Intent(this, uso_app_cliente::class.java)
                        startActivity(intent)
                        Toast.makeText(
                            this, "Transferencia de puntos exitosa",
                            Toast.LENGTH_LONG
                        ).show();
                    }
                }
            }
        }
    }
}
