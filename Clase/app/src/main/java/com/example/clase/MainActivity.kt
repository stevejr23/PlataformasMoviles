package com.example.clase

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.util.stream.IntStream.range

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //mayor()
        //listado()
        multiplicacion()
    }

    // Validar si una persona es mayor de edad o menor de edad
    fun mayor() {
        val edad = 18
        val edad2 = 15
        if (edad >= 18) {
            println("Usted es mayor de Edad")
        } else {
            println("Usted es menor de Edad")
        }
    }

    // Presentar la tabla de multiplicar de n numeros de forma ascendente y descendente
    fun multiplicacion() {


        println("Ascendente")
        for (num in range(1, 11)) {
            val multi = 2 * num
            println("2 * " + num + " = " + multi)
        }



    }


    // Mostrar el listado de paralelo de la materia de Plataformas móviles y los subgrupos por proyectos (Mostrar los resultados ordenados).
    fun listado() {

        val nombres = arrayOfNulls<String>(18)
        nombres[0] = "Eric Alvarado"
        nombres[1] = "Miguel Caraguay"
        nombres[2] = "Carlos Castillo"
        nombres[3] = "Erick Cuenca"
        nombres[4] = "Anthony Espinoza"
        nombres[5] = "Jhoselin Guachizaca"
        nombres[6] = "Steven Jara"
        nombres[7] = "Sofia Jaramillo"
        nombres[8] = "Andres Jimenez"
        nombres[9] = "Diego Leiva"
        nombres[10] = "Mateo Martinez"
        nombres[11] = "Pablo Montaño"
        nombres[12] = "Rommel Ojeda"
        nombres[13] = "Joselito Ordeoñez"
        nombres[14] = "Bryan Rodriguez"
        nombres[15] = "Pablo Saraguro"
        nombres[16] = "Isaias Silva"
        nombres[17] = "Carlos Tandazo"

        println(nombres.contentToString())


    }

//Presentar las propiedades de un vehículo utilizando clases, como tracción, motor, tipo de vehículo, capacidad

    //Calcular el iva
    fun iva() {
        var total = 100
        var iva = total * 0.12
        println("El 12% del iva es $iva del $total")
    }
}