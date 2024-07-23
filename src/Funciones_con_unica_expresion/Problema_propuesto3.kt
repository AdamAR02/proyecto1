package Funciones_con_unica_expresion

fun calcularSuperficieRectangulo(base: Int, altura: Int): Int {
    return base * altura
}

fun main() {

    val base1 = 5
    val altura1 = 10

    val base2 = 8
    val altura2 = 6


    val superficie1 = calcularSuperficieRectangulo(base1, altura1)
    val superficie2 = calcularSuperficieRectangulo(base2, altura2)


    if (superficie1 > superficie2) {
        println("El primer rectángulo tiene una superficie mayor.")
    } else if (superficie2 > superficie1) {
        println("El segundo rectángulo tiene una superficie mayor.")
    } else {
        println("Ambos rectángulos tienen la misma superficie.")
    }
}