class Rectangulo(var base: Int, var altura: Int) : Poligono(){
    override fun perimetro(): Int {
        return(2*base*altura)
    }

    overide fun area(): Int {
        return(base*altura)
    }
}