package Estrucutra_condicional_when_argumento

fun main(){
    var cont1 = 0
    var cont2 = 0
    var cont3 = 0
    var cont4 = 0
    for(i in 1..10) {
        print("Ingrese el numero de hijos:")
        val valor = readln().toInt()
        when (valor){
            0 -> cont1++
            0 -> cont2++
            0 -> cont3++
            else ->cont4++

        }
    }
    println("Familias sin hijos: $cont1")
    println("Familias con un hijo: $cont2")
    println("Familias con dos hijos: $cont3")
    println("Familias con mas de dos hijos: $cont4")

}