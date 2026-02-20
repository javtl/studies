Para trabajar con esos archivos en MySQL Workbench a través de XAMPP, el proceso se divide en dos partes: primero preparar la base de datos y luego importar los datos.

Aquí tienes los pasos detallados para hacerlo correctamente:

---

## 1. Ejecutar el script SQL (`creacion ejemplo ventas.sql`)

Antes de meter datos, necesitas la "estructura" (las tablas vacías). Ese archivo `.sql` seguramente contiene las sentencias `CREATE TABLE`.

1. Abre **XAMPP Control Panel** y asegúrate de que **MySQL** esté en verde (Running).
2. Abre **MySQL Workbench** y conéctate a tu instancia local.
3. Ve al menú **File > Open SQL Script...** y selecciona `creacion ejemplo ventas.sql`.
4. Pulsa el icono del **rayo** ⚡ para ejecutarlo.
* *Nota:* Revisa en el panel de la izquierda (Schemas) si ha aparecido una nueva base de datos. Si no la ves, pulsa el botón de refrescar.



---

## 2. Importar los archivos CSV (`clientes.csv`, `proveedores.csv`, `ventas.csv`)

Workbench tiene un asistente muy útil para esto.

1. En el panel **Schemas**, haz clic derecho sobre la tabla donde quieras meter los datos (ej: la tabla `clientes`).

⚠️ Si no aparecen las tablas en tu Base de Datos:
Eso pasa a veces porque el panel de la izquierda de Workbench no se actualiza solo. Es lo que llamamos un problema de "refresco" de la interfaz.

Para solucionarlo y ver tus tablas en **`ejemplo_ventas`**, haz lo siguiente:

1. **Botón de Refresco**: En el panel **Schemas** (donde ves el cilindrito), justo al lado de la palabra "Schemas", hay un icono pequeño de una **flecha circular** 🔄. Haz clic ahí.
2. **Desplegar**: Si después de refrescar sigue sin aparecer la flecha al lado de `ejemplo_ventas`, haz **doble clic** sobre el nombre `ejemplo_ventas` para que se ponga en negrita (esto la selecciona como activa) y vuelve a darle a la flecha de refrescar.
3. **Verificar por comando**: Si sigue sin aparecer visualmente pero te dice que "ya existe", abre una pestaña de SQL y escribe esto:
```sql
USE ejemplo_ventas;
SHOW TABLES;

```

Si en el resultado de abajo te sale una lista de tablas, ¡es que están ahí! Solo es Workbench siendo un poco "perezoso" para mostrarlas en el menú lateral.

**Una vez las veas o confirmes que existen:**
Empieza con el **Table Data Import Wizard** haciendo clic derecho sobre la tabla de **proveedores** (recuerda el orden que dijimos: primero proveedores, luego clientes y al final ventas).

2. Selecciona **Table Data Import Wizard**.
3. **Selecciona el archivo**: Busca el archivo `.csv` correspondiente en tu ordenador.
4. **Configuración**:
* Asegúrate de que el "Destination" sea la tabla que acabas de crear.
* Comprueba que los nombres de las columnas del CSV coinciden con los de la base de datos (el asistente suele emparejarlos automáticamente).


5. **Finish**: Dale a "Next" hasta que termine el proceso. Repite esto para los tres CSV.

---

## 3. ¿Qué pasa con los archivos Excel (`.xls`)?

MySQL Workbench **no importa archivos `.xls` directamente**. Tienes dos opciones:

* **Opción A (Recomendada):** Abre los archivos en Excel y dale a **"Guardar como..." > CSV (delimitado por comas)**. Una vez los tengas en CSV, usa el asistente del paso anterior.
* **Opción B:** Copiar y pegar los datos directamente en la cuadrícula de edición de Workbench si son pocos registros, aunque para `1000-Registros-de-ventas.xls` es mejor la Opción A.

---

## ⚠️ Consejos importantes para que no te dé error:

* **Orden de importación**: Si las tablas tienen **Claves Foráneas (Foreign Keys)**, el orden importa. Primero importa las tablas "maestras" (Clientes y Proveedores) y al final la tabla de Ventas. Si lo haces al revés, te dará error porque las ventas intentarán apuntar a clientes que aún no existen en la base de datos.

### 2. Importar los datos (Orden de carga)

Ahora que las tablas están creadas pero vacías, usa el **Table Data Import Wizard** haciendo clic derecho sobre cada tabla. **El orden es crítico** debido a las claves foráneas (no puedes vender algo de un proveedor que no existe):

1. **Primero: `proveedores**`
* Clic derecho en la tabla `proveedores` > *Table Data Import Wizard*.
* Selecciona `proveedores.csv` y sigue el asistente.


2. **Segundo: `clientes**`
* Clic derecho en la tabla `clientes` (la que está dentro de `ejemplo_ventas`) > *Table Data Import Wizard*.
* Selecciona `clientes.csv`.
* *Nota: No uses la tabla de la base de datos "el cilindrito", usa la que acabas de crear en `ejemplo_ventas`.*


3. **Tercero: `ventas**`
* Clic derecho en la tabla `ventas` > *Table Data Import Wizard*.
* Selecciona `ventas.csv`.



### ¿Por qué hacerlo así?

Si intentas importar `ventas.csv` antes que los clientes o proveedores, MySQL te dará un error de **"Foreign Key Constraint"**, porque la base de datos intentará verificar que el `id_cliente` de la venta existe en la tabla de clientes, y si está vacía, rechazará el registro.

* **Formato de Fecha**: Asegúrate de que las fechas en los CSV tengan el formato `AAAA-MM-DD`. Si vienen como `DD/MM/AAAA`, podrías tener problemas al importar.
* **Codificación**: Si ves símbolos extraños en los nombres (como eñes o tildes), asegúrate de elegir la codificación `utf8` en el asistente de importación.
