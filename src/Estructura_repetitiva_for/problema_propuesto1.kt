package Estructura_repetitiva_for

fun main(){
    print("ingrese valor")
    val num= readln().toInt()
    when{
        num > 0 -> println("Numero positivo")
        num <0 -> print("numero negativo")
        else -> println("Numero nulo")

    }


}