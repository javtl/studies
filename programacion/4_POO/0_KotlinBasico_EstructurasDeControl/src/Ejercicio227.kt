/*Escribir un programa que pregunte al usuario un entero del 1 al 100 y a continuación
muestre por pantalla la tabla de multiplicar de ese número
*/

fun main() {

    print("Introduce un número entero (1-100): ")

    val numero = readln().toIntOrNull()

    if (numero != null && numero in 1..100) {
        println("\nTabla de multiplicar del $numero:")

        for (i in 1..10) {
            val resultado = numero * i

            println("$numero x $i = $resultado")
        }
    } else {
        println("Error: Por favor, introduce un número válido entre 1 y 100.")
    }
}