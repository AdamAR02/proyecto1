fun main(){
    //problema 1
    /*

    do{
        print("Ingrese un valor comprendido entre 0 y 999")
        val valor = readln().toInt()
        if(valor < 10)
            println("El valor ingresado tiene 1 digito")
        else
            if(valor < 100)
                println("El valor ingresado tiene dos digitos")
        else
            println("El valor ingresado tiene tres digitos")
    }while(valor != 0)

     */





    //Problema 2
    /*
    var cant = 0
    var suma = 0
    do{
        print("Ingrese u valor (0 para finalizar):")
        val valor = readln().toInt()
        if(valor != 0){
            suma+= valor
            cant++
        }
    }while(valor != 0)
    if(cant !=0){
        val promedio = suma/cant
        print("El promedio de los valores ingresados: $promedio")
    }
    else{
        print("No se ingresaron valores.")
    }
    */



    //Problema 3
    /*
    var cantidad_inferior = 0 //por debajo de 9.8
    var cantidad_superior = 0 //por debajo de 10.2
    var cantidad_adecuada = 0 //entre 9.8 y 10.2

    do{
        print("Ingrese el peso de la pieza(0 para finalizar):")
        val peso = readln().toDouble()
        if(peso > 10.2)
            cantidad_superior++
        else
            if(peso >= 9.8 && peso <= 10.2)
                cantidad_adecuada++
        else
            cantidad_inferior++
    }while (peso != 0.0)
    println("Piezas aptas: $cantidad_adecuada")
    println("Piezas peso superior a 10.2: $cantidad_superior")
    println("Pieza peso inferior a 9.8: $cantidad_inferior")
    val suma = cantidad_adecuada + cantidad_inferior + cantidad_superior
    println("Cantidad total de piezas")
    */



/*
    fun main(parametro: Array<String>) {
        do {
            print("Ingrese un valor comprendido entre 0 y 999:")
            val valor = readln().toInt()
            if (valor < 10)
                println("El valor ingresado tiene un dígito")
            else
                if (valor < 100)
                    println("El valor ingresado tiene dos dígitos")
                else
                    println("El valor ingresado tiene tres dígitos")
        } while (valor != 0)
    }
    */







/*

    fun main(parametro: Array<String>) {
        do {
            print("Ingrese un valor comprendido entre 0 y 9999 (9999 para finalizar):")
            val valor = readln().toInt()






            if (valor < 10)
                println("El valor ingresado tiene un dígito")
            else
                if (valor < 100)
                    println("El valor ingresado tiene dos dígitos")
                else
                    println("El valor ingresado tiene tres dígitos")
        } while (valor != 0)
    }
*/









/*
    fun main() {

        var acumulador = 0
        var valor: Int

        do {
            print("Ingrese un valor (9999 para terminar): ")

            if (valor= 9999) {
                acumulador += valor
            }
        } while (valor != 9999)

        println("El valor acumulado es: $acumulador")

        when {
            acumulador == 0 -> println("El valor acumulado es cero.")
            acumulador > 0 -> println("El valor acumulado es mayor que cero.")
            else -> println("El valor acumulado es menor que cero.")

*/


/*






        fun main() {


            var sumaSaldosAcreedores = 0
            var numeroCuenta: Int
            var saldoActual: Int

            do {
                print("Ingrese el número de cuenta (negativo para terminar): ")


                if (numeroCuenta >= 0) {
                    print("Ingrese el saldo actual de la cuenta: ")


                    // Determinar estado de la cuenta
                    val estadoCuenta = when {
                        saldoActual > 0 -> {
                            sumaSaldosAcreedores += saldoActual
                            "Acreedor"
                        }
                        saldoActual < 0 -> "Deudor"
                        else -> "Nulo"
                    }

                    // Mostrar información de la cuenta
                    println("Número de cuenta: $numeroCuenta")
                    println("Estado de la cuenta: $estadoCuenta")
                }
            } while (numeroCuenta >= 0)

            // Mostrar suma total de saldos acreedores
            println("La suma total de los saldos acreedores es: $sumaSaldosAcreedores")
    }
    */

}