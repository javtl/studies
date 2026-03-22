## 🐍 Lección 4: Sets, Tuplas, Diccionarios y Funciones

### 1. Tuplas `(a, b)` - Las Inmutables

Son como listas, pero **no se pueden modificar** una vez creadas. En Java, serían similares a un objeto constante o un Registro.

* **Uso:** Coordenadas, configuraciones fijas, o datos que no deben cambiar.
* **Ventaja:** Son más rápidas que las listas en memoria.

### 2. Sets `{a, b}` - Los Únicos

Son colecciones **no ordenadas** de elementos **únicos**.

* **Poder especial:** Eliminan duplicados automáticamente.
* **Uso:** Filtrar una lista de transacciones para ver qué monedas distintas tienes.

### 3. Diccionarios `{"clave": "valor"}` - El Corazón de Python

Almacenan datos en pares de Clave-Valor. Es el equivalente al `HashMap` de Java.

```python
cartera = {"moneda": "BTC", "cantidad": 0.5}
print(cartera["moneda"]) # Devuelve "BTC"

```

### 4. Funciones `def` - Reutilización

Para no repetir código, usamos `def`.

* **Sintaxis:** `def nombre_funcion(parametro):`.
* **Return:** En Python, una función puede devolver cualquier cosa (¡incluso múltiples valores a la vez!).

---

### **Día 4: Estructuras Avanzadas y Modularización**

"Un programador senior no escribe código largo, escribe funciones pequeñas que hacen cosas grandes."

**Ejercicios del día:**

1. **El Validador de Usuarios (Sets + Diccionarios):**
Imagina que tienes una lista de registros con correos duplicados: `["a@test.com", "b@test.com", "a@test.com", "c@test.com"]`.
* Crea una función llamada `limpiar_registros` que reciba esa lista.
* Dentro de la función, convierte la lista en un **Set** para eliminar duplicados.
* Devuelve el número de usuarios únicos.
* Fuera de la función, crea un **Diccionario** llamado `estadisticas` que guarde una clave `"total_unicos"` con el resultado obtenido e imprímelo.


2. **Calculadora de Impuestos Cripto (Funciones):**
* Crea una función llamada `calcular_impuestos` que reciba dos parámetros: `monto` y `porcentaje` (con un **valor por defecto** de 21).
* La función debe retornar el monto del impuesto calculado.
* Llama a la función dos veces: una pasando solo el monto (usará el 21%) y otra pasando el monto y un impuesto del 10%.
* Imprime ambos resultados con 2 decimales.



* **Tema principal:** Estructuras de Datos Pro y Funciones.
* **Subtema:** Sets, Dicts, Argumentos por defecto.
* **Estado:** Nuevo concepto / Integración lógica.
