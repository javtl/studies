abstract class PersonalHospital(
    val codigoEmpleado: String,     // Propiedad inmutable (RA4.c)
    val nombre: String,
    experienciaInicial: Int,       // Sin val/var: pasamanos para el setter (RA7.c)
    sueldoBaseInicial: Double,     // Sin val/var
    guardiasIniciales: Int         // Sin val/var
) : Atendible {                    // Implementación de la interfaz (RA4.i)

    // [RA4.h] COMPANION OBJECT: Miembros Estáticos (Contadores globales)
    companion object {
        var totalPersonalActivo: Int = 0
        const val MAX_GUARDIAS_PERMITIDAS = 10
    }

    // [RA4.f] VISIBILIDAD: Control de acceso interno
    protected var estaEnGuardia: Boolean = false
    private val historialSeguro: String = "EXP-MED-CONFIDENCIAL"

    // [RA4.c] SETTERS PERSONALIZADOS: Control de reglas de negocio
    var añosExperiencia: Int = 0
        set(value) {
            // Regla: Impedir valores negativos (mínimo 0)
            field = if (value < 0) 0 else value
        }

    var sueldoBase: Double = 0.0
        set(value) {
            if (value >= 0.0) field = value
        }

    var numeroGuardiasMensuales: Int = 0
        set(value) {
            // Regla: Controlar un máximo permitido mediante un 'when'
            field = when {
                value > MAX_GUARDIAS_PERMITIDAS -> MAX_GUARDIAS_PERMITIDAS
                value < 0 -> 0
                else -> value
            }
        }

    // [RA4.d] BLOQUE DE INICIALIZACIÓN (Avisos de construcción)
    init {
        this.añosExperiencia = experienciaInicial
        this.sueldoBase = sueldoBaseInicial
        this.numeroGuardiasMensuales = guardiasIniciales

        totalPersonalActivo++ // Control estático
        println("🏥 [HOSPITAL] Personal registrado: '$nombre' (Cód: $codigoEmpleado).")
    }

    // [RA4.i] IMPLEMENTACIÓN DE MÉTODOS DE LA INTERFAZ
    override fun registrarIngreso(sala: String): Boolean {
        if (estaEnGuardia) {
            println("❌ Rechazado: El empleado '$nombre' ya está asignado a otra urgencia.")
            return false
        }
        estaEnGuardia = true
        println("🩺 Éxito: El empleado '$nombre' ha ingresado en la sala: $sala.")
        return true
    }

    override fun darAltaMedica(): Boolean {
        if (!estaEnGuardia) {
            println("❌ Rechazado: El empleado '$nombre' no estaba de guardia activa.")
            return false
        }
        estaEnGuardia = false
        println("🔄 Éxito: Guardia finalizada para '$nombre'. Pasa a descanso.")
        return true
    }

    // Getter para que el main lea de forma segura el estado
    fun consultarDisponibilidad(): Boolean = estaEnGuardia

    // [RA7.d] MÉTODO ABSTRACTO: Obligatorio para las subclases
    abstract fun generarInformeRol(): String

    override fun toString(): String {
        return "Cód: $codigoEmpleado | $nombre | Sueldo: $sueldoBase€ | Exp: $añosExperiencia años | En Guardia: $estaEnGuardia"
    }
}