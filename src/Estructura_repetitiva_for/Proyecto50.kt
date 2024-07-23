package Estructura_repetitiva_for

fun main(){
    var mul3 =0
    var mul5 =0
    var mul9 =0
    for(index in 1..10000){
        if(index % 3 == 0)
            mul3++
        if(index % 5 == 0)
            mul5++
        if(index % 9 == 0)
            mul9++
    }
    print("Cantidad de multiplos de 3: $mul3")
    print("Cantidad de multiplos de 5: $mul5")
    print("Cantidad de multiplos de 9: $mul9")
}