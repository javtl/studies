/**
 * EJERCICIO: Generar un triángulo rectángulo.
 * Conceptos: Bucles anidados vs .repeat(), validación de entrada.
 */

fun main() {
    print("Introduce la altura del triángulo (entero positivo): ")
    val altura = readlnOrNull()?.toIntOrNull()

    // 1. Validación de seguridad (Guard Clause)
    if (altura == null || altura <= 0) {
        println("❌ Error: Debes introducir un número entero mayor que cero.")
        return
    }

    println("\n--- RESULTADO ---")

    // ENFOQUE A: El tuyo (Moderno y Eficiente)
    // Usamos un solo bucle y multiplicamos el carácter.
    for (i in 1..altura) {
        println("*".repeat(i))
    }
}

/**
 * NOTA PARA EL EXAMEN:
 * Si el profesor te obliga a usar bucles anidados (sin .repeat()),
 * la lógica sería esta:
 */
fun enfoqueTradicional(altura: Int) {
    for (fila in 1..altura) {
        for (columna in 1..fila) {
            print("*")
        }
        println() // Salto de línea al terminar cada fila
    }
}