class Cuadrado(var lado: Int) : Rectangulo(base=lado,altura=lado){

    override fun toString(): String{
        var resultado="Soy un cuadrado de lado: $lado"
        return resultado
    }
}