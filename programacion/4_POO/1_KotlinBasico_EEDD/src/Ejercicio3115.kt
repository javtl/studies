import java.util.Random

fun main() {
    val random = Random()
    val numeros = ArrayList<Int>()

    while (numeros.size < 6) {
        val numAleatorio = random.nextInt(49) + 1

        if (numAleatorio !in numeros) {
            numeros.add(numAleatorio)
        }
    }

    numeros.sort()

    val reintegro = random.nextInt(10)

    println("--- TU COMBINACIÓN GANADORA ---")
    print("Números: ")
    for (i in 0 until numeros.size) {
        print(numeros[i])

        if (i < numeros.size - 1) {
            print(", ")
        }
    }

    println("\nReintegro: $reintegro")
    println("-------------------------------")
}