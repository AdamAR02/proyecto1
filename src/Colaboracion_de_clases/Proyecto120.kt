package Colaboracion_de_clases

class Dado(var valor: Int){
    fun tirar(){
        valor=((Math.random()*6)+1).toInt()
        mostrar()
    }
    fun mostrar(){
        println("Valor del dado:$valor")
    }
}
class JuegoDeDados{
    val dado1=Dado(1)
    val dado2=Dado(1)
    val dado3=Dado(1)
    fun jugar(){
        dado1.tirar()
        dado2.tirar()
        dado3.tirar()
        if(dado1.valor==dado2.valor&&dado2.valor==dado3.valor)
            println("Ganó")
        else
            print("Perdió")
    }
}
fun main(parametro:Array<String>){
    val juego1=JuegoDeDados()
    juego1.jugar()
}