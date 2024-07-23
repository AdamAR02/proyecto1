package Conceptos_de_funciones

// Función para calcular el cuadrado de un número
fun calcularCuadrado(numero: Int) {
    val cuadrado = numero * numero
    println("**************************")
}

// Función para calcular el producto de dos números
fun calcularProducto(num1: Int, num2: Int) {
    val producto = num1 * num2
    println("**************************")
}

fun main() {
    val num = 0
    var num1: Int
    var num2: Int

    // Llamada a la primera función
    println("Ingrese un número entero para calcular su cuadrado: ")
    num1 =0
    calcularCuadrado(num1)

    // Llamada a la segunda función
    println("\nIngrese dos números enteros para calcular su producto:")
    println("Primer número: ")
    num1 = 0
    println("Segundo número: ")
    num2 = 0
    calcularProducto(num1, num2)
}