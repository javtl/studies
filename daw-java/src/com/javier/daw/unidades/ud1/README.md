# Unidad 1: Elementos de un programa

 ## Índice de contenidos

 - Objetivos de la unidad — 3
- Introducción — 4
-
  1. Estructura del programa — 4
  - 1.1. Estructura y bloques fundamentales
  - 1.2. Comentarios
-
  2. Datos y operadores — 8
  - 2.1. Variables, tipos de datos, literales y constantes
  - 2.2. Operadores, expresiones y conversiones de tipo
-
  3. Del código fuente al programa en ejecución — 11
  - 3.1. Compilación, bytecode y máquina virtual
  - 3.2. El proyecto: paquetes, classpath y entorno integrado de desarrollo
-
  4. Trazado de expresiones: ejemplos resueltos — 16
  - 4.1. Precedencia, asociatividad y evaluación paso a paso
  - 4.2. Conversiones y errores frecuentes, con las cifras hechas
- Ampliación y actualización — 20
- Mini proyecto guiado — 22
- Ejercicio — 22
- Resumen profesionalizante — 22

---

 # RESULTADOS DE APRENDIZAJE

 ## Objetivos de la unidad

 Al finalizar esta unidad, serás capaz de:

 - Reconocer la estructura de un programa informático.
- Escribir y comentar el código correctamente.
- Declarar variables y usar los tipos de datos.
- Emplear operadores y construir expresiones.
- Realizar conversiones de tipo.

 **UT 1 · 0485**

---

 # ACTIVACIÓN Y REFLEXIÓN

 ## Introducción

 ### Preguntas para reflexionar

 - ¿Qué partes tiene, por dentro, un programa informático?
- ¿Cómo se guardan y se manipulan los datos en un programa?
- ¿Por qué hay que convertir unos tipos de datos en otros?

 Esta unidad abre el módulo 0485 (Programación), el troncal del ciclo DAM. Empieza por lo esencial: los elementos de un programa.

 Trabajaremos con Java, un lenguaje orientado a objetos muy usado en el desarrollo multiplataforma. Aprenderás la estructura de un programa (bloques, clases, el método `main`), los comentarios, las variables y los tipos de datos, los operadores y las expresiones, y las conversiones de tipo. Es la base sobre la que se construye todo lo demás. Culmina en el análisis y trazado de un programa identificando sus elementos, con conversiones de tipo.

 Desarrolla la estructura del programa (estructura y bloques; comentarios) y los datos y operadores (variables; tipos de datos, literales y constantes; operadores y expresiones; conversiones de tipo). El análisis y trazado de un programa, con conversiones de tipo es el entregable. Es cómo se reconocen y se usan los elementos básicos de un programa.

 **UT 1 · 0485**

 > entorno de desarrollo (IDE) mostrando la estructura de un programa en Java

---

 # SECCIÓN 1

 # 1\. Estructura del programa

 ## 1.1. Estructura y bloques fundamentales

 Un programa en Java tiene una estructura clara y organizada en bloques. Todo el código vive dentro de clases, y la ejecución empieza en un método especial llamado `main`:

 - **La clase:** la unidad básica de organización en Java. Todo el código va dentro de una clase (`class`). El nombre de la clase suele coincidir con el del archivo (`.java`).
- **El método `main`:** el punto de entrada del programa; es donde empieza la ejecución:

```
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola, mundo");
    }
}
```

 - **Bloques `{ }`:** el código se organiza en bloques delimitados por llaves; definen el alcance (scope) de las variables y agrupan las instrucciones.
- **Instrucciones (statements):** cada orden termina en punto y coma `;`.
- **Sentencias de salida:** `System.out.println(...)` imprime en la consola.
- **Sangría (indentación):** aunque Java no la exige, es imprescindible para que el código sea legible (buena práctica profesional).

 Comprender la estructura de un programa (clase, `main`, bloques, instrucciones) es la base de la programación. Comprender esto es el punto de partida. Es qué partes tiene, por dentro, un programa.

 Un programa en Java tiene una estructura clara organizada en bloques, con todo el código dentro de clases y la ejecución empezando en el método `main`: la clase es la unidad básica de organización (`class`), cuyo nombre suele coincidir con el del archivo `.java`; el método `main` es el punto de entrada donde empieza la ejecución; los bloques delimitados por llaves definen el alcance de las variables y agrupan las instrucciones; cada instrucción/statement termina en punto y coma; las sentencias de salida como `System.out.println` imprimen en la consola; y la sangría/indentación, aunque Java no la exige, es imprescindible para la legibilidad.

 **UT 1 · 0485**

 > estructura de un programa Java (clase → método `main` → bloques → instrucciones)

---

 ## 1.2. Comentarios

 Los comentarios son texto que el programador escribe para explicar el código y que el compilador ignora. Son fundamentales para que el código sea comprensible y mantenible:

 ### Tipos de comentarios en Java

 - **De línea:** `./` comentario hasta el final de la línea.
- **De bloque:** `/` comentario que puede ocupar varias líneas `/`.
- **De documentación (Javadoc):** `.* ... /` — para documentar clases y métodos; genera documentación automática.

```
./ Comentario de una línea
int edad = 25; ./ explica esta variable
```

```
.* Comentario
de varias líneas ./
```

