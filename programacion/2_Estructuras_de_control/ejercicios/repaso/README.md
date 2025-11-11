# Repaso — Tema 2 (Estructuras de control) y Funciones

## Contenido del directorio `repaso/`

Archivos en esta carpeta (11 ejercicios de repaso):

- `00_funcion_ejemplo_basico.py`
- `01_funcion_saludo.py`
- `02_funcion_area.py`
- `03_ejercicio1_esPar.py`
- `04_ejercicio2_saludo.py`
- `05_ejercicio_repaso_2_1_calculo_decibelios.py`
- `06_ejercicio_repaso_2_2_saludar_persona.py`
- `07_ejercicio_repaso_2_3_invocar_funcion.py`
- `08_ejercicio_repaso_2_4_uso_return.py`
- `09_ejercicio_repaso_2_5_parametros_opcionales.py`
- `10_ejercicio_repaso_2_6_contador.py`

## Resumen de lo estudiado hoy

### Tema 2 — Estructuras de Control

- Condicionales: repaso de expresiones booleanas, operadores lógicos y las sentencias `if`, `if-else` y `elif`. Vimos también condicionales anidadas y la evaluación en cortocircuito.
- Iterativas: repasé el uso de `while` y `for`, y cómo controlar bucles con `break` y `continue`. Practiqué patrones comunes como contadores, sumas acumuladas y búsqueda de máximos/mínimos.

### Funciones

- Concepto y ventajas: modularizar para mejorar legibilidad y reutilización.
- Sintaxis básica: `def`, parámetros, docstrings y `return`.
- Parámetros opcionales con valores por defecto.
- Ámbito de variables: diferencias entre variables locales y globales y cuándo usar `global`.

## Notas y puntos clave

- El PDF `1_Tema_2_Estructuras_de_Control.pdf` agrupa ejercicios prácticos relevantes: la Práctica 2.1 contiene 10 ejercicios y la Práctica 2.2 contiene 25 ejercicios (más 2 actividades). Es una buena fuente para practicar lo visto en clase.
- Al diseñar soluciones, sigo la estrategia de modularización: entender entradas/salidas, dividir en subtareas, escribir pseudocódigo e identificar funciones auxiliares y principales.

## Ejemplos orientativos (muy breves)

- Cálculo de decibelios (función que devuelve el resultado):

```python
import math

def calcular_decibelios(senal, ruido):
    """Devuelve decibelios para la relación señal/ruido."""
    return 10 * math.log10(senal / ruido)

# Uso: valor = calcular_decibelios(9, 10)
```

- Saludo simple con docstring:

```python
def saludar_persona(nombre):
    """Imprime un saludo personalizado."""
    print(f"Hola, {nombre}!")

# Uso: saludar_persona('Carlos')
```

## Relación entre archivos y conceptos

- `00_*.py` a `02_*.py`: ejemplos y funciones básicas (saludos, cálculo de áreas).
- `03_*.py` a `10_*.py`: ejercicios de repaso centrados en condicionales, funciones, `return`, parámetros opcionales y ámbito.
- `05_ejercicio_repaso_2_1_calculo_decibelios.py` contiene la transformación del ejemplo matemático a función.

---

Si quiero añadir más detalles (enunciados completos, tests o soluciones), lo iré incorporando en archivos separados cuando lo estime conveniente.

Actualizo este README al final de cada clase para que quede constancia de lo trabajado.
