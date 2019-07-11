package com.app.lared

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_registro_cliente2.*

class registro_cliente2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_cliente2)

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

        val atras_finalcliente: Button = findViewById(R.id.atras_finalcliente)
        atras_finalcliente.setOnClickListener {
            val intent = Intent(this, registro_cliente3 :: class.java)
            startActivity(intent)
        }

        val registrar_cliente: Button = findViewById(R.id.registrar_cliente)
        registrar_cliente.setOnClickListener {
            val pais_cliente = this.pais_cliente.getSelectedItem().toString()
            val ciudad_cliente = this.ciudad_cliente.getText().toString()
            val barrio_cliente = this.barrio_cliente.getText().toString()
            if (pais_cliente.equals("Escoja su país de residencia")) {
                Toast.makeText(
                    this, "Debe escoger el pais donde vive",
                    Toast.LENGTH_LONG
                ).show();
            } else {
                if (ciudad_cliente.equals("")) {
                    Toast.makeText(
                        this, "Debe escoger la ciudad donde vive",
                        Toast.LENGTH_LONG
                    ).show();
                } else {
                    if (barrio_cliente.equals("")) {
                        Toast.makeText(
                            this, "Debe escoger el barrio de preferencia",
                            Toast.LENGTH_LONG
                        ).show();
                    } else {
                        val intent = Intent(this, registro_cliente4 :: class.java)
                        var primer_nombre : String = this.primer_nombre.text.toString()
                        var segundo_nombre : String = this.segundo_nombre.text.toString()
                        var primer_apellido : String = this.primer_apellido.text.toString()
                        var segundo_apellido : String = this.segundo_apellido.text.toString()
                        var movil_cliente : String = this.movil_clientecompleto.text.toString()
                        var tipo_doc_cliente : String = this.tipo_doccliente.text.toString()
                        var num_doccliente : String = this.numdoc_cliente.text.toString()
                        var email_cliente : String = this.email_cliente.text.toString()
                        var pais_cliente : String = this.pais_cliente.selectedItem.toString()
                        var ciudad_cliente : String = this.ciudad_cliente.text.toString()
                        var barrio_cliente : String = this.barrio_cliente.text.toString()
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
                        val nombrecompleto :Bundle = Bundle()
                        nombrecompleto.putString("nombrecompleto","Nombre Completo: " + primer_nombre + " " + segundo_nombre + " " + primer_apellido + " " + segundo_apellido)
                        intent.putExtras(nombrecompleto)
                        val movilcliente :Bundle = Bundle()
                        movilcliente.putString("movilcliente",movil_cliente)
                        intent.putExtras(movilcliente)
                        val movilclientecompleto :Bundle = Bundle()
                        movilclientecompleto.putString("movilclientecompleto","Número Celular: " + movil_cliente)
                        intent.putExtras(movilclientecompleto)
                        val documentocompleto :Bundle = Bundle()
                        documentocompleto.putString("documentocompleto",tipo_doc_cliente + ": " + num_doccliente)
                        intent.putExtras(documentocompleto)
                        val tipodoccliente :Bundle = Bundle()
                        tipodoccliente.putString("tipodoccliente",tipo_doc_cliente)
                        intent.putExtras(tipodoccliente)
                        val numdoccliente :Bundle = Bundle()
                        numdoccliente.putString("numdoccliente",num_doccliente)
                        intent.putExtras(numdoccliente)
                        val emailclientecompleto :Bundle = Bundle()
                        emailclientecompleto.putString("emailclientecompleto","Correo electrónico: " + email_cliente)
                        intent.putExtras(emailclientecompleto)
                        val emailcliente :Bundle = Bundle()
                        emailcliente.putString("emailcliente",email_cliente)
                        intent.putExtras(emailcliente)
                        val paisclientecompleto :Bundle = Bundle()
                        paisclientecompleto.putString("paisclientecompleto","País de residencia: " + pais_cliente)
                        intent.putExtras(paisclientecompleto)
                        val paiscliente :Bundle = Bundle()
                        paiscliente.putString("paiscliente",pais_cliente)
                        intent.putExtras(paiscliente)
                        val ciudadclientecompleto :Bundle = Bundle()
                        ciudadclientecompleto.putString("ciudadclientecompleto","Ciudad de residencia: " + ciudad_cliente)
                        intent.putExtras(ciudadclientecompleto)
                        val ciudadcliente :Bundle = Bundle()
                        ciudadcliente.putString("ciudadcliente",ciudad_cliente)
                        intent.putExtras(ciudadcliente)
                        val barrioclientecompleto :Bundle = Bundle()
                        barrioclientecompleto.putString("barrioclientecompleto","Barrio de preferencia: " + barrio_cliente)
                        intent.putExtras(barrioclientecompleto)
                        val barriocliente :Bundle = Bundle()
                        barriocliente.putString("barriocliente",barrio_cliente)
                        intent.putExtras(barriocliente)
                        startActivity(intent)
                        Toast.makeText(
                            this, "Resumen de datos suministrados",
                            Toast.LENGTH_LONG
                        ).show();
                    }
                }
            }
        }
    }
}
