package E0KotlinBasicoEstructurasDeControl

/**
 * EJERCICIO: Conteo de números primos.
 * Conceptos: Funciones booleanas, Algoritmos de optimización, Bucles de control.
 */

fun main() {
    var contadorPrimos = 0
    println("--- ANALIZADOR DE NÚMEROS PRIMOS ---")
    println("(Introduce números > 1. Pulsa 0 para finalizar)\n")

    while (true) {
        print("Número: ")
        val numero = readlnOrNull()?.toIntOrNull() ?: 0

        // 1. Condición de parada
        if (numero == 0) break

        // 2. Validación de rango (Mayores que 1)
        if (numero <= 1) {
            println("⚠️ El número debe ser mayor que 1.")
            continue
        }

        // 3. Verificación de primalidad
        if (esPrimo(numero)) {
            println("✨ $numero es primo.")
            contadorPrimos++
        } else {
            println("❌ $numero no es primo.")
        }
    }

    println("\n--- RESULTADO FINAL ---")
    println("Se han encontrado $contadorPrimos números primos.")
}

/**
 * Función que determina si un número es primo.
 * Optimizada: Solo comprueba hasta la raíz cuadrada del número.
 */
fun esPrimo(n: Int): Boolean {
    // El 2 es el único primo par
    if (n == 2) return true
    // Si es par y no es 2, no es primo
    if (n % 2 == 0) return false

    // Comprobamos divisores impares desde 3 hasta la raíz de n
    // ¿Por qué? Si no tiene divisores hasta su raíz, no los tendrá después.
    var divisor = 3
    while (divisor * divisor <= n) {
        if (n % divisor == 0) return false
        divisor += 2 // Saltamos de 2 en 2 (solo impares)
    }

    return true
}