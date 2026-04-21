class Cuadrado(var lado: Int) : Rectangulo(base=lado,altura=lado){

    override fun toString(): String{
        val resultado ="Soy un cuadrado de lado: $lado"
        return resultado
    }
}