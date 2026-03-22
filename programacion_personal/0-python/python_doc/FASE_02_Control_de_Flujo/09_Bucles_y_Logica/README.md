## FASE 2: Paso 9 - Control de Bucles y Lógica

### Puntos Clave a Estudiar (Capítulo 4.4, 4.6, 4.7)

Esta sección cubre tres sentencias importantes para controlar el flujo de ejecución, que forman parte de **4. Más herramientas para control de flujo**:

1.  **`break` and `continue` Statements (4.4):**
    *   Estos se utilizan para **implementar lógica de interrupción y continuación dentro de los ciclos**.
    *   La sentencia `break` termina la ejecución del bucle más cercano que la contiene (ya sea `for` o `while`).
    *   La sentencia `continue` hace que la ejecución salte a la siguiente iteración del bucle, omitiendo cualquier código restante dentro del cuerpo del bucle.

2.  **La sentencia `pass` (4.6):**
    *   Esta sentencia no hace nada.
    *   Se utiliza a menudo como un marcador (*placeholder*) cuando la sintaxis requiere una sentencia, pero el programador no desea ejecutar ninguna acción o el código aún no se ha escrito.

3.  **La sentencia `match` (4.7):**
    *   Esta sentencia introduce la **concordancia de patrones estructurales** (*structural pattern matching*) en Python.
    *   Es comparable a las sentencias `switch` en otros lenguajes, permitiendo comparar un valor con una secuencia de patrones.

### Ejemplo de Código (`break` y `continue`)

Como refuerzo para comprender mejor las interrupciones en el flujo, veamos un ejemplo de uso de `break` y `continue` dentro de un bucle que busca divisores:

```python
# Uso de break: Terminar la búsqueda
for n in range(2, 10):
    for x in range(2, n):
        if n % x == 0:
            print(f"{n} es igual a {x} * {n//x}")
            # break termina este bucle 'for' interno
            break
    else:
        # El bloque else del for se ejecuta si el break no fue llamado.
        # En este caso, si el número no tiene divisores, es primo.
        print(f"{n} es un número primo")

# Uso de continue: Saltar la iteración
for num in range(2, 10):
    if num % 2 == 0:
        # continue salta el resto del código y va a la siguiente iteración
        continue
    print(f"Encontrado un número impar: {num}")
```

### Ejercicio Práctico

Utiliza el intérprete de Python para practicar las sentencias de control:

1.  **Uso de `break`:** Escribe un bucle `for` que itere a través de una lista de nombres. Si encuentras el nombre "Carlos", imprime "¡Carlos encontrado!" y detén la ejecución del bucle inmediatamente usando `break`.
2.  **Uso de `continue`:** Escribe un bucle `for` que itere del 1 al 10. Usa la sentencia `continue` para saltarte la impresión del número 5, pero imprime todos los demás.
3.  **Uso de `pass`:** Escribe una función sencilla llamada `futura_implementacion(x)` que actualmente solo contenga la sentencia `pass`. Llama a la función para confirmar que no produce errores.

Una vez que domines estos conceptos de control de bucles, pasaremos al **Punto 10: Definición de Funciones (4.8)**, que es el **núcleo de la programación extensible**.