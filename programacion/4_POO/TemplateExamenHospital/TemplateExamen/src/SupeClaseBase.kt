abstract class SuperclaseBase(
    val idUnico: String,              // Propiedad inmutable (No cambia una vez creada)
    val nombreIdentificador: String,  // Propiedad de lectura estándar
    datoFiltroMinimoInicial: Int,     // Parámetro temporal de paso (SIN val/var para poder usar el setter)
    datoFiltroRangoInicial: Double,   // Parámetro temporal de paso (SIN val/var)
    datoFiltroMaximoInicial: Int      // Parámetro temporal de paso (SIN val/var)
) : MiInterfaz {                      // [RA4.i] Acoplamiento obligatorio de la interfaz

    // ---------------------------------------------------------------------
    // [RA4.h] COMPANION OBJECT: Miembros Estáticos (Contadores Globales)
    // ---------------------------------------------------------------------
    companion object {
        var contadorGlobalObjetos: Int = 0
        const val LIMITE_MAXIMO_SISTEMA = 100 // Constante de control
    }

    // ---------------------------------------------------------------------
    // [RA4.f] MODIFICADORES DE VISIBILIDAD: Encapsulamiento de datos
    // ---------------------------------------------------------------------
    protected var estadoInternoBooleano: Boolean = false // Solo visible para la familia (clases hijas)
    private val claveInternaSeguridad: String = "SISTEMA-INTERNO" // Totalmente oculta fuera de esta clase

    // ---------------------------------------------------------------------
    // [RA4.c] SETTERS PERSONALIZADOS: Control de reglas, rangos y valores basura
    // ---------------------------------------------------------------------
    var propiedadConMinimo: Int = 0
        set(value) {
            // Ejemplo: Impedir que el valor sea inferior a un mínimo (si es menor, se clava en el mínimo)
            field = if (value < 10) 10 else value
        }

    var propiedadConRangoFiltro: Double = 0.0
        set(value) {
            // Ejemplo: Solo aceptar valores positivos
            if (value >= 0.0) field = value
        }

    var propiedadConMaximo: Int = 0
        set(value) {
            // Ejemplo: Controlar un tope máximo usando la estructura 'when'
            field = when {
                value > LIMITE_MAXIMO_SISTEMA -> LIMITE_MAXIMO_SISTEMA
                value < 0 -> 0
                else -> value
            }
        }

    // ---------------------------------------------------------------------
    // [RA4.d] BLOQUE DE INICIALIZACIÓN: Constructor primario en acción
    // ---------------------------------------------------------------------
    init {
        // OBLIGATORIO: Forzar a los parámetros del constructor a pasar por los setters reguladores
        this.propiedadConMinimo = datoFiltroMinimoInicial
        this.propiedadConRangoFiltro = datoFiltroRangoInicial
        this.propiedadConMaximo = datoFiltroMaximoInicial

        // Control del estado estático de la clase
        contadorGlobalObjetos++

        // [RA5.b] Mostrar aviso obligatorio por consola al crear un objeto
        println("✨ [SISTEMA] Nuevo objeto registrado. ID: '$idUnico' | Total: $contadorGlobalObjetos")
    }

    // ---------------------------------------------------------------------
    // [RA4.i] IMPLEMENTACIÓN DE LA LÓGICA COMÚN DE LA INTERFAZ
    // ---------------------------------------------------------------------
    override fun ejecutarAccionConLimite(cantidad: Int): Boolean {
        // Regla típica: comprobar si el estado lo permite o si supera el máximo
        if (estadoInternoBooleano || cantidad > propiedadConMaximo) {
            println("❌ Operación rechazada para el ID '$idUnico'. No cumple las condiciones.")
            return false
        }
        estadoInternoBooleano = true
        println("✅ Operación ejecutada con éxito para el ID '$idUnico'. Cantidad procesada: $cantidad.")
        return true
    }

    override fun revertirEstado(): Boolean {
        if (!estadoInternoBooleano) {
            println("❌ Operación rechazada: El ID '$idUnico' ya se encuentra en su estado base.")
            return false
        }
        estadoInternoBooleano = false
        println("🔄 Estado restaurado con éxito para el ID '$idUnico'.")
        return true
    }

    // Función 'getter' segura para permitir que el 'main' lea el estado sin modificarlo a la fuerza
    fun consultarEstadoActual(): Boolean = estadoInternoBooleano

    // ---------------------------------------------------------------------
    // [RA7.d] MÉTODO ABSTRACTO: Fuerza a cada subclase a definir su comportamiento
    // ---------------------------------------------------------------------
    abstract fun generarCadenaInformativaEspecifica(): String

    override fun toString(): String {
        return "ID: $idUnico | Nombre: $nombreIdentificador | Prop1: $propiedadConMinimo | Prop2: $propiedadConRangoFiltro | Estado: $estadoInternoBooleano"
    }
}