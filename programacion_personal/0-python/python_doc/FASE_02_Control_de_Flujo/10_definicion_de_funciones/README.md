Este es un punto crucial en la Fase 2 del aprendizaje, ya que entramos en la modularización y la reutilización de código a través de las funciones.

El **Punto P10: Definición de Funciones (Básico)** aborda la sección 4.8 del tutorial de Python, y su objetivo clave es:

### La Definición de Funciones como Núcleo de la Programación Extensible

Es fundamental entender que **la definición de funciones es el núcleo de la programación extensible**.

Las funciones son esenciales para la extensibilidad del lenguaje por varias razones, según se detalla en las fuentes:

1.  **Modularidad y Reutilización:** Las funciones permiten agrupar bloques de código que realizan tareas específicas, haciendo que el programa sea más manejable y fácil de modificar.
2.  **Extensión del Intérprete:** El intérprete de Python es fácilmente **extensible con funciones y tipos de datos implementados en C o C++** (o en otros lenguajes que permitan ser llamados desde C).
3.  **Aplicaciones Modificables:** Python es un lenguaje apropiado para **extender aplicaciones modificables**.

### Contexto Adicional sobre Funciones

Aunque el P10 cubre la definición básica (4.8), la documentación inmediatamente pasa a **Más sobre definición de funciones** (4.9). En este contexto más amplio, la documentación de Python explica que se permiten:

*   Argumentos obligatorios y opcionales.
*   Argumentos de palabra clave.
*   Listas de argumentos arbitrarios.

Estos aspectos avanzados se estudian en detalle en el **Punto P11**, e incluyen conceptos como **Argumentos con valores por omisión**, **Palabras claves como argumentos**, y el uso de **Parámetros especiales** (ya sean posicionales o de palabras clave).

### Ejemplo de Definición de Funciones

Para ilustrar el concepto básico de la definición de funciones, se utiliza la palabra clave `def`, tal como se muestra en este ejemplo de la serie de Fibonacci, que define la función `fib(n)`:

```python
# Python 3: Serie de Fibonacci hasta n
>>> def fib(n): 
>>> a, b = 0, 1 
>>> while a < n: 
>>> print(a, end=' ') 
>>> a, b = b, a+b 
>>> print() 
>>> fib(1000)  
0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987
```

### Ejemplo Adicional de Definición de Funciones (P10)
El ejemplo anterior (fib) mostraba una función que imprimía resultados. Este nuevo ejemplo (calcula_area) mostrará una función que devuelve un valor, un patrón de uso muy común:

# Python 3: Función para calcular el área de un rectángulo
```python
def calcula_area(base, altura):
    """Calcula y devuelve el área de un rectángulo."""
    area = base * altura
    return area

# Uso de la función
area1 = calcula_area(10, 5)
print(f"El área calculada es: {area1}") 
# Salida: El área calculada es: 50
```

Este ejemplo cumple con el principio de encapsular una lógica específica, lo que refuerza por qué las funciones son esenciales para la programación extensible
.
#### Ejercicios de Práctica Basados en la Documentación
> El método de práctica más recomendado por la documentación es tener el intérprete de Python a mano para una experiencia práctica
> , ya que el tutorial está diseñado para ser seguido interactivamente.
> Para practicar la definición de funciones (P10) y prepararte para el siguiente punto (P11: Más sobre definición de funciones
> ), puedes enfocarte en la experimentación con argumentos:

**1. Práctica de Funciones de Retorno Básico**
Objetivo: Crear una función simple que tome uno o más argumentos y use la sentencia return para devolver un resultado, en lugar de imprimirlo directamente.
• Ejercicio 1 (Conversión): Define una función llamada convertir_a_mayusculas(texto) que acepte una cadena de texto y devuelva la misma cadena, pero toda en mayúsculas.
• Ejercicio 2 (Aritmética): Define una función llamada potencia_cubica(numero) que devuelva el cubo del número ingresado.

**2. Práctica de la Progresión del Tutorial (Preparación para P11)**
El siguiente paso en la ruta de aprendizaje (P11) cubre Más sobre definición de funciones (Sección 4.9)
, que incluye el manejo avanzado de argumentos
. La práctica más efectiva es experimentar con estos nuevos tipos de argumentos en el intérprete, ya que el tutorial introduce características como:
• Argumentos con valores por omisión (4.9.1): Define una función donde uno de los parámetros tiene un valor preestablecido.
• Palabras claves como argumentos (4.9.2): Llama a una función usando palabras clave para asignar valores a los parámetros en un orden arbitrario
.

Ejemplo de Práctica Avanzada (Basado en 4.9.1):
Define la función saludar(nombre, saludo='Hola').

# Define la función con un argumento por omisión:
def saludar(nombre, saludo='Hola'):
    print(f"{saludo}, {nombre}!")

# Llama a la función usando el valor por omisión
saludar("Mundo") 
# Llama a la función sobrescribiendo el valor por omisión
saludar("Mundo", saludo='Adiós')
