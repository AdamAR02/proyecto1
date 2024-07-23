package Funciones_con_unica_expresion

fun calcularPerimetroCuadrado(lado: Int): Int {

    val perimetro = lado * 4

    return perimetro
}

fun main() {

    val lado = 5
    val perimetro = calcularPerimetroCuadrado(lado)
    println("El perímetro del cuadrado con lado $lado es: $perimetro")
}