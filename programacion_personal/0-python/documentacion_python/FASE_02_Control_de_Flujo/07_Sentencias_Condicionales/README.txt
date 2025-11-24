## FASE 2: Paso 5 - Sentencias Condicionales (`if`)

El siguiente punto en tu *Roadmap* se enfoca en el **Capítulo 4. Más herramientas para control de flujo**, comenzando con la toma de decisiones.

### Puntos Clave a Estudiar (Capítulo 4.1. La sentencia `if`)

Esta sección introduce cómo Python maneja la lógica de decisión, lo cual es vital para cualquier programa:

1.  **Estructuras de Control:** Python conoce las sentencias de control de flujo usuales que se esperan en otros lenguajes: **`if`**, **`for`**, **`while`** y **`range`**, aunque con algunos giros propios del lenguaje.
2.  **La Sentencia `if` (4.1):** Esta sentencia se utiliza para la ejecución condicional, permitiendo que el programa ejecute bloques de código basados en si una condición es verdadera o falsa.
3.  **Indentation (Indentación):** La indentación es crucial en Python. A diferencia de otros lenguajes que usan llaves (`{}`), Python usa la indentación (espacios o tabulaciones) para definir el bloque de código que pertenece a la sentencia `if`, `else` o `elif` (else if).

### Ejercicio Práctico

Para practicar la sentencia `if`, integraremos los números que aprendiste en la Fase 1. Utiliza el modo interactivo del intérprete para construir una pequeña lógica que determine la condición de una persona según su edad:

1.  **Define una variable** llamada `edad` y asígnale un valor entero.
2.  **Escribe un bloque `if`** para verificar lo siguiente:
    *   Si la `edad` es menor que 13, imprime: "Eres un niño."
    *   Si la `edad` es mayor o igual que 13, pero menor que 18, imprime: "Eres un adolescente." (Usa `elif` para esta condición).
    *   Si no se cumple ninguna de las anteriores (es 18 o mayor), imprime: "Eres un adulto." (Usa `else`).

Al completar este ejercicio, habrás practicado el uso de la sentencia **`if`** y su estructura de indentación fundamental, y podremos avanzar a la sentencia **`for`** (4.2), el siguiente punto en el control de flujo.