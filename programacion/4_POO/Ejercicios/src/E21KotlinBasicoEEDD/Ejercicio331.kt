/*Suponer una lista con datos de las compras hechas por clientes de una empresa a lo
largo de un mes, la cual contiene tuplas con información de cada venta: (cliente, día del
mes, monto, domicilio del cliente). Ejemplo:
[("Nuria Costa", 5, 12780.78, "Calle Las Flores 355"), ("Jorge Russo",
7, 699, "Mirasol 218"), ("Nuria Costa", 7, 532.90, "Calle Las Flores
355"), ("Julián Rodriguez", 12, 5715.99, "La Mancha 761"), ("Jorge
Russo", 15, 958, "Mirasol 218")]
Escribir una función que reciba como parámetro una lista con el formato mencionado
anteriormente y retorne los domicilios de cada cliente al cual se le debe enviar una
factura de compra. Notar que cada cliente puede haber hecho más de una compra en el
mes, por lo que la función debe retornar una estructura que contenga cada domicilio una
sola vez.*/

package E21KotlinBasicoEEDD


/**
 * EJERCICIO: Extracción de domicilios únicos para facturación.
 * Conceptos: Data Classes, Sets (HashSet) y Transformación de colecciones.
 */

// 1. Representamos la "tupla" con una Data Class para mayor claridad
data class Venta(
    val cliente: String,
    val dia: Int,
    val monto: Double,
    val domicilio: String
)

fun main() {
    // Datos de ejemplo del enunciado
    val comprasDelMes = listOf(
        Venta("Nuria Costa", 5, 12780.78, "Calle Las Flores 355"),
        Venta("Jorge Russo", 7, 699.0, "Mirasol 218"),
        Venta("Nuria Costa", 7, 532.90, "Calle Las Flores 355"),
        Venta("Julián Rodriguez", 12, 5715.99, "La Mancha 761"),
        Venta("Jorge Russo", 15, 958.0, "Mirasol 218")
    )

    val domiciliosParaFactura = obtenerDomiciliosUnicos(comprasDelMes)

    println("--- RUTAS DE ENVÍO DE FACTURAS ---")
    domiciliosParaFactura.forEachIndexed { i, domicilio ->
        println("${i + 1}. $domicilio")
    }
}

/**
 * Función principal solicitada.
 * @param ventas Lista de todas las transacciones del mes.
 * @return Un Set con los domicilios sin repetir.
 */
fun obtenerDomiciliosUnicos(ventas: List<Venta>): Set<String> {
    // Usamos un MutableSet porque por definición NO permite duplicados.
    val domicilios = mutableSetOf<String>()

    for (venta in ventas) {
        // Al añadir un domicilio que ya existe, el Set simplemente lo ignora.
        domicilios.add(venta.domicilio)
    }

    return domicilios
}