```
..*
* Comentario Javadoc: describe una clase o método.
* @param args argumentos del programa
./
```

 ### Para qué sirven

 - Explicar el porqué de una parte del código (no el qué obvio).
- Documentar el uso de una clase o método (Javadoc).
- Facilitar el mantenimiento (que otro —o tu yo futuro— entienda el código).
- Buenas prácticas: comentar lo necesario (el código claro se explica solo); mantener los comentarios actualizados (un comentario que miente es peor que ninguno).

 Saber usar los comentarios (línea, bloque, Javadoc) es esencial para un código comprensible y profesional. Comprender cómo se explica y se documenta el código es esencial.

 **UT 1 · 0485**

 Los comentarios son texto que el programador escribe para explicar el código y que el compilador ignora, fundamentales para la comprensión y el mantenimiento: en Java hay comentarios de línea (`//` hasta el final de la línea), de bloque (`/` varias líneas `/`) y de documentación/Javadoc (`/* ... /` para documentar clases y métodos, generando documentación automática); sirven para explicar el porqué de una parte del código, documentar el uso de una clase o método y facilitar el mantenimiento; y las buenas prácticas son comentar lo necesario (el código claro se explica solo) y mantener los comentarios actualizados.

 **UT 1 · 0485**

 > los tres tipos de comentarios en Java (línea, bloque, Javadoc) en el IDE

---

 ## Ejemplo — leer y entender un programa ajeno

 > desarrollador analizando la estructura de un programa Java que no ha escrito

 ### Contexto

 Un desarrollador junior recibe un programa Java que debe entender y modificar. No lo ha escrito él, así que primero tiene que reconocer sus elementos.

 ### Estrategia

 Identificó la estructura: la clase principal, el método `main` (por donde empieza), los bloques `{ }` y las instrucciones. Leyó los comentarios (`./`, `/ /`, Javadoc) para entender el propósito de cada parte. Trazó mentalmente el flujo: qué hace el programa paso a paso, qué variables usa y de qué tipo.

 ### Resultado

 Comprendió el programa reconociendo sus elementos y sus comentarios, y pudo modificarlo con seguridad. Saber reconocer la estructura y los elementos de un programa es la base para leer, entender y mantener código.

 ### En la práctica

 - Todo el código Java va dentro de una clase; la ejecución empieza en el método `main`.
- Cada instrucción termina en `;` y los bloques se delimitan con `{ }`.
- Usa comentarios para explicar el porqué; documenta clases y métodos con Javadoc.
- La sangría no es opcional en la práctica: hace el código legible y profesional.

 Un error frecuente es creer que «los comentarios son una pérdida de tiempo; el código ya se explica solo».

 En realidad, el código claro ayuda, pero los comentarios explican el porqué de las decisiones y documentan el uso (Javadoc); son esenciales para el mantenimiento y el trabajo en equipo. Lo importante es que estén actualizados.

 Un error frecuente es creer que «en Java puedo escribir el código sin sangría ni orden, si funciona da igual».

 En realidad, aunque Java compile sin sangría, un código desordenado es ilegible e imposible de mantener; la indentación y el orden son una buena práctica profesional imprescindible.

---

 # SECCIÓN 2

 # 2\. Datos y operadores

 ## 2.1. Variables, tipos de datos, literales y constantes

 Los programas manipulan datos, y esos datos se guardan en variables. En Java, cada variable tiene un tipo que determina qué puede contener:

 - **Variable:** un espacio en memoria con un nombre que almacena un valor y que puede cambiar. Se declara indicando su tipo:

```
int edad = 25;
double precio = 19.99;
String nombre = "Ana";
boolean activo = true;
```

 - **Tipos de datos primitivos (los básicos):**
  - Enteros: `int` (entero), `long` (entero grande), `byte`, `short`.
  - Decimales: `double` (decimal), `float`.
  - Carácter: `char` (un solo carácter, `'A'`).
  - Lógico: `boolean` (`true` / `false`).
- **Tipos de referencia:** como `String` (cadena de texto), objetos, arrays. (Se ven en las siguientes unidades.)
- **Literales:** los valores fijos que se escriben en el código: `25`, `19.99`, `'A'`, `"Ana"`, `true`.
- **Constantes:** valores que no cambian, declarados con `final` (por convención, en mayúsculas):

```
final double IVA = 0.21;
```

 - **Nombres (identificadores):** claros y descriptivos, en camelCase (`precioTotal`), que no sean palabras reservadas.

 Comprender las variables, los tipos de datos, los literales y las constantes es esencial para manejar la información en un programa. Comprender cómo se guardan y manipulan los datos es esencial.

 Los programas manipulan datos que se guardan en variables, y en Java cada variable tiene un tipo que determina qué puede contener: una variable es un espacio en memoria con un nombre que almacena un valor y puede cambiar, y se declara indicando su tipo (`int edad = 25`); los tipos primitivos básicos son los enteros (`int`, `long`, `byte`, `short`), los decimales (`double`, `float`), el carácter (`char`) y el lógico (`boolean true/false`); los tipos de referencia son `String`, los objetos y los arrays; los literales son los valores fijos escritos en el código (`25`, `"Ana"`, `true`); las constantes son valores que no cambian, declarados con `final` y por convención en mayúsculas (`final double IVA = 0.21`); y los identificadores deben ser claros, en camelCase y no ser palabras reservadas.

 ### Tipos primitivos

 | Categoría | Tipos | Qué guarda | Ejemplo |
