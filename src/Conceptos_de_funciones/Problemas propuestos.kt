package Conceptos_de_funciones

fun mayormenor(valor1: Int, valor2: Int, valor3: Int) {
    when {
        valor1 < valor2 && valor1 < valor3 -> {
            if (valor2 < valor3)
                println("$valor1 $valor2 $valor3 ")
            else
                println("$valor1 $valor3 $valor2 ")
        }
        valor2 < valor3 -> {
            if (valor1 < valor3)
                println("$valor2 $valor1 $valor3")
            else
                println("$valor2 $valor3 $valor1")
        }
        else -> {
            if (valor1 < valor2)
                println("$valor3 $valor1 $valor2")
            else
                println("$valor3 $valor2 $valor1")
        }
    }
}

fun main() {
    print("Ingrese primer valor:")
    val valor1 = readln().toInt()
    print("Ingrese segunda valor:")
    val valor2 = readln().toInt()
    print("Ingrese tercer valor:")
    val valor3 = readln().toInt()
    mayormenor(valor1, valor2, valor3)
    }

