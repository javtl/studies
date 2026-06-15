class ClaseHijaTipoB(
    idUnico: String,
    nombreIdentificador: String,
    prop1: Int,
    prop2: Double,
    prop3: Int,
    // Atributo PROPIO: Una lista de Strings inicializada por defecto
    val listaDatosExclusivosB: List<String> = listOf("ElementoAlfa", "ElementoBeta")
) : SuperclaseBase(idUnico, nombreIdentificador, prop1, prop2, datoFiltroMaximoInicial = prop3) {

    override fun generarCadenaInformativaEspecifica(): String {
        return "Especificación Tipo B para $nombreIdentificador. Datos indexados: ${listaDatosExclusivosB.joinToString(", ")}."
    }

    override fun toString(): String {
        return super.toString() + " | [Subclase B - Tamaño Lista: ${listaDatosExclusivosB.size}]"
    }
}