| --- | --- | --- | --- |
| Enteros | `int`, `long`, `byte`, `short` | Números sin decimales | `int edad = 25;` |
| Decimales | `double`, `float` | Números con decimales | `double precio = 19.99;` |
| Carácter | `char` | Un solo carácter | `char inicial = 'A';` |
| Lógico | `boolean` | `true` o `false` | `boolean activo = true;` |

### Variables, literales, constantes e identificadores

 | Concepto | Definición | Ejemplo |
| --- | --- | --- |
| Variable | Espacio en memoria con un nombre que almacena un valor y puede cambiar | `int edad = 25;` |
| Literal | Valor fijo escrito en el código | `25`, `19.99`, `'A'`, `"Ana"`, `true` |
| Constante | Valor que no cambia, declarado con `final` y por convención en mayúsculas | `final double IVA = 0.21;` |
| Identificador | Nombre claro y descriptivo, en camelCase, que no sea palabra reservada | `precioTotal` |

### Tipos de referencia

 | Tipo | Qué son |
| --- | --- |
| `String` | Cadenas de texto |
| Objetos | Instancias de cualquier clase |
| Arrays | Colecciones de tamaño fijo |

**UT 1 · 0485**

---

 ## 2.2. Operadores, expresiones y conversiones de tipo

 Con los datos guardados, los programas los combinan y operan con ellos usando operadores, formando expresiones. Y a veces hay que convertir un tipo en otro:

 - **Operadores aritméticos:** `+`, `-`, `*`, `/`, `%` (resto o módulo).

```
int total = 10 + 5 * 2; ./ 20 (precedencia: * antes que +)
int resto = 17 % 5; ./ 2
```

 - **Operadores de comparación (relacionales):** `.=`, `.=`, `<`, `>`, `.=`, `.= →` devuelven boolean.
- **Operadores lógicos:** `.&` (Y/AND), `.|` (O/OR), `!` (NO/NOT) → combinan condiciones.
- **Operadores de asignación:** `=`, y los combinados `+=`, `-=`, `*=`, `.=`.
- **Expresiones:** combinaciones de valores, variables y operadores que producen un resultado (`precio cantidad`); hay que respetar la precedencia\* de los operadores (los paréntesis mandan).
- **Conversiones de tipo (casting):** cambiar un dato de un tipo a otro:
  - **Implícita (widening):** automática, de tipo pequeño a grande (`int → double`), sin pérdida.
  - **Explícita (narrowing):** manual, de grande a pequeño, puede perder información:

```
double d = 5; ./ implícita: int .> double
int n = (int) 5.9; ./ explícita: double .> int, n vale 5 (pierde decimales)
```

 Comprender los operadores, las expresiones y las conversiones de tipo completa el manejo de los datos y es el entregable de la unidad. Comprender por qué y cómo se convierten unos tipos de datos en otros es esencial.

 Con los datos guardados, los programas los combinan y operan usando operadores que forman expresiones, y a veces hay que convertir un tipo en otro: los operadores aritméticos son `+`, `-`, `*`, `/`, `%` (resto), respetando la precedencia; los de comparación (`==`, `!=`, `<`, `>`, `<=`, `>=`) devuelven boolean; los lógicos (`&&`, `||`, `!`) combinan condiciones; los de asignación son `=` y los combinados (`+=`, `-=`); las expresiones combinan valores, variables y operadores para producir un resultado, respetando la precedencia (los paréntesis mandan); y las conversiones de tipo (casting) cambian un dato de un tipo a otro, implícita/widening (automática de pequeño a grande sin pérdida, `int→double`) o explícita/narrowing (manual de grande a pequeño, puede perder información, `(int)5.9` da `5`).

 **UT 1 · 0485**

 > operadores (aritméticos, comparación, lógicos) y conversiones de tipo (implícita vs explícita)

---

 ## Ejemplo — un programa de cálculo con conversiones

 > análisis y trazado de un programa con variables, operadores y conversiones de tipo

 ### Contexto

 Como entregable, hay que analizar y trazar un pequeño programa Java de cálculo (por ejemplo, calcular el precio con IVA de una compra), identificando sus elementos y sus conversiones de tipo.

 ### Estrategia

 El desarrollador identificó los elementos: la clase, el `main`, las variables (precio, cantidad, IVA) y sus tipos, los operadores (`,+`) y las expresiones del cálculo. Detectó una conversión de tipo: un resultado `double` que se mostraba como `int` con un cast explícito. Trazó\* el programa paso a paso, anotando el valor de cada variable, y comprobó el resultado.

 ### Resultado

 El desarrollador comprendió y trazó el programa reconociendo todos sus elementos y sus conversiones. El análisis y trazado de un programa, con conversiones de tipo, fue el entregable de la unidad.

 ### En la práctica

 - Declara cada variable con su tipo adecuado; usa `final` para las constantes.
