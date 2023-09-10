//Declarado en tiempo de compilación
const val PI = 3.1416
fun main(args: Array<String>) {
    //Declarado en tiempo de ejecución
    println("Hello World!")
    //Variables de lectura y escritura se asignan con var.
    var dinero = 10
    println(dinero)
    dinero = 5
    println(dinero)
    //Variables de sobrelectura se asginan con "val", estas no se pueden modificar o reasignar un nuevo valor
    val nombre = "Maria"
    println(nombre)
    println(PI)

    val boolean = true
    val numeroLargo = 3L
    val double = 2.7182
    val float = 1.17f

    val primerValor = 20
    val segundoValor = 10
    val tercerValor = primerValor.minus(segundoValor)
    val tercerValor2 = primerValor - segundoValor
    println(tercerValor)
    println(tercerValor2)

    val apellido = "Vetri"
    val giuseppe = "Giuseppe"
    //nombreCompleto = nombreCompleto2
    val nombreCompleto = giuseppe +" "+ apellido
    //Esta segunda forma nos permite concatenar cadenas de texto de forma facil
    val nombreCompleto2 = "$giuseppe $apellido"
    val nombreCompleto3 = "Mi nombre es $giuseppe $apellido"
    println(nombreCompleto)
    println(nombreCompleto2)
    println(nombreCompleto3)
}