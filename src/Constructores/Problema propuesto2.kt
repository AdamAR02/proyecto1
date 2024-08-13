package Constructores

class Punto(val x: Int, val y: Int) {

    fun cuadrante(): String {
        return when {
            x > 0 && y > 0 -> "1º Cuadrante"
            x < 0 && y > 0 -> "2º Cuadrante"
            x < 0 && y < 0 -> "3º Cuadrante"
            x > 0 && y < 0 -> "4º Cuadrante"
            x == 0 && y == 0 -> "Origen"
            x == 0 -> "Eje Y"
            y == 0 -> "Eje X"
            else -> "No definido"
        }
    }
}