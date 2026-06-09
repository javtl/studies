// =========================================================================
// [RA4.i] INTERFACES: Contratos de comportamiento para clases
// =========================================================================
// Estructura limpia para cuando pidan métodos que devuelvan Boolean o controlen estados.
interface Rentable {
    fun aplicarAlquiler(dias: Int): Boolean
    fun devolverVehiculo(): Boolean
}

// =========================================================================
// [RA7.a] SUPERCLASE / CLASE MADRE (Debe ser 'abstract')
// [RA4.a,b,c] Componentes típicos: propiedades, métodos y encapsulamiento
// =========================================================================
abstract class Vehiculo(
    val id: String,                // Propiedad inmutable (No cambiará)
    val marca: String,
    duracionGarantiaInicial: Int,  // Parámetro de paso temporal (Sin val/var para usar el setter)
    precioBaseInicial: Double,     // Parámetro de paso temporal (Sin val/var)
    capacidadInicial: Int          // Parámetro de paso temporal (Sin val/var)
) : Rentable {                     // [RA4.i] Acoplamiento de la interfaz a la clase madre

    // ---------------------------------------------------------------------
    // [RA4.h] COMPANION OBJECT: Miembros Estáticos (Globales de la clase)
    // ---------------------------------------------------------------------
    companion object {
        var totalVehiculosRegistrados: Int = 0
        const val MAX_PLAZAS_PERMITIDAS = 9 // Constante de control global
    }

    // ---------------------------------------------------------------------
    // [RA4.f] MODIFICADORES DE VISIBILIDAD: 'protected' y 'private'
    // ---------------------------------------------------------------------
    protected var estaAlquilado: Boolean = false // Accesible solo por la familia de clases
    private var codigoInternoSeguridad: String = "SEC-XYZ" // Invisible fuera de esta clase

    // ---------------------------------------------------------------------
    // [RA4.c] SETTERS PERSONALIZADOS: Control de rangos, máximos y mínimos
    // ---------------------------------------------------------------------
    var duracionGarantiaMeses: Int = 12
        set(value) {
            // Regla: Impedir valores menores de 12 meses (Filtro mínimo)
            field = if (value < 12) 12 else value
        }

    var precioBase: Double = 0.0
        set(value) {
            if (value >= 0.0) field = value
        }

    var capacidadPasajeros: Int = 5
        set(value) {
            // Regla: Controlar un máximo permitido utilizando estructuras 'when'
            field = when {
                value > MAX_PLAZAS_PERMITIDAS -> MAX_PLAZAS_PERMITIDAS
                value < 1 -> 1
                else -> value
            }
        }

    // ---------------------------------------------------------------------
    // [RA4.d] BLOQUE DE INICIALIZACIÓN (Constructor secundario implícito / Avisos)
    // ---------------------------------------------------------------------
    init {
        // Obligatorio: Forzar a los datos iniciales a pasar por nuestros filtros setters
        this.duracionGarantiaMeses = duracionGarantiaInicial
        this.precioBase = precioBaseInicial
        this.capacidadPasajeros = capacidadInicial

        // Control estático global
        totalVehiculosRegistrados++

        // Mensaje por consola al instanciar
        println("✨ [SISTEMA] Vehículo con ID '$id' registrado correctamente.")
    }

    // ---------------------------------------------------------------------
    // [RA4.i] IMPLEMENTACIÓN DE INTERFAZ COMÚN PARA TODAS LAS HIJAS
    // ---------------------------------------------------------------------
    override fun aplicarAlquiler(dias: Int): Boolean {
        if (estaAlquilado || dias <= 0) {
            println("❌ Operación rechazada: Vehículo '$id' no disponible o días inválidos.")
            return false
        }
        estaAlquilado = true
        println("✅ Alquilado con éxito el vehículo '$id' por $dias días.")
        return true
    }

    override fun devolverVehiculo(): Boolean {
        if (!estaAlquilado) {
            println("❌ Operación rechazada: El vehículo '$id' ya estaba en garaje.")
            return false
        }
        estaAlquilado = false
        println("🔄 Vehículo '$id' devuelto y listo para el siguiente cliente.")
        return true
    }

    // Método 'getter' seguro para que el main lea el estado sin poder modificarlo
    fun comprobarEstadoAlquiler(): Boolean = estaAlquilado

    // ---------------------------------------------------------------------
    // [RA7.d] MÉTODO ABSTRACTO: Fuerza a las subclases a implementar su lógica
    // ---------------------------------------------------------------------
    abstract fun obtenerDescripcionEspecifica(): String

    override fun toString(): String {
        return "ID: $id | Marca: $marca | Precio Base: $precioBase€ | Capacidad: $capacidadPasajeros | Alquilado: $estaAlquilado"
    }
}


