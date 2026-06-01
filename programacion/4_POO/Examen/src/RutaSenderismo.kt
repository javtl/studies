class RutaSenderismo(
    nombre: String,
    duracionMinutos: Int,
    precio: Double,
    plazasIniciales: Int,
    // Lista de puntos de interés específica para esta ruta
    val puntosDeInteres: List<String> = listOf("Mirador de Trevélez", "Río Monachil", "Vereda de la Estrella")
) : Aventura(nombre, duracionMinutos, precio, plazasIniciales), Reservable {

    // Implementación de las propiedades obligatorias de la interfaz Reservable
    override var plazasReservadasTotales: Int = 0

    // Redefinimos el método abstracto de Aventura
    override fun descripcionDetallada(): String {
        return "Ruta de Senderismo '$nombre'. Pasaremos por los siguientes puntos clave: ${puntosDeInteres.joinToString(", ")}."
    }

    override fun toString(): String {
        return super.toString() + " | Tipo: Senderismo | Puntos: ${puntosDeInteres.size}"
    }
}