- Respeta la precedencia de los operadores; ante la duda, usa paréntesis.
- Cuidado con la conversión explícita (`(int)`): puede perder información (los decimales).
- Traza los programas paso a paso (anotando el valor de las variables) para entenderlos.

 Un error frecuente es creer que «da igual el tipo de datos que elija para una variable».

 En realidad, el tipo determina qué valores caben y qué operaciones se pueden hacer; usar el tipo adecuado (`int`, `double`, `boolean`…) evita errores y desperdicio de memoria. Elegir bien el tipo es parte de programar bien.

 Un error frecuente es creer que «la conversión de tipos siempre es segura».

 En realidad, la conversión implícita (a un tipo mayor) es segura, pero la explícita (a un tipo menor) puede perder información (un `double` a `int` pierde los decimales); hay que usarla con cuidado y a conciencia.

---

 # SECCIÓN 3

 # 3\. Del código fuente al programa en ejecución

 Hasta aquí el programa ha sido texto: clases, variables, operadores. Pero un fichero de texto no se ejecuta. Entre lo que escribes y lo que la máquina hace hay un proceso —la compilación— y un intermediario —la máquina virtual— que explican muchas cosas que de otro modo parecen arbitrarias: por qué el fichero debe llamarse igual que la clase, por qué el mismo programa funciona en Windows y en Linux sin recompilar, o por qué el compilador se queja de una variable que «está ahí».

 **UT 1 · 0485**

 ## 3.1. Compilación, bytecode y máquina virtual Se compila a un lenguaje intermedio llamado bytecode, que después ejecuta un programa intér

 Java no se compila directamente a instrucciones del procesador, como hacen C o C++. Se compila a un lenguaje intermedio llamado bytecode, que después ejecuta un programa intérprete: la máquina virtual de Java (JVM, Java Virtual Machine). El recorrido completo tiene tres pasos:

 ### Escritura

 Se escribe el código fuente en un fichero de texto con extensión `.java`. Una regla del lenguaje: si la clase se declara `public`, el fichero debe llamarse exactamente igual que ella, mayúsculas incluidas. `Saludo.java` contiene `public class Saludo`.

 ### Compilación

 El compilador `javac` lee el `.java`, comprueba la sintaxis y los tipos y, si todo es correcto, genera un fichero `.class` con el bytecode. Si algo falla, no genera nada: son los errores de compilación.

 ### Ejecución

 La orden `java` arranca la máquina virtual, que carga el `.class`, verifica el bytecode y lo ejecuta traduciéndolo a instrucciones de la máquina concreta.

 Un programa mínimo y las dos órdenes que lo ponen en marcha:

```
public class Saludo {
    public static void main(String[] args) {
        String quien = (args.length > 0) ? args[0] : "mundo";
        System.out.println("Hola, " + quien);
    }
}
```

```
$ javac Saludo.java
# produce Saludo.class (bytecode)

$ java Saludo
# arranca la JVM y ejecuta el metodo main

Hola, mundo

$ java Saludo Ana
# los argumentos llegan al array args

Hola, Ana
```

 Ese rodeo por el bytecode es lo que da a Java su lema histórico, «escribe una vez, ejecuta en cualquier sitio»: el `.class` es idéntico en todas las plataformas y lo que cambia es la máquina virtual, que existe para Windows, GNU/Linux, macOS y otros sistemas. El precio es que hace falta una JVM instalada; la ventaja, que no hay que recompilar para cada sistema operativo.

 **UT 1 · 0485**

 > recorrido del código fuente `.java` al bytecode `.class` con `javac` y de ahí a la ejecución en distintas máquinas virtuales (Windows, GNU/Linux, macOS)

 Conviene distinguir dos siglas que se confunden constantemente:

 ### JDK (Java Development Kit)

 El kit de desarrollo. Incluye el compilador `javac`, el generador de documentación `javadoc`, el empaquetador `jar`, el depurador `jdb` y la propia máquina virtual. Es lo que hay que instalar para programar.

 ### JRE (Java Runtime Environment)

 Solo lo necesario para ejecutar, es decir, la máquina virtual y las bibliotecas. Basta para el usuario final. Desde Java 11 las distribuciones de OpenJDK ya no publican un JRE separado; en su lugar se genera un entorno a medida con la herramienta `jlink`.

 Sobre las versiones: Java publica una versión nueva cada seis meses, y cada cierto tiempo designa una como LTS (Long-Term Support, soporte a largo plazo), que es la que las empresas adoptan porque recibe actualizaciones durante años. Java 8, 11, 17 y 21 son versiones LTS. Antes de empezar un proyecto hay que fijar con qué versión se compila, porque el bytecode generado por un compilador nuevo no lo entiende una máquina virtual antigua; por eso `javac` admite la opción `.-release`, que compila para una versión concreta.

 Desde Java 11 existe además un atajo cómodo para probar cosas: `java Saludo.java` compila en memoria y ejecuta de una sola vez, sin dejar el `.class`. Es práctico para un programa de un solo fichero, pero el flujo normal de un proyecto sigue siendo compilar y después ejecutar.

 ### JDK y JRE

 |  | JDK (Java Development Kit) | JRE (Java Runtime Environment) |
| --- | --- | --- |
| **Para qué sirve** | Desarrollar | Ejecutar |
| **Quién lo necesita** | El programador | El usuario final |
| **Qué incluye** | Compilador `javac`, generador de documentación `javadoc`, empaquetador `jar`, depurador `jdb` y la propia máquina virtual | La máquina virtual y las bibliotecas |

