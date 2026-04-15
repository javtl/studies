class Triangulo(var l1: Int, var l2: Int, var l3: Int) : Poligono(){
    println("Triangulo creado correctamente")
}

override fun perimettro(){
    return(l1+l2+l3)
}

override fun area(): Int{
    var semiperimetro: Double = 0.0
    var aHeron: Double = 0.0

    semiperimetro = ((l1+l2+l3)/2).toDouble()
    aHeron = Math.sqrt(semiperimetro*semiperimetro-l1)*(semiperimetro*semiperimetro-l2)*(semiperimetro*semiperimetro-l3)
    return aHeron.toInt()
}

override fun equals (other: Any?): Boolean{
    if(this === other)
        return true
    if (other == null)
        return false
    if (other !)

}

