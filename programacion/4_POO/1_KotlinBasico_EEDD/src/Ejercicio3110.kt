/*Escribir un programa que almacene en una lista los siguientes precios:
50, 75, 46,
22, 80, 65, 8
y muestre por pantalla el menor y el mayor de los precios*/

fun main() {

    val precios = listOf(50, 75, 46, 22, 80, 65, 8)


    val precioMenor = precios.minOrNull()
    val precioMayor = precios.maxOrNull()

    
    println("El precio menor es: $precioMenor")
    println("El precio mayor es: $precioMayor")
}
