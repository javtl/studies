/*Escribir un programa que almacene en una lista los siguientes precios:
50, 75, 46,
22, 80, 65, 8
y muestre por pantalla el menor y el mayor de los precios*/

/**
 * EJERCICIO: Búsqueda de valores extremos en una colección.
 * Conceptos: Listas, Iteración, y Funciones de agregación.
 */

fun main() {
    // 1. Definimos la fuente de datos (Inmutable)
    val precios = listOf(50, 75, 46, 22, 80, 65, 8)

    // ENFOQUE A: El Estándar Kotlin (Product Engineer)
    // Usamos 'OrNull' por seguridad, por si la lista estuviera vacía.
    val menorKotlin = precios.minOrNull()
    val mayorKotlin = precios.maxOrNull()

    // ENFOQUE B: Lógica Manual (Nivel Examen/Algoritmia)
    // Inicializamos con el primer elemento de la lista.
    var maxManual = precios[0]
    var minManual = precios[0]

    for (precio in precios) {
        if (precio > maxManual) {
            maxManual = precio
        }
        if (precio < minManual) {
            minManual = precio
        }
    }

    // 3. Output Formateado
    println("--- ANÁLISIS DE PRECIOS ---")
    println("Lista analizada: $precios")
    println("---------------------------")
    println("💰 Precio Máximo: $maxManual")
    println("📉 Precio Mínimo: $minManual")
}