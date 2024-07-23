package Estructura_repetitiva_for

fun main(){
    var mayor=0
    for(i in 1..5){
        print("Ingrese el valor")
        val valor1=readln().toInt()
        print("Ingrese el valor")
        val valor2=readln().toInt()
        print("Ingrese el valor")
        val valor3=readln().toInt()

        mayor += when{
            valor1 > valor2 && valor1 > valor3 ->valor1
            valor2 > valor3 -> valor2
            else ->valor3
        }



    }
println("Valor acumulado del mayor de cada lista es: $mayor")
}