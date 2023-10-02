
// Declaramos los valores de nuestras respuestas
const val RESPUESTA_AFIRMATIVA = "✅"
const val RESPUESTA_NEGATIVA = "❌"
const val RESPUESTA_DUDOSA = "?"

//Unimos las respuestas con los valores
val respuestas = mapOf(
    "Sí" to RESPUESTA_AFIRMATIVA,
    "Es cierto" to RESPUESTA_AFIRMATIVA,
    "Totalmente" to RESPUESTA_AFIRMATIVA,
    "Sin duda" to RESPUESTA_AFIRMATIVA,
    "Pregunta en otro momento" to RESPUESTA_DUDOSA,
    "No puedo decirte en este momento" to RESPUESTA_DUDOSA,
    "Puede que si o puede que no" to RESPUESTA_DUDOSA,
    "No va a suceder" to RESPUESTA_NEGATIVA,
    "No cuentes con ello" to RESPUESTA_NEGATIVA,
    "Definitivamente no" to RESPUESTA_NEGATIVA,
    "No lo creo" to RESPUESTA_NEGATIVA,
)

fun main(args: Array<String>) {
    println("Hola soy tu bola 8 magica creada en Kotlin. Cual de estas opciones deseas realizar?")
    println("1. Realizar una pregunta")
    println("2. Revisar todas las respuestas")
    println("3. Salir")

    val valorImgresado = readLine()
    when(valorImgresado){
        "1" -> realizarPregunta()
        "2" -> mostrarRespuestas()
        "3" -> salir()
        else -> mostrarError()
    }
}

fun realizarPregunta(){
    println("Que pregunta deseas realizar?")
    readln()
    println("Asi que esa era tu pregunta... La respuesta a eso es:")
    val respuestaGenerada = respuestas.keys.random()
    println(respuestaGenerada)
}

fun mostrarRespuestas(){
    println("Seleccion una opcion:")
    println("1. Revisar todas las respuestas.")
    println("2. Revisar solo las respuestas afirmativas.")
    println("3. Revisar solo las respuestas dudosas.")
    println("4. Revisar solo las respuestas negativas.")

    val opcionIngresada = readLine()
    when(opcionIngresada){
        "1" ->  mostrarRespuestasPorTipo()
        "2" ->  mostrarRespuestasPorTipo(tipoDeRespuesta = RESPUESTA_AFIRMATIVA)
        "3" ->  mostrarRespuestasPorTipo(tipoDeRespuesta = RESPUESTA_NEGATIVA)
        "4" ->  mostrarRespuestasPorTipo(tipoDeRespuesta = RESPUESTA_DUDOSA)
        else -> println("Respuesta no valida.")
    }
}

fun mostrarRespuestasPorTipo(tipoDeRespuesta : String = "TODOS"){
    val printAnswers: (Map<String, String>) -> Unit = {
        it.keys.forEach { answer -> println(answer) }
    }
    when(tipoDeRespuesta){
        "TODOS" -> respuestas.keys.forEach{respuesta -> println(respuesta)}

        RESPUESTA_AFIRMATIVA -> respuestas.filterValues { values -> values == RESPUESTA_AFIRMATIVA }
            .also { printAnswers(it) }

        RESPUESTA_NEGATIVA -> respuestas.filterValues { values -> values == RESPUESTA_NEGATIVA }
            .also { printAnswers(it) }

        RESPUESTA_DUDOSA -> respuestas.filterValues { values -> values == RESPUESTA_DUDOSA }
            .also { printAnswers(it) }
    }
}

fun salir(){
    println("Hasta luego.")
}

fun mostrarError(){
    println("Has elegido una opcion no valida, intenta de nuevo.")
}