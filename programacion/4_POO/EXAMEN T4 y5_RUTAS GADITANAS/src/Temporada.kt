class Temporada(
    val periodo: String // Ejemplo: "2025-2026"
) {
    // RA6.c: Lista para almacenar la información de los objetos
    private val actividades = mutableListOf<ActividadTuristica>()

    // Método estándar de inserción
    fun agregarActividad(a: ActividadTuristica) {
        actividades.add(a)
    }

    /**
     * RA6.b/e: Devuelve la lista ordenada por precio.
     * Usamos sortedBy para no alterar el orden de inserción original de la lista privada.
     */
    fun listarActividades(): List<ActividadTuristica> {
        return actividades.sortedBy { it.precio }
    }

    /**
     * RA6.g: Búsqueda por subcadena dentro de la descripción detallada de cada objeto.
     */
    fun buscarPorSubcadena(sub: String): List<ActividadTuristica> {
        return actividades.filter { it.descripcionDetallada().contains(sub, ignoreCase = true) }
    }

    // Método auxiliar para facilitarnos los cálculos del main más adelante
    fun obtenerTodas(): List<ActividadTuristica> = actividades
}