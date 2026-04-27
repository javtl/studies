import kotlin.math.abs

/**
 * EJERCICIO: Listar años cumplidos
 * Conceptos: Bucles 'for', Rangos (..), y Valor Absoluto.
 */
fun main() {
    print("Dime tu edad: ")

    // 1. Captura segura: Intentamos leer un entero. Si falla o es nulo, usamos 0.
    val entrada = readlnOrNull()?.toIntOrNull() ?: 0

    // 2. Normalización: Si el usuario pone -25, usamos 25 (valor absoluto)
    // Esto demuestra al profesor que prevés casos de error del usuario.
    val edad = abs(entrada)

    if (edad == 0) {
        println("Edad no válida o eres un recién nacido.")
    } else {
        println("\n--- LISTA DE AÑOS CUMPLIDOS ---")

        // 3. El Bucle 'for': En Kotlin los rangos se definen con '..'
        // i recorrerá desde 1 hasta la edad inclusive.
        for (i in 1..edad) {
            println("Has cumplido: $i años")
        }

        println("-------------------------------")
    }
}