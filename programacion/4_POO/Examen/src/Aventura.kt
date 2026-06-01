abstract class Aventura(
    val nombre: String,
    duracionInicial: Int,
    precioInicial: Double,
    plazasIniciales: Int
) {

    // 1. Restricción: Impedir valores menores de 10 minutos
    var duracionMinutos: Int = 10
        set(value) {
            field = if (value < 10) {
                println("⚠️ Duración inválida. Ajustada al mínimo de 10 minutos.")
                10
            } else {
                field = value
            }
        }

    // 2. Propiedad normal para el precio
    var precio: Double = precioInicial
        set(value) {
            if (value >= 0.0) field = value
        }

    // 3. Restricción: Máximo permitido de 20 plazas
    var plazasDisponibles: Int = 20
        set(value) {
            field = when {
                value > 20 -> {
                    println("⚠️ Superado el límite de plazas. Ajustado al máximo de 20.")
                    20
                }
                value < 0 -> 0
                else -> value
            }
        }

    // 4. Bloque de inicialización (Aviso por consola)
    init {
        // Asignamos usando los setters para que se ejecuten las validaciones
        this.duracionMinutos = duracionInicial
        this.plazasDisponibles = plazasIniciales
        println("📢 ¡Aviso! La actividad '$nombre' ha sido registrada correctamente en Sierra Nevada.")
    }

    // 5. Método abstracto
    abstract fun descripcionDetallada(): String

    override fun toString(): String {
        return "Actividad: $nombre | Duración: ${duracionMinutos}min | Precio: ${precio}€ | Plazas: $plazasDisponibles"
    }
}