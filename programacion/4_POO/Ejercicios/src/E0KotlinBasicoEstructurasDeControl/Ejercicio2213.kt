/*Escribir un programa que muestre el
eco de todo lo que el usuario introduzca hasta que
el usuario escriba “salir” que terminará.*/

fun main() {
    var entrada = ""

    println("[escribe 'salir' para terminar]:")

    while (entrada != "salir") {
        print("> ")
        entrada = readln()

        if (entrada != "salir") {
            println("Eco: $entrada")
        }
    }

    println("Programa finalizado.")
}