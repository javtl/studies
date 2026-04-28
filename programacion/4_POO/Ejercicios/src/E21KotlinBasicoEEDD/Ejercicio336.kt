/*Dado el conjunto de letras:
vocales = {'a', 'e', 'i', 'o', 'u'}
1. Crea un conjunto consonantes que contenga las letras del alfabeto que no son
vocales.
2. Crea un conjunto letras_comunes que contenga las letras que están tanto en el
conjunto vocales como en el conjunto consonantes.*/

package E21KotlinBasicoEEDD

/**
 * EJERCICIO: Vocales vs Consonantes.
 * Conceptos: Diferencia de conjuntos, conjuntos disjuntos e intersección vacía.
 */

fun main() {
    // Definimos el conjunto de vocales
    val vocales = setOf('a', 'e', 'i', 'o', 'u')

    // Definimos el alfabeto completo (rango de la 'a' a la 'z')
    val alfabeto = ('a'..'z').toSet()

    // 1. Crear el conjunto 'consonantes'
    // Usamos 'subtract' para quitar las vocales del alfabeto completo
    val consonantes = alfabeto subtract vocales

    // 2. Encontrar la intersección (letras_comunes)
    val letras_comunes = vocales intersect consonantes

    // --- Visualización de resultados ---
    println("🅰️ Vocales: $vocales")
    println("🅱️ Consonantes (primeras 10): ${consonantes.take(10)}...")
    println("--------------------------------------------------")

    if (letras_comunes.isEmpty()) {
        println("✨ letras_comunes: Conjunto vacío (∅)")
        println("Nota: Esto ocurre porque las vocales y las consonantes son conjuntos DISJUNTOS.")
    } else {
        println("🔍 letras_comunes: $letras_comunes")
    }
}