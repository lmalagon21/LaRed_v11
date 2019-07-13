package com.app.lared

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
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

        val pais_cliente = findViewById(R.id.pais_cliente) as Spinner
        val departamento_cliente = findViewById<Spinner>(R.id.departamento_cliente)
        val ciudad_cliente = findViewById(R.id.ciudad_cliente) as Spinner
        val barrio_cliente = findViewById<Spinner>(R.id.barrio_cliente)
        val valorPaisCliente = arrayOf("Escoja su país de residencia","Colombia")
        val valorDepartamentoClienteColombia = arrayOf("Escoja su departamento de residencia","Antioquia", "Bogotá D.C.", "Cundinamarca")
        val valorCiudadClienteAntioquia = arrayOf("Escoja su ciudad de residencia", "Medellín", "Bello", "Envigado", "Itagüi", "Sabaneta", "La Estrella", "Rionegro")
        val valorBarrioClienteMedellin = arrayOf("Escoja su barrio de preferencia", "*COMUNA 1*", "Carpinelo", "El Compromiso", "Granizal", "La Avanzada", "La Esperanza Nº 2", "Moscú Nº 2", "Popular Nº 1", "Popular Nº 2", "Santo Domingo Savio Nº 1", "Santo Domingo Savio Nº 2", "San Pablo", "Villa Guadalupe", "*COMUNA 2*", "Santa Cruz", "La Isla", "El Playón de Los Comuneros", "Pablo VI", "La Frontera", "La Francia", "Andalucía", "Villa del Socorro", "Villa Niza", "Moscú Nº 1", "La Rosa","*COMUNA 3*","La Salle","Las Granjas", "Campo Valdes Nº 2", "Santa Inés", "El Raizal", "El Pomar", "Manrique Central Nº 2", "Manrique Oriental", "Versalles Nº 1", "Versalles Nº 2", "La Cruz", "La Honda", "Oriente", "Maria Cano - Carambolas", "San José La Cima Nº 1", "San José La Cima Nº 2", "*COMUNA 4*", "Aranjuez", "Berlín", "San Isidro", "Palermo", "Bermejal - Los Álamos", "Moravia", "Sevilla", "San Pedro", "Manrique Central Nº 1", "Campo Valdes Nº 1", "Las Esmeraldas", "La Piñuela", "Brasilia", "Miranda", "*COMUNA 5*", "Castilla", "Toscana", "Héctor Abad Gómez", "La Paralela2", "Las Brisas", "Florencia", "Tejelo", "Boyacá", "Belalcazar", "Girardot", "Tricentenario", "Francisco Antonio Zea", "Alfonso López", "Caribe", "El Progreso", "*COMUNA 6*", "Doce de Octubre Nº 1", "Doce de Octubre Nº 2", "Santander", "Pedregal", "La Esperanza", "San Martín de Porres", "Kennedy", "Picacho", "Picachito", "Mirador del Doce", "El Progreso Nº 2", "El Triunfo", "*COMUNA 7*", "Robledo", "El Volador", "San Germán", "Barrio Facultad de Minas", "La Pilarica", "Bosques de San Pablo", "Altamira", "Córdoba", "López de Mesa", "El Diamante", "Aures Nº 1", "Aures Nº 2", "Bello Horizonte", "Villa Flora", "Palenque", "Cucaracho", "Fuente Clara", "Santa Margarita", "Olaya Herrera", "Pajarito", "Monteclaro", "Villa de La Iguaná", "La Cuchilla", "La Aurora", "La Campiña", "*COMUNA 8", "Villa Hermosa", "La Mansión", "San Miguel", "La Ladera", "Golondrinas", "Batallón Girardot", "Llanaditas", "Los Mangos", "Enciso", "Sucre", "El Pinal", "Trece de Noviembre", "La Libertad", "Villatina", "San Antonio", "Las Estancias", "Villa Turbay", "La Sierra", "Villa Lilliam", "Esfuerzos de Paz Nº 1", "Esfuerzos de Paz Nº 2", "*COMUNA 9", "Buenos Aires", "Caicedo", "Juan Pablo II", "Ocho de Marzo", "Barrios de Jesús", "Bomboná Nº 2", "Los Cerros - El Vergel", "Alejandro Echavarría", "Miraflores", "Cataluña", "La Milagrosa", "Gerona", "El Salvador", "Loreto", "Asomadera Nº 1", "Asomadera Nº 2", "Asomadera Nº 3", "Quinta Linda", "Barrio Pablo Escobar", "*COMUNA 10*", "La Candelaria", "Prado", "Jesús Nazareno", "El Chagualo", "Estación Villa", "San Benito", "Guayaquil", "Corazón de Jesús - Barrio Triste", "Calle Nueva", "Perpetuo Socorro", "Barrio Colón", "Las Palmas", "Bomboná Nº 1", "Boston", "Los Ángeles", "Villa Nueva", "San Diego", "*COMUNA 11", "Los Conquistadores", "Laureles", "Carlos E. Restrepo", "Suramericana", "Naranjal", "San Joaquín", "Bolivariana", "Las Acacias", "La Castellana", "Lorena", "El Velódromo", "Estadio", "Los Colores", "Cuarta Brigada", "Florida Nueva", "*COMUNA 12*", "La América", "Ferrini", "Calasanz", "Los Pinos", "La Floresta", "Santa Lucía", "El Danubio", "Campo Alegre", "Santa Mónica", "Barrio Cristóbal", "Simón Bolívar", "Santa Teresita", "Calasanz Parte Alta", "*COMUNA 13*", "San Javier Nº 1", "San Javier Nº 2", "El Pesebre", "Blanquizal", "Santa Rosa de Lima", "Los Alcázares", "Metropolitano", "La Pradera", "Juan XXIII", "La Divisa", "Veinte de Julio", "Belencito", "Betania", "El Corazón", "Las Independencias", "Nuevos Conquistadores", "El Salado", "Eduardo Santos", "Peñitas", "Antonio Nariño", "El Socorro", "Calasania", "*COMUNA 14*", "Castropol", "Barrio Colombia", "Villa Carlota", "Lalinde", "Manila", "Las Lomas Nº 1", "Las Lomas Nº 2", "Altos del Poblado", "El Tesoro", "Los Naranjos", "Los Balsos Nº 1", "Los Balsos Nº 2", "San Lucas", "El Diamante", "El Castillo", "Alejandría", "La Florida", "El Poblado", "Astorga", "Patio Bonito", "La Aguacatala", "Santa María de Los Ángeles", "*COMUNA 15", "Tenche", "Trinidad", "Santa Fe", "Campo Amor", "Cristo Rey", "Guayabal", "La Colina", "*COMUNA 16*", "Belén", "Cerro Nutibara", "Fátima", "Rosales", "Granada", "San Bernardo", "Las Playas", "Diego Echavarria", "La Mota", "El Rincón", "La Hondonada", "La Loma de Los Bernal", "La Gloria", "Altavista", "La Palma", "Zafra", "Los Alpes", "Las Violetas", "Las Mercedes", "Nueva Villa de Aburrá", "Miravalle", "El Nogal - Los Almendros")
        val valorBarrioClienteBello = arrayOf("Escoja su barrio de preferencia", "*COMUNA 1*", "Los Sauces", "El Cafetal", "La Pradera", "La Esmeralda", "París", "La Maruchenga", "José Antonio Galán", "Salvador Allende", "*COMUNA 2", "Barrio Nuevo", "La Cabañita", "La Cabaña", "La Madera", "La Florida", "Gran Avenida", "San José Obrero", "*COMUNA 3", "Villas de Occidente", "Molinares", "San Simón", "Amazonía", "Santa Ana", "Los Búcaros", "Serramonte, Salento", "*COMUNA 4", "Suárez", "Puerto Bello", "Rincón Santos", "Central", "Espíritu Santo", "Centro", "Pérez", "Nazareth", "La Meseta", "El Rosario", "Andalucía", "López de Mesa", "El Cairo", "La Milagrosa", "El Congolo", "Las Granjas", "Prado", "Manchester", "La Estación", "*COMUNA 5*", "La Cumbre", "Altavista", "El Carmelo", "Hato Viejo", "El Porvenir", "Briceño", "Buenos Aires", "El Paraíso", "Riachuelos", "Valadares", "El Trapiche", "Aralias", "Urapanes", "La Primavera", "Villa María Villas de Comfenalco", "*COMUNA 6*", "Bellavista", "Playa Rica", "San Gabriel", "San Martín", "Villas del Sol", "Tierradentro", "Villa Linda", "Girasoles", "Pachelly", "Los Alpes", "El Ducado","La Aldea", "La Selva", "*COMUNA 7*", "La Selva", "El Mirador", "Niquía Bifamiliares", "Altos de Niquía", "Altos de Quitasol", "*COMUNA 8*", "Ciudad Niquía", "Panamericano", "Ciudadela del Norte", "Terranova", "San Francisco I, II y III", "Santa Isabel I y II", "Senderos de San Jacinto", "Carmel", "San Basilio", "Nogales de Terranova", "Camino de los Vientos I y II y Terranova", "Hermosa Provincia", "*COMUNA 9*", "La Navarra", "El Trébol", "Guasimalito", "*COMUNA 10*", "La Virginia", "Fontidueño", "La Mina", "Alcalá", "Los Ciruelos", "Estación Primera", "Las Vegas", "La Camila", "Cinco Estrellas", "Marco Fidel Suárez", "*COMUNA 11*", "La Gabriela", "Belvedere", "Acevedo", "Zamora", "Alpes del Norte", "Santa Rita")
        val valorBarrioClienteEnvigado = arrayOf("Escoja su barrio de preferencia", "*ZONA 1*", "Las Vegas", "*ZONA 2", "El Poratl", "San Marcos", "Pontevedra", "Jardines", "Villa Grande", "Bosques de Zuñiga", "*ZONA 3", "La Sebastiana", "Las Flores", "Uribe Ángel", "Alto de Misael", "Las Orquideas", "*ZONA 4", "El Esmeraldal", "Loma del atravesado", "Zuñiga", "*ZONA 5*", "Loma de las brujas", "La pradera", "El Chocho", "Inmaculada", "*ZONA 6*", "El Chinguí", "El Salado", "La Mina", "San Rafael", "San José", "*ZONA 7*", "Las Antillas", "El Trianon", "Loma del Barro", "La Paz", "El Dorado", "*ZONA 8*", "Las Casitas", "Primavera", "Milán-Vallejuelos", "Alcalá", "*ZONA 9*", "Los Naranjos", "Mesa", "Zona Centro", "Obreros", "Bucarest", "La Magnolia", "*ZONA 10*", "El Escobero", "Santa Catalina", "*ZONA 11*", "El Vallano", "Belvedere", "*ZONA 12*", "las Palmas", "*ZONA 13*", "Pantanillo", "Perico")
        val valorBarrioClienteItagui = arrayOf("Escoja su barrio de preferencia", "*COMUNA 1*", "Zona Industrial Nº1", "Zona Industrial Nº2", "La Independencia", "La Santa Cruz", "San José", "Araucaria", "La Gloria", "Las Mercedes", "Centro", "Asturias", "Los Naranjos", "Villa Paula", "Artex", "Playa Rica", "Satexco", "San Isidro", "*COMUMA 2", "Santa Catalina", "Samaria Robles de Sur", "La Finca", "Yarumito", "El Palmar", "Santa Ana", "Samaria Nº1", "Las Margaritas", "Malta", "Monte Verde", "Camparola", "San Pio X", "La Palma", "Jardines Montesacro", "Zona Industrial Nº3", "*COMUNA 4*", "Las Brisas", "Pilsen", "San Javier", "Villa Lia", "19 de Abril", "San Gabriel", "San Antonio", "Triana", "Ditaires", "San Francisco", "Glorieta Pilsen", "*COMUNA 4", "Santa Maria Nº 1", "Santa Maria Nº 2", "Santa Maria Nº 3", "La Esmeralda", "Simón Bolivar", "San Fernando", "Entre colinas", "*COMUNA 5*", "Las Acacias", "Las Américas", "El Tablazo", "Calatrava", "Loma Linda", "Terranova Nº 1 y Nº 2", "La Aldea", "Balcones de Sevilla", "*COMUNA 6*", "Fátima", "El Rosario", "La Unión", "Santa María La Nueva", "*COMUNA 7*", "La María", "Los Olivares", "Loma de los Zuleta", "El Progreso", "El Pedregal", "Los Gómez", "El Ajizal", "Porvenir")
        val valorBarrioClienteSabaneta = arrayOf("Escoja su barrio de preferencia", "Aliadas Del Sur", "Ancon Sur", "Betania", "Calle Del Banco", "Calle Larga", "El Carmelo Ii", "Entreamigos", "Holanda", "La Barquereña", "La Florida", "La Doctora", "Las Casitas", "Los Alcázarez", "Los Arias", "Manuel Restrepo", "María Auxiliadora", "Nuestra Señora De Los Dolores", "Paso Ancho", "Playas De María", "Prados De Sabaneta", "Promisión", "Restrepo Naranjo", "Sabaneta Real", "San Joaquín", "San Rafael", "Santa Ana", "Tres Esquinas", "Vegas De La Doctora", "Vegas De San José", "Villas Del Carmen", "Virgen Del Carmen")
        val valorBarrioClienteLaEstrella = arrayOf("Escoja su barrio de preferencia", "Ancón San Martín", "Villa alicia Villa Mira", "Bellavista", "Camilo Torres", "Caqueta", "Centro", "Chile", "El Dorado", "El Pedrero", "Escobar", "Horizontes", "La Chinca", "La Ferreira", "La Ospina", "Las Brisas", "Monterrey", "Primavera", "Quebrada Grande", "San Agustín", "San Andrés", "San Cayetano", "San Vicente", "Zona Industrial")
        val valorBarrioClienteRionegro = arrayOf("Escoja su barrio de preferencia", "*COMUNA 1*", "Belchite", "El Centro", "Alto del Medio", "El Hospital", "*COMUNA 2*", "El Faro", "San Antonio", "Gualanday", "*COMUNA 3*", "Cuatro Esquinas", "Santa Ana", "*COMUNA 4*", "El Porvenir" , "*Corregimiento Sur*", "Cabeceras de Llanogrande", "El Higuerón", "Pontezuela", "El Capiro", "Santa Teresa", "Tres Puertas", "Guayabito", "Vilachuaga", "El Rosal", "Santa Ana", "San Antonio", "Chipre", "*Corregimiento Occidente*", "El Tablazo", "Tablacito", "La Mosquita", "La Quiebra", "Playa Rica", "Ranchería", "Yarumal", "Aeropuerto", "La Convención", "*Corregimiento Centro*", "El Carmín", "Cuchillas de San José", "Abreito", "Abreo", "Chachafruto", "Barro Blanco", "*Corregimiento Norte*", "Mampuesto", "La Mosca", "La Laja", "Cimarronas", "San Luis", "Río Abajo", "Santa Bárbara", "Los Pinos", "Galicia")
        val valorDepartamentoClienteArgentina = arrayOf("Escoja su departamento de residencia", "Buenos Aires", "Avellaneda", "Rosario", "Cordoba")

        pais_cliente.adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line,valorPaisCliente)

        pais_cliente.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                // Display the selected item text on text view
                val pais_escogido = valorPaisCliente[position]
                if (position.equals(1)) {
                    departamento_cliente.adapter = ArrayAdapter(this@registro_cliente2, android.R.layout.simple_dropdown_item_1line, valorDepartamentoClienteColombia)
                    departamento_cliente.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
                        override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                            val departamento_escogido: String = valorDepartamentoClienteColombia[position]
                            if (position.equals(1)) {
                                ciudad_cliente.adapter = ArrayAdapter(this@registro_cliente2, android.R.layout.simple_dropdown_item_1line, valorCiudadClienteAntioquia)
                                ciudad_cliente.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
                                    override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                                        val ciudad_escogido: String = valorCiudadClienteAntioquia[position]
                                        if (position.equals(1)) {
                                            barrio_cliente.adapter = ArrayAdapter(this@registro_cliente2, android.R.layout.simple_dropdown_item_1line, valorBarrioClienteMedellin)
                                        }
                                        if (position.equals(2)) {
                                            barrio_cliente.adapter = ArrayAdapter(this@registro_cliente2, android.R.layout.simple_dropdown_item_1line, valorBarrioClienteBello)
                                        }
                                        if (position.equals(3)) {
                                            barrio_cliente.adapter = ArrayAdapter(this@registro_cliente2, android.R.layout.simple_dropdown_item_1line, valorBarrioClienteEnvigado)
                                        }
                                        if (position.equals(4)) {
                                            barrio_cliente.adapter = ArrayAdapter(this@registro_cliente2, android.R.layout.simple_dropdown_item_1line, valorBarrioClienteItagui)
                                        }
                                        if (position.equals(5)) {
                                            barrio_cliente.adapter = ArrayAdapter(this@registro_cliente2, android.R.layout.simple_dropdown_item_1line, valorBarrioClienteSabaneta)
                                        }
                                        if (position.equals(6)) {
                                            barrio_cliente.adapter = ArrayAdapter(this@registro_cliente2, android.R.layout.simple_dropdown_item_1line, valorBarrioClienteLaEstrella)
                                        }
                                        if (position.equals(7)) {
                                            barrio_cliente.adapter = ArrayAdapter(this@registro_cliente2, android.R.layout.simple_dropdown_item_1line, valorBarrioClienteRionegro)
                                        }
                                    }
                                    override fun onNothingSelected(parent: AdapterView<*>) {
                                        // Another interface callback
                                    }
                                }
                            }

                        }
                        override fun onNothingSelected(parent: AdapterView<*>) {
                                // Another interface callback
                        }
                    }
                }
                if (position.equals(2)) {
                    departamento_cliente.adapter = ArrayAdapter(
                        this@registro_cliente2,
                        android.R.layout.simple_dropdown_item_1line,
                        valorDepartamentoClienteArgentina
                    )
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // Another interface callback
            }
        }

        val registrar_cliente: Button = findViewById(R.id.registrar_cliente)
        registrar_cliente.setOnClickListener {
            val pais_cliente = this.pais_cliente.getSelectedItem().toString()
            val departamento_cliente = this.departamento_cliente.getSelectedItem().toString()
            val ciudad_cliente = this.ciudad_cliente.getSelectedItem().toString()
            val barrio_cliente = this.barrio_cliente.getSelectedItem().toString()
            if (pais_cliente.equals("Escoja su país de residencia")) {
                Toast.makeText(
                    this, "Debe escoger el pais donde vive",
                    Toast.LENGTH_LONG
                ).show();
            } else {
                if (departamento_cliente.equals("Escoja su departamento de residencia")) {
                    Toast.makeText(
                        this, "Debe escoger el departamento donde vive",
                        Toast.LENGTH_LONG
                    ).show();
                } else {
                    if (ciudad_cliente.equals("Escoja su ciudad de residencia")) {
                        Toast.makeText(
                            this, "Debe escoger la ciudad donde vive",
                            Toast.LENGTH_LONG
                        ).show();
                    } else {
                        if (barrio_cliente.equals("Escoja su barrio de preferencia")) {
                            Toast.makeText(
                                this, "Debe escoger el barrio de preferencia",
                                Toast.LENGTH_LONG
                            ).show();
                        } else {
                            val intent = Intent(this, registro_cliente4::class.java)
                            var primer_nombre: String = this.primer_nombre.text.toString()
                            var segundo_nombre: String = this.segundo_nombre.text.toString()
                            var primer_apellido: String = this.primer_apellido.text.toString()
                            var segundo_apellido: String = this.segundo_apellido.text.toString()
                            var movil_cliente: String = this.movil_clientecompleto.text.toString()
                            var tipo_doc_cliente: String = this.tipo_doccliente.text.toString()
                            var num_doccliente: String = this.numdoc_cliente.text.toString()
                            var email_cliente: String = this.email_cliente.text.toString()
                            var pais_cliente: String = this.pais_cliente.selectedItem.toString()
                            var ciudad_cliente: String = this.ciudad_cliente.selectedItem.toString()
                            var departamento_cliente: String = this.departamento_cliente.selectedItem.toString()
                            var barrio_cliente: String = this.barrio_cliente.selectedItem.toString()
                            val primernombre: Bundle = Bundle()
                            primernombre.putString("primernombre", primer_nombre)
                            intent.putExtras(primernombre)
                            val segundonombre: Bundle = Bundle()
                            segundonombre.putString("segundonombre", segundo_nombre)
                            intent.putExtras(segundonombre)
                            val primerapellido: Bundle = Bundle()
                            primerapellido.putString("primerapellido", primer_apellido)
                            intent.putExtras(primerapellido)
                            val segundoapellido: Bundle = Bundle()
                            segundoapellido.putString("segundoapellido", segundo_apellido)
                            intent.putExtras(segundoapellido)
                            val nombrecompleto: Bundle = Bundle()
                            nombrecompleto.putString("nombrecompleto", "Nombre Completo: " + primer_nombre + " " + segundo_nombre + " " + primer_apellido + " " + segundo_apellido)
                            intent.putExtras(nombrecompleto)
                            val movilcliente: Bundle = Bundle()
                            movilcliente.putString("movilcliente", movil_cliente)
                            intent.putExtras(movilcliente)
                            val movilclientecompleto: Bundle = Bundle()
                            movilclientecompleto.putString("movilclientecompleto", "Número Celular: " + movil_cliente)
                            intent.putExtras(movilclientecompleto)
                            val documentocompleto: Bundle = Bundle()
                            documentocompleto.putString("documentocompleto", tipo_doc_cliente + ": " + num_doccliente)
                            intent.putExtras(documentocompleto)
                            val tipodoccliente: Bundle = Bundle()
                            tipodoccliente.putString("tipodoccliente", tipo_doc_cliente)
                            intent.putExtras(tipodoccliente)
                            val numdoccliente: Bundle = Bundle()
                            numdoccliente.putString("numdoccliente", num_doccliente)
                            intent.putExtras(numdoccliente)
                            val emailclientecompleto: Bundle = Bundle()
                            emailclientecompleto.putString(
                                "emailclientecompleto",
                                "Correo electrónico: " + email_cliente
                            )
                            intent.putExtras(emailclientecompleto)
                            val emailcliente: Bundle = Bundle()
                            emailcliente.putString("emailcliente", email_cliente)
                            intent.putExtras(emailcliente)
                            val paisclientecompleto: Bundle = Bundle()
                            paisclientecompleto.putString("paisclientecompleto", "País de residencia: " + pais_cliente)
                            intent.putExtras(paisclientecompleto)
                            val paiscliente: Bundle = Bundle()
                            paiscliente.putString("paiscliente", pais_cliente)
                            intent.putExtras(paiscliente)
                            val departamentoclientecompleto: Bundle = Bundle()
                            departamentoclientecompleto.putString("departamentoclientecompleto", "Departamento: " + departamento_cliente)
                            intent.putExtras(departamentoclientecompleto)
                            val departamentocliente: Bundle = Bundle()
                            departamentocliente.putString("departamentocliente", departamento_cliente)
                            intent.putExtras(departamentocliente)
                            val ciudadclientecompleto: Bundle = Bundle()
                            ciudadclientecompleto.putString("ciudadclientecompleto", "Ciudad: " + ciudad_cliente)
                            intent.putExtras(ciudadclientecompleto)
                            val ciudadcliente: Bundle = Bundle()
                            ciudadcliente.putString("ciudadcliente", ciudad_cliente)
                            intent.putExtras(ciudadcliente)
                            val barrioclientecompleto: Bundle = Bundle()
                            barrioclientecompleto.putString(
                                "barrioclientecompleto",
                                "Barrio de preferencia: " + barrio_cliente
                            )
                            intent.putExtras(barrioclientecompleto)
                            val barriocliente: Bundle = Bundle()
                            barriocliente.putString("barriocliente", barrio_cliente)
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

        val atras_finalcliente: Button = findViewById(R.id.atras_finalcliente)
        atras_finalcliente.setOnClickListener {
            val intent = Intent(this, registro_cliente3 :: class.java)
            startActivity(intent)
        }
    }
}
