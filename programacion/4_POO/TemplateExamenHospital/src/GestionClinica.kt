class GestionClinica(
    val nombreClinica: String
) {
    // Encapsulamiento estricto de la lista (RA4.f + RA6.c)
    private val plantillaPersonal = mutableListOf<PersonalHospital>()

    // Método para añadir elementos (RA4.j)
    fun contratarPersonal(p: PersonalHospital) {
        plantillaPersonal.add(p)
    }

    /**
     * [RA6.b, e] Devuelve la lista ordenada por Sueldo de menor a mayor.
     */
    fun obtenerPlantillaOrdenadaPorSueldo(): List<PersonalHospital> {
        return plantillaPersonal.sortedBy { it.sueldoBase }
    }

    /**
     * [RA6.d] Búsqueda por subcadena utilizando programación funcional
     */
    fun buscarPorPalabraClave(sub: String): List<PersonalHospital> {
        return plantillaPersonal.filter { empleado ->
            empleado.generarInformeRol().contains(sub, ignoreCase = true)
        }
    }

    // Pasamanos seguro para que el main pueda aplicar funciones avanzadas
    fun obtenerTodaLaPlantilla(): List<PersonalHospital> = plantillaPersonal
}