package Funciones_con_retorno_de_datos


fun calcularSuperficie(lado1: Int, lado2: Int): Int {
    return lado1 * lado2
}

fun main() {

    val lado1Rectangulo1 = 6
    val lado2Rectangulo1 = 8

    val lado1Rectangulo2 = 5
    val lado2Rectangulo2 = 12


    val superficieRectangulo1 = calcularSuperficie(lado1Rectangulo1, lado2Rectangulo1)
    val superficieRectangulo2 = calcularSuperficie(lado1Rectangulo2, lado2Rectangulo2)


    if (superficieRectangulo1 > superficieRectangulo2) {
        println("El primer rectángulo tiene una superficie mayor.")
    } else if (superficieRectangulo2 > superficieRectangulo1) {
        println("El segundo rectángulo tiene una superficie mayor.")
    } else {
        println("Ambos rectángulos tienen la misma superficie.")
    }
}