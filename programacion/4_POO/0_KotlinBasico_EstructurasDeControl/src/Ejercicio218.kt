/*
En una determinada empresa, sus empleados son evaluados al final de cada año. Los
puntos que pueden obtener en la evaluación comienzan en 0.0 y pueden ir aumentando,
traduciéndose en mejores beneficios. Los puntos que pueden conseguir los empleados
pueden ser 0.0, 0.4, 0.6 o más, pero no valores intermedios entre las cifras mencionadas.
A continuación, se muestra una tabla con los niveles correspondientes a cada
puntuación. La cantidad de dinero conseguida en cada nivel es de 2.400€ multiplicada
por la puntuación del nivel.
Nivel Puntuación
Inaceptable 0.0
Aceptable 0.4
Meritorio 0.6 o más
Escribir un programa que lea la puntuación del usuario e indique su nivel de
rendimiento, así como la cantidad de dinero que recibirá el usuario
*/

fun Ejercicio216(){

    fun main() {
        val bonificacionBase = 2400


        print("Introduce tu puntuación (0.0, 0.4, 0.6 o más): ")
        val puntuacionInput = readLine()?.toDoubleOrNull() ?: -1.0


        val nivel = when {
            puntuacionInput == 0.0 -> "Inaceptable"
            puntuacionInput == 0.4 -> "Aceptable"
            puntuacionInput >= 0.6 -> "Meritorio"
            else -> "" 
        }


        if (nivel.isNotEmpty()) {
            val dineroRecibido = bonificacionBase * puntuacionInput

            println("\n--- Resultados de la Evaluación ---")
            println("Nivel de rendimiento: $nivel")
            println("Puntuación obtenida: $puntuacionInput")
            println("Cantidad de dinero a recibir: ${"%.2f".format(dineroRecibido)}€")
        } else {
            println("\n[Error]: La puntuación introducida no es válida.")
            println("Recuerda que solo se permiten: 0.0, 0.4 o valores iguales/mayores a 0.6.")
        }
    }
}