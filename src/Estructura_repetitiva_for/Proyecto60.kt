package Estructura_repetitiva_for

fun main(){
    print("ingrese la primer nota:")
    val nota1 = readln().toInt()
    print("Ingrese la segunda nota:")
    val nota2 = readln().toInt()
    print("Tercer nota:")
    val nota3 = readln().toInt()
    val promedio = (nota1 + nota2 + nota3)/3
    when {
        promedio >= 7 ->print("Pormocionado")
        promedio >= 4 -> print("Regular")
        else ->print("Libre")
    }
}