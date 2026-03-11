/*Escribir un programa que almacene las asignaturas de un curso (por ejemplo
Matemáticas, Física, Química, Historia y Lengua) en una lista, pregunte al usuario la
nota que ha sacado en cada asignatura y elimine de la lista las asignaturas aprobadas. Al
final el programa debe mostrar por pantalla las asignaturas que el usuario tiene que
repetir. Usa subprogramas cuando consideres de forma justificada. Intenta controlar los
posibles errores.*/

fun main() {
    val asignaturas = mutableListOf("Matemáticas", "Física", "Química", "Historia", "Lengua")

    
    val asignaturasASuperar = filtrarRepetidas(asignaturas)

    println("\n--- Resultados ---")
    if (asignaturasASuperar.isEmpty()) {
        println("¡Felicidades! Has aprobado todo.")
    } else {
        println("Debes repetir las siguientes asignaturas:")
        asignaturasASuperar.forEach { println("- $it") }
    }
}


fun filtrarRepetidas(lista: List<String>): List<String> {
    val suspensas = mutableListOf<String>()

    for (asignatura in lista) {
        val nota = pedirNotaValida(asignatura)
        if (nota < 5.0) {
            suspensas.add(asignatura)
        }
    }
    return suspensas
}


fun pedirNotaValida(asignatura: String): Double {
    while (true) {
        print("¿Qué nota sacaste en $asignatura? ")
        val entrada = readLine()?.replace(",", ".") /

        try {
            val nota = entrada?.toDouble() ?: -1.0
            if (nota in 0.0..10.0) return nota
            else println("Por favor, introduce una nota entre 0 y 10.")
        } catch (e: NumberFormatException) {
            println("Entrada no válida. Introduce un número (ej: 7.5).")
        }
    }
}
