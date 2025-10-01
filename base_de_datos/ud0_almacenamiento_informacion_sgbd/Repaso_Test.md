# Practicas tipo test 
## Tema 1 .- Introducción a las Bases de Datos
## Sistemas de Almacenamiento de la Información y Sistemas Gestores de Bases de Datos

### 🧠 Simulacro de Examen Teórico (10 Preguntas)  ✅ ❌

1. Arquitectura de Referencia (Niveles) (PDF Completo)
En la Arquitectura de Referencia (ANSI/SPARC), el nivel que describe la estructura global de la base de datos (tablas, relaciones, atributos) es el:
a) Nivel Físico o Interno.
b) Nivel de Usuario.
✅ c) Nivel Lógico o Conceptual.
d) Nivel de Correspondencia.

2. Tipos de Usuarios (PDF Completo)
Dentro de los Usuarios Finales de una base de datos, ¿cuál es su característica principal al explotar los datos?
a) Tienen un conocimiento técnico profundo sobre la estructura de la base de datos.
b) Son responsables de la definición y mantenimiento de la BD.
✅ c) Explotan la base de datos con conocimiento sobre el negocio, pero no necesariamente técnico sobre los datos.
d) Son los encargados de la programación de aplicaciones que acceden a la BD.

3. Fragmentación (PDF Completo)
Si una tabla en un sistema distribuido se divide enviando ciertas filas o tuplas a diferentes sitios geográficos, el tipo de fragmentación aplicado es:
a) Mixta.
✅ b) Horizontal.
c) Vertical.
d) De Datos.

4. ETL - Destino/Resultado (PDF Completo)
En un proceso ETL, el DWH (DataWarehouse) se define como:
a) Un sistema de gestión de relaciones con clientes (CRM).
b) El origen de datos de sistemas transaccionales (OLTP).
✅ c) Un repositorio de datos genérico, consolidado y optimizado para el análisis (OLAP).
d) Un fichero plano utilizado como fuente de carga.

5. Arquitectura Operacional (PDF Completo)
La Arquitectura Operacional que separa la base de datos, la lógica de la aplicación y la presentación del usuario en diferentes componentes o máquinas se conoce como:
a) Centralizada.
b) Paralela.
c) Distribuida.
✅ d) Cliente-Servidor (o con Servidor de Aplicaciones).

6. Explotación de Bases de Datos (PDF Completo)
¿Qué tipo de sistema de explotación de bases de datos se enfoca en el manejo de las operaciones diarias (transacciones) de una empresa, como altas de productos o registros de ventas?
a) Sistemas de soporte a la Decisión (DSS).
b) DataMarts.
c) Minería de Datos.
✅ d) Sistemas Transaccionales (OLTP).

7. Herramientas de la Base de Datos (PDF Completo)
De las herramientas mencionadas, la que típicamente se utiliza para crear documentos estructurados y formateados a partir de los datos de la base de datos (por ejemplo, facturas o listas de inventario) es:
a) La Consola de Comandos.
b) El Formulario.
✅ c) El Informe.
d) La Interfaz Gráfica.

8. ETL - Orígenes de Datos (PDF Completo)
En un proceso ETL, si se extraen datos de un sistema que gestiona las operaciones internas de la empresa como contabilidad, producción y recursos humanos, la fuente de datos probablemente sea:
a) CRM (Customer Relationship Management).
b) ERP (Enterprise Resource Planning).
✅ c) FLAT FILE (Fichero Plano).
d) DWH (DataWarehouse).

9. Fragmentación (PDF Completo)
La Fragmentación Vertical ocurre cuando una tabla se divide en múltiples partes a nivel de:
a) Tuplas o Filas.
✅ b) Registros o Transacciones.
❌c) Campos o Columnas.
d) Bases de Datos.

10. Tipos de Sistemas Según Licencia (PDF Completo)
Un Sistema Gestor de Bases de Datos (SGBD) que permite a los usuarios utilizar, estudiar, cambiar y distribuir el software sin restricciones de pago se clasifica como:
a) SGBD Comercial.
b) SGBD Monousuario.
✅ c) SGBD Libre.
d) SGBD Distribuido.

