/*Dado el conjunto de números enteros:
numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
1. Crea un conjunto pares que contenga los números pares del conjunto numeros.
2. Crea un conjunto multiplos_de_tres que contenga los números que son
múltiplos de tres del conjunto numeros.
3. Encuentra la intersección entre los conjuntos pares y multiplos_de_tres y
guárdala en un conjunto llamado pares_y_multiplos_de_tres.*/

package E21KotlinBasicoEEDD


/**
 * EJERCICIO: Filtrado de conjuntos y cálculo de intersección.
 * Conceptos: filter (predicados), operador módulo (%) e intersección.
 */

fun main() {
    // Definimos el conjunto inicial
    val numeros = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // 1. Crear el conjunto 'pares' usando un filtro
    // La condición it % 2 == 0 comprueba si el resto de la división es cero
    val pares = numeros.filter { it % 2 == 0 }.toSet()

    // 2. Crear el conjunto 'multiplos_de_tres'
    val multiplos_de_tres = numeros.filter { it % 3 == 0 }.toSet()

    // 3. Encontrar la intersección
    val pares_y_multiplos_de_tres = pares intersect multiplos_de_tres

    // --- Visualización de resultados ---
    println("🔢 Conjunto base: $numeros")
    println("--------------------------------------------------")
    println("🔵 Números pares: $pares")
    println("🟢 Múltiplos de 3: $multiplos_de_tres")
    println("⭐ Intersección (Pares y Múltiplos de 3): $pares_y_multiplos_de_tres")
}