### Sobre las versiones

 | Detalle | Información |
| --- | --- |
| **Ritmo de publicación** | Una versión nueva cada seis meses |
| **Versiones LTS (Long-Term Support)** | Java 8, 11, 17 y 21 — las que adoptan las empresas, porque reciben actualizaciones durante años |
| **Compatibilidad** | El bytecode de un compilador nuevo no lo entiende una máquina virtual antigua; `javac --release` compila para una versión concreta |
| **Atajo desde Java 11** | `java Saludo.java` compila en memoria y ejecuta de una vez, sin dejar el `.class` |

---

 ## 3.2. El proyecto: paquetes, classpath y entorno integrado de desarrollo

 Un programa real no es un fichero suelto, sino decenas o cientos de clases. Para que no se conviertan en un montón desordenado, Java las agrupa en paquetes (`package`), que cumplen tres funciones: evitan que dos clases con el mismo nombre choquen, organizan el proyecto por temas y sirven de unidad de visibilidad.

 La regla es mecánica: el nombre del paquete se corresponde con una ruta de directorios. Una clase declarada así:

```
package es.thepower.tienda.modelo;

public class Producto {
    private final String nombre;
    private final double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
}
```

 debe vivir en el fichero `es/thepower/tienda/modelo/Producto.java`. Por convención, los nombres de paquete van en minúsculas y empiezan por el dominio de la organización invertido (`es.thepower.tienda`), lo que hace prácticamente imposible que coincidan con los de otra empresa. La declaración `package` debe ser la primera línea de código del fichero, por delante de cualquier `import`.

 Para compilar y ejecutar respetando esa estructura se indica el directorio de salida con `-d` y, al ejecutar, el nombre completo de la clase (paquete incluido):

```
$ javac -d destino src/es/thepower/tienda/modelo/Producto.java
$ javac -d destino -cp destino src/es/thepower/tienda/App.java
$ java -cp destino es.thepower.tienda.App
```

 Ahí aparece la tercera pieza: el classpath (`-cp` o `-classpath`), la lista de lugares donde la máquina virtual y el compilador buscan las clases compiladas y las bibliotecas. Cuando un programa falla con el mensaje `ClassNotFoundException` o `NoClassDefFoundError`, casi siempre es que algo no está en el classpath. Los entornos de desarrollo y las herramientas de construcción lo gestionan por ti, pero conviene saber qué es, porque el día que un despliegue falle el mensaje hablará de eso.

 **UT 1 · 0485**

 > correspondencia entre el nombre del paquete `es.thepower.tienda.modelo` y el árbol de directorios del proyecto, con el classpath apuntando al directorio de clases compiladas

 El entorno integrado de desarrollo (IDE, Integrated Development Environment) es el programa que reúne todo lo anterior en una sola ventana. Los más usados en Java son IntelliJ IDEA, Eclipse, Apache NetBeans y Visual Studio Code con su extensión de Java. Todos ofrecen, con nombres distintos, las mismas prestaciones:

 - **Editor inteligente:** coloreado de sintaxis, autocompletado de nombres de clase y de método, y detección de errores mientras escribes, sin esperar a compilar.
- **Compilación y ejecución integradas:** un botón compila el proyecto entero y otro lo ejecuta, mostrando la consola dentro del propio entorno.
- **Refactorización:** cambiar el nombre de una clase, una variable o un método y que el entorno actualice todos los usos, o extraer un trozo de código a un método nuevo, sin romper nada.
- **Depurador integrado:** puntos de ruptura, ejecución paso a paso e inspección de variables, que se trabajan a fondo en la unidad 3.
- **Gestión del proyecto:** creación de la estructura de directorios, configuración del JDK, gestión de dependencias con Maven o Gradle e integración con el control de versiones.

 Crear un proyecto nuevo sigue siempre los mismos pasos: elegir el tipo de proyecto y la herramienta de construcción, seleccionar la versión del JDK, dar nombre al proyecto y al paquete base, y crear la primera clase con su método `main`. A partir de ahí el entorno se encarga de invocar `javac` y `java` con los parámetros correctos.

 Una última cosa que no es cosmética: los convenios de nomenclatura. Todo el mundo en Java los respeta, y saltárselos hace que el código parezca escrito por alguien que no conoce el lenguaje. Las clases y las interfaces se escriben en UpperCamelCase (`CuentaBancaria`); los métodos y las variables, en lowerCamelCase (`calcularTotal`, `precioUnitario`); las constantes, en mayúsculas con guion bajo (`IVA_GENERAL`); los paquetes, en minúsculas y sin guiones.

 **UT 1 · 0485**

 > ventana de un entorno integrado de desarrollo con el árbol del proyecto, el editor, la consola de ejecución y la configuración del JDK

