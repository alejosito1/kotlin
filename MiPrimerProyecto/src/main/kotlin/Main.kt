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
}