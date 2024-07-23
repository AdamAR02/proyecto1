package Funciones_con_argumentos_nombrados

fun calcularSueldo(
    nombre: String,costoHora: Double, cantidadHoras: Int)


{ val sueldo = costoHora * cantidadHoras
    println("nombre trabajo $cantidadHoras horas, " +
     "se le paga por hora $costoHora por lo tanto" +
             "le corresponde un sueldo de $sueldo")

}

