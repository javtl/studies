## **Sesión de Estudio de Python - Día 1**

### **Índice**

- [**Repaso de Fundamentos**](#repaso-de-fundamentos)
  - [Ejercicio: Variables y Tipos de Datos](#ejercicio-variables-y-tipos-de-datos)
  - [Ejercicio: Manejo de Cadenas (Strings)](#ejercicio-manejo-de-cadenas-strings)
- [**Ejercicio 1: Traducción de Pseudocódigo a Python**](#ejercicio-1-traduccion-de-pseudocodigo-a-python)
  - [Clase de Código: `ComparadorNumeros`](./ejercicios-repaso/comparador_numeros.py)
- [**Ejercicio 2: Uso de If/Elif/Else**](#ejercicio-2-uso-de-ifelifelse)
  - [Clase de Código: `RelacionNumeros`](./ejercicios-repaso/relacion_numeros.py)
- [**Ejercicio 3: Manipulación de Listas y Diccionarios**](#ejercicio-3-manipulacion-de-listas-y-diccionarios)
  - [Clase de Código: `BuscadorPersonas`](./ejercicios-repaso/buscador_personas.py)

---

### **Repaso de Fundamentos**

Hoy hemos repasado los conceptos básicos de **pseudocódigo** y su traducción a **Python**. Los puntos clave fueron las **variables**, los **operadores** y las **estructuras de control condicionales**.

| Tema              | Descripción                                                                              |
| :---------------- | :--------------------------------------------------------------------------------------- |
| **Variables**     | Contenedores de información con tipos de datos implícitos (cadenas, números, booleanos). |
| **Operadores**    | Símbolos para realizar operaciones (`+`, `*`, `==`, `>`, `and`).                         |
| **Condicionales** | Estructuras que permiten al programa tomar decisiones (`if`, `elif`, `else`).            |

---

### **Ejercicio: Variables y Tipos de Datos**

**Objetivo:** Practicar la creación de variables y entender los tipos de datos básicos en Python.

**Ejemplo Práctico:**

```python
# Crear variables de distintos tipos
nombre = "Nombre"        # String
edad = 20                # Entero
altura = 1.50            # Float
estudiante = True        # Booleano

# Mostrar la información
print("Nombre:", nombre)
print("Edad:", edad)
print("Altura:", altura)
print("¿Es estudiante?", estudiante)

# Operaciones con variables
edad_futura = edad + 5
print("Dentro de 5 años tendrás:", edad_futura, "años")
```

**Explicación rápida:**

- `nombre` → texto (`str`)
- `edad` → número entero (`int`)
- `altura` → número decimal (`float`)
- `estudiante` → verdadero/falso (`bool`)

---

### **Ejercicio: Manejo de Cadenas (Strings)**

**Objetivo:** Practicar operaciones básicas con cadenas de texto en Python.

**Ejemplo Práctico:**

```python
# Crear cadenas
saludo = "Hola"
nombre = "Javier"

# Concatenar cadenas
mensaje = saludo + " " + nombre + "!"
print(mensaje)  # Hola Javier!

# Longitud de una cadena
print("La longitud de tu nombre es:", len(nombre))

# Convertir a mayúsculas o minúsculas
print(nombre.upper())  # JAVIER
print(nombre.lower())  # javier

# Comprobar si una palabra está en la cadena
frase = "Python es divertido"
if "Python" in frase:
    print("¡Python está en la frase!")
```

**Explicación rápida:**

- Concatenación: unir varias cadenas con `+`
- `len()` → obtiene la longitud de la cadena
- `.upper()` / `.lower()` → cambiar mayúsculas y minúsculas
- `"texto" in cadena` → comprobar si un texto está dentro de otra cadena

---

### **Ejercicio 1: Traducción de Pseudocódigo a Python**

**Objetivo:** Traducir un algoritmo en pseudocódigo para comparar dos números a código Python.

**Solución Resuelta:**

```python
#-------------------- Clase de Código: `ComparadorNumeros` --------------------
# Archivo: ejercicios-repaso/comparador_numeros.py

def comparar_numeros():
    """Compara dos números ingresados por el usuario y determina cuál es mayor."""
    num1 = int(input("Introduce el primer número: "))
    num2 = int(input("Introduce el segundo número: "))

    if num1 > num2:
        print(f"{num1} es mayor que {num2}")
    else:
        print(f"{num2} es mayor que {num1}")

```

### **Ejercicio 2: Uso de If/Elif/Else**

Objetivo: Determinar la relación entre dos números usando la estructura if/elif/else.
#-------------------- Clase de Código: `RelacionNumeros` --------------------

# Archivo: ejercicios-repaso/relacion_numeros.py

```python
def determinar_relacion():
    """Determina si dos números son iguales, o si uno es mayor que el otro."""
    num1 = int(input("Introduce el primer número: "))
    num2 = int(input("Introduce el segundo número: "))

    if num1 == num2:
        print(f"El número {num1} es igual al número {num2}")
    elif num1 > num2:
        print(f"{num1} es mayor que {num2}")
    else:
        print(f"{num2} es mayor que {num1}")

```

### **Ejercicio 3: Manipulación de Listas y Diccionarios**

Objetivo: Crear un programa que almacene datos de personas en una lista de diccionarios, busque a un individuo y muestre sus detalles.
#-------------------- Clase de Código: `BuscadorPersonas` --------------------

# Archivo: ejercicios-repaso/buscador_personas.py

```python
def buscar_persona():
    """Busca una persona en una lista de diccionarios y muestra sus datos."""
    personas = [
        {"nombre": "Ana", "edad": 25, "ciudad": "Madrid"},
        {"nombre": "Luis", "edad": 30, "ciudad": "Barcelona"},
        {"nombre": "María", "edad": 22, "ciudad": "Sevilla"}
    ]

    nombre_buscado = input("Ingresa el nombre de la persona que quieres buscar: ")
    encontrado = False

    for persona in personas:
        if persona["nombre"].lower() == nombre_buscado.lower():
            print("\nPersona encontrada:")
            print(f"Nombre: {persona['nombre']}, Edad: {persona['edad']}, Ciudad: {persona['ciudad']}")
            encontrado = True
            break

    if not encontrado:
        print("\nNo se ha encontrado ninguna persona con ese nombre.")

```
