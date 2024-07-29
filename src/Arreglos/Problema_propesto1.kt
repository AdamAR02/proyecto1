package Arreglos


fun main() {
    // Crear un arreglo de 8 enteros
    val numeros = IntArray(8)

    // Primer bucle: carga de elementos
    for (i in numeros.indices) {
        print("Ingrese el valor entero ${i + 1}: ")
        numeros[i] = readLine()!!.toInt()
    }

    // Inicializar variables para acumulaciones y conteos
    var sumaTotal = 0
    var sumaMayoresA36 = 0
    var cantidadMayoresA50 = 0

    // Segundo bucle: análisis de elementos
    for (valor in numeros) {
        sumaTotal += valor
        if (valor > 36) {
            sumaMayoresA36 += valor
        }
        if (valor > 50) {
            cantidadMayoresA50++
        }
    }

    // Mostrar los resultados
    println("Valor acumulado de todos los elementos: $sumaTotal")
    println("Valor acumulado de los elementos mayores a 36: $sumaMayoresA36")
    println("Cantidad de valores mayores a 50: $cantidadMayoresA50")
}