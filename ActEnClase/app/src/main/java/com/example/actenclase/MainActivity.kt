package com.example.actenclase

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.util.stream.IntStream

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Validar si una persona es mayor de edad o menor de edad
        mayor()
        // Presentar la tabla de multiplicar de n numeros de forma ascendente y descendente
        multiplicacion()
        // Mostrar el listado de paralelo de la materia de Plataformas móviles y los subgrupos por proyectos (Mostrar los resultados ordenados).
        listado()
        // Presentar las propiedades de un vehículo utilizando clases, como tracción, motor, tipo de vehículo, capacidad
        propiedadesAutos()
        // Calcular el iva
        iva()
        // Validación de la cedula
        validarCedula()

    }

    // Validar si una persona es mayor de edad o menor de edad
    fun mayor() {
        println("--------")
        val edad = 18
        if (edad >= 18) {
            println("Usted es mayor de Edad")
        } else {
            println("Usted es menor de Edad")
        }
    }

    // Presentar la tabla de multiplicar de n numeros de forma ascendente y descendente
    fun multiplicacion() {
        println("-------------------------------------------------------------------------------- ")
        val n = 5
        println("La tabla de multiplicar de $n en forma ascendente es : ")
        for (i in 1..10) {
            println("$n x $i = ${n * i}")
        }
        println("La tabla de multiplicar de $n en forma descendente es : ")
        var contador = 10
        for (i in 1..11) {
            contador--
            println("$n x $contador = ${n * contador}")
        }
    }

    // Mostrar el listado de paralelo de la materia de Plataformas móviles y los subgrupos por proyectos (Mostrar los resultados ordenados).
    fun listado() {
        println("----------------")
        val personas = listOf<String>(
            "Eric Alvarado",
            "Miguel Caraguay",
            "Carlos Castillo",
            "Erick Cuenca",
            "Anthony Espinoza",
            "Jhoselin Guachizaca",
            "Steven Jara",
            "Sofia Jaramillo",
            "Andres Jimenez",
            "Diego Leiva",
            "Mateo Martinez",
            "Pablo Montaño",
            "Rommel Ojeda",
            "Joselito Ordeoñez",
            "Bryan Rodriguez",
            "Pablo Saraguro",
            "Isaias Silva",
            "Carlos Tandazo"
        )
        var ordenar = personas.sorted()
        println("Listado de los estudiantes de Plataformas moviles")
        for (persanas in ordenar) {
            println(persanas)
        }
        val proyectos = mutableMapOf(
            "Eric Alvarado" to "Mascotas",
            "Miguel Caraguay" to "Registro UTPL",
            "Carlos Castillo" to "Mascotas",
            "Erick Cuenca" to "Mascotas",
            "Anthony Espinoza" to "Mascotas",
            "Jhoselin Guachizaca" to "Mascotas",
            "Steven Jara" to "Registro UTPL",
            "Sofia Jaramillo" to "Registro UTPL",
            "Andres Jimenez" to "Mascotas",
            "Diego Leiva" to "Mascotas",
            "Mateo Martinez" to "Mascotas",
            "Pablo Montaño" to "Mascotas",
            "Rommel Ojeda" to "Mascotas",
            "Joselito Ordeoñez" to "Mascotas",
            "Bryan Rodriguez" to "Registro UTPL",
            "Pablo Saraguro" to "Registro UTPL",
            "Isaias Silva" to "Mascotas",
            "Carlos Tandazo" to "Mascotas"
        )

        val ordenProyectos = proyectos.toSortedMap()
        println("----------------")
        println("Listado De Estudiantes por Proyectos")
        for (i in ordenProyectos) {
            println("${i.key} - ${i.value}")
        }
    }

    //Presentar las propiedades de un vehículo utilizando clases, como tracción, motor, tipo de vehículo, capacidad
    fun propiedadesAutos() {
        println("-----------")
        val car = Vehiculo(
            marca = "Hyundai",
            arrayOf(Vehiculo.Traccion.Manual),
            arrayOf(Vehiculo.Motor.V6),
            arrayOf(Vehiculo.Tipo.Suv),
            capacidad = "5 Personas", color = "Plateado"
        )
        println(car.marca)
        car.vehiculo()
    }

    //Calcular el iva
    fun iva() {
        println("---------")
        var total = 100
        var iva = total * 0.12
        println("El 12% del iva es $iva del $total")
    }

    //Validar Cedula
    fun validarCedula() {
        println("--------------")
        var cedula = arrayOf(1, 1, 0, 5, 2, 6, 2, 1, 2, 3)
        var validadores = arrayOf(2, 1, 2, 1, 2, 1, 2, 1, 2)
        var contador = 0
        var suma = 0

        for (x in validadores) {

            var res = x * cedula[contador]
            contador += 1
            // Condicion si la multiplicacion supera el 9
            if (res > 9) {

                var aux1 = res.toString()
                // Suma de los dos valores
                res =
                    Character.getNumericValue(aux1.get(0)) + Character.getNumericValue(aux1.get(1))
            }
            // Suma total
            suma += res
        }
        /*
            Condicion para validar el ultimo numero Si el residuo es 0 se validara,
            Ó si es diferente se tendra que a 10 restarle el residuo
         */
        if (cedula[9] == (suma % 10) || cedula[9] == 10 - (suma % 10)) {
            println("Cedula Correcta")
        } else {
            println("Cedula Incorrecta")
        }
    }

}