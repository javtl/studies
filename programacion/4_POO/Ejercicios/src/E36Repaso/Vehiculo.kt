package E36Repaso

abstract class Vehiculo(
    var id: Int,
    var modelo: String,
    var bateria: Int
) : Comparable<Vehiculo> {


    fun setBateria(valor: Int) {
        bateria = valor
    }


    override fun compareTo(v: Vehiculo): Int {
        return this.bateria - v.bateria
    }

    abstract fun calcularAutonomia(): Int
}