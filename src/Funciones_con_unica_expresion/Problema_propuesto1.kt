package Funciones_con_unica_expresion

fun calcularPromedio(a: Int, b: Int, c: Int): Double {

    val suma = a + b + c

    val promedio = suma / 3.0

    return promedio
}

fun main() {

    val promedio = calcularPromedio(10, 15, 20)
    println("El promedio de los tres números es: $promedio")
}