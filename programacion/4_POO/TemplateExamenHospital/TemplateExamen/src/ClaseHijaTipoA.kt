/*SubclasesHijas.kt (Especializaciones del Molde)
[RA7.c] Muestra cómo se heredan los constructores sin duplicar variables y cómo se añade un atributo exclusivo por cada tipo de hijo.*/


class ClaseHijaTipoA(
    idUnico: String,               // Parámetro heredado: SIN val ni var
    nombreIdentificador: String,   // Parámetro heredado: SIN val ni var
    prop1: Int,                    // Parámetro heredado: SIN val ni var
    prop2: Double,                 // Parámetro heredado: SIN val ni var
    prop3: Int,                    // Parámetro heredado: SIN val ni var
    val propiedadExclusivaA: Boolean // Atributo PROPIO y único de este hijo: SÍ LLEVA val
) : SuperclaseBase(idUnico, nombreIdentificador, prop1, prop2, prop3) { // Envío de datos al constructor de la madre

    // [RA7.d] Sobrescribir obligatoriamente el método abstracto de la madre
    override fun generarCadenaInformativaEspecifica(): String {
        val estadoTexto = if (propiedaxExclusivaA) "Activo/SÍ" else "Inactivo/NO"
        return "Especificación Tipo A para $nombreIdentificador. Estado exclusivo: $estadoTexto."
    }

    override fun toString(): String {
        return super.toString() + " | [Subclase A - Atributo: $propiedadExclusivaA]"
    }
}