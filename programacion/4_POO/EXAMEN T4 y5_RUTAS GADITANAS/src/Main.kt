fun main() {
    // 1. Crear temporada
    val temporadaCadiz = Temporada("Verano 2026")

    // 2. Instanciar actividades (RA4.e)
    val ruta1 = RutaHistorica("Ruta Nocturna por el Pópulo", 90, 15.0, 20)
    val barco1 = PaseoEnBarco("Atardecer desde la Bahía", 120, 35.0, 25, "Catamarán")
    val gastro1 = RutaGastronomica("Tapeo Tradicional", 150, 45.0, 15)
    val ruta2 = RutaHistorica("Tour de la Caleta y Castillos", 100, 12.0, 22)

    // Añadir a la temporada
    temporadaCadiz.agregarActividad(ruta1)
    temporadaCadiz.agregarActividad(barco1)
    temporadaCadiz.agregarActividad(gastro1)
    temporadaCadiz.agregarActividad(ruta2)

    // 3. Mostrar ordenadas por precio
    println("📈 --- ACTIVIDADES ORDENADAS POR PRECIO ---")
    temporadaCadiz.listarActividades().forEach { println("• ${it.nombre} -> ${it.precio}€") }

    // 4. Buscar por subcadena
    println("\n🔍 --- BUSCANDO ACTIVIDADES QUE PASEN POR 'Caleta' ---")
    temporadaCadiz.buscarPorSubcadena("Caleta").forEach { println(" -> ${it.nombre}: ${it.descripcionDetallada()}") }

    // 5. Simular reservas y cancelaciones (RA4.i)
    println("\n🎫 --- SIMULANDO ACCIONES DE RESERVA ---")
    ruta1.reservar(5)  // Éxito
    ruta1.reservar(30) // Falla por superar el límite
    barco1.reservar(10) // Éxito
    barco1.cancelar()   // Libera 1 plaza del barco

    // =========================================================================
    // 📊 BLOQUE DE CÁLCULOS EFICIENTES (Puntos clave del examen)
    // =========================================================================
    println("\n=========================================================")
    println("📊 INFORME ESTADÍSTICO DE RENDIMIENTO")
    println("=========================================================")

    val todas = temporadaCadiz.obtenerTodas()

    // A) Total de actividades creadas
    println("1️⃣ Total de actividades en el sistema: ${todas.size}")

    // B) Porcentaje de actividades de cada tipo (Uso de 'is' para Smart Cast)
    val total = todas.size.toDouble()
    if (total > 0) {
        val countHistoricas = todas.count { it is RutaHistorica }
        val countBarco = todas.count { it is PaseoEnBarco }
        val countGastro = todas.count { it is RutaGastronomica }

        println("2️⃣ Distribución de la oferta turística:")
        println("   • Rutas Históricas: ${(countHistoricas / total) * 100}%")
        println("   • Paseos en Barco: ${(countBarco / total) * 100}%")
        println("   • Rutas Gastronómicas: ${(countGastro / total) * 100}%")
    }

    // C) Actividades que cuenten con alguna reserva de plazas
    // Accedemos a través de nuestra función getPlazasReservadas()
    println("3️⃣ Actividades con reservas activas actualmente:")
    todas.filter { it.getPlazasReservadas() > 0 }.forEach { println("   👉 ${it.nombre} (${it.getPlazasReservadas()} plazas vendidas)") }
    println("=========================================================")
}