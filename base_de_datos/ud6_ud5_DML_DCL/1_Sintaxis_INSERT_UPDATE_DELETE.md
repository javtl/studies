# DML (Lenguaje de Manipulación de Datos) y Control de Transacciones

El DML permite gestionar el contenido de las tablas: insertar nuevos registros, modificar los existentes o eliminarlos.

---

## 📥 1. INSERT (Inserción de datos)
Se utiliza para añadir nuevas filas a una tabla.

| Función | Formato |
| :--- | :--- |
| **Inserción de una fila** | `INSERT INTO NombreTabla [(columna1, ...)] VALUES (valor1, ...);` |
| **Inserción multifilas** | `INSERT INTO NombreTabla [(columna1, ...)] SELECT ...;` |

### 💡 Ejemplos de uso:
* **Insertar un nuevo cliente (Manual):**
    ```sql
    INSERT INTO clientes (id_cliente, nombre, ciudad) 
    VALUES (501, 'Ana García', 'Madrid');
    ```
* **Insertar desde otra tabla (Multifila):**
    *Útil para pasar datos de la tabla temporal de 1000 ventas a la oficial.*
    ```sql
    INSERT INTO ventas (id_venta, fecha, importe)
    SELECT id_venta, fecha, importe FROM ventas_temporal;
    ```

---

## 📝 2. UPDATE (Modificación de datos)
Permite cambiar los valores de las filas ya existentes. **¡Cuidado!** Si olvidas el `WHERE`, modificarás toda la tabla.

| Función | Formato |
| :--- | :--- |
| **Modificación básica** | `UPDATE NombreTabla SET col1 = val1, ... WHERE condición;` |
| **Modificación con Subconsulta** | `UPDATE NombreTabla SET col1 = val1 WHERE colx = (SELECT ...);` |

### 💡 Ejemplos de uso:
* **Subir el precio de un producto:**
    ```sql
    UPDATE productos SET precio = precio * 1.10 WHERE categoria = 'Electrónica';
    ```
* **Actualizar usando una subconsulta:**
    *Cambiar el estado a 'VIP' de los clientes que han gastado más de 10.000€.*
    ```sql
    UPDATE clientes SET tipo = 'VIP' 
    WHERE id_cliente IN (SELECT id_cliente FROM ventas WHERE importe > 10000);
    ```

---

## 🗑️ 3. DELETE (Borrado de datos)
Elimina filas de una tabla según una condición.

| Función | Formato |
| :--- | :--- |
| **Borrado de filas** | `DELETE FROM NombreTabla WHERE condición;` |

### 💡 Ejemplo de uso:
* **Eliminar ventas antiguas:**
    ```sql
    DELETE FROM ventas WHERE fecha < '2020-01-01';
    ```

---

## 🔐 4. TRANSACCIONES
Una transacción es un conjunto de sentencias que se ejecutan como una única unidad de trabajo. Esto garantiza que, si algo falla a mitad, la base de datos no quede corrupta.

| Función | Propósito |
| :--- | :--- |
| **COMMIT** | Valida y guarda permanentemente todos los cambios realizados en la transacción. |
| **ROLLBACK** | Aborta la transacción y deshace todos los cambios realizados desde el último COMMIT, volviendo al estado anterior. |

### 💡 Ejemplo de uso (Escenario de seguridad):
Imagina que vas a borrar muchos datos pero no estás seguro de si el `WHERE` es correcto:

```sql
START TRANSACTION; -- Iniciamos la unidad de trabajo

DELETE FROM clientes WHERE ciudad = 'Madrid'; -- Borramos

-- Comprobamos si el borrado fue correcto...
-- ¿Nos hemos equivocado?
ROLLBACK; -- ¡Uf! Deshacemos el borrado y los clientes vuelven a aparecer.

-- ¿Todo es correcto?
COMMIT; -- Los cambios se graban definitivamente.
```