---

 # SECCIÓN 4

 # 4\. Trazado de expresiones: ejemplos resueltos

 Los operadores parecen sencillos hasta que una expresión da un resultado que no esperabas. Casi siempre la culpa es de una de estas tres cosas: la precedencia, la división entera o la representación de los números decimales. Este apartado resuelve, con las cifras hechas, los casos que más errores provocan. Conviene hacer la traza a mano antes de ejecutar y comparar después: es la mejor forma de comprobar si de verdad se ha entendido.

 ## 4.1. Precedencia, asociatividad y evaluación paso a paso

 La precedencia decide qué operador se aplica antes cuando hay varios en la misma expresión; la asociatividad, en qué orden se aplican los de igual precedencia. De mayor a menor prioridad, los grupos que se usan a este nivel son:

 - **Postfijos** `expr.+` y `expr.-`, y a continuación los unarios `.+expr`, `.-expr`, `+`, `-`, `!` y la conversión explícita `(tipo)`.
- **Multiplicativos** `*`, `/`, `%`.
- **Aditivos** `+` y `-`.
- **Relacionales** `<`, `>`, `.=`, `.=` y después los de igualdad `.= ` y `.=`.
- **Lógicos**, en este orden: `.&` y luego `.|`.
- El operador condicional `? :` y, en último lugar, las asignaciones `=`, `+=`, `-=`, `*=`, `.=`, ` %=`.

 Todos los binarios anteriores son asociativos por la izquierda (se evalúan de izquierda a derecha); las asignaciones lo son por la derecha.

 ### Primer ejemplo resuelto

```
int r = 3 + 4 * 2 - 6 / 4;
```

 **Paso 1:** se resuelven los multiplicativos de izquierda a derecha. `4 * 2` da `8`. `6 / 4` es una división entre enteros, así que el resultado también es entero y se trunca: da `1`, no `1,5`.

 **Paso 2:** quedan los aditivos, de izquierda a derecha: `3 + 8` da `11` y `11 - 1` da `10`.

 **Resultado:** `r` vale `10`.

 ### Segundo ejemplo resuelto, el que más veces se falla en un examen

```
int x = 7;
int y = x.+ + .+x;
```

 Java evalúa los operandos de izquierda a derecha. El primero es `x.+`, incremento posterior: entrega el valor actual, `7`, y después deja `x` en `8`. El segundo es `.+x`, incremento previo: primero sube `x` a `9` y luego entrega `9`.

 La suma es `7 + 9`.

 **Resultado:** `y` vale `16` y `x` vale `9`.

 La moraleja práctica es no escribir expresiones así en código real; escribirlas en un ejercicio sirve para entender la diferencia entre las dos formas del operador.

 ### Tercer ejemplo resuelto: el cortocircuito

 Los operadores `.&` y `.|` solo evalúan el segundo operando si hace falta. En `a .& b`, si `a` es falso el resultado ya es falso y `b` no llega a evaluarse; en `a .| b`, si `a` es verdadero, tampoco.

 Eso permite escribir comprobaciones que de otro modo fallarían:

```
int divisor = 0;

if (divisor .= 0 .& 100 / divisor > 5) {
    System.out.println("El cociente es mayor que 5");
} else {
    System.out.println("No se evalua la division");
}
```

 Como `divisor .= 0` es falso, la división nunca se ejecuta y no se produce el error. Si se invirtiera el orden de las condiciones, el programa fallaría en tiempo de ejecución. El orden de las condiciones, por tanto, no es indiferente.

 **UT 1 · 0485**

 ### Tabla de prioridad

 | Prioridad | Grupo | Operadores | Asociatividad |
| --- | --- | --- | --- |
| 1 (mayor) | Postfijos | `expr++`, `expr--` | Izquierda |
| 2 | Unarios y conversión | `++expr`, `--expr`, `+`, `-`, `!`, `(tipo)` | Derecha |
| 3 | Multiplicativos | `*`, `/`, `%` | Izquierda |
| 4 | Aditivos | `+`, `-` | Izquierda |
| 5 | Relacionales | `<`, `>`, `<=`, `>=` | Izquierda |
| 6 | Igualdad | `==`, `!=` | Izquierda |
| 7 | Lógico Y | `&&` | Izquierda |
| 8 | Lógico O | \` |  |
| 9 | Condicional | `?:` | Derecha |
| 10 (menor) | Asignaciones | `=`, `+=`, `-=`, `=`, `/=`, `%=` | Derecha |

### Cuarto ejemplo resuelto: el resto con negativos

 El operador `%` devuelve el resto de la división entera y, en Java, toma el signo del dividendo, no el del divisor.

 Así:

 - `7 % 3` vale `1`
- `-7 % 3` vale `-1`
- `7 % -3` vale `1`

 Es un detalle que importa cuando se usa `%` para comprobar la paridad de un número que puede ser negativo: `n % 2 .= 1` es falso para los impares negativos, mientras que `n % 2 .= 0` funciona siempre.

---

 ## 4.2. Conversiones y errores frecuentes, con las cifras hechas

 Las conversiones de tipo son el otro gran origen de resultados sorprendentes. Estos cuatro casos cubren la mayoría de los que se encontrará el alumnado.

 ### Caso 1: la división entera disfrazada

 Calcular el porcentaje de aprobados en un grupo de 30 personas, de las que aprueban 21:

```
int aprobados = 21;
int total = 30;

double malResultado = aprobados / total * 100;
./ 0.0

double bienResultado = (double) aprobados / total * 100;

System.out.println(malResultado);
./ 0.0

System.out.println(bienResultado);
./ 70.0

