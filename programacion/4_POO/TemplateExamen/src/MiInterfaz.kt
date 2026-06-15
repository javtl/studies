/*
=========================================================================
TEMPLATE BASE (La estructura genérica que sirve para todo)
=========================================================================
[RA4.i] Molde para cualquier comportamiento que requiera una acción
y su posterior reversión.
*/

interface MiInterfaz {
    // Método para realizar una acción controlada (con límite o validación)
    fun ejecutarAccionConLimite(cantidad: Int): Boolean

    // Método para deshacer una acción previa o restaurar estado
    fun revertirEstado(): Boolean
}

/*
=========================================================================
ADAPTACIÓN 1: Contexto "Actividades Turísticas" (Gestión de Plazas)
Interpretación: La "Acción" es reservar y la "Reversión" es cancelar.
=========================================================================
*/

interface Reservable {
    // Mapeo: ejecutarAccionConLimite(Int) -> reservar(plazas: Int)
    fun reservar(plazas: Int): Boolean

    // Mapeo: revertirEstado() -> cancelar()
    fun cancelar(): Boolean
}

/*
=========================================================================
ADAPTACIÓN 2: Contexto "Biblioteca" (Gestión de Préstamos)
Interpretación: La "Acción" es prestar ejemplares y la "Reversión" es devolver.
=========================================================================
*/

interface Prestable {
    // Mapeo: ejecutarAccionConLimite(Int) -> prestar(ejemplares: Int)
    fun prestar(ejemplares: Int): Boolean

    // Mapeo: revertirEstado() -> devolver()
    fun devolver(): Boolean
}

/*
=========================================================================
ADAPTACIÓN 3: Contexto "E-Commerce" (Gestión de Carrito)
Interpretación: La "Acción" es añadir unidades al pedido y la "Reversión" es eliminar.
=========================================================================
*/

interface GestionablePedido {
    // Mapeo: ejecutarAccionConLimite(Int) -> agregarAlCarrito(unidades: Int)
    fun agregarAlCarrito(unidades: Int): Boolean

    // Mapeo: revertirEstado() -> vaciarCarrito()
    fun vaciarCarrito(): Boolean
}

/*
=========================================================================
ADAPTACIÓN 4: Contexto "Parking" (Gestión de Acceso)
Interpretación: La "Acción" es registrar entrada y la "Reversión" es salida.
=========================================================================
*/

interface Accesible {
    // Mapeo: ejecutarAccionConLimite(Int) -> registrarEntrada(horas: Int)
    fun registrarEntrada(horas: Int): Boolean

    // Mapeo: revertirEstado() -> registrarSalida()
    fun registrarSalida(): Boolean
}