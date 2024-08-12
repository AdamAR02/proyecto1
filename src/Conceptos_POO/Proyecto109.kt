package Conceptos_POO

class persona{
    var nombre: String = ""
    var edad: Int = 0


    fun inicializador(nombre: String, edad: Int){
        this.nombre = nombre
        this.edad = edad
    }
    fun imprimiendo(){
        println("Nombre: $nombre y tirnr una edad de $edad")
    }
    fun esMayorEdad(){
        if(edad >= 18)
            println("Es mayor de edad $nombre")
        else
            println("No es mayor de edad $nombre ")
    }

    fun main(){
        fun main(parametro: Array<String>) {
            val persona1: persona
            persona1 = persona()
            persona1.inicializador("Pedro", 16)
            persona1.imprimiendo()
            persona1.esMayorEdad()
        }

        fun main(){
            fun main(parametro: Array<String>) {
                val persona2: persona
                persona2 = persona()
                persona2.inicializador("Ana", 50)
                persona2.imprimiendo()
                persona2.esMayorEdad()
            }
        }