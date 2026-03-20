# 1. 🧠 IDEA CLAVE

> Crear usuario = **crear acceso al servidor**, no a bases de datos

✔ El usuario **no tiene permisos al crearse**
✔ Luego hay que usar `GRANT`

---

# 2. ⚙️ Sintaxis básica (MariaDB)

```sql
CREATE USER 'usuario'@'host'
IDENTIFIED BY 'password';
```

---

# 3. 🧩 ESTRUCTURA CLAVE

```text
'usuario'@'host'
```

👉 Esto es lo más importante del tema

| Parte   | Qué significa          |
| ------- | ---------------------- |
| usuario | nombre del usuario     |
| host    | desde dónde se conecta |

---

# 4. 🔥 HOST (muy importante)

| Host        | Significado                   |
| ----------- | ----------------------------- |
| 'localhost' | solo desde el propio servidor |
| '%'         | desde cualquier sitio         |

---

## Ejemplos

```sql
CREATE USER 'bob'@'localhost' IDENTIFIED BY '1234';
```

👉 Solo puede entrar desde el mismo servidor

---

```sql
CREATE USER 'bob'@'%' IDENTIFIED BY '1234';
```

👉 Puede entrar desde cualquier IP

---

# 5. ⚠️ SI NO PONES HOST

```sql
CREATE USER 'bob';
```

👉 Equivale a:

```sql
'bob'@'%'
```

---

# 6. 🧠 Regla mental

```text
usuario = quién
host = desde dónde
```

---

# 7. 🔍 Ver usuarios

```sql
SELECT user FROM mysql.user;
```

👉 Tabla interna del sistema

---

# 8. 🔥 IMPORTANTE (clave de examen)

> Crear usuario NO da permisos

👉 Este usuario no puede hacer nada:

```sql
CREATE USER 'bob'@'localhost' IDENTIFIED BY '1234';
```

---

# 9. ⚙️ Dar permisos (GRANT)

```sql
GRANT ALL PRIVILEGES ON basedatos.* TO 'bob'@'localhost';
```

---

## Traducción

👉 “bob puede hacer TODO en esa base de datos”

---

# 10. 🔁 Aplicar cambios

En MariaDB moderno normalmente no hace falta, pero clásico:

```sql
FLUSH PRIVILEGES;
```

---

# 11. 🧪 Ejemplo completo (flujo real)

## 1. Crear usuario

```sql
CREATE USER 'bob'@'localhost' IDENTIFIED BY 'Secure1pass!';
```

---

## 2. Crear base de datos

```sql
CREATE DATABASE bobdb;
```

---

## 3. Dar permisos

```sql
GRANT ALL PRIVILEGES ON bobdb.* TO 'bob'@'localhost';
```

---

## 4. Probar

```sql
SHOW DATABASES;
```

👉 Ahora ve `bobdb`

---

# 12. 🔒 Tipos de permisos

| Permiso        | Qué permite |
| -------------- | ----------- |
| SELECT         | leer datos  |
| INSERT         | insertar    |
| UPDATE         | modificar   |
| DELETE         | borrar      |
| ALL PRIVILEGES | todo        |

---

## Ejemplo más realista (no dar todo)

```sql
GRANT SELECT, INSERT ON bobdb.* TO 'bob'@'localhost';
```

---

# 13. ❌ Errores típicos

❌ Olvidar el host
❌ Pensar que CREATE USER ya da permisos
❌ Dar `ALL PRIVILEGES` siempre (mala práctica real)

---

# 14. 🗑️ Borrar usuario

```sql
DROP USER 'bob'@'localhost';
```

---

# 15. 🧠 Patrón típico de examen

Te dan:

```sql
CREATE USER 'ana'@'localhost';
```

👉 Pregunta:

* ¿Puede acceder a tablas? → ❌ NO
* ¿Por qué? → no tiene permisos

---

# 16. 💡 Resumen final

> CREATE USER = crea identidad
> GRANT = da permisos

---
