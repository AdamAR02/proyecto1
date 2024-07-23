package Funciones_con_unica_expresion

fun obtenerCantidadCaracteres(texto: String): Int {
    return texto.length
}

fun main() {

    val nombre1 = "Juan"
    val nombre2 = "María"


    val cantidadCaracteres1 = obtenerCantidadCaracteres(nombre1)
    val cantidadCaracteres2 = obtenerCantidadCaracteres(nombre2)


    if (cantidadCaracteres1 > cantidadCaracteres2) {
        println("'$nombre1' tiene más caracteres que '$nombre2'.")
    } else if (cantidadCaracteres2 > cantidadCaracteres1) {
        println("'$nombre2' tiene más caracteres que '$nombre1'.")
    } else {
        println("Ambos nombres tienen la misma cantidad de caracteres.")
    }
}