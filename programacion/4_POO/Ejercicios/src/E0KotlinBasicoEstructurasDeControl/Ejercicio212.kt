/**
 * EJERCICIO: Verificación de Contraseña
 * Nivel: 1º DAM - Programación
 * Conceptos clave: Variables, Entrada de datos, Null Safety y Comparación de Strings.
 */

fun main() {
    // 1. Definimos la "Single Source of Truth" (Contraseña maestra)
    // Usamos 'val' porque es una constante que no cambiará durante la ejecución
    val passwordMaestra = "alberti"

    // 2. Interacción con el usuario
    print("Introduce la contraseña para acceder: ")

    // 3. Captura y Normalización (El corazón del ejercicio)
    // readlnOrNull() es más moderno y seguro que readLine()
    // .lowercase() convierte la entrada a minúsculas para ignorar el Case Sensitive
    val entradaUsuario = readlnOrNull()?.lowercase()

    // 4. Lógica de Verificación (Clean Code)
    // Usamos una comparación directa. Al haber normalizado arriba,
    // comparamos "alberti" con lo que sea que haya escrito el usuario en minúsculas.
    if (entradaUsuario == passwordMaestra) {
        println("\n✅ ACCESO CONCEDIDO: La contraseña coincide.")
    } else {
        println("\n❌ ERROR: Contraseña incorrecta o vacía.")
    }
}