./ 70.0
```

 En la primera expresión, `21 / 30` se calcula entre enteros: da `0` (se pierde el `0,7`), y multiplicar `0` por `100` sigue dando `0`. Que la variable destino sea `double` no arregla nada, porque la conversión ocurre demasiado tarde.

 En la segunda, la conversión explícita `(double)` afecta al primer operando y obliga a que toda la división se haga en coma flotante: `0,7` por `100` igual a `70,0`.

 **Regla práctica:** convertir antes de dividir, no después.

 ### Caso 2: el desbordamiento silencioso

 El tipo `int` ocupa 32 bits y su valor máximo es `2 147 483 647` (`Integer.MAX_VALUE`). Sumarle uno no produce ningún error: el valor «da la vuelta» y se convierte en el mínimo negativo.

```
int maximo = Integer.MAX_VALUE;
./ 2147483647

System.out.println(maximo + 1);
./ -2147483648

long seguro = (long) maximo + 1;

System.out.println(seguro);
./ 2147483648
```

 El desbordamiento es silencioso: no lanza ninguna excepción, simplemente da un número equivocado. Por eso los importes en céntimos, los identificadores o los contadores de una aplicación con mucho volumen se declaran `long` (hasta `9 223 372 036 854 775 807`) y no `int`.

 Si se necesita detectarlo, la clase `Math` ofrece métodos como `Math.addExact`, que lanzan una excepción en lugar de dar la vuelta.

 **UT 1 · 0485**

 ### Caso 3: los decimales que no cuadran

 Los tipos `float` y `double` guardan los números en binario siguiendo la norma IEEE 754, y en binario muchos decimales no tienen representación exacta, igual que un tercio no la tiene en decimal:

```
System.out.println(0.1 + 0.2);
./ 0.30000000000000004

System.out.println(0.1 + 0.2 .= 0.3);
./ false

System.out.println(new java.math.BigDecimal("0.1")
    .add(new java.math.BigDecimal("0.2")));
./ 0.3
```

 No es un fallo de Java: ocurre en cualquier lenguaje que use coma flotante binaria.

 Las consecuencias prácticas son dos:

 1. Primera: nunca se comparan dos `double` con `.= `; se comprueba que su diferencia sea menor que una tolerancia.
2. Segunda: el dinero no se guarda en `double`. Para importes se usa `BigDecimal` construido a partir de una cadena de texto, como en el ejemplo, o se trabaja en céntimos con enteros.

 Una factura calculada con `double` acaba descuadrando por un céntimo, y ese céntimo lo detecta el cliente.

 > comparación entre el cálculo de un importe con `double` (`0.30000000000000004`) y con `BigDecimal` (`0.3`), con la conclusión de que el dinero no se representa en coma flotante

 **UT 1 · 0485**

 ### Caso 4: los caracteres son números

 El tipo `char` guarda un código Unicode, de manera que participa en las operaciones aritméticas promocionándose a `int`:

```
char letra = 'A';

System.out.println(letra + 1);
./ 66

System.out.println((char) (letra + 1));
./ B

System.out.println((int) 'a');
./ 97
```

 Sin la conversión explícita a `char`, la suma se imprime como el número `66`. Con ella, se interpreta de nuevo como carácter y aparece la `B`.

 Ese mismo mecanismo permite pasar una letra de minúscula a mayúscula restando 32, aunque para eso lo correcto es usar los métodos de la clase `Character`, que funcionan con acentos y con cualquier alfabeto.

 Y una regla del compilador que sorprende: la aritmética con `byte`, `short` y `char` se hace siempre promocionando a `int`, de modo que la primera línea siguiente no compila y la segunda sí:

```
byte b = 10;

./ b = b + 1;
./ error de compilacion: int no cabe en byte

b += 1;
./ correcto: el operador compuesto convierte de forma implicita

