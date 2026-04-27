/*Tienes este código:
palabra = 'banana'
contador = 0
for letra in palabra:
if letra == 'a':
contador = contador + 1
print(contador)
Encapsúlalo en una función llamada cuenta, y hazla genérica de tal modo que pueda
aceptar una cadena y una letra como argumentos. De tal forma que pueda hacer la
siguiente llamada:
numero_de_os = cuenta("consuelo","o") # Resultado debe ser 2*/

/**
 * EJERCICIO: Encapsulamiento y Parametrización.
 * Conceptos: Ámbito de función (Scope), Argumentos y Retorno.
 */

/**
 * Cuenta cuántas veces aparece un [caracterObjetivo] dentro de una [cadena].
 * * @param cadena El texto donde buscaremos.
 * @param caracterObjetivo La letra que queremos contar (Tipo Char).
 * @return El número total de ocurrencias (Tipo Int).
 */
fun cuenta(cadena: String, caracterObjetivo: Char): Int {
    var contador = 0

    // Recorremos la cadena letra por letra
    for (letra in cadena) {
        if (letra == caracterObjetivo) {
            contador++ // Usamos el operador de incremento profesional
        }
    }

    return contador
}

fun main() {
    // Caso de prueba 1: "consuelo" con la letra 'o'
    val numeroDeOs = cuenta("consuelo", 'o')
    println("En 'consuelo' hay $numeroDeOs letras 'o'")

    // Caso de prueba 2: "banana" con la letra 'a'
    val numeroDeAs = cuenta("banana", 'a')
    println("En 'banana' hay $numeroDeAs letras 'a'")
}