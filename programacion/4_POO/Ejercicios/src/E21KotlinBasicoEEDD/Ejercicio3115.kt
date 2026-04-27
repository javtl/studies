/**
 * EJERCICIO: Generador de Lotería Primitiva.
 * Conceptos: Programación funcional, Set (colecciones únicas) y Random.
 */

fun main() {
    // 1. Generar 6 números únicos entre 1 y 49
    // Usamos un Set porque automáticamente ignora duplicados
    val numeros = mutableSetOf<Int>()

    while (numeros.size < 6) {
        numeros.add((1..49).random())
    }

    // 2. Convertimos a lista para ordenar y presentar
    val combinacionOrdenada = numeros.toList().sorted()

    // 3. Generar el reintegro (0-9)
    val reintegro = (0..9).random()

    // 4. Salida elegante usando joinToString
    println("--- 🎫 TU APUESTA DE LA PRIMITIVA ---")
    println("Números: ${combinacionOrdenada.joinToString(", ")}")
    println("Reintegro: $reintegro")
    println("-------------------------------------")
}