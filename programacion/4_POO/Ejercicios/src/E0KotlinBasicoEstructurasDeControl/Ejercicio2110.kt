/**
 * EJERCICIO: Configurador de Pizzas
 * Conceptos: Listas de solo lectura, validación de opciones y concatenación.
 */

fun main() {
    // 1. Definición de Catálogos (Ingredientes base ya incluidos)
    val ingredientesVegetarianos = listOf("Pimiento", "Tofu")
    val ingredientesNoVegetarianos = listOf("Pepperoni", "Jamón", "Salmón")

    println("--- BIENVENIDO A BELLA NAPOLI ---")
    print("¿Desea una pizza vegetariana? (S/N): ")
    val esVegetarianaInput = readlnOrNull()?.trim()?.uppercase() ?: "N"

    // 2. Selección del set de ingredientes según la elección
    val esVegetariana = (esVegetarianaInput == "S")
    val catalogoDisponible = if (esVegetariana) ingredientesVegetarianos else ingredientesNoVegetarianos

    // 3. Mostrar menú dinámico
    println("\nIngredientes disponibles para su elección:")
    catalogoDisponible.forEachIndexed { index, nombre ->
        println("${index + 1}. $nombre")
    }

    print("\nSeleccione el número del ingrediente extra: ")
    val seleccion = readlnOrNull()?.toIntOrNull()?.minus(1) ?: -1

    // 4. Validación de la selección y Output Final
    if (seleccion in catalogoDisponible.indices) {
        val ingredienteElegido = catalogoDisponible[seleccion]
        val tipoPizza = if (esVegetariana) "Vegetariana" else "No Vegetariana"

        println("\n--- RESUMEN DE SU PEDIDO ---")
        println("Tipo de pizza: $tipoPizza")
        println("Ingredientes: Tomate, Mozzarella y $ingredienteElegido.")
        println("----------------------------")
    } else {
        println("\n❌ Error: Selección de ingrediente no válida.")
    }
}