/*Escribir un programa que almacene las asignaturas de un curso (por ejemplo
Matemáticas, Física, Química, Historia y Lengua) en una lista, pregunte al usuario la
nota que ha sacado en cada asignatura y elimine de la lista las asignaturas aprobadas. Al
final el programa debe mostrar por pantalla las asignaturas que el usuario tiene que
repetir. Usa subprogramas cuando consideres de forma justificada. Intenta controlar los
posibles errores.*/

fun main() {
    // 1. Definimos la lista de asignaturas (corregido según el esquema del profesor)
    val asignaturas = listOf("Matemáticas", "Física", "Química", "Historia", "Lengua")

    // 2. Pedimos las notas (devuelve una lista de Double)
    val notas = pedirNotas(asignaturas)

    // 3. Filtramos las que están suspensas comparando ambas listas
    val suspensas = filtroSuspensas(asignaturas, notas)

    // 4. Mostramos resultados
    println("\n--- Resumen de notas ---")
    println(notas)
    println("Asignaturas suspensas: $suspensas")
}

/**
 * Recorre la lista de asignaturas y pide una nota para cada una.
 */
fun pedirNotas(asignaturas: List<String>): List<Double> {
    val listaNotas = mutableListOf<Double>()

    for (asignatura in asignaturas) {
        var notaValida = -1.0
        while (notaValida !in 0.0..10.0) {
            print("¿Qué nota sacaste en $asignatura? ")
            val entrada = readLine()?.replace(",", ".")

            try {
                val nota = entrada?.toDouble() ?: -1.0
                if (nota in 0.0..10.0) {
                    notaValida = nota
                } else {
                    println("Error: La nota debe estar entre 0 y 10.")
                }
            } catch (e: NumberFormatException) {
                println("Error: Introduce un número válido (ej: 6.5).")
            }
        }
        listaNotas.add(notaValida)
    }
    return listaNotas
}

/**
 * Compara las asignaturas con sus notas y devuelve solo las que tienen menos de 5.0.
 */
fun filtroSuspensas(asignaturas: List<String>, notas: List<Double>): List<String> {
    val suspensas = mutableListOf<String>()

    // Usamos indices para relacionar la posición de la asignatura con la posición de la nota
    for (i in asignaturas.indices) {
        if (notas[i] < 5.0) {
            suspensas.add(asignaturas[i])
        }
    }
    return suspensas
}