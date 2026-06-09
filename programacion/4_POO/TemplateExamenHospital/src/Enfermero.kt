class Enfermero(
    codigoEmpleado: String,
    nombre: String,
    añosExperiencia: Int,
    sueldoBase: Double,
    numeroGuardias: Int,
    // Atributo propio: Lista con los sectores asignados
    val sectoresAsignados: List<String> = listOf("Urgencias", "Planta 3 - Pediatría")
) : PersonalHospital(codigoEmpleado, nombre, añosExperiencia, sueldoBase, guardiasIniciales = numeroGuardias) {

    override fun generarInformeRol(): String {
        return "Informe de enfermería para $nombre. Sectores cubiertos hoy: ${sectoresAsignados.joinToString(", ")}."
    }

    override fun toString(): String {
        return super.toString() + " | Rol: Enfermero [Sectores: ${sectoresAsignados.size}]"
    }
}