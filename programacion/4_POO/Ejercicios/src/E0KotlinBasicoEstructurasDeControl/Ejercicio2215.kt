/*Leer números enteros de teclado, hasta que el usuario ingrese el 0. Finalmente, mostrar
la sumatoria de todos los números positivos ingresados.*/

/**
 * EJERCICIO: Acumulador de números positivos.
 * Conceptos: Bucle de parada (while), Acumuladores y Condicionales.
 */

fun main() {
    var sumatoria = 0
    println("--- CALCULADORA DE SUMA POSITIVA ---")
    println("(Introduce números. El 0 detendrá el programa)\n")

    // 1. Iniciamos el bucle infinito controlado
    while (true) {
        print("Introduce un número: ")
        val numero = readlnOrNull()?.toIntOrNull() ?: 0

        // 2. Condición de parada (El Centinela)
        if (numero == 0) {
            break // Salimos del bucle inmediatamente
        }

        // 3. Filtro de negocio: Solo sumamos si es mayor que 0
        if (numero > 0) {
            sumatoria += numero
        } else {
            println("⚠️ El número $numero es negativo, no se incluirá en la suma.")
        }
    }

    // 4. Resultado final
    println("\n====================================")
    println("✅ La suma total de los positivos es: $sumatoria")
    println("====================================")
}