// =========================================================================
// [RA7.c] SUBCLASES / CLASES HEREDADAS E INCIDENCIA DE CONSTRUCTORES
// [RA7.e] Diseño y aplicación de Jerarquías de clases
// =========================================================================

// --- HIJA 1: Especificación por Tipo de Atributo Directo
class Coche(
    id: String,               // Parámetro heredado: SIN val/var
    marca: String,            // Parámetro heredado: SIN val/var
    duracionGarantia: Int,    // Parámetro heredado: SIN val/var
    precioBase: Double,       // Parámetro heredado: SIN val/var
    capacidad: Int,           // Parámetro heredado: SIN val/var
    val esElectrico: Boolean  // Atributo propio: SÍ LLEVA val/var
) : Vehiculo(id, marca, duracionGarantia, precioBase, capacidad) { // Invocación del constructor madre

    // [RA7.d] Sobrescribir el método obligatorio de la superclase
    override fun obtenerDescripcionEspecifica(): String {
        val tipoMotor = if (esElectrico) "Eléctrico 🔋" else "Combustión ⛽"
        return "Coche familiar de la marca $marca con motor tipo: $tipoMotor."
    }

    override fun toString(): String {
        return super.toString() + " | Tipo: Coche [Eléctrico: $esElectrico]"
    }
}

// --- HIJA 2: Especificación por Colección Interna de Datos (Listas de Strings)
class Autobus(
    id: String,
    marca: String,
    duracionGarantia: Int,
    precioBase: Double,
    capacidad: Int,
    // Atributo propio: Colección de paradas inicializada por defecto si no se pasa otra
    val listaParadasRuta: List<String> = listOf("Estación Central", "Aeropuerto", "Puerto Comercial")
) : Vehiculo(id, marca, duracionGarantia, precioBase, capacity = capacidad) {

    override fun obtenerDescripcionEspecifica(): String {
        return "Autobús de ruta regular de la marca $marca. Recorrido planificado: ${listaParadasRuta.joinToString(" -> ")}."
    }

    override fun toString(): String {
        return super.toString() + " | Tipo: Autobús [Paradas: ${listaParadasRuta.size}]"
    }
}


// =========================================================================
// [RA6.b,c,e] CLASE GESTORA DE COLECCIONES (Tratamiento de listas avanzadas)
// =========================================================================
class GestionFlota(
    val nombreEmpresa: String
) {
    // [RA4.f] + [RA6.c] Encapsulamiento de listas. Oculta la colección mutable interna.
    private val inventarioVehiculos = mutableListOf<Vehiculo>()

    // Método básico de inserción [RA4.j]
    fun registrarVehiculo(v: Vehiculo) {
        inventarioVehiculos.add(v)
    }

    /**
     * [RA6.b,e] Método de visualización/recuperación ordenada.
     * Devuelve una nueva lista de solo lectura ordenada por un criterio numérico (Precio).
     */
    fun consultarCatalogoOrdenado(): List<Vehiculo> {
        return inventarioVehiculos.sortedBy { it.precioBase }
    }

    /**
     * [RA6.d] Uso de filtrados y búsquedas de subcadenas combinando lambdas
     */
    fun buscarPorTextoEnDescripcion(subcadena: String): List<Vehiculo> {
        return inventarioVehiculos.filter { vehiculo ->
            vehiculo.obtenerDescripcionEspecifica().contains(subcadena, ignoreCase = true)
        }
    }

    // Pasamanos controlado para dar acceso seguro a los datos en el bloque principal
    fun obtenerTodosLosVehiculos(): List<Vehiculo> = inventarioVehiculos
}


