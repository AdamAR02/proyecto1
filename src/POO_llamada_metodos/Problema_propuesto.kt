package POO_llamada_metodos


class Hijos {
    private val edades = IntArray(5)  // Arreglo para almacenar las edades

    fun cargar() {
        println("Ingrese las edades de 5 personas:")
        for (i in edades.indices) {
            print("Edad ${i + 1}: ")
            edades[i] = readln().toInt()
        }
        imprimirMayorEdad()  // Llamada al método para imprimir la mayor edad
        imprimirPromedioEdad()  // Llamada al método para imprimir el promedio de edades
    }

    private fun imprimirMayorEdad() {
        val mayorEdad = edades.maxOrNull() ?: 0
        println("La mayor edad es: $mayorEdad")
    }

    private fun imprimirPromedioEdad() {
        val promedio = edades.average()
        println("El promedio de las edades es: ${String.format("%.2f", promedio)}")
    }
}

fun main() {
    val hijos = Hijos()
    hijos.cargar()
}