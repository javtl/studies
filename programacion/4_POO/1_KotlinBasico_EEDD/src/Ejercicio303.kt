/*Tienes este código:
palabra = 'banana'
contador = 0
for letra in palabra:
if letra == 'a':
contador = contador + 1
print(contador)
Encapsúlalo en una función llamada cuenta, y hazla genérica de tal modo que pueda
aceptar una cadena y una letra como argumentos. De tal forma que pueda hacer la
siguiente llamada:
numero_de_os = cuenta("consuelo","o") # Resultado debe ser 2*/

fun cuenta(palabra: String, letraBusqueda: Char): Int {
    var contador = 0
    for (letra in palabra) {
        if (letra == letraBusqueda) {
            contador = contador + 1
        }
    }
    return contador
}


fun main() {

    val numero_de_os = cuenta("consuelo", 'o')
    println(numero_de_os)


    println(cuenta("banana", 'a'))
}