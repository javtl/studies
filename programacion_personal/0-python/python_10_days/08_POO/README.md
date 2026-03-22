# 📅 Día 8: Programación Orientada a Objetos (POO)

## 📋 1. ¿Qué es un Objeto?

Imagina que estás programando un juego de coches. En lugar de tener variables sueltas (`color_coche1`, `velocidad_coche1`), creamos un **molde** llamado `Coche`.

* **Clase (Class):** Es el molde o plano (ej: El diseño de un Ferrari).
* **Objeto / Instancia:** Es el coche real fabricado con ese molde (ej: El Ferrari rojo que tienes en el garaje).

---

## 📋 2. Los dos componentes de una Clase

### A. Atributos (Lo que el objeto ES)

Son las características o variables: `color`, `marca`, `gasolina`.

### B. Métodos (Lo que el objeto HACE)

Son las funciones dentro de la clase: `arrancar()`, `acelerar()`, `frenar()`.

---

## 💻 Ejemplo de Código: Tu primera Clase

En Python, usamos la palabra `class` y un método especial llamado `__init__` (el constructor), que se ejecuta al crear el objeto.

```python
class Coche:
    # El Constructor: Define qué necesita el coche al nacer
    def __init__(self, marca, modelo):
        self.marca = marca      # Atributo
        self.modelo = modelo    # Atributo
        self.encendido = False  # Atributo por defecto

    # Un Método: Una acción
    def arrancar(self):
        self.encendido = True
        print(f"El {self.modelo} ha arrancado. ¡Brum brum!")

# --- Usando la clase ---
mi_coche = Coche("Tesla", "Model 3") # Creamos el objeto
print(mi_coche.marca)               # Accedemos a un atributo
mi_coche.arrancar()                  # Llamamos a un método

```

> **Nota sobre `self`:** Es una palabra que usa Python para decir "este objeto en concreto". Es como si el coche dijera: "MIRA **MI** MARCA".

---

## 🛠️ Desafío del Día 8: El Sistema de Usuarios

Vamos a aplicar esto para crear un sistema de gestión de usuarios para tu aplicación.

### Ejercicio 1: Crear la Clase `Usuario`

Crea una clase llamada `Usuario` que tenga:

1. **Atributos:** `nombre`, `email` y `puntos` (que empiece siempre en 0).
2. **Método `presentarse()`:** Debe imprimir: "Hola, soy [nombre] y mi correo es [email]".
3. **Método `ganar_puntos(cantidad)`:** Debe sumar esa cantidad al atributo `puntos`.

### Ejercicio 2: Interacción entre Objetos

1. Crea dos objetos: `usuario1` (con tu nombre) y `usuario2` (con el nombre "Satoshi").
2. Haz que ambos se presenten.
3. Dale 50 puntos a `usuario1`.
4. Imprime cuántos puntos tiene cada uno para verificar que son independientes.

---

## 🚀 Reto Pro: Integración (Día 7 + Día 8)

**¿Podrías crear un método llamado `guardar_en_json()` dentro de la clase que guarde los datos del usuario en un archivo?** (Pista: Usa `self.__dict__` para convertir el objeto en un diccionario fácilmente).
