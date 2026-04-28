/*Escribir un programa que guarde en un diccionario los precios de las frutas de la tabla,
pregunte al usuario por una fruta, un número de kilos y muestre por pantalla el precio de
ese número de kilos de fruta. Si la fruta no está en el diccionario debe mostrar un
mensaje informando de ello.
Fruta Precio
Plátano 1.35
Manzana 0.80
Pera 0.85
Naranja 0.70

*/

package E21KotlinBasicoEEDD

/**
 * EJERCICIO: Diccionario de precios de frutas.
 * Conceptos: Mapas (Map), tipos de datos Double y gestión de claves inexistentes.
 */

fun main() {
    // 1. Definimos el diccionario (Map)
    // Las claves son String (nombre) y los valores Double (precio)
    val preciosFrutas = mapOf(
        "Plátano" to 1.35,
        "Manzana" to 0.80,
        "Pera"    to 0.85,
        "Naranja" to 0.70
    )

    println("--- 🛒 SISTEMA DE PESO Y PRECIO ---")
    print("¿Qué fruta busca? ")
    // Normalizamos la entrada: primera letra mayúscula, resto minúsculas
    val frutaElegida = readlnOrNull()?.trim()?.lowercase()?.replaceFirstChar { it.uppercase() } ?: ""

    // 2. Buscamos el precio en el diccionario
    // El operador preciosFrutas[fruta] devuelve un Double? (puede ser nulo)
    val precioUnitario = preciosFrutas[frutaElegida]

    if (precioUnitario != null) {
        // 3. Si la fruta existe, pedimos los kilos
        print("¿Cuántos kilos de $frutaElegida desea? ")
        val kilos = readlnOrNull()?.replace(",", ".")?.toDoubleOrNull() ?: 0.0

        if (kilos > 0) {
            val total = precioUnitario * kilos
            // Formateamos a 2 decimales para que parezca un ticket real
            println("\n----------------------------")
            println("Ticket: $frutaElegida")
            println("Precio/kg: ${"%.2f".format(precioUnitario)}€")
            println("Kilos: $kilos")
            println("TOTAL: ${"%.2f".format(total)}€")
            println("----------------------------")
        } else {
            println("⚠️ Cantidad de kilos no válida.")
        }
    } else {
        // 4. Si la fruta no está en el mapa
        println("❌ Lo sentimos, no disponemos de '$frutaElegida' en nuestra tienda.")
        println("Frutas disponibles: ${preciosFrutas.keys.joinToString(", ")}")
    }
}