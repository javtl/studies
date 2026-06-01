class Escalada(
    nombre: String,
    duracionMinutos: Int,
    precio: Double,
    plazasIniciales: Int,
    nivelInicial: String, // "Básico", "Medio", "Avanzado"
    zonaInicial: String   // "Los Cahorros", "Peñones de San Francisco"
) : Aventura(nombre, duracionMinutos, precio, plazasIniciales), Reservable {

    override var plazasReservadasTotales: Int = 0

    // Validación para el nivel de dificultad
    var nivelDificultad: String = "Básico"
        set(value) {
            field = if (value in listOf("Básico", "Medio", "Avanzado")) value else "Básico"
        }

    // Validación para la zona de escalada
    var zonaEscalada: String = "Los Cahorros"
        set(value) {
            field = if (value in listOf("Los Cahorros", "Peñones de San Francisco")) value else "Los Cahorros"
        }

    init {
        // Pasamos los valores por los setters para validar
        this.nivelDificultad = nivelInicial
        this.zonaEscalada = zonaInicial
    }

    override fun descripcionDetallada(): String {
        return "Aventura de Escalada en la zona de '$zonaEscalada' con un nivel de dificultad '$nivelDificultad'."
    }

    override fun toString(): String {
        return super.toString() + " | Tipo: Escalada | Zona: $zonaEscalada | Nivel: $nivelDificultad"
    }
}