---

### 🧠 Simulacro de Examen Teórico II (10 Preguntas) ✅ ❌

1. Arquitectura de Referencia (Correspondencias)
En la Arquitectura de Referencia (ANSI/SPARC), la Correspondencia Externa/Conceptual es crucial para lograr:
a) La independencia física de la base de datos.
b) La optimización del almacenamiento en disco.
c) La definición de los índices internos.
✅ d) Aislar a los usuarios de los cambios en el esquema global.

2. Objetivos de una Base de Datos (Redundancia)
Uno de los principales objetivos de usar una Base de Datos en lugar de ficheros es buscar la Redundancia Mínima. ¿Qué problema se reduce directamente al minimizar la redundancia?
a) La seguridad y privacidad de los datos.
b) El tiempo de respuesta del sistema (Desempeño).
✅ c) Las anomalías de actualización y la inconsistencia de datos.
d) La versatilidad para usar los datos de diferentes maneras.

3. Modelos de Bases de Datos (Estructura)
¿Cuál es el término técnico que describe una fila dentro de una Tabla en el contexto del Modelo Relacional?
a) Atributo.
b) Esquema.
c) Relación.
✅ d) Tupla.

4. Arquitectura Operacional (Centralizada)
En una Arquitectura Operacional Centralizada, ¿dónde se encuentran típicamente el SGBD, los datos, y el procesamiento?
a) Distribuidos en múltiples nodos de red.
b) Separados en un Servidor (datos) y un Cliente (presentación).
✅ c) En un único equipo anfitrión, gestionando todo.
❌d) Separados en capas Cliente, Servidor de Aplicaciones y Servidor de Base de Datos.

5. Tipos de Sistemas (Ubicación)
Un Sistema de Bases de Datos donde los datos se almacenan en múltiples sitios interconectados, pero que se perciben como una sola base de datos, se clasifica según su ubicación como:
a) Monousuario.
b) Centralizado.
c) Multiusuario.
✅ d) Distribuido.

6. Herramientas del SGBD (Consola de Comandos)
¿Qué característica de interacción con el SGBD permite a un usuario o administrador ejecutar directamente sentencias SQL para definir o manipular la base de datos?
❌a) Informes.
b) Interfaz Gráfica.
c) Formularios.
✅ d) Consola de Comandos.

7. Fragmentación (Mixta)
La Fragmentación Mixta de datos es una combinación de:
a) La división por ubicación y por tiempo.
b) La división entre sistemas OLTP y OLAP.
✅ c) La fragmentación horizontal (filas) y la fragmentación vertical (columnas).
d) La división entre un SGBD Libre y uno Comercial.

8. ETL - Orígenes (SQL)
¿Cuál es la función del origen de datos SQL en un proceso ETL?
❌a) Almacenar los datos de destino en el DataWarehouse.
b) Servir como el sistema principal de gestión de clientes.
✅ c) Permitir la extracción de datos mediante consultas a otras bases de datos.
d) Procesar la información para generar informes y dashboards.

9. Explotación de Bases de Datos (OLAP)
El enfoque de explotación que está directamente asociado con el análisis de grandes volúmenes de datos históricos en DataWarehouses para el soporte a la decisión se denomina:
a) Minería de Datos.
b) Sistemas Transaccionales (OLTP).
✅ c) Proceso Analítico en Línea (OLAP).
d) Big Data.

10. Correspondencia (Conceptual/Interna)
El objetivo de la Correspondencia Interna/Conceptual en la Arquitectura de Referencia es:
❌a) Asegurar la independencia lógica, protegiendo los programas de los cambios en las vistas.
✅ b) Asegurar la independencia física, permitiendo mover archivos e índices sin afectar el esquema conceptual.
c) Definir cómo se visualizan los datos en el front-end.
d) Gestionar las transacciones y la concurrencia de los usuarios.

---

