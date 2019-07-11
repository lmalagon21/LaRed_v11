package com.app.lared

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_registro_cliente3.*

class registro_cliente3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_cliente3)

        val primernombrebundle:Bundle? = intent.extras
        primer_nombre.text = primernombrebundle!!.getString("primernombre")

        val segundonombrebundle:Bundle? = intent.extras
        segundo_nombre.text = segundonombrebundle!!.getString("segundonombre")

        val primerapellidobundle:Bundle? = intent.extras
        primer_apellido.text = primerapellidobundle!!.getString("primerapellido")

        val segundoapellidobundle:Bundle? = intent.extras
        segundo_apellido.text = segundoapellidobundle!!.getString("segundoapellido")

        val movilclientebundle:Bundle? = intent.extras
        movil_clientecompleto.text = movilclientebundle!!.getString("movilcliente")

        val tipodocclientebundle:Bundle? = intent.extras
        tipo_doccliente.text = tipodocclientebundle!!.getString("tipodoccliente")

        val numdocclientebundle:Bundle? = intent.extras
        numdoc_cliente.text = numdocclientebundle!!.getString("numdoccliente")

        val emailclientebundle:Bundle? = intent.extras
        email_cliente.text = emailclientebundle!!.getString("emailcliente")

        val atras_registrocliente2 : Button = findViewById(R.id.atras_registrocliente2)
        atras_registrocliente2.setOnClickListener {
            val intent = Intent(this, registro_cliente1 :: class.java)
            startActivity(intent)
        }

        val cont_regcliente2 : Button = findViewById(R.id.cont_regcliente2)
        cont_regcliente2.setOnClickListener {
            val pregunta1_cliente = this.pregunta1_cliente.getText().toString()
            val respuesta1_cliente = this.respuesta1_cliente.getText().toString()
            val pregunta2_cliente = this.pregunta2_cliente.getText().toString()
            val respuesta2_cliente = this.respuesta2_cliente.getText().toString()
            if (pregunta1_cliente.equals("")) {
                Toast.makeText(this, "Debe escoger la pregunta 1",
                    Toast.LENGTH_LONG).show();
            } else {
                if (respuesta1_cliente.equals("")) {
                    Toast.makeText(
                        this, "Debe digitar la respuesta 1",
                        Toast.LENGTH_LONG
                    ).show();
                } else {
                    if (pregunta2_cliente.equals("")) {
                        Toast.makeText(
                            this, "Debe escoger la pregunta 2",
                            Toast.LENGTH_LONG
                        ).show();
                    } else {
                        if (respuesta2_cliente.equals("")) {
                            Toast.makeText(
                                this, "Debe digitar la respuesta 2",
                                Toast.LENGTH_LONG
                            ).show();
                        } else {
                            val intent = Intent(this, registro_cliente2 :: class.java)
                            var primer_nombre : String = this.primer_nombre.text.toString()
                            var segundo_nombre : String = this.segundo_nombre.text.toString()
                            var primer_apellido : String = this.primer_apellido.text.toString()
                            var segundo_apellido : String = this.segundo_apellido.text.toString()
                            var movil_cliente : String = this.movil_clientecompleto.text.toString()
                            var tipo_doc_cliente : String = this.tipo_doccliente.text.toString()
                            var num_doccliente : String = this.numdoc_cliente.text.toString()
                            var email_cliente : String = this.email_cliente.text.toString()
                            val primernombre:Bundle = Bundle()
                            primernombre.putString("primernombre",primer_nombre)
                            intent.putExtras(primernombre)
                            val segundonombre :Bundle = Bundle()
                            segundonombre.putString("segundonombre",segundo_nombre)
                            intent.putExtras(segundonombre)
                            val primerapellido :Bundle = Bundle()
                            primerapellido.putString("primerapellido",primer_apellido)
                            intent.putExtras(primerapellido)
                            val segundoapellido :Bundle = Bundle()
                            segundoapellido.putString("segundoapellido",segundo_apellido)
                            intent.putExtras(segundoapellido)
                            val movilcliente :Bundle = Bundle()
                            movilcliente.putString("movilcliente",movil_cliente)
                            intent.putExtras(movilcliente)
                            val tipodoccliente :Bundle = Bundle()
                            tipodoccliente.putString("tipodoccliente",tipo_doc_cliente)
                            intent.putExtras(tipodoccliente)
                            val numdoccliente :Bundle = Bundle()
                            numdoccliente.putString("numdoccliente",num_doccliente)
                            intent.putExtras(numdoccliente)
                            val emailcliente :Bundle = Bundle()
                            emailcliente.putString("emailcliente",email_cliente)
                            intent.putExtras(emailcliente)
                            startActivity(intent)
                        }
                    }
                }
            }
        }
    }
}
