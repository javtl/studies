/**
 * EJERCICIO: Cálculo de División con Validación de Cero
 * Conceptos: Control de flujo (if-else), Null Safety, Funciones y Tipos de datos.
 */

fun main() {
    // 1. Entrada de datos con validación de nulidad (Elvis Operator ?:)
    // Si el usuario introduce algo que no es un número, asignamos 'null' para manejar el error
    print("Introduce el dividendo (número a dividir): ")
    val dividendo = readlnOrNull()?.toDoubleOrNull()

    print("Introduce el divisor (entre cuánto dividir): ")
    val divisor = readlnOrNull()?.toDoubleOrNull()

    // 2. Validación de Entradas y Lógica de Negocio
    // Comprobamos que ambos sean números válidos y que el divisor no sea 0
    if (dividendo == null || divisor == null) {
        println("❌ ERROR: Por favor, introduce números válidos.")
    } else if (divisor == 0.0) {
        println("⚠️ ERROR CRÍTICO: No se puede dividir entre cero.")
    } else {
        // 3. Ejecución y Formateo
        val resultado = calcularDivision(dividendo, divisor)
        println("\n✅ El resultado de dividir $dividendo entre $divisor es: $resultado")
    }
}

/**
 * Función que realiza la operación.
 * Usamos Double para mayor precisión decimal (estándar en la Factory Engine).
 */
fun calcularDivision(n1: Double, n2: Double): Double {
    return n1 / n2
}