// =========================================================================
// [RA4.e] FUNCIÓN MAIN: Instanciación, control de flujo y estadísticas avanzadas
// =========================================================================
fun main() {
    // 1. Instanciamos la clase controladora / Gestora
    val miFlota = GestionFlota("Alquileres Pro DAM 2026")

    // 2. [RA4.e] Crear objetos reales de las clases hijas
    val coche1 = Coche("1111-AAA", "Tesla", 24, 60.0, 5, esElectrico = true)
    val coche2 = Coche("2222-BBB", "Seat", 6, 25.0, 5, esElectrico = false) // Probará el set mínimo de garantía
    val bus1 = Autobus("3333-CCC", "Mercedes", 36, 120.0, 50) // Probará el set máximo de plazas (ajustará a 9)

    // Agregamos los elementos a nuestra estructura de datos de la empresa
    miFlota.registrarVehiculo(coche1)
    miFlota.registrarVehiculo(coche2)
    miFlota.registrarVehiculo(bus1)

    // 3. [RA6.c,d] Mostrar listados procesando colecciones ordenadas
    println("\n📋 --- CATÁLOGO DISPONIBLE DE MENOR A MAYOR PRECIO ---")
    val listaOrdenada = miFlota.consultarCatalogoOrdenado()
    for (v in listaOrdenada) { // [RA6.d] Recorrido por iterador implícito
        println("• ${v.marca} (ID: ${v.id}) -> Base: ${v.precioBase}€ (Garantía: ${v.duracionGarantiaMeses} meses)")
    }

    // 4. Búsqueda semántica por subcadena de texto
    val busqueda = "Aeropuerto"
    println("\n🔍 --- RESULTADOS DE BÚSQUEDA PARA EL TÉRMINO: '$busqueda' ---")
    miFlota.buscarPorTextoEnDescripcion(busqueda).forEach {
        println("Found -> ID: ${it.id} | Descripción: ${it.obtenerDescripcionEspecifica()}")
    }

    // 5. Simular ejecuciones de la interfaz rentable
    println("\n🎫 --- SIMULACIÓN DE FLUJO DE TRABAJO (RESERVAS) ---")
    coche1.aplicarAlquiler(5)  // Operación Exitosa
    coche1.aplicarAlquiler(2)  // Operación Denegada (Ya está alquilado)
    coche1.devolverVehiculo()   // Operación Exitosa

    bus1.aplicarAlquiler(10)   // Dejamos el autobús alquilado para alterar estadísticas


    // =========================================================================
    // [RA6] OPERADORES FUNCIONALES AVANZADOS (Asegurar la máxima nota en cálculos)
    // =========================================================================
    println("\n=========================================================")
    println("📊 CUADRO DE MANDOS E INFORME ESTADÍSTICO FINAL")
    println("=========================================================")

    val datosGlobales = miFlota.obtenerTodosLosVehiculos()

    // Cálculo A: Total de elementos registrados usando la variable ESTÁTICA del companion object [RA4.h]
    println("1️⃣ Total de objetos creados físicamente en memoria: ${Vehiculo.totalVehiculosRegistrados}")

    // Cálculo B: Filtrar elementos bajo comprobación de estado interno (¿Cuáles están alquilados?)
    val alquiladosActivos = datosGlobales.filter { it.comprobarEstadoAlquiler() }
    println("2️⃣ Vehículos fuera del taller con alquileres activos:")
    if (alquiladosActivos.isEmpty()) {
        println("   No hay alquileres activos en este momento.")
    } else {
        alquiladosActivos.forEach { println("   👉 ${it.marca} [ID: ${it.id}]") }
    }

    // Cálculo C: Porcentaje de reparto de clases hijas dinámicamente usando 'is'
    val tamañoTotal = datosGlobales.size.toDouble()
    if (tamañoTotal > 0) {
        val totalCoches = datosGlobales.count { it is Coche } // Comprobación estricta de tipo
        val totalAutobuses = datosGlobales.count { it is Autobus }

        println("3️⃣ Mapeo estadístico de distribución de la flota:")
        println("   • Turismos / Coches: ${(totalCoches / tamañoTotal) * 100}% de la flota.")
        println("   • Transporte / Autobuses: ${(totalAutobuses / tamañoTotal) * 100}% de la flota.")
    }
    println("=========================================================")
}