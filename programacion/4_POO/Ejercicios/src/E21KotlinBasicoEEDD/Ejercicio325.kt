/*Escribir un programa que almacene el diccionario con los créditos de las asignaturas de
un curso {'Matemáticas': 6, 'Física': 4, 'Química': 5} y después muestre por
pantalla los créditos de cada asignatura en el formato <asignatura> tiene
<créditos> créditos, donde <asignatura> es cada una de las asignaturas del curso,
y <créditos> son sus créditos. Al final debe mostrar también el número total de
créditos del curso.*/

package E21KotlinBasicoEEDD

/**
 * EJERCICIO: Diccionario de créditos y sumatorio total.
 * Conceptos: Mapas (Map), Iteración con desestructuración y Acumuladores.
 */

fun main() {
    // 1. Definimos el diccionario de asignaturas y sus créditos
    val creditosAsignaturas = mapOf(
        "Matemáticas" to 6,
        "Física"      to 4,
        "Química"     to 5
    )

    // 2. Variable acumuladora para el total
    var totalCreditos = 0

    println("--- DETALLE DE CRÉDITOS DEL CURSO ---")

    // 3. Iteración profesional: extraemos (asignatura, puntos) de cada entrada del mapa
    for ((asignatura, puntos) in creditosAsignaturas) {
        println("$asignatura tiene $puntos créditos")

        // Sumamos los créditos al total
        totalCreditos += puntos
    }

    // 4. Resultado final
    println("-------------------------------------")
    println("TOTAL DE CRÉDITOS DEL CURSO: $totalCreditos")
    println("-------------------------------------")
}