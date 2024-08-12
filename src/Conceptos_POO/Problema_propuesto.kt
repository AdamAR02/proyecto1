package Conceptos_POO

class Alumno(var nombre: String, var nota: Double) {

    fun imprimir() {
        println("Nombre del alumno: $nombre")
        println("Nota del alumno: $nota")
    }

    fun mostrarEstado() {
        if (nota >= 4) {
            println("$nombre está regular.")
        } else {
            println("$nombre no está regular.")
        }
    }
}


fun main() {

    val alumno1 = Alumno("Juan", 6.5)
    val alumno2 = Alumno("Ana", 3.8)
    
    println("Datos del primer alumno:")
    alumno1.imprimir()
    alumno1.mostrarEstado()

    println("\nDatos del segundo alumno:")
    alumno2.imprimir()
    alumno2.mostrarEstado()
}