/*Escribir un programa que pida al usuario un número entero positivo y muestre por
pantalla la cuenta atrás desde ese número hasta cero separados por comas.*/

fun main() {

    print("Introduce un número entero positivo: ")
    val input = readLine()?.toIntOrNull()


    if (input != null && input >= 0) {

        val cuentaAtras = (input downTo 0).joinToString(", ")

        println(cuentaAtras)
    } else {
        println("Error: Por favor, introduce un número entero válido y mayor o igual a cero.")
    }
}