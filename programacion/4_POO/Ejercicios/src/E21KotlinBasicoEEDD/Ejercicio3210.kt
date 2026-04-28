/*Escribir un programa que permita gestionar la base de datos de clientes de una empresa.
Los clientes se guardarán en un diccionario en el que la clave de cada cliente será su
NIF, y el valor será otro diccionario con los datos del cliente (nombre, dirección,
teléfono, correo, preferente), donde preferente tendrá el valor True si se trata de un
cliente preferente. El programa debe preguntar al usuario por una opción del siguiente
menú: (1) Añadir cliente, (2) Eliminar cliente, (3) Mostrar cliente, (4) Listar todos los
clientes, (5) Listar clientes preferentes, (6) Terminar. En función de la opción elegida el
programa tendrá que hacer lo siguiente:
1. Preguntar los datos del cliente, crear un diccionario con los datos y añadirlo a la
base de datos.
2. Preguntar por el NIF del cliente y eliminar sus datos de la base de datos.
3. Preguntar por el NIF del cliente y mostrar sus datos.
4. Mostrar lista de todos los clientes de la base datos con su NIF y nombre.
5. Mostrar la lista de clientes preferentes de la base de datos con su NIF y nombre.
6. Terminar el programa.*/

package E21KotlinBasicoEEDD

/**
 * EJERCICIO: CRUD de Clientes con Diccionarios Anidados.
 * Conceptos: MutableMap de MutableMap, Filtrado de colecciones y Menú de control.
 */

fun main() {
    // Base de datos: La clave es el NIF (String), el valor es un Mapa con los datos
    val baseDatosClientes = mutableMapOf<String, MutableMap<String, Any>>()

    var opcion: Int?
    do {
        println("\n--- 🏦 GESTIÓN DE CLIENTES ---")
        println("1. Añadir cliente")
        println("2. Eliminar cliente")
        println("3. Mostrar cliente")
        println("4. Listar todos los clientes")
        println("5. Listar clientes preferentes")
        println("6. Terminar")
        print("Seleccione una opción: ")

        opcion = readlnOrNull()?.toIntOrNull()

        when (opcion) {
            1 -> añadirCliente(baseDatosClientes)
            2 -> eliminarCliente(baseDatosClientes)
            3 -> mostrarCliente(baseDatosClientes)
            4 -> listarClientes(baseDatosClientes, soloPreferentes = false)
            5 -> listarClientes(baseDatosClientes, soloPreferentes = true)
            6 -> println("Finalizando programa... Guardando cambios (simulado).")
            else -> println("❌ Opción no válida.")
        }
    } while (opcion != 6)
}

/**
 * (1) Solicita datos y crea el mapa anidado
 */
fun añadirCliente(db: MutableMap<String, MutableMap<String, Any>>) {
    print("Introduce NIF: ")
    val nif = readlnOrNull()?.trim()?.uppercase() ?: ""

    val datos = mutableMapOf<String, Any>()
    print("Nombre: ")
    datos["nombre"] = readlnOrNull() ?: ""
    print("Dirección: ")
    datos["direccion"] = readlnOrNull() ?: ""
    print("Teléfono: ")
    datos["telefono"] = readlnOrNull() ?: ""
    print("Correo: ")
    datos["correo"] = readlnOrNull() ?: ""
    print("¿Es preferente? (S/N): ")
    datos["preferente"] = readlnOrNull()?.trim()?.uppercase() == "S"

    db[nif] = datos
    println("✅ Cliente $nif añadido correctamente.")
}

/**
 * (2) Elimina por NIF
 */
fun eliminarCliente(db: MutableMap<String, MutableMap<String, Any>>) {
    print("Introduce NIF del cliente a eliminar: ")
    val nif = readlnOrNull()?.trim()?.uppercase() ?: ""
    if (db.remove(nif) != null) {
        println("🗑️ Cliente eliminado.")
    } else {
        println("⚠️ No se encontró ningún cliente con ese NIF.")
    }
}

/**
 * (3) Muestra un cliente específico
 */
fun mostrarCliente(db: Map<String, Map<String, Any>>) {
    print("Introduce NIF: ")
    val nif = readlnOrNull()?.trim()?.uppercase() ?: ""
    val c = db[nif]
    if (c != null) {
        println("\n--- DATOS DEL CLIENTE ---")
        for ((clave, valor) in c) {
            println("${clave.replaceFirstChar { it.uppercase() }}: $valor")
        }
    } else {
        println("⚠️ Cliente no encontrado.")
    }
}

/**
 * (4 y 5) Listado general o filtrado
 */
fun listarClientes(db: Map<String, Map<String, Any>>, soloPreferentes: Boolean) {
    val titulo = if (soloPreferentes) "PREFERENTES" else "TODOS"
    println("\n--- LISTADO DE CLIENTES ($titulo) ---")

    var hayResultados = false
    for ((nif, datos) in db) {
        val esPreferente = datos["preferente"] as? Boolean ?: false

        if (!soloPreferentes || esPreferente) {
            println("NIF: $nif | Nombre: ${datos["nombre"]}")
            hayResultados = true
        }
    }
    if (!hayResultados) println("No hay clientes que mostrar.")
}