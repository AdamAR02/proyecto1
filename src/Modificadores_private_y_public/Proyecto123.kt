package Modificadores_private_y_public

class Dado{
    private var valor: Int=1
    fun tirar(){
        valor=((Math.random()*6)+1).toInt()
    }
    fun imprimir(){
        separador()
        println("Valordeldado:$valor")
        separador()
    }
    private fun separador()=
        println("**************************************")
}
fun main(parametro:Array<String>){
    val dado1=Dado()
    dado1.tirar()
    dado1.imprimir()
}