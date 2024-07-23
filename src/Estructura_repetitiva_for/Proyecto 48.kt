package Estructura_repetitiva_for

fun main(){

    var suma=0
    for(index in 1..10){
        print("Ingrerse el valor $index:")
        val valor  = readln().toInt()
        suma += valor
    }
        println("La suma de todos los valores ingresados es $suma")
        val promedio = suma / 10
        println("Su promedio es $promedio")
}