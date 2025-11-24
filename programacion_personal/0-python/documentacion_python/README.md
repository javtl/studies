# 🐍 Ruta de Aprendizaje Python 3.13.8 (Documentación Oficial)

Este repositorio documenta mi progreso en el aprendizaje del lenguaje **Python 3.13.8**, siguiendo estrictamente el **Tutorial de Python de la Documentación Oficial** [1]. El objetivo es dominar los fundamentos de Python antes de la transición a Kotlin.

Cada fase del roadmap corresponde a una carpeta principal, y cada punto de estudio es una subcarpeta que contiene los apuntes (`.md`) generados para ese tema.

---

## ⚠️ Advertencia Fundamental de la Documentación

Es **crucial** recordar que *El tutorial de Python* está diseñado para **programadores** que ya conocen los conceptos de programación y son nuevos *solo en Python* [2].

> Si eres nuevo en programación, la documentación sugiere comenzar con la **Guía para principiantes** [4].

---

## 🗺️ Roadmap Detallado

El plan se divide en 5 Fases, cubriendo los capítulos principales del tutorial:

### FASE 1: Configuración y Tipos de Datos Simples (Capítulos 1, 2, 3)
Esta fase se centra en la instalación, el modo interactivo y los tipos de datos fundamentales (Números, Texto, Listas introductorias).

| Punto | Tema | Sección Doc | Objetivo Clave |
| :--- | :--- | :--- | :--- |
| **P1** | Configuración y Uso | `1. Python setup and usage` | Aprender Cómo instalar, configurar y usar Python [1]. |
| **P2** | Introducción General | `2. Abriendo el apetito` | Vistazo general al lenguaje: sintaxis elegante y tipado dinámico [2]. |
| **P3** | Interacción con el Sistema | `3. Usando el intérprete de Python` | Aprender a Invocar el intérprete y usar el **Modo interactivo** [3]. |
| **P4** | Números y Aritmética | `3.1.1. Números` | Uso de Python como calculadora. Entender `/` (float) y `//` (piso) [8]. |
| **P5** | Texto y Listas Introductorias | `3.1.2. Texto` y `3.1.3. Listas` | Comprender las cadenas de texto y la introducción a las **Listas** [8, 9]. |
| **P6** | Primeros pasos | `3.2. Primeros pasos hacia la programación` | Aplicación inicial de la sintaxis básica [3]. |

***

### FASE 2: Control de Flujo y Funciones (Capítulo 4)
Se profundiza en la lógica de ejecución, bucles y la creación de funciones reutilizables.

| Punto | Tema | Sección Doc | Objetivo Clave |
| :--- | :--- | :--- | :--- |
| **P7** | Sentencias Condicionales | `4.1. La sentencia if` | Aprender el flujo de control condicional [9]. |
| **P8** | Bucles Iterativos | `4.2. La sentencia for` y `4.3. La función range()` | Uso del bucle `for` y la función `range()`, junto con cláusulas `else` [7]. |
| **P9** | Control de Bucles y Lógica | `4.4. break and continue`, `4.6. pass`, `4.7. match` | Implementar lógica de interrupción y continuación dentro de los ciclos [7]. |
| **P10** | Definición de Funciones (Básico) | `4.8. Definir funciones` | Entender que la definición de funciones es el núcleo de la programación extensible [7, 10]. |
| **P11** | Argumentos de Funciones (Avanzado) | `4.9. Más sobre definición de funciones` | Estudiar Argumentos por omisión, Palabras claves y Parámetros especiales [7]. |
| **P12** | Funciones Anónimas y Doc. | `4.9.6. Expresiones lambda` y `4.9.7. Docstrings` | Introducción a **funciones anónimas** y la importancia de las **Docstrings** [7]. |

***

### FASE 3: Estructuras de Datos Compuestas (Capítulo 5)
Enfoque en las estructuras que agrupan datos: Listas avanzadas, Tuplas, Conjuntos y Diccionarios.

