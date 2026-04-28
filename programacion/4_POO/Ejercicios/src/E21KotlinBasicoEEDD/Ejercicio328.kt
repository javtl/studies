/*Escribir un programa que cree un diccionario de traducción español-inglés. El usuario
introducirá las palabras en español e inglés separadas por dos puntos, y cada par
<palabra>:<traducción> separados por comas. El programa debe crear un
diccionario con las palabras y sus traducciones. Después pedirá una frase en español y
utilizará el diccionario para traducirla palabra a palabra. Si una palabra no está en el
diccionario debe dejarla sin traducir.*/

package E21KotlinBasicoEEDD

/**
 * EJERCICIO: Diccionario de traducción y procesador de frases.
 * Conceptos: Parsing de Strings (split), Mapas y Reconstrucción de frases.
 */

fun main() {
    // 1. Fase de Entrada: Crear el diccionario
    println("--- 📖 CONFIGURACIÓN DEL TRADUCTOR ---")
    println("Introduce las palabras (formato: español:inglés) separadas por comas.")
    println("Ejemplo: rojo:red, azul:blue, casa:house")
    print("> ")

    val entradaDiccionario = readlnOrNull() ?: ""
    val diccionario = crearDiccionario(entradaDiccionario)

    // 2. Fase de Traducción
    println("\n--- 📝 PROCESADOR DE TEXTO ---")
    print("Introduce una frase en español: ")
    val fraseEspanol = readlnOrNull() ?: ""

    val fraseTraducida = traducirFrase(fraseEspanol, diccionario)

    println("\nResultado:")
    println("🇪🇸 $fraseEspanol")
    println("🇬🇧 $fraseTraducida")
}

/**
 * Convierte una cadena "esp:ing, esp:ing" en un Map<String, String>
 */
fun crearDiccionario(entrada: String): Map<String, String> {
    val mapa = mutableMapOf<String, String>()

    // Dividimos primero por comas para separar los pares
    val pares = entrada.split(",")

    for (par in pares) {
        // Dividimos cada par por los dos puntos
        val partes = par.trim().split(":")
        if (partes.size == 2) {
            val espanol = partes[0].trim().lowercase()
            val ingles = partes[1].trim().lowercase()
            mapa[espanol] = ingles
        }
    }
    return mapa
}

/**
 * Traduce palabra por palabra usando el diccionario
 */
fun traducirFrase(frase: String, diccionario: Map<String, String>): String {
    // Dividimos la frase por espacios
    val palabras = frase.split(" ")
    val resultado = mutableListOf<String>()

    for (p in palabras) {
        val limpia = p.lowercase().trim()
        // El operador ?: (elvis) devuelve el original si no hay traducción
        val traducida = diccionario[limpia] ?: p
        resultado.add(traducida)
    }

    // Unimos la lista de nuevo en una sola frase
    return resultado.joinToString(" ")
}