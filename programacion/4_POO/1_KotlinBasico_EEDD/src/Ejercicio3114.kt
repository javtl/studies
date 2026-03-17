/*Ejercicio 3.1.14 Realiza un programa que compruebe la letra del DNI*/

fun main(){
    val letrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE"

    print("Introduce el número de tu DNI (sin letra): ")
    val entrada = readlnOrNull()

    val numero = entrada?.toIntOrNull()

    if (numero != null && entrada.length == 8) {
        val indice = numero % 23

        val letraCorrecta = letrasDNI[indice]

        println("Para el número $numero, la letra correspondiente es: $letraCorrecta")
        println("DNI completo: $numero$letraCorrecta")
        } else {
            println("Error: Por favor, introduce un número de DNI válido (8 dígitos).")
        }


}