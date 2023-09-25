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

    //Try catch
    var nombre3 : String? = null
    try {
        throw NullPointerException("Referencia nula.")

    } catch (exception : NullPointerException){
        println("Ha ocurrido un error")
    } finally {
        println("Finalmente ha ocurrido un error... Cerrando aplicacion.")
    }
    println(nombre3?.length)

    val primerValor = 0
    val segundoValor = 0
    val resultado : Int = try { primerValor / segundoValor } catch (exception : Exception){0}
    println(resultado)

    //Elvis operator
    //Permite asignar un valor por defecto a una variable null, (?:)
    var nombre4: String? = null
    val caracteresDeNombre: Int = nombre4?.length ?:0
    println(caracteresDeNombre)

    //Listas
    //Listas imnutables
    val listaDeNombres = listOf<String>("Juan", "Enrique", "Camila")
    println(listaDeNombres)
    //Listas mutables
    val listaVacia = mutableListOf<String>()
    listaVacia.add("Juan")
    println(listaVacia)

    val valorUsandoGet = listaVacia.get(0)
    println(valorUsandoGet)

    val valorUsandoOperador = listaVacia[0]
    println(valorUsandoOperador)

    val primerValor1: String? = listaDeNombres.firstOrNull()
    println(primerValor1)

    listaVacia.removeAt(0)
    println(listaVacia)

    listaVacia.add("Enrique")
    println(listaVacia)
    listaVacia.removeIf { caracteres -> caracteres.length>3 }
    println(listaVacia)

    //Arrays
    val myArray = arrayOf(1,2,3,4)
    println("Nuestro array $myArray")
    println("Array como lista ${myArray.toList()}")

    //Ordenar listas.
    val numerosDeLoteria = listOf(11,22,43,56,78,66)
    val numerosSorted = numerosDeLoteria.sorted()
    println(numerosSorted)
    val numerosDeLoteriaDecendientes = numerosDeLoteria.sortedDescending()
    println(numerosDeLoteriaDecendientes)

    val ordenarPorMultiplos = numerosDeLoteria.sortedBy { numero -> numero < 50 }
    println(ordenarPorMultiplos)

    val numerosAleatorios = numerosDeLoteria.shuffled()
    println(numerosAleatorios)

    val numerosEnReversa = numerosDeLoteria.reversed()
    println(numerosEnReversa)

    val mensajesDeNumeros = numerosDeLoteria.map { numero -> "Tu numero de loteria es $numero" }
    println(mensajesDeNumeros)
    val numerosFiltrados = numerosDeLoteria.filter { numero -> numero > 50 }
    println(numerosFiltrados)

    //Maps
    val edadDeSuperHeroes = mapOf(
        "Ironman" to 35,
        "Spiderman" to 23,
        "Capitan America" to 99
    )
    println(edadDeSuperHeroes)

    val edadSuperHeroesMutable = mutableMapOf(
        "Ironman" to 35,
        "Spiderman" to 23,
        "Capitan America" to 99
    )
    println(edadSuperHeroesMutable)
    edadSuperHeroesMutable.put("Wolverine", 45)
    println(edadSuperHeroesMutable)

    edadSuperHeroesMutable["Storm"] = 30
    println(edadSuperHeroesMutable)

    val edadIroman = edadSuperHeroesMutable["Ironman"]
    println(edadIroman)

    edadSuperHeroesMutable.remove("Wolverine")
    println(edadSuperHeroesMutable)

    println(edadSuperHeroesMutable.keys)
    println(edadSuperHeroesMutable.values)

    //Sets
    val vocalesRepetidas = setOf("a","e","i","o","u","a","e","i","o","u")
    println(vocalesRepetidas)

    val numerosFavoritos = mutableSetOf(1,2,3,4)
    println(numerosFavoritos)
    numerosFavoritos.add(5)
    println(numerosFavoritos)

    numerosFavoritos.remove(5)
    println(numerosFavoritos)

    val valorDelSet: Int? = numerosFavoritos.first { numero -> numero > 2 }
    println(valorDelSet)

    //Funciones y funciones de extension.
    val fraseAleatoria = "En Platzi nunca paramos de aprender".randomCase()
    println(fraseAleatoria)
    imprimirFrase(fraseAleatoria)

    //Tipos de parámetros
    //Parametros nombrados salen en azul, se suele suele usar para dos o mas parametros.
    imprimirNombre(nombre ="Sergio", apellido = "Torres")

    //Lambdas
    val myLambda : (String) -> Int = {
        valor  -> valor.length
    }
    val lambdaEjecutada: Int = myLambda("Hola")
    println(lambdaEjecutada)

    val saludos = listOf("Hello", "Hola", "Ciao")
    val longitudDeSaludos = saludos.map(myLambda)
    println(longitudDeSaludos)

    //High Order Functions
    val largoDelValorInicial = superFuncion(valorInicial = "Hola", block = {
        valor -> valor.length
    })
    println(largoDelValorInicial)

    val lambda: () -> String = funcionInception("Sergio")
    val valorLambda: String = lambda()
    println(valorLambda)

    //Scope functions
    //Let
    var nombreLet : String? = null
    nombreLet?.let{
        valor -> println("El nombre no es nulo, es $valor")
    }
    nombreLet = "Sergio"
    nombreLet?.let{
        valor -> println("El nombre no es nulo, es $valor")
    }

    //With
    val colores = listOf("Azul", "Amarillo", "Rojo")
    with(colores){
        println("Nuestros colores son $this")
        println("Esta lista tiene una cantidad de colores de $size")
    }

    //Run
    val moviles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Redmi 10", "Xiaomi Mi A3")
        .run {
            removeIf {
                movil -> movil.contains("Google")
            }
            this
        }
    println(moviles)

    //Apply
    
}
//Funciones y funciones de extension.
fun imprimirFrase(frase : String) : Unit{
    println("Tu frase es : $frase")
}
fun String.randomCase() : String {
    val numeroAleatorio = 0..99
    val resultadoAleatorio = numeroAleatorio.random()
    if (resultadoAleatorio.rem(2) == 0) {
        return this.toUpperCase()
    } else {
        return this.toLowerCase()
    }
}

//Tipos de parámetros
fun imprimirNombre(nombre: String,segundoNombre: String = "", apellido: String){
    println("Mi nombre es $nombre y mi apellido es $apellido")
    //Al parametro segundoNombre se le esta asignando un valor por defecto.
    println("Mi nombre completo es $nombre $segundoNombre $apellido")
}

//High Order Functions
fun superFuncion(valorInicial : String, block : (String) -> Int) : Int {
    return block(valorInicial)
}

fun funcionInception(nombre : String) : () -> String{
    return {
        "Hola desde la lambda $nombre"
    }
}