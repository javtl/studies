/*
Escribir un programa que pida al usuario un número entero y muestre por pantalla un
triángulo rectángulo como el de más abajo, de altura el número introducido.
*
**
***
****    */

fun main() {

    print("Introduce la altura del triángulo (entero): ")
    val altura = readLine()?.toIntOrNull()

    if (altura != null && altura > 0) {

        for (i in 1..altura) {

            println("*".repeat(i))
        }
    } else {
        println("Por favor, introduce un número entero positivo válido.")
    }
}