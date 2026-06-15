/*
* ClaseGestora.kt (El Contenedor / Almacén de Datos)
[RA6.b, c, e] El cerebro de la lógica de negocio. Oculta la colección mutable y expone operaciones de ordenación y filtrado.
* */

class ClaseGestora(
    val nombreDelSistemaGestor: String
) {
    // [RA4.f] + [RA6.c] Encapsulamiento estricto: la lista es PRIVADA para que nadie la modifique desde fuera
    private val coleccionDatosInterna = mutableListOf<SuperclaseBase>()

    // Método universal para añadir elementos a la estructura [RA4.j]
    fun insertarElemento(elemento: SuperclaseBase) {
        coleccionDatosInterna.add(elemento)
    }

    /**
     * [RA6.b, e] Método de ordenación.
     * Devuelve una nueva lista de solo lectura ordenada por el criterio numérico que pida el enunciado (Precio, ID, etc.).
     */
    fun obtenerColeccionOrdenadaPorCriterioNumerico(): List<SuperclaseBase> {
        return coleccionDatosInterna.sortedBy { it.propiedadConRangoFiltro }
    }

    /**
     * [RA6.d] Método de búsqueda por coincidencia de caracteres (Subcadena)
     */
    fun filtrarPorSubcadenaEnTexto(subcadena: String): List<SuperclaseBase> {
        return coleccionDatosInterna.filter { objeto ->
            objeto.generarCadenaInformativaEspecifica().contains(subcadena, ignoreCase = true)
        }
    }

    // Función pasamanos para que el bloque principal acceda a la lista original de forma segura
    fun copiarColeccionCompleta(): List<SuperclaseBase> = coleccionDatosInterna
}