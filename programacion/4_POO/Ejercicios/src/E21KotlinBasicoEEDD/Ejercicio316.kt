/*Escribir un programa que almacene las asignaturas de un curso (por ejemplo

Matemáticas, Física, Química, Historia y Lengua) en una lista, pregunte al usuario la

nota que ha sacado en cada asignatura y elimine de la lista las asignaturas aprobadas. Al

final el programa debe mostrar por pantalla las asignaturas que el usuario tiene que

repetir. Usa subprogramas cuando consideres de forma justificada. Intenta controlar los

posibles errores.*/

/**
 * EJERCICIO: Filtrado de asignaturas aprobadas.
 * Conceptos: Listas mutables, mapeo de datos, control de errores y filtrado funcional.
 */

fun main() {
    // 1. Inicializamos la lista de asignaturas como MutableList para poder "eliminar"
    val asignaturas = mutableListOf("Matemáticas", "Física", "Química", "Historia", "Lengua")

    // 2. Obtenemos las notas mediante el subprograma
    val notas = pedirNotas(asignaturas)

    // 3. Justificación del Subprograma de Filtrado:
    // Separamos el filtrado para mantener el main limpio y permitir
    // que la lógica de "qué es un aprobado" sea fácil de cambiar (ej. pasar de 5.0 a 6.0).
    eliminarAprobadas(asignaturas, notas)

    // 4. Output final
    println("\n--- RESULTADO DEL TRIMESTRE ---")
    if (asignaturas.isEmpty()) {
        println("¡Felicidades! Has aprobado todo. No tienes que repetir nada.")
    } else {
        println("Debes esforzarte más. Tienes que repetir: ${asignaturas.joinToString(", ")}")
    }
}

/**
 * Solicita notas al usuario asegurando que estén en el rango 0-10.
 */
fun pedirNotas(lista: List<String>): List<Double> {
    val notasRecogidas = mutableListOf<Double>()

    for (materia in lista) {
        var nota: Double? = null
        while (nota == null || nota !in 0.0..10.0) {
            print("Introduce nota para $materia (0-10): ")
            // Usamos .replace para que acepte tanto puntos como comas decimales
            val entrada = readlnOrNull()?.replace(",", ".")
            nota = entrada?.toDoubleOrNull()

            if (nota == null || nota !in 0.0..10.0) {
                println("⚠️ Entrada no válida. Introduce un número entre 0.0 y 10.0")
            }
        }
        notasRecogidas.add(nota)
    }
    return notasRecogidas
}

/**
 * Modifica la lista original eliminando los elementos cuya nota sea >= 5.0.
 * Se recorre de atrás hacia adelante para evitar errores de índice al eliminar.
 */
fun eliminarAprobadas(asignaturas: MutableList<String>, notas: List<Double>) {
    // Recorremos los índices en orden inverso (downTo)
    // Si borras el índice 0, el que era 1 pasa a ser 0, y el bucle se saltaría elementos.
    // Al ir de atrás hacia adelante, los cambios de índice no afectan a las posiciones pendientes.
    for (i in asignaturas.indices.reversed()) {
        if (notas[i] >= 5.0) {
            asignaturas.removeAt(i)
        }
    }
}