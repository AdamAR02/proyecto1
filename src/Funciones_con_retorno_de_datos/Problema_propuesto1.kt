package Funciones_con_retorno_de_datos

fun calcularPromedio(a: Int, b: Int, c: Int): Double {
    val suma = a + b + c
    val promedio = suma.toDouble() / 3
    return promedio
}

fun main() {
    val num1 = 10
    val num2 = 20
    val num3 = 30

    val promedio = calcularPromedio(num1, num2, num3)
    println("El promedio de $num1, $num2 y $num3 es: $promedio")
}