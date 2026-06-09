/*
MiInterfaz.kt (Contrato de Comportamiento)
[RA4.i] Molde para cualquier comportamiento que requiera una acción (modificar un estado, validar un proceso o devolver un Boolean).*/

interface MiInterfaz {
    // Método que recibe un parámetro numérico y devuelve si la acción fue exitosa o no
    fun ejecutarAccionConLimite(cantidad: Int): Boolean

    // Método para revertir o cambiar un estado interno
    fun revertirEstado(): Boolean
}