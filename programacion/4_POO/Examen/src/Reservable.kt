interface Reservable {

    // Forzamos a que la clase que implemente esta interfaz tenga una forma
    // de gestionar cuántas plazas se han reservado en total.
    var plazasReservadasTotales: Int

    // También necesitamos acceder a las plazas disponibles de la actividad
    var plazasDisponibles: Int

    /**
     * Intenta reservar un número de plazas.
     * @return true si la reserva se hizo con éxito, false si no cumple las reglas.
     */
    fun reservar(plazas: Int): Boolean {
        // Regla: No se pueden reservar más plazas de las que hay disponibles
        if (plazas <= 0 || plazas > plazasDisponibles) {
            println("⚠️ No se puede realizar la reserva. Plazas solicitadas: $plazas. Disponibles: $plazasDisponibles")
            return false
        }

        // Si pasa el filtro, actualizamos el estado
        plazasDisponibles -= plazas
        plazasReservadasTotales += plazas
        println("✅ Reserva realizada con éxito: $plazas plazas.")
        return true
    }

    /**
     * Intenta cancelar un número de plazas previamente reservadas.
     * @return true si la cancelación se hizo con éxito, false en caso contrario.
     */
    fun cancelar(plazas: Int): Boolean {
        // Regla 1: Impedir cancelar más plazas de 20 en una sola operación
        if (plazas > 20) {
            println("⚠️ Error: No se permite cancelar más de 20 plazas de golpe.")
            return false
        }

        // Regla 2: Impedir cancelar más plazas de las que realmente están reservadas
        if (plazas <= 0 || plazas > plazasReservadasTotales) {
            println("⚠️ Error: No puedes cancelar $plazas plazas porque solo tienes $plazasReservadasTotales reservadas.")
            return false
        }

        // Si pasa los filtros, actualizamos correctamente las plazas disponibles y reservadas
        plazasReservadasTotales -= plazas
        plazasDisponibles += plazas
        println("🔄 Cancelación realizada con éxito: $plazas plazas liberadas.")
        return true
    }
}