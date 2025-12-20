## 🐍 Lección 1: Variables y Tipos en Python

### 1. Tipado Dinámico y Fuerte

A diferencia de Java, donde debes declarar `int miNumero = 10;`, en Python simplemente escribes `mi_numero = 10`.

* **Dinámico:** El tipo se define en tiempo de ejecución.
* **Fuerte:** Python no permite operaciones ilógicas entre tipos (ej. no puedes sumar un `int` y un `string` sin convertir uno de ellos).

### 2. Tipos de Datos Primitivos

| Tipo | Nombre | Ejemplo | Nota |
| --- | --- | --- | --- |
| **Enteros** | `int` | `saldo = 1000` | No tienen límite de precisión (pueden ser enormes). |
| **Flotantes** | `float` | `precio = 19.99` | Siguen el estándar IEEE 754 (punto flotante). |
| **Strings** | `str` | `"Bitcoin"` | Son **inmutables**. Una vez creados, no cambian. |
| **Booleanos** | `bool` | `True` / `False` | ¡Ojo! Siempre empiezan con **Mayúscula**. |

### 3. La Nomenclatura (PEP 8)

En Java usas `camelCase`. En Python, el estándar oficial es **`snake_case`**:

* **Correcto:** `user_balance`, `is_active`, `crypto_price`.
* **Incorrecto:** `userBalance`, `IsActive`.

### 4. La función `type()` e Introspección

En cualquier momento puedes preguntar a Python qué tipo de dato es una variable:

```python
x = 10.5
print(type(x))  # <class 'float'>

```

### 5. Casting (Conversión de tipos)

Es fundamental para manejar entradas de usuario (`input()`), que siempre devuelve un `str`:

* `int("10")` → Convierte a entero.
* `float("10.5")` → Convierte a flotante.
* `str(100)` → Convierte a texto.
