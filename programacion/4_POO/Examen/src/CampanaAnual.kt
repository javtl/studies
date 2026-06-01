class CampanaAnual(
    val anio: String // Ejemplo: "2026", "2025-2026", "Invierno 2027"
) {
    // Colección interna privada para almacenar las actividades
    private val actividades = mutableListOf<Aventura>()

    /**
     * Añade una actividad a la campaña.
     * @return Devuelve la lista completa de actividades actualmente registradas,
     * pero ordenada de menor a mayor PRECIO.
     */
    fun agregarActividad(a: Aventura): List<Aventura> {
        actividades.add(a)
        println("➕ Actividad '${a.nombre}' añadida a la campaña $anio.")

        // Retornamos una nueva lista ordenada por la propiedad precio
        return actividades.sortedBy { it.precio }
    }

    /**
     * Busca qué actividades contienen una subcadena de texto dentro de su descripción detallada.
     * @param sub La subcadena de texto a buscar (no distingue entre mayúsculas/minúsculas).
     * @return Una lista con todas las Aventuras que coincidan con la búsqueda.
     */
    fun buscarPorSubcadena(sub: String): List<Aventura> {
        // Filtramos la lista comprobando si la descripción detallada contiene la subcadena
        return actividades.filter { aventura ->
            // Convertimos ambas a minúsculas (lowercase) para que la búsqueda sea "Case Insensitive"
            aventura.descripcionDetallada().lowercase().contains(sub.lowercase())
        }
    }

    /**
     * Función útil de soporte para listar todo lo que hay en la campaña actualmente
     */
    fun mostrarCampaña() {
        println("\n=== 📅 PLANIFICACIÓN CAMPAÑA: $anio ===")
        if (actividades.isEmpty()) {
            println("La campaña está vacía.")
        } else {
            actividades.forEach { println(it) }
        }
        println("=========================================")
    }
}