/**
 * EJERCICIO: Recorrido inverso de String con While.
 * Conceptos: Índices (0 a N-1), Longitud de cadena y punteros manuales.
 */

fun main() {
    val cadena = "Kotlin"

    // 1. Inicializamos el índice en la última posición válida.
    // Importante: Si la longitud es 6, los índices van del 0 al 5.
    var indice = cadena.length - 1

    println("--- RECORRIDO INVERSO ---")

    // 2. Condición de control: Mientras el índice sea una posición válida (>= 0)
    while (indice >= 0) {
        val caracter = cadena[indice]
        println("Carácter en posición $indice: $caracter")

        // 3. Decremento: Movemos el puntero hacia la izquierda
        indice--
    }
}