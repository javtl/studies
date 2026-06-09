class RutaGastronomica(
    nombre: String,
    duracionMinutos: Int,
    precio: Double,
    plazasIniciales: Int,
    // Atributo propio
    val platos: List<String> = listOf("Tortillitas de camarones", "Pescaíto frito", "Chicharrones")
) : ActividadTuristica(nombre, duracionMinutos, precio, plazasIniciales) {

    override fun descripcionDetallada(): String {
        return "Tour de sabores gaditanos. Parada obligatoria en el Mercado Central para degustar: ${platos.joinToString(" y ")}."
    }

    override fun toString(): String {
        return super.toString() + " | Tipo: Gastronómica [Platos: ${platos.size}]"
    }
}