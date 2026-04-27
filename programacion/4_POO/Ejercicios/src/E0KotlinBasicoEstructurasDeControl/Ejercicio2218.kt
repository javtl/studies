package E0KotlinBasicoEstructurasDeControl

/**
 * EJERCICIO: Suma de dígitos y conteo de pares.
 * Conceptos: Bucle de control, Operadores aritméticos (División y Módulo), Acumuladores.
 */

fun main() {
    var cantidadPares = 0
    println("--- ANALIZADOR DE NÚMEROS ---")
    println("(Introduce números positivos. Usa -1 para salir)\n")

    while (true) {
        print("Introduce un número entero: ")
        val numero = readlnOrNull()?.toIntOrNull() ?: 0

        // 1. Condición de salida
        if (numero == -1) break

        // 2. Validación de entrada (Solo positivos)
        if (numero < 0) {
            println("⚠️ Por favor, introduce números positivos o -1 para salir.")
            continue // Salta a la siguiente iteración del bucle
        }

        // 3. Conteo de pares
        if (numero % 2 == 0) {
            cantidadPares++
        }

        // 4. Lógica de Suma de Dígitos (Aritmética Senior)
        val sumaDigitos = calcularSumaDigitos(numero)
        println("👉 La suma de los dígitos de $numero es: $sumaDigitos")
    }

    println("\n--- RESUMEN FINAL ---")
    println("Total de números pares ingresados: $cantidadPares")
    println("¡Gracias por usar el sistema!")
}

/**
 * Función auxiliar para extraer y sumar dígitos.
 * Usamos un bucle while para ir reduciendo el número.
 */
fun calcularSumaDigitos(n: Int): Int {
    var temporal = n
    var suma = 0

    while (temporal > 0) {
        // El resto (%) de dividir por 10 nos da el último dígito
        suma += (temporal % 10)
        // La división (/) entre 10 elimina el último dígito
        temporal /= 10
    }
    return suma
}