/**
 * EJERCICIO: Cálculo de Bonificaciones por Desempeño
 * Conceptos: Estructura 'when' como expresión, Formateo de moneda y constantes.
 */

fun main() {
    // 1. Constantes (Clean Code: No "hardcodear" valores mágicos en el código)
    val BONIFICACION_ANUAL = 2400.0
    val NIVEL_INACEPTABLE = 0.0
    val NIVEL_ACEPTABLE = 0.4
    val NIVEL_MERITORIO = 0.6

    // 2. Entrada de datos
    print("Introduce tu puntuación de evaluación (ej. 0.0, 0.4, 0.6...): ")
    val puntuacion = readlnOrNull()?.toDoubleOrNull() ?: -1.0

    // 3. Determinación de Nivel (Uso de 'when' como expresión)
    // Validamos que la puntuación sea una de las permitidas
    val nivel = when {
        puntuacion == NIVEL_INACEPTABLE -> "Inaceptable"
        puntuacion == NIVEL_ACEPTABLE -> "Aceptable"
        puntuacion >= NIVEL_MERITORIO -> "Meritorio"
        else -> null // Usamos null para indicar que el valor es inválido
    }

    // 4. Salida de resultados con validación
    if (nivel != null) {
        val dineroTotal = BONIFICACION_ANUAL * puntuacion

        println("\n--- REPORTE DE EVALUACIÓN ---")
        println("Nivel asignado: $nivel")
        // Formateamos a 2 decimales para que parezca dinero real (€)
        println("Dinero extra: ${"%.2f".format(dineroTotal)}€")
    } else {
        println("\n❌ ERROR: La puntuación $puntuacion no es válida.")
        println("Valores permitidos: 0.0, 0.4 o >= 0.6")
    }
}