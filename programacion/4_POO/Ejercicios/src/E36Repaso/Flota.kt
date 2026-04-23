package E36Repaso

class Flota {

    private val vehiculos = mutableListOf<Vehiculo>()

    fun agregar(v: Vehiculo) {
        vehiculos.add(v)
    }

    fun eliminarPorId(id: Int) {
        // removeIf es perfecto y muy limpio
        vehiculos.removeIf { it.id == id }
    }

    // Retorna una lista nueva ordenada sin modificar la original
    fun listaOrdenadosPorBateria(): List<Vehiculo> {
        return vehiculos.sorted()
    }

    fun autonomiaMedia(): Double {
        // Usamos el operador elvis (?:) para devolver 0.0 si la lista está vacía
        return vehiculos.map { it.calcularAutonomia() }.average().takeIf { !it.isNaN() } ?: 0.0
    }

    // Función extra útil: ver todos los vehículos
    fun mostrarFlota() = vehiculos.forEach { println(it) }
}