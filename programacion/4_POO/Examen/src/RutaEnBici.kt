class RutaEnBicicleta(
    nombre: String,
    duracionMinutos: Int,
    precio: Double,
    plazasIniciales: Int,
    tipoBiciInicial: String, // "Montaña", "Electrica", "Enduro"
    val tramos: List<String> = listOf("Ascenso al Veleta", "Hoya de la Mora", "Laguna de las Yeguas")
) : Aventura(nombre, duracionMinutos, precio, plazasIniciales), Reservable {

    override var plazasReservadasTotales: Int = 0

    // Validación para el tipo de bicicleta
    var tipoBicicleta: String = "Montaña"
        set(value) {
            field = if (value in listOf("Montaña", "Electrica", "Enduro")) value else "Montaña"
        }

    init {
        this.tipoBicicleta = tipoBiciInicial
    }

    override fun descripcionDetallada(): String {
        return "Ruta en Bicicleta tipo '$tipoBicicleta'. Recorreremos los tramos: ${tramos.joinToString(" -> ")}."
    }

    override fun toString(): String {
        return super.toString() + " | Tipo: Bici ($tipoBicicleta) | Tramos: ${tramos.size}"
    }
}