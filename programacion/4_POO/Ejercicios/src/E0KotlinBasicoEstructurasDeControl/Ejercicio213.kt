/*Escribir un programa que pida al usuario dos números y muestre por pantalla su
división. Si el divisor es cero el programa debe mostrar un error*/


fun main{

    print("Introduce el dividendo: ")
    val a = readLine()?.toIntOrNull() ?: 0

    print("Introduce el divisor: ")
    val b = readLine()?.toIntOrNull() ?: 0

    if (a == null || b == nul){
        println("ERROR introduce valores validos.")
    }else{
        try{
            val resultado : Float = divide(a/)
        }
    }
}
fun divide(a: Float, b Float): Float {

    if(b == 0.0f){
        throw illegalArgumentException("No se puede dividir entre cero")
    }else{
        return (a/b)
    }
}