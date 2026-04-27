/**
 * EJERCICIO: Efecto Eco con condición de salida.
 * Conceptos: Bucle while vs do-while, Cláusula de escape (break).
 */

fun main() {
    println("--- MODO ECO ACTIVADO ---")
    println("(Escribe 'salir' para cerrar el programa)\n")

    // Usamos while(true) para un bucle infinito controlado internamente
    while (true) {
        print("Entrada: ")

        // Leemos y limpiamos espacios en blanco con .trim()
        val entrada = readlnOrNull()?.trim() ?: ""

        // 1. Condición de Salida (Case Insensitive para ser más robustos)
        if (entrada.lowercase() == "salir") {
            break // Rompe el bucle inmediatamente
        }

        // 2. Lógica del Eco
        if (entrada.isNotEmpty()) {
            println("📢 Eco: $entrada")
        } else {
            println("⚠️ (Has introducido una cadena vacía)")
        }
    }

    println("\n👋 Programa finalizado. ¡Hasta pronto!")
}