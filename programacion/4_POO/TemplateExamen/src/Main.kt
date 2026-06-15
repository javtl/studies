fun main() {
    // 1. Instanciamos la clase que controla todo el cotarro
    val gestorSistema = ClaseGestora("Core Engine DAM/DAW 2026")

    // 2. [RA4.e] Crear instancias reales de las clases hijas pasándole datos de prueba
    val objetoA1 = ClaseHijaTipoA("ID-001", "Componente Alfa", 5, 150.0, 50, propiedadExclusivaA = true)
    val objetoA2 = ClaseHijaTipoA("ID-002", "Componente Beta", 2, 75.5, 200, propiedadExclusivaA = false) // Probará el setter máximo
    val objetoB1 = ClaseHijaTipoB("ID-003", "Componente Gamma", 12, 320.0, 30)

    // Almacenamos los objetos dentro de la estructura de la clase gestora
    gestorSistema.insertarElemento(objetoA1)
    gestorSistema.insertarElemento(objetoA2)
    gestorSistema.insertarElemento(objetoB1)

    // 3. [RA6.c, d] Recorrido y muestra del catálogo ordenado mediante bucle clásico
    println("\n📋 --- ELEMENTOS PROCESADOS (ORDENADOS POR CRITERIO NUMÉRICO) ---")
    val listaFiltradaYOrdenada = gestorSistema.obtainColeccionOrdenadaPorCriterioNumerico()
    for (item in listaFiltradaYOrdenada) { // [RA6.d] Iterador implícito for-in
        println("• ${item.nombreIdentificador} [ID: ${item.idUnico}] -> FiltroValor: ${item.propiedadConRangoFiltro} | MinimoAjustado: ${item.propiedadConMinimo}")
    }

    // 4. Búsqueda semántica por cadena de texto
    val patronBuscado = "Alfa"
    println("\n🔍 --- COINCIDENCIAS ENCONTRADAS PARA EL PATRÓN: '$patronBuscado' ---")
    gestorSistema.filtrarPorSubcadenaEnTexto(patronBuscado).forEach {
        println(" -> Hit en ID: ${it.idUnico} | Detalle: ${it.generarCadenaInformativaEspecifica()}")
    }

    // 5. Pruebas de ejecución de la Interfaz y control de estados (RA4.i)
    println("\n🎫 --- TRAZABILIDAD DE ACCIONES DE LA INTERFAZ ---")
    objetoA1.ejecutarAccionConLimite(20)  // Ejecución válida: cambia estado a true
    objetoA1.ejecutarAccionConLimite(10)  // Ejecución inválida: ya está en true
    objetoA1.revertirEstado()              // Ejecución válida: vuelve a false


    // =========================================================================
    // 📊 BLOQUE ANALÍTICO AVANZADO: Programación Funcional Pura (Nota Máxima)
    // =========================================================================
    println("\n=========================================================")
    println("📊 INFORME DE MÉTRICAS GLOBALES DEL SISTEMA")
    println("=========================================================")

    val listaGlobalMetricas = gestorSistema.copiarColeccionCompleta()

    // Métrica A: Total de objetos en memoria usando la propiedad ESTATICA de la clase base [RA4.h]
    println("1️⃣ Recuento de instancias vivas en memoria (Companion Object): ${SuperclaseBase.contadorGlobalObjetos}")

    // Métrica B: Filtrado funcional preciso basado en estados internos booleanos
    val objetosModificados = listaGlobalMetricas.filter { it.consultarEstadoActual() }
    println("2️⃣ Elementos que se encuentran con el estado modificado de la interfaz:")
    if (objetosModificados.isEmpty()) {
        println("   Ningún elemento ha modificado su estado base.")
    } else {
        objetosModificados.forEach { println("   👉 ${it.nombreIdentificador} [ID: ${it.idUnico}]") }
    }

    // Métrica C: Cálculo exacto de porcentajes de tipos usando 'is' (Smart Cast dinámico)
    val totalElementosInyectados = listaGlobalMetricas.size.toDouble()
    if (totalElementosInyectados > 0) {
        val conteoTipoA = listaGlobalMetricas.count { it is ClaseHijaTipoA } // Cuenta cuántos objetos son de la subclase A
        val conteoTipoB = listaGlobalMetricas.count { it is ClaseHijaTipoB } // Cuenta cuántos objetos son de la subclase B

        println("3️⃣ Desglose porcentual por tipología de clase heredada:")
        println("   • Proporción de Subclases Tipo A: ${(conteoTipoA / totalElementosInyectados) * 100}% del total.")
        println("   • Proporción de Subclases Tipo B: ${(conteoTipoB / totalElementosInyectados) * 100}% del total.")
    }
    println("=========================================================")
}