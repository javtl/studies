package E0KotlinBasicoEstructurasDeControl

/**
 * EJERCICIO: Menú interactivo persistente.
 * Conceptos: Bucle do-while, Estructura when, Control de flujo y UX.
 */

fun main() {
    // Usamos una variable para controlar la salida del bucle
    var opcionSeleccionada: Int?

    do {
        // 1. Interfaz de Usuario (UI)
        println("\n--- 🛠️ PANEL DE CONTROL ---")
        println("1. Comenzar programa")
        println("2. Imprimir listado")
        println("3. Finalizar programa")
        print("Seleccione una opción (1-3): ")

        // 2. Lectura y validación de entrada
        opcionSeleccionada = readlnOrNull()?.toIntOrNull()

        // 3. Dispatcher (Distribuidor de lógica)
        when (opcionSeleccionada) {
            1 -> {
                println("\n🚀 Ejecutando: El motor del programa se ha iniciado.")
            }
            2 -> {
                println("\n📋 Listado: Generando reporte de datos en consola...")
            }
            3 -> {
                println("\n👋 Saliendo... Gracias por usar el sistema.")
            }
            else -> {
                // Captura cualquier número que no sea 1, 2 o 3, y también el 'null'
                println("\n❌ ERROR: Opción no válida. Intente de nuevo.")
            }
        }

    } while (opcionSeleccionada != 3) // El bucle se repite siempre que no sea 3
}