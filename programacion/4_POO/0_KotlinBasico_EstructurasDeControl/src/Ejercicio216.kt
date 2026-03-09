/*
Los alumnos de un curso se han dividido en dos grupos A y B de acuerdo al sexo y el
nombre. El grupo A está formado por las mujeres con un nombre anterior a la M y los
hombres con un nombre posterior a la N y el grupo B por el resto. Escribir un programa
que pregunte al usuario su nombre y sexo, y muestre por pantalla el grupo que le
corresponde.
* */

fun Ejercicio216(){

    print("Introduce tu nombre: ")
    val nombre = readLine()?.trim()?.uppercase() ?: ""

    print("Introduce tu sexo (M para mujer, H para hombre): ")
    val sexo = readLine()?.trim()?.uppercase() ?: ""

        val grupo = if (
            (sexo == "M" && nombre < "M") ||
            (sexo == "H" && nombre > "N")
        ) {
            "A"
        } else {
            "B"
        }

        println("\nTu nombre es $nombre, tu sexo es $sexo y perteneces al: Grupo $grupo")
}
