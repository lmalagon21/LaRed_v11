package com.app.lared

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_registro_cliente1.*

class registro_cliente1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_cliente1)


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
                                    var primer_nombre : String = this.primer_nombre.text.toString()
                                    var segundo_nombre : String = this.segundo_nombre.text.toString()
                                    var primer_apellido : String = this.primer_apellido.text.toString()
                                    var segundo_apellido : String = this.segundo_apellido.text.toString()
                                    var movil_cliente : String = this.movil_clientecompleto.text.toString()
                                    var tipo_doc_cliente : String = this.tipo_doc_cliente.selectedItem.toString()
                                    var num_doccliente : String = this.numdoccliente.text.toString()
                                    var emailCliente : String = this.email_cliente.text.toString()
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
                                    emailcliente.putString("emailcliente",emailCliente)
                                    intent.putExtras(emailcliente)
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

        val atras_registrocliente1 : Button = findViewById(R.id.atras_registrocliente1)
        atras_registrocliente1.setOnClickListener {
            val intent = Intent(this, registro_cliente :: class.java)
            startActivity(intent)
        }
    }
}

