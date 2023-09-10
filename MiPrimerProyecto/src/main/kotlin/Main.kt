//Declarado en tiempo de compilación
const val PI = 3.1416
fun main(args: Array<String>) {
    val nombre = "Li"
    //isNotEmpty = compruesta si la variables esta vacia.
    if (nombre.isNotEmpty()) println("El largo de nuestra variable nombre es ${nombre.length}") else println("Error, la variable esta vacia.")
    val mensaje : String = if (nombre.length > 4){
        "Tu nombre es largo!"
    } else if (nombre.isEmpty()){
        "Nombre esta vacio"
    } else {
        "Tienes un nombre corto"
    }
    println(mensaje)
}