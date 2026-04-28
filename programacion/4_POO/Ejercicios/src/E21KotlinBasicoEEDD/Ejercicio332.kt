/*Solicitar al usuario que introduzca los nombres de pila de los alumnos de primaria de
una escuela, finalizando cuando se introduzca “x”. A continuación, solicitar que
introduzca los nombres de los alumnos de secundaria, finalizando al introducir “x”.
 Mostrar los nombres de todos los alumnos de primaria y los de secundaria, sin
repeticiones.
 Mostrar qué nombres se repiten entre los alumnos de primaria y secundaria.
 Mostrar qué nombres de primaria no se repiten en los de nivel secundaria.
 Mostrar si todos los nombres de primaria están incluidos en secundaria*/

package E21KotlinBasicoEEDD


/**
 * EJERCICIO: Comparativa de nombres Primaria vs Secundaria.
 * Conceptos: Sets, Operaciones de Conjuntos (Union, Intersect, Subtract).
 */

fun main() {
    // 1. Recolección de datos
    println("--- 🎒 REGISTRO DE PRIMARIA ---")
    val primaria = pedirNombres()

    println("\n--- 🎓 REGISTRO DE SECUNDARIA ---")
    val secundaria = pedirNombres()

    // 2. Lógica de Conjuntos

    // Nombres de todos (Unión)
    val todosLosNombres = primaria union secundaria

    // Nombres que se repiten en ambos (Intersección)
    val nombresComunes = primaria intersect secundaria

    // Nombres de primaria que no están en secundaria (Diferencia)
    val soloPrimaria = primaria subtract secundaria

    // Comprobar si secundaria contiene todos los de primaria (Subconjunto)
    val primariaIncluidaEnSecundaria = secundaria.containsAll(primaria)

    // 3. Visualización de Resultados
    println("\n" + "=".repeat(40))
    println("📊 INFORME DE COINCIDENCIAS")
    println("=".repeat(40))

    println("\n✨ Todos los nombres (sin repeticiones):")
    println(todosLosNombres.joinToString(", "))

    println("\n🔄 Nombres que aparecen en ambos niveles:")
    if (nombresComunes.isEmpty()) println("Ninguno.") else println(nombresComunes.joinToString(", "))

    println("\n🚫 Nombres de primaria que NO están en secundaria:")
    if (soloPrimaria.isEmpty()) println("Todos los de primaria están en secundaria.") else println(soloPrimaria.joinToString(", "))

    println("\n🤔 ¿Todos los nombres de primaria existen en secundaria?")
    println(if (primariaIncluidaEnSecundaria) "SÍ, primaria es un subconjunto de secundaria." else "NO, hay nombres únicos en primaria.")
}

/**
 * Función auxiliar para leer nombres hasta introducir 'x'
 */
fun pedirNombres(): Set<String> {
    val nombres = mutableSetOf<String>()
    while (true) {
        print("Introduce nombre (o 'x' para terminar): ")
        val entrada = readlnOrNull()?.trim()?.lowercase()?.replaceFirstChar { it.uppercase() } ?: ""

        if (entrada == "X") break
        if (entrada.isNotEmpty()) {
            nombres.add(entrada)
        }
    }
    return nombres
}