
/*Escribir un programa que pregunte al usuario su edad y muestre por pantalla todos los
años que ha cumplido (desde 1 hasta su edad). */
import kotlin.math.abs

fun Ejercicio222(){


    var edad: Int = 0
    var i: Int = 1

    print("Dime tu edad: ")
    edad = readln()?.toInt() ?:0

    try {
        edad = readln()?.toInt() ?:0
    } catch (e: NumberFormatException){
        print("Debe ser un numero entero: ${e.message}")
    }
   if(edad>0) {
       for (i in 1 <= ..< = edad) {
           print("Has cumplido: $i años")
       }
   }else{

       for(i in 1 <=..<= abs(n = edad){
           print("Has cumplido: $i años")
       }
   }


}