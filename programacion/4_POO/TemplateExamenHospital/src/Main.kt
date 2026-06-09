fun Main() {
    // 1. Instanciar la clase gestora
    val clinicaSalud = GestionClinica("Hospital General Clínico 2026")

    // 2. [RA4.e] Crear objetos reales utilizando las subclases
    val medico1 = Medico("MED-01", "Dra. Amelia", 15, 85.0, 4, esEspecialista = true)
    val medico2 = Medico("MED-02", "Dr. Lucas", 2, 45.0, 12, esEspecialista = false) // Ajustará guardias a 10
    val enfermero1 = Enfermero("ENF-01", "Enfermero Juan", 5, 30.0, 3)

    // Guardar en la estructura de la clínica
    clinicaSalud.contratarPersonal(medico1)
    clinicaSalud.contratarPersonal(medico2)
    clinicaSalud.contratarPersonal(enfermero1)

    // 3. [RA6.c, d] Recorrer y mostrar la colección de forma ordenada
    println("\n📋 --- PLANTILLA MÉDICA ORDENADA POR SUELDO ---")
    val listaSueldos = clinicaSalud.obtenerPlantillaOrdenadaPorSueldo()
    for (empleado in listaSueldos) { // Recorrido clásico (RA6.d)
        println("• ${empleado.nombre} (Cód: ${empleado.codigoEmpleado}) -> Base: ${empleado.sueldoBase}€ (Guardias mensuales: ${empleado.numeroGuardiasMensuales})")
    }

    // 4. Búsqueda por subcadena de texto
    val busqueda = "Urgencias"
    println("\n🔍 --- BÚSQUEDA DE PERSONAL EN SECTOR: '$busqueda' ---")
    clinicaSalud.buscarPorPalabraClave(busqueda).forEach {
        println("Resultado -> Nombre: ${it.nombre} | Rol: ${it.generarInformeRol()}")
    }

    // 5. Simular ejecuciones de la interfaz Atendible (RA4.i)
    println("\n🎫 --- SIMULACIÓN DE TURNOS Y GUARDIAS (INTERFAZ) ---")
    medico1.registrarIngreso("Quirófano A") // Éxito
    medico1.registrarIngreso("Planta 1")     // Denegado (Ya está ocupado)
    medico1.darAltaMedica()                  // Éxito

    enfermero1.registrarIngreso("Caja de Urgencias") // Se queda en guardia activa


    // =========================================================================
    // [RA6] OPERADORES FUNCIONALES AVANZADOS (Estadísticas clónicas para el examen)
    // =========================================================================
    println("\n=========================================================")
    println("📊 CUADRO DE MANDOS CLÍNICO FINAL")
    println("=========================================================")

    val datosHospital = clinicaSalud.obtenerTodaLaPlantilla()

    // Cálculo A: Total de registros mediante la variable ESTATICA [RA4.h]
    println("1️⃣ Total de contratos físicos registrados en memoria: ${PersonalHospital.totalPersonalActivo}")

    // Cálculo B: Filtrar elementos por condición de estado interno
    val personalEnAccion = datosHospital.filter { it.consultarDisponibilidad() }
    println("2️⃣ Personal sanitario actualmente en guardia activa:")
    if (personalEnAccion.isEmpty()) {
        println("   Calma total: No hay guardias activas en este momento.")
    } else {
        personalEnAccion.forEach { println("   🚨 ${it.nombre} [Código: ${it.codigoEmpleado}]") }
    }

    // Cálculo C: Porcentaje exacto utilizando 'is' para Smart Cast
    val totalContratos = datosHospital.size.toDouble()
    if (totalContratos > 0) {
        val totalMedicos = datosHospital.count { it is Medico }
        val totalEnfermeros = datosHospital.count { it is Enfermero }

        println("3️⃣ Reparto de especialidades de la plantilla:")
        println("   • Área Médica (Facultativos): ${(totalMedicos / totalContratos) * 100}%")
        println("   • Área Cuidados (Enfermería): ${(totalEnfermeros / totalContratos) * 100}%")
    }
    println("=========================================================")
}