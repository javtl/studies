# 1. 🧠 Qué es una VIEW

> Una **VIEW** = un **SELECT guardado** que se usa como si fuera una tabla.

✔ No almacena datos
✔ Siempre ejecuta el SELECT
✔ Siempre muestra datos actualizados

---

# 2. ⚙️ Sintaxis básica (MariaDB)

```sql
CREATE [OR REPLACE] VIEW nombre_vista AS
SELECT columnas
FROM tabla
WHERE condicion;
```

---

# 3. 🔍 Cómo funciona

1. Creas la vista (guardas el SELECT)
2. Cuando la usas → se ejecuta ese SELECT
3. El resultado se comporta como una tabla

---

# 4. 🧩 Ejemplo práctico

### Tabla: clientes

| id | nombre | ciudad  |
| -- | ------ | ------- |
| 1  | Ana    | Madrid  |
| 2  | Luis   | Sevilla |
| 3  | Pedro  | Madrid  |

---

### Crear vista

```sql
CREATE VIEW clientes_madrid AS
SELECT id, nombre
FROM clientes
WHERE ciudad = 'Madrid';
```

---

### Usarla

```sql
SELECT * FROM clientes_madrid;
```

---

# 5. 🧠 Regla mental

```text
VIEW = SELECT guardado
```

---

# 6. 🔥 Uso real

✔ Simplificar consultas largas
✔ Reutilizar lógica
✔ Ocultar columnas
✔ Dar una “tabla limpia” a otros usuarios

---

# 7. ⚠️ IMPORTANTE (muy preguntado)

> ❌ Una VIEW NO mejora rendimiento por sí sola

---

# 8. 🔒 WITH READ ONLY

```sql
CREATE VIEW clientes_madrid AS
SELECT *
FROM clientes
WHERE ciudad = 'Madrid'
WITH READ ONLY;
```

👉 ❌ No permite `INSERT`, `UPDATE`, `DELETE`

---

# 9. 🧠 WITH CHECK OPTION (clave)

```sql
CREATE VIEW clientes_madrid AS
SELECT *
FROM clientes
WHERE ciudad = 'Madrid'
WITH CHECK OPTION;
```

---

## Cómo funciona

👉 Solo permite modificar datos que sigan cumpliendo la vista

---

### ❌ Esto falla

```sql
INSERT INTO clientes_madrid (id, nombre, ciudad)
VALUES (4, 'Juan', 'Sevilla');
```

---

### ✅ Esto sí funciona

```sql
INSERT INTO clientes_madrid (id, nombre, ciudad)
VALUES (4, 'Juan', 'Madrid');
```

---

# 10. ⚡ Tip rápido

| Opción       | Qué hace                   |
| ------------ | -------------------------- |
| READ ONLY    | Bloquea modificaciones     |
| CHECK OPTION | Obliga a cumplir condición |

---

# 11. 🧩 VIEW con JOIN

```sql
CREATE VIEW pedidos_clientes AS
SELECT c.nombre, p.id AS pedido_id
FROM clientes c
JOIN pedidos p ON p.cliente_id = c.id;
```

---

👉 Se usa igual:

```sql
SELECT * FROM pedidos_clientes;
```

---

# 12. ❗ DML en vistas (muy importante)

## ✔ Puedes hacer INSERT/UPDATE si:

* Es una vista simple (una tabla)
* No hay funciones (SUM, AVG…)
* No hay GROUP BY
* No hay DISTINCT

---

## ❌ No puedes si:

* Hay JOINs complejos
* Hay agregaciones
* Hay columnas calculadas

---

# 13. 🗑️ Borrar vista

```sql
DROP VIEW nombre_vista;
```

---

# 14. 🧠 Patrón típico de examen

```sql
CREATE VIEW algo AS
SELECT ...
FROM tabla
WHERE condicion;
```

👉 Luego te preguntan:

* si puedes hacer INSERT
* si CHECK OPTION falla
* o qué devuelve

---

# 15. 💡 Resumen final

> VIEW = forma limpia de reutilizar consultas sin duplicar lógica

---

