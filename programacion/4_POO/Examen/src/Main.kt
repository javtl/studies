fun main() {
    // 1. Crear una campaña anual correctamente
    val campana2026 = CampanaAnual("Temporada Sierra Nevada 2026")

    // 2. Crear actividades (instanciando las clases hijas)
    val senderismo1 = RutaSenderismo(
        nombre = "Ruta por Monachil",
        duracionMinutos = 180,
        precio = 25.0,
        plazasIniciales = 15
    )
    val escalada1 = Escalada(
        nombre = "Bautismo de Escalada",
        duracionMinutos = 240,
        precio = 60.0,
        plazasIniciales = 10,
        nivelInicial = "Básico",
        zonaInicial = "Los Cahorros"
    )
    val bici1 = RutaEnBicicleta(
        nombre = "Desafío Subida al Veleta",
        duracionMinutos = 300,
        precio = 45.0,
        plazasIniciales = 8,
        tipoBiciInicial = "Montaña"
    )

    // Lista general para poder hacer cálculos globales más tarde
    val todasLasActividades = listOf(senderismo1, escalada1, bici1)

    // 3. Añadir actividades a la campaña (y el método nos devuelve la lista ordenada por precio)
    println("\n--- ➕ Registrando Actividades en la Campaña ---")
    campana2026.agregarActividad(senderismo1)
    campana2026.agregarActividad(escalada1)
    campana2026.agregarActividad(bici1)

    // 4. Mostrar las actividades ordenadas por precio
    println("\n--- 📈 Actividades Ordenadas por Precio (Menor a Mayor) ---")
    val ordenadas = todasLasActividades.sortedBy { it.precio }
    ordenadas.forEach { println(" - ${it.nombre}: ${it.precio}€") }

    // 5. Buscar actividades por subcadena (Por ejemplo "Veleta")
    val terminoBusqueda = "Veleta"
    println("\n--- 🔍 Buscando por la subcadena '$terminoBusqueda' ---")
    val resultadosBusqueda = campana2026.buscarPorSubcadena(terminoBusqueda)
    if (resultadosBusqueda.isEmpty()) {
        println("No se encontraron actividades con ese término.")
    } else {
        resultadosBusqueda.forEach { println("Encontrada -> ${it.nombre}: ${it.descripcionDetallada()}") }
    }

    // 6. Realizar reservas y cancelaciones (Polimorfismo con la Interfaz Reservable)
    println("\n--- 🎫 Simulando Gestión de Reservas y Cancelaciones ---")

    // Intentamos reservar en la ruta de bici (Tenemos 8 plazas iniciales)
    bici1.reservar(5)  // Éxito: Quedan 3 disponibles, 5 reservadas.
    bici1.reservar(4)  // Fallo: Intenta meter 4 pero solo quedan 3 libres.

    // Intentamos cancelar en la ruta de bici
    bici1.cancelar(2)  // Éxito: Quedan 5 disponibles, 3 reservadas.
    bici1.cancelar(25) // Fallo: Supera el límite máximo de 20 plazas por cancelación.

    // Reservamos en el bautismo de escalada
    escalada1.reservar(3)

    // Dejamos senderismo1 SIN RESERVAS para comprobar los cálculos posteriores

    // =========================================================================
    // 📊 BLOQUE DE CÁLCULOS ESTADÍSTICOS
    // =========================================================================
    println("\n=========================================================")
    println("📊 INFORME ESTADÍSTICO FINAL")
    println("=========================================================")

    // A) Total de Actividades creadas
    println("1. Total de actividades creadas: ${todasLasActividades.size}")

    // B) Actividades que NO se hayan reservado (plazasReservadasTotales sea 0)
    val noReservadas = todasLasActividades.filter { it.plazasReservadasTotales == 0 }
    println("2. Actividades que NO se han reservado:")
    if (noReservadas.isEmpty()) {
        println("   [Todas las actividades tienen al menos una reserva]")
    } else {
        noReservadas.forEach { println("   • ${it.nombre}") }
    }

    // C) La recaudación total de una campaña (plazasReservadasTotales * precio)
    val recaudacionTotal = todasLasActividades.sumOf { it.plazasReservadasTotales * it.precio }
    println("3. Recaudación total de la campaña: $recaudacionTotal€")

    // D) Actividad más cara
    val actividadMasCara = todasLasActividades.maxByOrNull { it.precio }
    println("4. Actividad más cara: ${actividadMasCara?.nombre} (${actividadMasCara?.precio}€)")

    // E) Actividad más barata
    val actividadMasBarata = todasLasActividades.minByOrNull { it.precio }
    println("5. Actividad más barata: ${actividadMasBarata?.nombre} (${actividadMasBarata?.precio}€)")
    println("=========================================================")
}