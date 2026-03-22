# 📅 Día 9: Herencia y Polimorfismo

## 📋 1. ¿Qué es la Herencia?

Imagina que tienes una clase **Animal**. Todos los animales respiran y comen. Pero un **Perro** ladra y un **Gato** maúlla.

* **Clase Padre (Superclase):** `Animal` (Tiene lo común).
* **Clase Hija (Subclase):** `Perro` (Hereda de Animal y añade sus propias cosas).

---

## 💻 Ejemplo de Código: Herencia Básica

Para heredar, ponemos el nombre de la clase padre entre paréntesis al definir la hija.

```python
class Usuario: # Clase Padre (la que hiciste ayer)
    def __init__(self, nombre):
        self.nombre = nombre
    
    def saludar(self):
        print(f"Hola, soy {self.nombre}")

class Admin(Usuario): # Clase Hija
    def borrar_usuario(self, usuario):
        print(f"El administrador {self.nombre} ha borrado a {usuario}")

# --- Uso ---
admin_pro = Admin("Alex")
admin_pro.saludar()         # ✅ Heredado de Usuario
admin_pro.borrar_usuario("Pepe") # ✅ Propio de Admin

```

---

## 📋 2. El método `super()`

A veces la clase hija necesita su propio `__init__` pero también quiere lo del padre. Usamos `super()` para llamar al constructor del padre.

```python
class Admin(Usuario):
    def __init__(self, nombre, nivel_seguridad):
        super().__init__(nombre) # Llama al __init__ de Usuario
        self.nivel = nivel_seguridad # Añade algo nuevo

```

---

## 🛠️ Desafío del Día 9: El Sistema de Empleados

Vamos a modelar una estructura de empresa.

### Ejercicio 1: Clase Base

Crea una clase llamada `Empleado` que tenga:

* **Atributos:** `nombre` y `salario`.
* **Método `describir()`:** Imprime "Nombre: [nombre], Salario: [salario]".

### Ejercicio 2: Herencia

Crea una clase llamada `Desarrollador` que herede de `Empleado`.

* Añade un atributo nuevo: `lenguaje` (ej: Python, Java).
* **Sobrescribe** (Override) el método `describir()` para que también mencione el lenguaje.

### Ejercicio 3: Especialización

Crea otra clase llamada `Gerente` que herede de `Empleado`.

* Añade un atributo: `equipo` (una lista de nombres de personas).
* Añade un método: `mostrar_equipo()` que imprima los nombres de su equipo.