### 🧠 Simulacro de Examen Teórico FINAL (10 Preguntas) ✅ ❌

1. Comparación Ficheros vs. BD (PDF 1)
Según el contenido del PDF 1, si se añaden o suprimen campos de un Fichero, el problema inmediato que surge en una aplicación con ficheros es la obligación de:
a) Incrementar la Redundancia Mínima.
b) Cambiar todos los programas que usen dicho fichero.
c) Modificar el Diccionario de Datos.
d) Eliminar los Registros duplicados.

2. Objetivos / Características (PDF 1)
La característica Integridad de una Base de Datos asegura, principalmente:
a) Que la organización física de los datos sea independiente de la lógica (Afinación).
b) Que los datos sean fiables según las restricciones definidas y que el sistema pueda recuperarlos tras un fallo.
c) La protección de los datos ante robos o usuarios no identificados (Seguridad).
d) Que los mismos ítems no se repitan en sitios distintos (Redundancia Mínima).

3. Arquitectura de Referencia: Independencia (Refuerzo - PDF 1/2)
La Correspondencia Conceptual/Interna de la Arquitectura de Referencia (Niveles) está orientada a mantener la:
a) Independencia Lógica.
b) Simplicidad.
c) Independencia Física.
d) Versatilidad.

4. Modelos de Bases de Datos (PDF 1)
¿Cuál es el modelo de base de datos que utiliza la estructura de árboles donde un Nodo Hijo solo puede tener un único Nodo Padre?
a) Modelo En Red.
b) Modelo Relacional.
c) Modelo Orientado a Objetos.
d) Modelo Jerárquico.

5. Arquitectura Operacional (PDF 2)
En la arquitectura Cliente/Servidor, ¿dónde reside típicamente el Software de Gestión de Datos (manipulación y SGBD)?
a) En el Cliente.
b) En un Navegador WEB.
c) En el Servidor.
d) En la Red de Área Extensa (WAN).

6. Lenguajes del SGBD (PDF 1)
El Lenguaje DCL (Data Control Language) es el encargado de:
a) Crear y modificar la estructura de los objetos de la base de datos.
b) Insertar, actualizar, y eliminar los datos (Manipulación).
c) Controlar el acceso a la información, definiendo privilegios y autorizaciones.
d) Definir los Metadatos en el Diccionario de Datos.

7. Fragmentación (PDF 2)
Para una fragmentación de tipo Mixta, ¿cuál de los siguientes ejemplos es correcto?
a) Dividir la tabla en diferentes filas (Horizontal) y la base de datos en diferentes servidores (Distribuida).
b) Dividir la tabla en diferentes campos (Vertical) y utilizar un SGBD Libre.
c) Dividir una tabla primero por filas (Horizontal) y luego cada subconjunto resultante por columnas (Vertical).
d) Dividir una tabla por filas o por columnas, pero nunca ambas.

8. Herramientas y Componentes (PDF 1/2)
El componente del SGBD que almacena la definición de todos los objetos (tablas, columnas, índices, privilegios) y los metadatos de la base de datos es:
a) El Gestor de la Base de Datos.
b) El Administrador de la Base de Datos (DBA).
c) El Diccionario de Datos.
d) El Software de Desarrollo.

9. Arquitectura Operacional (Refuerzo - PDF 2)
¿Cuál es la principal ventaja de la arquitectura con Servidores de Aplicaciones sobre la arquitectura simple Cliente/Servidor?
a) Permite el uso de SGBD Libres.
b) No requiere instalación ni administración de las aplicaciones en los equipos clientes.
c) Resuelve el problema de la fragmentación vertical.
d) Separa la BD del SGBD en equipos distintos.

10. Correspondencia (Refuerzo - PDF 1/2)
La Independencia Lógica de los datos (la característica fundamental de una BD según tu PDF 1) se logra gracias a la correspondencia entre los niveles:
a) Conceptual e Interno.
b) Externo y Conceptual.
c) Físico y de Usuario.
d) De Definición y Manipulación.