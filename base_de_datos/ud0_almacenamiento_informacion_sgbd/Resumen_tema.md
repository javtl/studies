## 📚 Repaso General del Tema 1: Bases de Datos

---

### 1. Fundamentos y Problemas Iniciales (PDF 1)

El propósito fundamental de las Bases de Datos es superar las deficiencias del antiguo **Sistema de Ficheros Independientes**:

| Concepto          | Sistema de Ficheros                                          | Sistema de Bases de Datos                                                     |
| :---------------- | :----------------------------------------------------------- | :---------------------------------------------------------------------------- |
| **Definición**    | Datos asociados a programas específicos.                     | Conjunto de datos usados independientemente por distintos programas/usuarios. |
| **Redundancia**   | Alta (mismos datos en varios ficheros).                      | **Mínima** (objetivo clave).                                                  |
| **Independencia** | Nula (cambias un fichero, **obligado a cambiar programas**). | Alta (Independencia **Lógica** y **Física**).                                 |
| **Integridad**    | Baja (difícil asegurar consistencia).                        | **Alta** (se definen restricciones para fiabilidad).                          |

### 2. Arquitectura de Referencia (Niveles)

Esta arquitectura (ANSI/SPARC) es la clave para lograr la **Independencia de los Datos**. Se divide en tres niveles con sus correspondencias:

| Nivel                | Descripción                                                       | Relación de Correspondencia | Independencia Lograda                                                   |
| :------------------- | :---------------------------------------------------------------- | :-------------------------- | :---------------------------------------------------------------------- |
| **Nivel Externo**    | Visión del **Usuario** (subesquemas).                             | **Externa/Conceptual**      | **LÓGICA** (Protege al usuario de cambios en el esquema global).        |
| **Nivel Conceptual** | Visión **Global** (entidades, relaciones, restricciones).         | **Conceptual/Interna**      | **FÍSICA** (Protege al esquema global de cambios en el almacenamiento). |
| **Nivel Interno**    | Visión **Física** (ubicación, índices, organización de ficheros). | -                           | -                                                                       |

---

### 3. Modelos y Terminología (PDF 1)

El modelo dominante es el **Relacional**, introducido por Codd, que usa tablas.

| Estructura  | Modelo Relacional (Término) |
| :---------- | :-------------------------- |
| **Tabla**   | Relación                    |
| **Fila**    | **Tupla** (o Registro)      |
| **Columna** | **Atributo** (o Campo)      |

Otros modelos incluyen el **Jerárquico** (estructura de árbol, un padre: muchos hijos) y el **En Red** (múltiples padres permitidos).

---

### 4. Arquitectura Operacional (PDF 2)

Describe cómo se despliegan físicamente los sistemas:

| Arquitectura                     | Características Clave                                                                  | Consecuencia/Uso                                                                                         |
| :------------------------------- | :------------------------------------------------------------------------------------- | :------------------------------------------------------------------------------------------------------- |
| **Centralizada**                 | Todo (BD, SGBD, Aplicación) en un **único equipo (Anfitrión)**.                        | Alta dependencia. Poca escalabilidad.                                                                    |
| **Cliente-Servidor**             | Separa el **Servidor** (SGBD, Datos) del **Cliente** (Interfaz, Lógica de aplicación). | Logra independencia. El cliente requiere instalación de software.                                        |
| **Con Servidor de Aplicaciones** | Se añaden capas de servidores para la lógica de negocio.                               | **Mayor ventaja:** El cliente solo necesita un navegador (**no requiere administración en el cliente**). |
| **Distribuida**                  | Datos fragmentados y repartidos en varios servidores.                                  | El usuario percibe una única BD.                                                                         |

### 5. Componentes y Lenguajes

| Componente               | Función Principal                                                       | Lenguaje               | Función Principal                                      |
| :----------------------- | :---------------------------------------------------------------------- | :--------------------- | :----------------------------------------------------- |
| **Diccionario de Datos** | Almacena los **Metadatos** (datos sobre los datos) y las restricciones. | **DDL** (Definición)   | Crea y modifica la estructura (tablas, vistas).        |
| **Consola de Comandos**  | Interfaz para ejecutar sentencias SQL directamente.                     | **DML** (Manipulación) | Inserta, modifica, elimina datos (`SELECT`, `INSERT`). |
| **SGBD**                 | Conjunto de programas que administran la BD (seguridad, concurrencia).  | **DCL** (Control)      | Gestiona permisos y privilegios (`GRANT`, `REVOKE`).   |

### 6. Flujos de Datos y Explotación (PDF 2)

| Concepto            | Flujo de Datos                                                                    | Uso/Objetivo                                                                                       |
| :------------------ | :-------------------------------------------------------------------------------- | :------------------------------------------------------------------------------------------------- |
| **ETL**             | **E**xtracción $\rightarrow$ **T**ransformación $\rightarrow$ **C**arga           | Migrar y preparar datos. Orígenes comunes: **ERP** (operaciones internas) y **CRM** (clientes).    |
| **DWH / DataMarts** | Destino del ETL.                                                                  | Repositorios de datos consolidados para el análisis.                                               |
| **OLTP**            | Sistemas **Transaccionales**                                                      | Manejan las **operaciones diarias** de la empresa (altas, ventas, etc.). Velocidad y concurrencia. |
| **OLAP**            | Sistemas **Analíticos**                                                           | Analizan grandes volúmenes de datos históricos (DWH) para el **Soporte a la Decisión (DSS)**.      |
| **Fragmentación**   | **Horizontal** (por filas), **Vertical** (por columnas), **Mixta** (combinación). | Se usa en BDs distribuidas para mejorar el rendimiento y el manejo de datos.                       |

---
