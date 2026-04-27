// Escribir un programa que pida al usuario una palabra y muestre por pantalla si es un
//palíndromo.


/**
 * EJERCICIO: Detección de Palíndromos.
 * Conceptos: Normalización de Strings, Inversión vs. Comparación por índices.
 */

fun main() {
    print("Introduce una palabra o frase: ")

    // 1. Limpieza de datos (Data Cleaning)
    // Eliminamos espacios y pasamos a minúsculas para que "Ana" sea palíndromo.
    val original = readlnOrNull()?.lowercase()?.replace(" ", "") ?: ""

    if (original.isEmpty()) {
        println("⚠️ Entrada vacía.")
        return
    }

    // ENFOQUE A: El método Kotlin (Rápido y legible)
    val esPalindromoKotlin = original == original.reversed()

    // ENFOQUE B: El método de Ingeniería (Eficiente en memoria)
    // Comparamos los extremos hacia el centro sin crear una nueva String.
    val esPalindromoManual = verificarManualmente(original)

    println("\n--- RESULTADO ---")
    if (esPalindromoManual) {
        println("✅ '$original' es un palíndromo.")
    } else {
        println("❌ '$original' no es un palíndromo.")
    }
}

/**
 * Algoritmo de 'Two Pointers': Compara la primera letra con la última,
 * la segunda con la penúltima, y así hasta el centro.
 */
fun verificarManualmente(texto: String): Boolean {
    var izquierda = 0
    var derecha = texto.length - 1

    while (izquierda < derecha) {
        if (texto[izquierda] != texto[derecha]) {
            return false // En cuanto uno no coincide, paramos.
        }
        izquierda++
        derecha--
    }
    return true
}