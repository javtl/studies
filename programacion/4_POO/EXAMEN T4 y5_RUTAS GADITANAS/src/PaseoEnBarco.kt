class PaseoEnBarco(
    nombre: String,
    duracionMinutos: Int,
    precio: Double,
    plazasIniciales: Int,
    // Atributo propio
    val tipoBarco: String // Ejemplo: "Catamarán", "Velero"
) : ActividadTuristica(nombre, duracionMinutos, precio, plazasIniciales) {

    override fun descripcionDetallada(): String {
        return "Navegación por la Bahía de Cádiz a bordo de un $tipoBarco. Cruzaremos el Puente Carranza (Sujeto a viento de Levante)."
    }

    override fun toString(): String {
        return super.toString() + " | Tipo: Barco ($tipoBarco)"
    }
}