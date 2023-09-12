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

    //Estructura de control: When
    val nombreColor = "Carmesi"
    when (nombreColor){
        "Amarillo" -> println("El amarillo es el color e la alegria")
        "Rojo", "Carmesi" -> println("El $nombreColor simboliza el calor")
        else -> println("Error. No tengo informacion del color")
    }

    val code = 404
    when(code){
        //Para rangos.
        in 200..299 -> println("Todo ha ido bien.")
        in 400..500 -> println("Algo ha fallado")
        else -> println("Codigo desconocido, algo ha fallado.")
    }

    val tallaDeZapatos = 45
    val mensaje2 = when(tallaDeZapatos){
        41,43 -> "Tenemos disponible"
        42,44 -> "Casi no nos quedan"
        45 -> "Lo siento no tenemos disponibles"
        else -> "Estos zapatos solo vienen en tallas 41, 42, 43, 44 y 45"
    }
    println(mensaje2)

    //While y Do While
    var contador = 10
    while (contador > 0){
        println("El valor del contador es $contador")
        contador--
    }
    do{
        println("Generando numero aleatorio")
        val numeroAleatorio = (0..100).random()
        println("El numero generado es $numeroAleatorio")
    } while (numeroAleatorio > 50)

    //For
    val listaDeFrutas = listOf("Manzana", "Pera", "Frambuesa", "Durazno")
    for (fruta in listaDeFrutas) println("Hoy voy a comerme una fruta llamada $fruta")
    listaDeFrutas.forEach{fruta -> println("Hoy voy a comerme una fruta nueva $fruta") }

    val caracteresDeFrutas: List<Int> = listaDeFrutas.map { fruta -> fruta.length }
    println(caracteresDeFrutas)

    val listaFiltrada = caracteresDeFrutas.filter { cacteresDeFrutas -> cacteresDeFrutas>5 }
    println(listaFiltrada)
    
}