| Punto | Tema | Sección Doc | Objetivo Clave |
| :--- | :--- | :--- | :--- |
| **P13** | Listas Avanzadas | `5.1. Más sobre listas` | Uso de listas como pilas/colas y dominio de **List Comprehensions** [7, 10]. |
| **P14** | Manipulación y Eliminación | `5.2. La instrucción del` | Aprender a eliminar elementos o porciones de la lista [7]. |
| **P15** | Secuencias y Conjuntos | `5.3. Tuplas y secuencias` y `5.4. Conjuntos` | Dominar las **Tuplas** (inmutables) y los **Conjuntos** (sin duplicados) [7]. |
| **P16** | Diccionarios | `5.5. Diccionarios` | Estudio de los mapeos clave-valor para almacenar datos estructurados [7]. |
| **P17** | Técnicas de Iteración | `5.6. Técnicas de iteración` y `5.8. Comparando secuencias` | Aprender formas eficientes de recorrer las estructuras de datos [7]. |

***

### FASE 4: Modularidad, I/O y Manejo de Errores (Capítulos 6, 7, 8)
Exploración de cómo hacer el código reutilizable, cómo interactuar con el sistema de archivos y cómo gestionar fallos.

| Punto | Tema | Sección Doc | Objetivo Clave |
| :--- | :--- | :--- | :--- |
| **P18** | Módulos y Reutilización | `6. Módulos` | Organizar el código, incluyendo Ejecutar módulos como scripts y Paquetes [7]. |
| **P19** | Entrada y Salida (I/O) | `7. Entrada y salida` | Práctica de Formateo de salida, lectura/escritura de archivos y uso de `json` [7]. |
| **P20** | Gestión de Errores | `8. Errores y excepciones` | Entender Errores de sintaxis y Gestionar excepciones con `try...except` [7]. |
| **P21** | Acciones de Limpieza | `8.7. Definiendo acciones de limpieza` | Uso de la cláusula `finally` para asegurar la ejecución de código de limpieza [7]. |

***

### FASE 5: Programación Orientada a Objetos (Capítulo 9)
Introducción al paradigma POO en Python.

| Punto | Tema | Sección Doc | Objetivo Clave |
| :--- | :--- | :--- | :--- |
| **P22** | Introducción a Clases | `9.3. Un primer vistazo a las clases` | Aprender Sintaxis de definición, Objetos clase, instancia y método [7]. |
| **P23** | Herencia | `9.5. Herencia` | Entender cómo las clases heredan atributos y métodos [7]. |
| **P24** | Iteradores y Generadores | `9.8. Iteradores` y `9.9. Generadores` | Introducción a conceptos avanzados para la creación eficiente de secuencias de datos [7]. |

---

## 🔗 Referencias de la Documentación Oficial (Python 3.13)

1.  **Documentación Oficial Python 3.13:** `https://docs.python.org/3.13/`
2.  **El tutorial de Python (Introducción):** `https://docs.python.org/3.13/tutorial/index.html`
3.  **Usando el intérprete (Modo Interactivo):** `https://docs.python.org/3.13/tutorial/interpreter.html`
4.  **Guía para principiantes:** `https://docs.python.org/3.13/faq/general.html#why-is-python-s-syntax-so-different-from-other-languages` (Se enlaza al FAQ general, punto de partida recomendado para novatos).
5.  **Guía para principiantes (contin.):** `https://docs.python.org/3.13/tutorial/introduction.html` (Sección "What is Python?")
6.  **Guía para principiantes (contin.):** (Referencia a la guía general)
7.  **Referencia de secciones del tutorial (Punto de referencia general en el texto):** `https://docs.python.org/3.13/tutorial/controlflow.html` (Referencia común para Control de Flujo)
8.  **Números y Aritmética:** `https://docs.python.org/3.13/tutorial/introduction.html#numbers`
9.  **Texto y Listas:** `https://docs.python.org/3.13/tutorial/introduction.html#strings-and-text`
10. **Funciones y List Comprehensions:** `https://docs.python.org/3.13/tutorial/controlflow.html#defining-functions` y `https://docs.python.org/3.13/tutorial/datastructures.html#list-comprehensions`
11. **Próximos pasos:** `https://docs.python.org/3.13/library/index.html` (La biblioteca estándar)


