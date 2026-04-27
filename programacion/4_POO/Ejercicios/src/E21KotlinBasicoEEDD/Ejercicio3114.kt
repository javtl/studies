/*Ejercicio 3.1.14 Realiza un programa que compruebe la letra del DNI*/

/**
 * EJERCICIO: Cálculo de letra de DNI (NIF).
 * Conceptos: Operador Módulo, Indexación de Strings y Validación de Longitud.
 */

fun main() {
    // 1. Definición del Diccionario de Control (Orden oficial del Ministerio)
    val ASIGNACION_LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE"

    print("Introduce el número de tu DNI (8 dígitos): ")
    val entrada = readlnOrNull()?.trim() ?: ""

    // 2. Validación de Requisitos de Negocio
    // Un DNI debe ser numérico y tener exactamente 8 caracteres (rellenando con ceros si es necesario)
    val numeroDni = entrada.toIntOrNull()

    if (numeroDni != null && entrada.length == 8) {

        // 3. El Algoritmo: El resto de dividir por 23 determina la posición
        val indice = numeroDni % 23
        val letraFinal = ASIGNACION_LETRAS[indice]

        println("\n--- VERIFICACIÓN DE IDENTIDAD ---")
        println("Número procesado: $numeroDni")
        println("Letra calculada:  $letraFinal")
        println("Resultado Final:  $numeroDni$letraFinal")
        println("---------------------------------")

    } else {
        println("\n❌ ERROR: Formato no válido.")
        println("Asegúrate de introducir exactamente 8 dígitos numéricos.")
    }
}