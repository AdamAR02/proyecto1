package Funciones_con_retorno_de_datos

fun retornarSuperficie(lado1: Int, lado2: Int): Int {
    return lado1 * lado2
}

fun main() {
    val lado1 = 6
    val lado2 = 8

    val superficie = retornarSuperficie(lado1, lado2)
    println("La superficie del rectángulo con lados $lado1 y $lado2 es: $superficie")
}