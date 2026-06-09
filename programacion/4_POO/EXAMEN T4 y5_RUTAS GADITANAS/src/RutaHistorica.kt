class RutaHistorica(
    nombre: String,          // Heredado (Sin val/var)
    duracionMinutos: Int,    // Heredado (Sin val/var)
    precio: Double,          // Heredado (Sin val/var)
    plazasIniciales: Int,    // Heredado (Sin val/var)
    // Atributo propio y específico de la ruta histórica
    val lugares: List<String> = listOf("La Caleta", "Catedral", "Teatro Romano", "Barrio del Pópulo")
) : ActividadTuristica(nombre, duracionMinutos, precio, plazasIniciales) {

    // RA7.d: Sobrescribimos el método obligatorio de la madre
    override fun descripcionDetallada(): String {
        return "Un viaje en el tiempo por Cádiz: '$nombre'. Visitaremos los puntos más emblemáticos: ${lugares.joinToString(", ")}."
    }

    override fun toString(): String {
        return super.toString() + " | Tipo: Histórica [Lugares: ${lugares.size}]"
    }
}