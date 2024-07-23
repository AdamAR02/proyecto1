package Funciones_con_retorno_de_datos

fun calcularPerimetroCuadrado(lado: Int): Int {
    return 4 * lado
}

fun main() {
    val lado = 5
    val perimetro = calcularPerimetroCuadrado(lado)
    println("El perímetro de un cuadrado con lado $lado es: $perimetro")
}