System.out.println(b);
./ 11
```

 Los operadores de asignación compuesta (`+=`, `-=`, `*=`…) llevan incorporada una conversión implícita al tipo de la variable de la izquierda. Es cómodo, pero también significa que pueden perder información sin avisar, exactamente igual que una conversión explícita.

 Por último, un error de compilación que no tiene que ver con los tipos sino con el ámbito (scope): una variable declarada dentro de un bloque `{ }` solo existe dentro de él, y una variable local debe tener un valor asignado antes de usarse. El compilador rechaza el programa que lea una variable local sin inicializar; los atributos de una clase, en cambio, reciben un valor por defecto (`0`, `false` o `null`), lo que se estudia al desarrollar clases.

 **UT 1 · 0485**

 > consola con la salida de los cuatro casos resueltos (división entera, desbordamiento, suma de decimales y aritmética con caracteres)

---

 # Ampliación y actualización

 ## Java moderno: `var`, records y bloques de texto

 El lenguaje Java evoluciona con versiones LTS (Long-Term Support) —como Java 17 y 21— que han añadido características que hacen el código más claro y conciso, y que conviene conocer desde el principio.

 La inferencia de tipos con `var` permite declarar variables locales sin repetir el tipo cuando es evidente, dejando que el compilador lo deduzca:

```
var nombre = "Ana";
```

 (el compilador sabe que es un `String`).

 Los records son una forma muy breve de crear clases inmutables solo para guardar datos:

```
record Punto(int x, int y) {}
```

 evitando escribir mucho código repetitivo.

 Y los bloques de texto (`"""..."""`) permiten escribir textos de varias líneas (como JSON o HTML) de forma limpia.

 Conocer el Java actual es importante porque el código profesional usa estas características, y porque muestran hacia dónde va el lenguaje (más conciso y seguro). No sustituyen a los fundamentos —que hay que dominar primero—, pero los complementan. Para el desarrollador DAM, empezar con buenos hábitos y con el Java moderno lo prepara para el código real de la industria. Refleja cómo el lenguaje Java se moderniza con la inferencia de tipos (`var`), los records y los bloques de texto.

 El lenguaje Java evoluciona con versiones LTS (Long-Term Support) como Java 17 y 21, que han añadido características que hacen el código más claro y conciso: la inferencia de tipos con `var` permite declarar variables locales sin repetir el tipo cuando es evidente (`var nombre = "Ana"`, el compilador sabe que es un `String`); los records son una forma breve de crear clases inmutables solo para guardar datos (`record Punto(int x, int y) {}`), evitando código repetitivo; y los bloques de texto (`"""..."""`) permiten escribir textos de varias líneas (JSON, HTML) de forma limpia; conocer el Java actual es importante porque el código profesional usa estas características y muestran hacia dónde va el lenguaje, complementando —que no sustituyendo— los fundamentos, y empezar con buenos hábitos prepara al desarrollador para el código real.

 **UT 1 · 0485**

 > características del Java moderno (`var`, records, bloques de texto) en el IDE

---

 ## Entorno moderno: dependencias (Maven/Gradle) e IA

 Programar hoy no es solo escribir código: es trabajar en un entorno con herramientas que gestionan el proyecto. La gestión de dependencias con Maven o Gradle permite que un proyecto declare las librerías externas que necesita y las descargue automáticamente, además de compilar y empaquetar el programa de forma estándar. Es imprescindible en cualquier proyecto real (evita descargar librerías a mano).

 Además, los formateadores y linters automáticos mantienen el código limpio y uniforme (indentación, estilo), y detectan errores y malas prácticas al escribir.

 Una novedad que está transformando la programación es la IA asistente (como GitHub Copilot): herramientas que sugieren código, lo explican o ayudan a corregirlo mientras programas. Bien usadas, aceleran el trabajo; pero deben usarse con criterio: el desarrollador tiene que entender y revisar siempre lo que la IA genera (puede equivocarse o no encajar en el contexto), porque la responsabilidad del código es suya.

 Para el desarrollador DAM, conocer el entorno moderno (Maven/Gradle, linters) y la IA lo sitúa en la forma real de trabajar hoy. Refleja cómo el desarrollo actual se apoya en la gestión de dependencias, el formateo automático y los asistentes de IA usados con criterio.

 Programar hoy es trabajar en un entorno con herramientas que gestionan el proyecto: la gestión de dependencias con Maven o Gradle permite declarar las librerías externas que necesita un proyecto y descargarlas automáticamente, además de compilar y empaquetar de forma estándar (imprescindible en cualquier proyecto real), y los formateadores y linters mantienen el código limpio y uniforme detectando errores y malas prácticas; una novedad que transforma la programación es la IA asistente (GitHub Copilot), que sugiere código, lo explica o ayuda a corregirlo, y que bien usada acelera el trabajo pero debe usarse con criterio (el desarrollador tiene que entender y revisar siempre lo que genera, porque la responsabilidad es suya); conocer el entorno moderno y la IA sitúa al desarrollador en la forma real de trabajar hoy.

 **UT 1 · 0485**

 > entorno moderno de desarrollo (gestión de dependencias Maven/Gradle y asistente de IA)

---

 # Mini proyecto guiado

 ## Análisis y trazado de un programa con conversiones. Elementos de un programa.

 **Paso 1:** Escribe un programa Java sencillo (clase + `main`) que calcule algo (por ejemplo, el precio con IVA).

 **Paso 2:** Declara variables con sus tipos y una constante (`final`); usa operadores y una conversión de tipo.

 **Paso 3:** Comenta el código (línea y Javadoc) explicando sus partes.

 **Paso 4:** Traza el programa paso a paso, anotando el valor de cada variable, e identifica todos sus elementos.

 **Entregable:** análisis y trazado de un programa identificando sus elementos, con conversiones de tipo.

 **UT 1 · 0485**

---

 # Ejercicio

 ## Analiza y escribe los elementos de un programa.

 ### Requisitos

 - Escribe un programa Java con su estructura (clase, `main`, bloques) y comentarios.
- Declara variables con distintos tipos de datos y una constante.
- Usa operadores aritméticos, de comparación y lógicos en expresiones.
- Realiza una conversión de tipo (implícita y explícita) y traza el resultado.

---

 # Resumen profesionalizante

 Con este conocimiento, ahora estás preparado para:

 - Reconocer la estructura de un programa informático.
- Escribir y comentar el código correctamente.
- Declarar variables y usar los tipos de datos.
- Emplear operadores y construir expresiones.
- Realizar conversiones de tipo.
- Compilar y ejecutar un programa desde la línea de órdenes y desde un entorno integrado de desarrollo.
- Crear un proyecto y organizar sus clases en paquetes.
- Trazar el resultado de una expresión aplicando la precedencia de los operadores.

 **UT 1 · 0485**

 **23**