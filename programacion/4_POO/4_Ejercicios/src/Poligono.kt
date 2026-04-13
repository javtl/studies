abstract class Poligono {
    init{
        contadorPoligono++
    }
    companion object{
        var contadorPoligono: Int = 0
    }

    abstract fun perimetro(): Int
    abstract fun area(): Int
}