/**
 * EJERCICIO: Tabla de multiplicar con validación de rango.
 * Conceptos: Rangos (in), Interpolación de Strings y Formateo de salida.
 */

fun main() {
    print("Introduce un número entero (1-100): ")

    // 1. Captura y conversión segura
    val numero = readlnOrNull()?.toIntOrNull()

    // 2. Validación de Rango (Cláusula de Guarda)
    // Usamos el operador 'in' para verificar si el número está en el rango
    if (numero == null || numero !in 1..100) {
        println("❌ Error: Debes introducir un número entero entre 1 y 100.")
        return
    }

    println("\n--- TABLA DEL $numero ---")

    // 3. Bucle de cálculo
    for (i in 1..10) {
        val resultado = numero * i

        // 4. Formateo avanzado (Opcional para nota 10)
        // %2d asegura que el número ocupe 2 espacios, alineando las columnas
        val linea = String.format("%d x %2d = %3d", numero, i, resultado)
        println(linea)
    }

    println("-----------------------")
}