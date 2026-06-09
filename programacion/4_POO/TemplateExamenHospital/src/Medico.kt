class Medico(
    codigoEmpleado: String,    // Parámetro heredado (Sin val/var)
    nombre: String,            // Parámetro heredado (Sin val/var)
    añosExperiencia: Int,      // Parámetro heredado (Sin val/var)
    sueldoBase: Double,        // Parámetro heredado (Sin val/var)
    numeroGuardias: Int,       // Parámetro heredado (Sin val/var)
    val esEspecialista: Boolean // Atributo propio (SÍ lleva val)
) : PersonalHospital(codigoEmpleado, nombre, añosExperiencia, sueldoBase, numeroGuardias) {

    override fun generarInformeRol(): String {
        val rango = if (esEspecialista) "Médico Especialista (Adjunto) 🎓" else "Médico Residente (MIR) 📋"
        return "Informe médico de la plantilla de $nombre. Categoría: $rango."
    }

    override fun toString(): String {
        return super.toString() + " | Rol: Médico [Especialista: $esEspecialista]"
    }
}