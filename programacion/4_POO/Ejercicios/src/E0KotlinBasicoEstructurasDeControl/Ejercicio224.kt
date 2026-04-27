/**
 * EJERCICIO: Cuenta atrás con formato de cadena.
 * Conceptos: Rangos inversos (downTo), JoinToString y Validación de entrada.
 */

fun main() {
    print("Introduce un número entero positivo: ")

    // 1. Captura con readlnOrNull (Estándar Kotlin 2.x)
    val numeroInicial = readlnOrNull()?.toIntOrNull()

    // 2. Validación mediante "Guard Clauses" (Cláusulas de guarda)
    // Es mejor validar los errores primero para dejar el camino libre a la lógica
    if (numeroInicial == null || numeroInicial < 0) {
        println("❌ Error: Debes introducir un número entero mayor o igual a cero.")
        return // Finaliza la ejecución si hay error
    }

    // 3. Generación de la secuencia (La hidrodinámica del rango)
    // 'downTo' crea un rango inverso.
    // 'joinToString' transforma la colección en un String elegante.
    val resultado = (numeroInicial downTo 0).joinToString(separator = ", ")

    // 4. Salida por pantalla
    println("\n🚀 Iniciando cuenta atrás:")
    println(resultado)
}