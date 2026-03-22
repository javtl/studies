### 🔹 P11. Argumentos de Funciones (Avanzado)

**1️⃣ Explicación (simple):**

El punto P11 se enfoca en la sección **4.9. Más sobre definición de funciones**, que complementa la definición básica de funciones (P10). El objetivo principal es estudiar la flexibilidad avanzada que Python ofrece en el manejo de parámetros de función. Esto incluye:

1.  **Argumentos con valores por omisión (4.9.1):** Permiten que algunos parámetros sean opcionales.
2.  **Palabras claves como argumentos (4.9.2):** Permiten pasar argumentos identificándolos por su nombre, haciendo el orden de la llamada flexible.
3.  **Parámetros especiales (4.9.3):** Que imponen restricciones sobre cómo se debe llamar un argumento (solo por posición o solo por palabra clave).

La definición de funciones es el **núcleo de la programación extensible** en Python.

**2️⃣ Ejemplo en palabras:**

Imagine un sistema de reportes financieros. La función que genera el reporte (`generar_reporte`) debe tener obligatoriamente el `rango_fechas` y el `tipo_datos`. Sin embargo, puede tener parámetros opcionales con valores por omisión, como el `formato` ("PDF"). Si el usuario quiere cambiar el formato, lo puede especificar usando la palabra clave, por ejemplo: `formato="Excel"`. La sintaxis flexible de Python permite argumentos obligatorios, opcionales, y argumentos de palabra clave.

**3️⃣ Código de ejemplo (Python):**

```python
# 4.9.1. Argumentos con valores por omisión
def registrar_evento(mensaje, nivel="INFO", usuario="Sistema"):
    # 'nivel' y 'usuario' usarán los valores por omisión si no se pasan
    print(f"[{nivel}] Usuario: {usuario} | Mensaje: {mensaje}")

# Uso 1: Usando valores por omisión
registrar_evento("Servidor iniciado") 
# Resultado: [INFO] Usuario: Sistema | Mensaje: Servidor iniciado

# Uso 2: Usando palabras claves como argumentos (4.9.2)
# Se especifica el 'nivel' y el 'usuario', permitiendo un orden diferente o solo modificando opcionales.
registrar_evento(usuario="Admin", nivel="ERROR", mensaje="Fallo de conexión")
# Resultado: [ERROR] Usuario: Admin | Mensaje: Fallo de conexión
```

**4️⃣ Ejercicio resuelto (paso a paso):**

*   Enunciado: Crea una función `ajustar_brillo` que reciba una `imagen` y un `valor_ajuste`. El `valor_ajuste` debe tener un valor por omisión de 10. Llama a la función usando la palabra clave `valor_ajuste` para establecerlo en 50.

*   Paso 1: Definir la función con el valor por omisión.

    ```python
    def ajustar_brillo(imagen, valor_ajuste=10):
        print(f"Procesando imagen: {imagen}")
        print(f"Brillo ajustado en: {valor_ajuste}")
    ```

*   Paso 2: Llamada 1 (Usando el valor por omisión).

    ```python
    ajustar_brillo("paisaje.jpg")
    # Resultado: Brillo ajustado en: 10
    ```

*   Paso 3: Llamada 2 (Usando palabra clave para sobrescribir el valor por omisión).

    ```python
    ajustar_brillo("paisaje.jpg", valor_ajuste=50)
    # Resultado: Brillo ajustado en: 50
    ```

**5️⃣ Ejercicios propuestos:**

*   Fácil: Crea una función `calcular_area(ancho, alto=5)` que use un valor por omisión para la altura. Llama a la función de dos formas: a) omitiendo la altura, b) especificando la altura de 15 utilizando la palabra clave `alto=` (4.9.2).

*   Intermedio: Investiga la sintaxis de **Parámetros únicamente posicionales** (4.9.3.2) y **Argumentos únicamente de palabras clave** (4.9.3.3). Diseña una función `procesar_datos(a, b, /, *, c, d)` y comprueba qué sucede si intentas pasar `a` o `b` usando la sintaxis de palabra clave, o si intentas pasar `c` o `d` sin usar la sintaxis de palabra clave.
```