// Escribir un programa que pida al usuario una palabra y muestre por pantalla si es un
//palíndromo.



fun main() {
    print("Dime una palabra: ")
    
    val palabra = readLine()?.lowercase()?.trim() ?: ""

    if (palabra.isEmpty()) {
        println("No escribiste nada.")
        return
    }


    if (palabra == palabra.reversed()) {
        println("¡Es un palíndromo!")
    } else {
        println("No es un palíndromo.")
    }
}
