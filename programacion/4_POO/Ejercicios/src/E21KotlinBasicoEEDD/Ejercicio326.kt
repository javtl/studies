/*Escribir un programa que cree un diccionario vacío y lo vaya llenado con información
sobre una persona (por ejemplo, nombre, edad, sexo, teléfono, correo electrónico, etc.)
que se le pida al usuario. Cada vez que se añada un nuevo dato debe imprimirse el
contenido del diccionario.*/

package E21KotlinBasicoEEDD

/**
 * EJERCICIO: Diccionario dinámico (MutableMap).
 * Conceptos: mutableMapOf, lectura de claves/valores y actualización en tiempo real.
 */

fun main() {
    // 1. Creamos un mapa mutable vacío.
    // Indicamos que las claves son String y los valores pueden ser cualquier cosa (Any).
    val perfilPersona = mutableMapOf<String, String>()

    println("--- 📝 CONSTRUCTOR DE PERFIL PERSONAL ---")
    println("(Escribe 'salir' en el nombre del dato para finalizar)\n")

    while (true) {
        // 2. Pedimos el nombre del campo (la Clave)
        print("¿Qué dato quieres añadir? (ej: Nombre, Edad, Email): ")
        val clave = readlnOrNull()?.trim()?.lowercase()?.replaceFirstChar { it.uppercase() } ?: ""

        if (clave.lowercase() == "salir") break
        if (clave.isEmpty()) continue

        // 3. Pedimos el valor del campo
        print("Introduce el valor para '$clave': ")
        val valor = readlnOrNull()?.trim() ?: ""

        // 4. Actualizamos el diccionario
        // Si la clave ya existe, se sobrescribe; si no, se crea.
        perfilPersona[clave] = valor

        // 5. Mostramos el estado actual del diccionario (Estado del Objeto)
        println("\n✅ Dato guardado correctamente.")
        println("Estado actual del perfil:")

        println("{")
        for ((k, v) in perfilPersona) {
            println("  \"$k\": \"$v\"")
        }
        println("}")
        println("-".repeat(30))
    }

    println("\n🏁 Registro finalizado. Perfil completo generado.")
}