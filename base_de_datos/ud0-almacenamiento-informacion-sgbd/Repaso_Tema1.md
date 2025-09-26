# 📚 Bases de Datos: Repaso Tema 1 (Introducción y Conceptos Fundamentales)

---

## 3. Arquitectura de las Bases de Datos (Niveles)

La arquitectura ANSI/SPARC define tres niveles para lograr la Independencia Lógica y Física de los datos:

| Nivel | Descripción | Ejemplo Repasado |
| :--- | :--- | :--- |
| **Externo (o de Vistas)** | Cómo ve los datos cada usuario o aplicación (vista simplificada y filtrada). | `La vista filtrada de ventas del mes.` |
| **Conceptual** | El esquema global de la BD. Define todas las tablas, atributos y sus relaciones. | `El esquema completo de la empresa.` |
| **Interno (o Físico)** | La estructura física de almacenamiento: cómo se guardan los datos, índices, etc. | `Definición de índices y organización de archivos.` |

---

## 4. Conceptos de BD y SGBD

| Concepto | Definición |
| :--- | :--- |
| **Base de Datos (BD)** | Colección organizada de datos interrelacionados. Es el **contenido**. |
| **SGBD (Sistema Gestor de Bases de Datos)** | El software que permite **acceder, definir, manipular y controlar** los datos de la BD. Es la **herramienta** (ej: MySQL). |

---

## 5. Modelos de Bases de Datos

El **Modelo Relacional** es el predominante (usado por MySQL, PostgreSQL, etc.).

* **Estructura fundamental:** Las **Tablas** (o Relaciones).
* **Identificación Única:** Cada tabla usa una **Clave Primaria (PK)** para identificar sus filas (registros).
* **Relación:** Las tablas se vinculan entre sí a través de las **Claves Foráneas (FK)**.

---