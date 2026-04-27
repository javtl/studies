/**
 * EJERCICIO: Asignación de Grupos A/B
 * Lógica:
 * - Grupo A: Mujeres (Nombre < M) OR Hombres (Nombre > N)
 * - Grupo B: Resto de casos.
 */

fun main() { // Recuerda usar main() para que sea ejecutable directamente

    // 1. Entrada de datos con limpieza (trim para evitar espacios accidentales)
    print("Introduce tu nombre: ")
    val nombre = readlnOrNull()?.trim()?.uppercase() ?: ""

    print("Introduce tu sexo (M = Mujer / H = Hombre): ")
    val sexo = readlnOrNull()?.trim()?.uppercase() ?: ""

    // 2. Validación de seguridad (Early Return)
    // Si los datos están vacíos, avisamos al usuario antes de calcular
    if (nombre.isEmpty() || (sexo != "M" && sexo != "H")) {
        println("❌ ERROR: Datos de entrada no válidos. Asegúrate de usar M o H.")
        return // Finaliza la ejecución de la función
    }

    // 3. Lógica de Negocio (Clasificación)
    // Guardamos el resultado en una variable constante 'val'
    val grupo = if ((sexo == "M" && nombre < "M") || (sexo == "H" && nombre > "N")) {
        "A"
    } else {
        "B"
    }

    // 4. Output profesional
    println("\n--- RESULTADO DE ASIGNACIÓN ---")
    println("Identidad: $nombre ($sexo)")
    println("Asignación: GRUPO $grupo")
    println("-------------------------------")
}