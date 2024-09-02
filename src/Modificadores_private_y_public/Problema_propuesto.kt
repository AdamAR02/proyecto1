package Modificadores_private_y_public

import kotlin.random.Random

class MiArreglo {
   
    private val arreglo: IntArray = IntArray(5)


    init {
        cargarValoresAleatorios()
    }


    private fun cargarValoresAleatorios() {
        for (i in arreglo.indices) {
            arreglo[i] = Random.nextInt(0, 11)
        }
    }

    fun mostrarArreglo() {
        println("Arreglo: ${arreglo.joinToString(", ")}")
    }

    fun mostrarMayor() {
        val max = arreglo.maxOrNull() ?: throw NoSuchElementException("El arreglo está vacío")
        println("Mayor elemento: $max")
    }

    fun mostrarMenor() {
        val min = arreglo.minOrNull() ?: throw NoSuchElementException("El arreglo está vacío")
        println("Menor elemento: $min")
    }
}

fun main() {
    val miArreglo = MiArreglo()
    miArreglo.mostrarArreglo()
    miArreglo.mostrarMayor()
    miArreglo.mostrarMenor()
}
