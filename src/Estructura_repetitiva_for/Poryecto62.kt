package Estructura_repetitiva_for

fun main(){
    var total = 0
    for(i in 1..3){
        print("ingrese sueldo del operario:")
        val sueldo = readln().toInt()
        total += when{
            sueldo >500-> {
                println("Sueldo alto")
                sueldo
            }
            sueldo > 2000 -> {
                println("Sueldo medio")
                0
            }
            else -> {
                println("sueldo bajo")
                0
            }
        }
    }
    println("Gastos totales en sueldos altos: $total")
}