abstract class ActividadTuristica(
    val nombre: String,
    duracionInicial: Int,
    var precio: Double, // var porque el precio puede fluctuar en la temporada
    plazasIniciales: Int
) : Reservable { // Implementa la interfaz aquí para dar lógica común

    // RA4.f: Control de visibilidad de las variables internas
    protected var plazasReservadas: Int = 0

    // Impedir valores menores de 10
    var duracionMinutos: Int = 10
        set(value) {
            field = if (value < 10) 10 else value
        }

    // Máximo permitido de 25 plazas
    var plazasDisponibles: Int = 25
        set(value) {
            field = when {
                value > 25 -> 25
                value < 0 -> 0
                else -> value
            }
        }

    init {
        // Forzamos el paso por los setters reguladores
        this.duracionMinutos = duracionInicial
        this.plazasDisponibles = plazasIniciales
        // Aviso obligatorio por consola
        println("✨ [SISTEMA] Actividad registrada correctamente: '$nombre' en Cádiz.")
    }

    // --- LÓGICA COMÚN DE RESERVAS (RA4.i) ---

    override fun reservar(plazas: Int): Boolean {
        // Regla 1: Impedir reservar más de 25 plazas de golpe
        if (plazas > 25) {
            println("❌ No puedes reservar más de 25 plazas de golpe.")
            return false
        }
        // Regla 2: Impedir reservar más de las disponibles
        if (plazas <= 0 || plazas > plazasDisponibles) {
            println("❌ Reserva rechazada. Plazas solicitadas: $plazas | Disponibles: $plazasDisponibles")
            return false
        }

        plazasDisponibles -= plazas
        plazasReservadas += plazas
        println("✅ ¡Reserva de $plazas plazas confirmada para '$nombre'!")
        return true
    }

    override fun cancelar(): Boolean {
        // Suponemos que cancela todas las plazas que ese usuario tuviera,
        // o si cancela de 1 en 1. Hagamos que libere 1 plaza reservada por simplicidad.
        if (plazasReservadas <= 0) {
            println("❌ No hay reservas activas que se puedan cancelar para '$nombre'.")
            return false
        }
        plazasReservadas--
        plazasDisponibles++
        println("🔄 Cancelación procesada. Una plaza liberada en '$nombre'.")
        return true
    }

    // Método para que el 'main' pueda leer las reservas sin modificarlas directamente
    fun getPlazasReservadas(): Int = plazasReservadas

    // Método abstracto obligatorio
    abstract fun descripcionDetallada(): String

    override fun toString(): String {
        return "'$nombre' (${duracionMinutos} min) | Precio: $precio€ | Disponibles: $plazasDisponibles | Reservadas: $plazasReservadas"
    }
}