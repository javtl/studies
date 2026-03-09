// PROGRAMA QUE TE PIDE LA EDAD Y TE DICE SI PUEDES PASAR A LA DISCO

fun main(){

    val edad: Int? = 0

    print("Dime tu edad: ")
    edad= readLine()!!.toInt()
    println("Eres ${if (edad>= 18) "mayor" else "menor"} de edad)")
}