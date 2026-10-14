# Unidad 2. Utilización de objetos

## Índice de contenidos

- Objetivos de la unidad
- Introducción
- 1\. Objetos y clases
    - 1.1. Características de los objetos
    - 1.2. Instanciación de objetos
- 2\. Uso de miembros
    - 2.1. Métodos, propiedades, métodos estáticos y constructores
    - 2.2. Destrucción de objetos y liberación de memoria
- 3\. Bibliotecas de clases: paquetes, import y API estándar
    - 3.1. Paquetes de la API e instrucción import
    - 3.2. Leer la documentación y usar clases nuevas
- 4\. Trabajar con objetos: parámetros, igualdad y envoltorios
    - 4.1. Paso de parámetros
    - 4.2. Igualdad de objetos y clases envoltorio
    - 4.3. El valor null y los fallos que provoca
- Ampliación y actualización
- Mini proyecto guiado
- Ejercicio
- Resumen profesionalizante

---

## Objetivos de la unidad

Al finalizar esta unidad, serás capaz de:

- Comprender qué es un objeto y una clase.
- Instanciar objetos a partir de clases.
- Utilizar los métodos y las propiedades de un objeto.
- Diferenciar los métodos estáticos y los constructores.
- Entender la destrucción de objetos y la liberación de memoria.
- Incorporar y utilizar bibliotecas de clases mediante paquetes e instrucciones `import`.
- Consultar la documentación de la API de Java.
- Explicar cómo se pasan los objetos como parámetros y comparar objetos correctamente.

## Introducción

### Preguntas para reflexionar

- ¿Qué es un objeto en programación y en qué se parece a un objeto real?
- ¿Cómo se crea y se usa un objeto de una clase ya existente?
- ¿Qué pasa con los objetos cuando ya no se usan?

Esta unidad introduce la **programación orientada a objetos (POO)**, el paradigma central de Java.

Antes de crear tus propias clases, aprenderás a utilizar objetos de clases que ya existen en la biblioteca de Java.

Comprenderás:

- Qué son los objetos y las clases.
- Cómo instanciar objetos utilizando `new`.
- Cómo utilizar sus métodos y propiedades.
- Qué diferencia existe entre los métodos de instancia, los métodos estáticos y los constructores.
- Qué ocurre con los objetos cuando dejan de utilizarse.
- Cómo funciona el recolector de basura y la liberación de memoria.

El objetivo práctico es desarrollar programas sencillos que instancien y utilicen objetos de clases de la biblioteca estándar de Java.

---

# 1\. Objetos y clases

## 1.1. Características de los objetos

La **programación orientada a objetos (POO)** modela los programas como un conjunto de objetos que colaboran entre sí.

Un objeto representa una entidad con datos y comportamiento, como los objetos del mundo real.

### ¿Qué es un objeto?

Un objeto tiene tres características fundamentales:

- **Estado (atributos o propiedades):** los datos que describen al objeto. Por ejemplo, un coche tiene marca, color y velocidad.
- **Comportamiento (métodos):** las acciones que puede realizar. Por ejemplo, un coche puede acelerar y frenar.
- **Identidad:** cada objeto es único, aunque tenga los mismos datos que otro objeto.

### ¿Qué es una clase?

Una clase es el **molde o plantilla a partir del cual se crean los objetos**. Define los atributos y los métodos que tendrán sus instancias.

Una analogía sencilla:

- **Clase:** el plano de una casa.
- **Objeto:** una casa construida a partir de ese plano.

De una misma clase `Coche` se pueden crear muchos objetos diferentes.

### Ventajas de la POO

- Organiza el código de forma modular y reutilizable.
- Permite modelar el mundo real de manera natural.
- Facilita el mantenimiento y la ampliación de los programas.

### Los objetos en Java

En Java se utilizan tanto objetos como tipos primitivos. La biblioteca estándar ofrece miles de clases ya preparadas, como `String`, `Scanner` y `LocalDate`, que podemos utilizar directamente.

Comprender que un objeto tiene estado, comportamiento e identidad, y que una clase es su molde, constituye la base de la programación orientada a objetos.

## 1.2. Instanciación de objetos

**Instanciar un objeto** significa crearlo a partir de una clase.

En Java se utiliza el operador `new`, que crea el objeto y devuelve una referencia a él.

### Crear objetos

```
Scanner teclado = new Scanner(System.in);
LocalDate hoy = LocalDate.now();
StringBuilder sb = new StringBuilder();
```

La sintaxis general de instanciación es:

```
Tipo nombre = new Constructor(argumentos);
```

Sus componentes son:

- **Tipo:** la clase del objeto, como `Scanner`.
- **Nombre:** la variable que almacenará la referencia al objeto.
- **`new`****:** crea el objeto.
- **Constructor:** inicializa el objeto y puede recibir argumentos.

### Las referencias a objetos

La variable no contiene directamente el objeto, sino una **referencia que apunta al objeto en memoria**.

Dos variables pueden referenciar el mismo objeto. Si una modifica su estado, los cambios también serán visibles a través de la otra referencia.

### Objetos de la biblioteca estándar

Muchas clases de Java se pueden utilizar directamente:

| Clase | Utilidad |
| --- | --- |
| `Scanner` | Leer datos introducidos por teclado. |
| `String` | Trabajar con texto. |
| `Math` | Realizar operaciones matemáticas. |
| `LocalDate` | Trabajar con fechas. |
| `LocalTime` | Trabajar con horas. |

No todas estas clases se crean del mismo modo. Por ejemplo, `Scanner` se instancia con `new`, mientras que `LocalDate` permite obtener objetos mediante métodos estáticos como `now()`.

### El valor `null`

El valor `null` representa una referencia que no apunta a ningún objeto.

Intentar acceder a un método o propiedad a través de una referencia nula provoca una excepción `NullPointerException`.

```
String nombre = null;

// Provoca NullPointerException.
System.out.println(nombre.length());
```

Saber instanciar objetos y entender cómo funcionan las referencias es esencial para trabajar con la POO.

### Ejemplo práctico: leer datos del usuario

**Contexto:** un desarrollador necesita un programa que lea datos por teclado y trabaje con fechas.

**Estrategia:**

1. Instancia un objeto `Scanner` para leer datos.
2. Utiliza métodos como `nextInt()` y `nextLine()`.
3. Emplea `LocalDate.now()` para obtener la fecha actual.
4. Combina objetos y métodos de la biblioteca estándar sin tener que implementar sus clases.

```
import java.time.LocalDate;
import java.util.Scanner;

public class Bienvenida {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = teclado.nextLine();

        LocalDate hoy = LocalDate.now();

        System.out.println("Hola, " + nombre);
        System.out.println("Hoy es " + hoy);

        teclado.close();
    }
}
```

**Resultado:** el programa reutiliza clases existentes y resuelve la tarea con poco código.

### En la práctica

- Un objeto tiene estado y comportamiento; la clase es su molde.
- Los objetos se pueden instanciar mediante `new`.
- Las variables de referencia no contienen directamente los objetos.
- Hay que tener cuidado con `null`.
- Es recomendable aprovechar las clases que ya proporciona Java.

**Errores frecuentes**

- Creer que para utilizar un objeto hay que programar toda su clase.
- Pensar que una variable contiene el objeto directamente.

Reutilizar clases existentes es una de las grandes ventajas de la programación orientada a objetos.

---

# 2\. Uso de miembros

## 2.1. Métodos, propiedades, métodos estáticos y constructores

Una vez creado un objeto, se utiliza a través de sus miembros: métodos y propiedades.

También hay que distinguir entre métodos de instancia, métodos estáticos y constructores.

### Acceso a los miembros: operador punto

El operador punto (`.`) permite acceder a los métodos y propiedades de un objeto, siempre que su visibilidad lo permita.

```
String nombre = "Ana";

int longitud = nombre.length();
String mayusculas = nombre.toUpperCase();

System.out.println(longitud);     // 3
System.out.println(mayusculas);   // ANA
```

### Métodos de instancia

Son las acciones que puede realizar un objeto concreto.

Se invocan mediante la referencia al objeto:

```
objeto.metodo(argumentos);
```

Pueden recibir parámetros y devolver un valor.

### Propiedades y atributos

Representan los datos o el estado del objeto.

Se accede a ellos mediante el operador punto cuando su visibilidad lo permite.

### Métodos estáticos

Los métodos estáticos se declaran con `static` y pertenecen a la clase, no a una instancia concreta.

Se invocan utilizando el nombre de la clase, sin necesidad de crear un objeto.

```
double raiz = Math.sqrt(16);
LocalDate hoy = LocalDate.now();
```

En estos ejemplos:

- `Math.sqrt(16)` calcula la raíz cuadrada de 16.
- `LocalDate.now()` obtiene la fecha actual.

### Constructores

Un constructor es un miembro especial que se ejecuta al crear un objeto mediante `new`. Se utiliza para inicializarlo.

Sus características son:

- Tiene el mismo nombre que la clase.
- Puede recibir argumentos o no recibir ninguno.
- Una clase puede tener varios constructores con diferentes listas de parámetros. Esto se denomina **sobrecarga de constructores**.

Ejemplo:

```
Scanner teclado = new Scanner(System.in);
StringBuilder texto = new StringBuilder();
```

### Comparativa de miembros

| Miembro | Qué es | Cómo se utiliza | Ejemplo |
| --- | --- | --- | --- |
| Método de instancia | Acción de un objeto. | Sobre un objeto concreto. | `nombre.length()` |
| Propiedad o atributo | Dato del objeto. | Mediante una referencia, según su visibilidad. | `objeto.propiedad` |
| Método estático | Operación perteneciente a la clase. | Con el nombre de la clase. | `Math.sqrt(16)` |
| Constructor | Inicializa un objeto. | Mediante `new`. | `new Scanner(System.in)` |

Comprender estas diferencias es esencial para manejar objetos correctamente.

## 2.2. Destrucción de objetos y liberación de memoria

Cuando un objeto deja de utilizarse, la memoria que ocupa puede liberarse.

En Java, esta tarea se realiza automáticamente mediante el **recolector de basura**, también conocido como _garbage collector_ (GC).

### El problema de la memoria

Cada objeto ocupa memoria. Si un programa mantiene referencias a objetos que ya no necesita, puede consumir cada vez más memoria y provocar una fuga de memoria.

### El recolector de basura

El GC es un mecanismo automático que:

- Detecta los objetos que ya no son alcanzables desde las referencias activas del programa.
- Recupera la memoria que ocupan cuando corresponde.
- Evita que el programador tenga que liberar manualmente la memoria de cada objeto.

### ¿Cuándo deja de ser necesario un objeto?

Cuando un objeto deja de ser alcanzable, puede convertirse en candidato para la recolección de basura.

```
Persona p = new Persona("Ana");

p = null;
```

Si no existen otras referencias al objeto `Persona("Ana")`, este podrá ser recolectado por el GC.

La recolección no tiene por qué ocurrir inmediatamente.

### Papel del programador

Aunque Java libera la memoria automáticamente, el programador debe evitar mantener referencias innecesarias que impidan recuperar objetos que ya no se necesitan.

Java no utiliza destructores deterministas como los de algunos otros lenguajes. La liberación de memoria de los objetos se gestiona mediante el GC.

### Ejemplo práctico: programas que utilizan objetos

**Contexto:** el entregable de la unidad consiste en escribir programas sencillos que instancien y utilicen objetos de la biblioteca de Java.

**Estrategia:** desarrollar programas que:

1. Instancien un `Scanner` y utilicen sus métodos para leer datos.
2. Utilicen métodos estáticos de `Math`.
3. Creen objetos `String` y empleen métodos como `length()`, `toUpperCase()` y `substring()`.
4. Trabajen con fechas mediante `LocalDate`.
5. Utilicen constructores con y sin argumentos.
6. Documenten y prueben cada programa.

**Resultado:** programas funcionales que aplican los fundamentos de la POO, incluidos objetos, métodos, constructores y gestión de memoria.

### En la práctica

- Accede a los miembros mediante el operador punto.
- Invoca los métodos estáticos con el nombre de la clase.
- Utiliza los constructores para inicializar objetos.
- Evita mantener referencias innecesarias.
- Deja que el recolector de basura gestione la memoria de los objetos.

**Errores frecuentes**

- Creer que en Java hay que liberar manualmente la memoria de los objetos.
- Pensar que un método estático se invoca igual que uno de instancia.

Los métodos estáticos pertenecen a la clase, mientras que los métodos de instancia se invocan sobre objetos concretos.

---

# 3\. Bibliotecas de clases: paquetes, import y API estándar

Java incorpora miles de clases que permiten leer datos por teclado, manejar fechas, calcular raíces cuadradas y realizar muchas otras tareas sin tener que implementarlas desde cero.

El conjunto de clases, interfaces y otros elementos disponibles forma parte de la **API estándar de Java** (_Application Programming Interface_, interfaz de programación de aplicaciones).

Saber buscar y utilizar estas clases es una habilidad profesional fundamental.

## 3.1. Paquetes de la API e instrucción import

Las clases de la API están organizadas en paquetes.

Estos son algunos de los más utilizados:

| Paquete | Contenido principal | Ejemplos |
| --- | --- | --- |
| `java.lang` | Clases fundamentales del lenguaje. | `String`, `Math`, `Object`, `System`, `Integer`, `Double`. |
| `java.util` | Utilidades generales. | `Scanner`, `Random`, `List`, `Map`, `Set`, `Objects`, `Arrays`. |
| `java.time` | Fechas y horas. | `LocalDate`, `LocalTime`, `LocalDateTime`, `Duration`, `Period`, `DateTimeFormatter`. |
| `java.io` | Entrada, salida y flujos de datos. | Clases para trabajar con datos y ficheros. |
| `java.nio.file` | Operaciones con rutas y ficheros. | `Path`, `Files`. |
| `java.math` | Operaciones matemáticas de precisión arbitraria. | `BigDecimal`, `BigInteger`. |

El paquete `java.lang` se importa automáticamente, por lo que no es necesario escribir una instrucción `import` para utilizar sus clases.

### La instrucción import

Para utilizar una clase de otro paquete, normalmente se importa al principio del archivo Java.

La instrucción se coloca después de la declaración `package`, si existe, y antes de la primera declaración de tipo.

```
import java.util.Scanner;
import java.time.LocalDate;

public class Bienvenida {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        LocalDate hoy = LocalDate.now();

        System.out.println("Hoy es " + hoy);

        teclado.close();
    }
}
```

### Importar todas las clases de un paquete

También existe la importación con comodín:

```
import java.util.*;
```

Esta instrucción permite utilizar los tipos accesibles de `java.util` sin escribir su nombre completo en cada uso.

Aunque funciona, en proyectos profesionales suele preferirse importar explícitamente las clases necesarias, ya que facilita identificar su procedencia.

Además, cuando dos paquetes contienen clases con el mismo nombre, puede ser necesario utilizar el nombre completo de la clase para evitar ambigüedades.

Por ejemplo:

```
java.util.Date fecha;
java.sql.Date fechaSQL;
```

### Import estático

La importación estática permite utilizar directamente miembros estáticos de una clase sin repetir el nombre de esta.

```
import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circunferencia {
    public static void main(String[] args) {
        double radio = 2.5;

        System.out.println("Longitud: " + (2 * PI * radio));
        System.out.println("Área: " + (PI * pow(radio, 2)));
    }
}
```

Este recurso puede resultar cómodo para constantes matemáticas y determinados métodos de prueba.

### Bibliotecas externas

Además de la API estándar, un proyecto puede incorporar bibliotecas externas desarrolladas por terceros.

Estas bibliotecas suelen distribuirse como archivos `.jar` o como dependencias gestionadas mediante herramientas como Maven o Gradle.

Una vez añadidas al proyecto, sus clases pueden utilizarse mediante las instrucciones `import` correspondientes.

La creación y utilización de bibliotecas propias se estudia en unidades posteriores.

## 3.2. Leer la documentación y usar clases nuevas

Nadie memoriza toda la API de Java. Lo importante es aprender a consultar la documentación oficial, generada mediante Javadoc.

La documentación de cada clase suele organizarse en los siguientes apartados:

1. **Descripción general:** explica qué representa la clase y para qué sirve.
2. **Constructores:** muestra cómo crear objetos y qué argumentos admiten.
3. **Resumen de métodos:** presenta los métodos disponibles, sus parámetros y sus valores de retorno.
4. **Detalle de cada método:** explica su funcionamiento, los parámetros, el resultado y las excepciones que puede lanzar.

### Ejemplo 1. La clase Math

`Math` ofrece métodos estáticos para realizar operaciones matemáticas, por lo que no es necesario instanciarla.

```
double a = Math.abs(-4.5);       // 4.5: valor absoluto
double b = Math.pow(2, 10);      // 1024.0: potencia
double c = Math.sqrt(144);       // 12.0: raíz cuadrada
long d = Math.round(3.6);        // 4: redondeo
int e = Math.max(7, 12);         // 12: máximo
double f = Math.random();        // Valor entre 0.0 y 1.0

System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f);
```

### Ejemplo 2. La clase Random

A diferencia de `Math`, `Random` se instancia para crear un generador de números pseudoaleatorios.

Su método `nextInt(int límite)` devuelve un entero entre cero, incluido, y el límite, excluido.

```
java.util.Random azar = new java.util.Random();

int dado = azar.nextInt(6) + 1;          // De 1 a 6
int entre10y20 = azar.nextInt(11) + 10;  // De 10 a 20

System.out.println(dado + " " + entre10y20);
```

Para obtener un número entre 10 y 20, ambos incluidos, se utiliza `nextInt(11) + 10`, ya que existen once valores posibles.

### Ejemplo 3. La clase LocalDate

`LocalDate` representa una fecha sin hora y ofrece métodos estáticos para obtenerla o construirla.

```
java.time.LocalDate hoy = java.time.LocalDate.now();

java.time.LocalDate matricula =
        java.time.LocalDate.of(2025, 9, 15);

java.time.LocalDate limite = matricula.plusDays(30);

long dias = java.time.temporal.ChronoUnit.DAYS.between(
        matricula,
        limite
);

System.out.println("Del " + matricula + " al " + limite
        + " hay " + dias + " días");
```

`LocalDate` es una clase inmutable: sus métodos de modificación aparente, como `plusDays()`, devuelven un nuevo objeto en lugar de modificar el original.

La biblioteca resuelve correctamente cuestiones como la diferente duración de los meses y los años bisiestos.

**Conclusión:** antes de programar desde cero una funcionalidad habitual, conviene comprobar si la biblioteca estándar ya ofrece una solución.

---

# 4\. Trabajar con objetos: parámetros, igualdad y envoltorios

Al utilizar objetos aparecen tres cuestiones importantes:

- Qué ocurre cuando se pasa un objeto como argumento a un método.
- Cómo se comprueba si dos objetos son iguales.
- Cómo trabajar con tipos primitivos cuando se necesitan objetos.

## 4.1. Paso de parámetros: qué se copia realmente

En Java, **todos los parámetros se pasan por valor**.

Cuando el parámetro es un objeto, el valor que se copia es la referencia al objeto, no el objeto completo.

Esto tiene dos consecuencias fundamentales.

### Modificar un objeto desde un método

Un método puede modificar el estado de un objeto recibido como argumento. El cambio será visible fuera del método porque ambas referencias apuntan al mismo objeto.

### Reasignar una referencia dentro de un método

Un método no puede cambiar la variable original del llamador asignándole otro objeto. Solo modifica la copia local de la referencia.

### Ejemplo completo

```
import java.util.ArrayList;
import java.util.List;

public class PasoDeParametros {

    static void anadir(List<String> lista) {
        lista.add("Luis");
        // Modifica el objeto: el cambio se ve fuera.
    }

    static void reemplazar(List<String> lista) {
        lista = new ArrayList<>();
        // Reasigna la copia local de la referencia.
        lista.add("Marta");
    }

    static void incrementar(int n) {
        n = n + 1;
        // Modifica la copia del valor primitivo.
    }

    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Ana");

        anadir(nombres);
        System.out.println(nombres);
        // [Ana, Luis]

        reemplazar(nombres);
        System.out.println(nombres);
        // [Ana, Luis]: la lista original no ha cambiado.

        int contador = 5;

        incrementar(contador);
        System.out.println(contador);
        // 5: el valor original no ha cambiado.
    }
}
```

### Ideas clave

- Los objetos pueden modificarse desde un método si este recibe una referencia al objeto.
- Reasignar el parámetro no cambia la referencia original del llamador.
- Los tipos primitivos se pasan por valor, por lo que modificar el parámetro no cambia la variable original.
- Si se necesita garantizar que un método no modifique un objeto, puede ser necesario pasar una copia independiente.

Comprender este comportamiento evita errores como pensar que un método puede modificar directamente un entero recibido como argumento o no darse cuenta de que un método puede modificar una lista compartida.

## 4.2. Igualdad de objetos y clases envoltorio

### Comparar referencias con ==

En Java, el operador `==` compara referencias cuando se utiliza con objetos. Comprueba si ambas referencias apuntan al mismo objeto.

Para comparar el contenido de dos objetos se utiliza normalmente el método `equals()`, siempre que la clase implemente adecuadamente esa comparación.

```
String a = new String("hola");
String b = new String("hola");

System.out.println(a == b);       // false: objetos distintos
System.out.println(a.equals(b));  // true: mismo contenido

System.out.println(java.util.Objects.equals(a, b));
// true
```

### Comparación segura con Objects.equals()

El método `Objects.equals(a, b)` permite comparar dos referencias de forma segura incluso si alguna es `null`.

```
String nombre = null;

System.out.println(java.util.Objects.equals(nombre, "Ana"));
// false
```

En cambio, ejecutar `nombre.equals("Ana")` provocaría una `NullPointerException`.

### Otros métodos heredados de Object

Todos los objetos heredan métodos de `Object`, entre ellos:

- **`toString()`****:** devuelve una representación textual del objeto. Se utiliza implícitamente, por ejemplo, al imprimir un objeto con `System.out.println()`.
- **`hashCode()`****:** devuelve un valor entero utilizado, entre otras cosas, por colecciones basadas en tablas hash.

La forma de redefinir estos métodos en clases propias se estudia más adelante.

### Clases envoltorio o wrapper

Los tipos primitivos, como `int` y `double`, no son objetos. Para representar sus valores mediante objetos, Java dispone de las clases envoltorio.

| Tipo primitivo | Clase envoltorio |
| --- | --- |
| `byte` | `Byte` |
| `short` | `Short` |
| `int` | `Integer` |
| `long` | `Long` |
| `float` | `Float` |
| `double` | `Double` |
| `boolean` | `Boolean` |
| `char` | `Character` |

### Autoboxing y unboxing

Java convierte automáticamente entre determinados tipos primitivos y sus clases envoltorio.

- **Autoboxing:** conversión de un tipo primitivo a su objeto envoltorio.
- **Unboxing:** conversión de un objeto envoltorio a su tipo primitivo.

```
Integer envuelto = 42;  // Autoboxing: int -> Integer
int plano = envuelto;   // Unboxing: Integer -> int
```

Estas conversiones simplifican el código, aunque hay que tener cuidado: intentar convertir a primitivo una referencia envoltorio que sea `null` provoca una `NullPointerException`.

### Métodos de conversión

Las clases envoltorio proporcionan métodos para convertir texto en números y números en texto.

```
int numero = Integer.parseInt("1234");

double d = Double.parseDouble(
        "19,99".replace(',', '.')
);

String texto = Integer.toString(numero);

System.out.println(Integer.MAX_VALUE);
// 2147483647

System.out.println(numero + " " + d + " " + texto + " " + plano);
```

Los métodos más importantes son:

| Método | Función | Observaciones |
| --- | --- | --- |
| `Integer.parseInt("1234")` | Convierte texto a `int`. | Lanza `NumberFormatException` si el texto no representa un entero válido. |
| `Double.parseDouble("19.99")` | Convierte texto a `double`. | Espera el punto como separador decimal. |
| `Integer.toString(numero)` | Convierte un entero a texto. | Devuelve un `String`. |
| `Integer.MAX_VALUE` | Proporciona el máximo valor de `int`. | Su valor es `2147483647`. |

Si el texto no representa un número válido, los métodos de conversión pueden lanzar `NumberFormatException`. Este caso debe gestionarse cuando los datos proceden del usuario.

### Una trampa con Integer y el operador ==

```
Integer x = 100, y = 100;
Integer p = 1000, q = 1000;

System.out.println(x == y);       // true en este caso
System.out.println(p == q);       // false en este caso
System.out.println(p.equals(q));  // true
```

Java mantiene una caché de objetos `Integer` para determinados valores pequeños, que incluye el intervalo de -128 a 127.

Por eso, en este ejemplo, las referencias de `x` e `y` pueden apuntar al mismo objeto, mientras que `p` y `q` apuntan a objetos diferentes.

**Regla práctica:** no utilices `==` para comparar el valor numérico de objetos envoltorio. Utiliza `equals()` o convierte los valores a tipos primitivos cuando corresponda.

## 4.3. El valor null y los fallos que provoca

Una referencia puede no apuntar a ningún objeto. Este estado se representa mediante el valor `null`.

No debe confundirse con una cadena vacía (`""`) ni con el número cero (`0`).

Intentar acceder a un método o propiedad mediante una referencia nula provoca una `NullPointerException`.

### Orígenes habituales de null

Los valores nulos pueden proceder de distintas fuentes:

- Un atributo de una clase que todavía no se ha inicializado. Los atributos de tipo referencia tienen `null` como valor predeterminado.
- Un método que devuelve `null` para indicar que no ha encontrado un resultado.
- Un elemento de un array de referencias recién creado.

```
  String[] nombres = new String[5];
```

Inicialmente, sus cinco posiciones contienen referencias nulas.

- Un dato recibido de un fichero, formulario o base de datos que está ausente.

### Cómo evitar los errores con null

Existen varias estrategias.

#### 1\. Comprobar el valor antes de utilizarlo

```
if (nombre != null) {
    System.out.println(nombre.length());
}
```

Conviene realizar la comprobación cerca del punto en el que se recibe el dato.

#### 2\. Rechazar los valores nulos cuanto antes

El método `Objects.requireNonNull()` permite validar una referencia al entrar en un método.

```
import java.util.Objects;

static String saludar(String nombre) {
    Objects.requireNonNull(nombre, "El nombre no puede ser null");
    return "Hola, " + nombre;
}
```

Así, el error se detecta en el punto de entrada y no mucho después, cuando resulta más difícil identificar su origen.

#### 3\. Evitar devolver null cuando existen alternativas

Según el caso, un método puede devolver:

- Una colección vacía si no encuentra elementos.
- Un objeto `Optional` si debe representar un único valor que puede estar ausente.

### Ejemplo completo con Optional

```
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class SinNulos {

    static String saludar(String nombre) {
        Objects.requireNonNull(
                nombre,
                "El nombre no puede ser null"
        );

        return "Hola, " + nombre;
    }

    static Optional<String> buscar(
            List<String> lista,
            String inicial
    ) {
        for (String s : lista) {
            if (s.startsWith(inicial)) {
                return Optional.of(s);
            }
        }

        return Optional.empty();
    }

    public static void main(String[] args) {
        List<String> nombres = List.of("Ana", "Luis", "Marta");

        System.out.println(
                buscar(nombres, "M").orElse("No encontrado")
        );

        System.out.println(
                buscar(nombres, "Z").orElse("No encontrado")
        );

        // Comparación segura aunque una referencia sea nula.
        String sinValor = null;

        System.out.println(
                Objects.equals(sinValor, "Ana")
        ); // false

        try {
            System.out.println(saludar(null));
        } catch (NullPointerException e) {
            System.out.println("Rechazado: " + e.getMessage());
        }
    }
}
```

La primera búsqueda devuelve `Marta`; la segunda devuelve `No encontrado`.

`Optional` permite expresar que un resultado puede estar ausente sin utilizar `null` como resultado de la búsqueda.

Las versiones modernas de Java también proporcionan mensajes de `NullPointerException` más descriptivos, que ayudan a identificar qué referencia era nula.

---

# Ampliación y actualización

## Gestión de memoria moderna y objetos inmutables

Aunque el recolector de basura libera memoria automáticamente, comprender su funcionamiento ayuda a desarrollar programas más eficientes.

La clave está en las referencias: mientras un objeto siga siendo alcanzable desde el programa, el GC no puede liberarlo.

Las fugas de memoria en Java no se deben normalmente a olvidar liberar memoria manualmente, sino a mantener referencias que ya no se necesitan. Por ejemplo, una colección que crece indefinidamente puede seguir reteniendo objetos innecesarios.

### Objetos inmutables

Los objetos inmutables son aquellos cuyo estado no puede cambiar una vez creados.

Algunos ejemplos son:

- `String`.
- `LocalDate`.
- `LocalDateTime`.
- `Optional`.

Los _records_ de Java también facilitan la creación de tipos de datos que suelen diseñarse para ser inmutables, aunque un `record` no garantiza por sí solo la inmutabilidad profunda de todos sus componentes.

### Ventajas de la inmutabilidad

- Reduce los efectos secundarios inesperados.
- Facilita la comprensión y el mantenimiento del código.
- Simplifica el intercambio de datos entre partes de un programa.
- Puede facilitar el trabajo con varios hilos de ejecución.

Conocer la gestión de memoria y los objetos inmutables permite escribir código de mayor calidad.

## Documentación y pruebas unitarias desde el primer objeto

Un buen desarrollador no solo escribe código que funciona: también lo documenta y lo prueba.

### Documentación con Javadoc

Javadoc permite generar automáticamente documentación de clases, métodos y otros elementos del código Java.

Esta documentación ayuda a otros desarrolladores a comprender cómo utilizar el código sin necesidad de leer toda su implementación.

Documentar las clases y sus métodos desde el principio es una buena práctica profesional.

### Pruebas unitarias con JUnit

Las pruebas unitarias comprueban que cada parte del código, especialmente cada método, funciona correctamente de forma aislada.

JUnit es una de las herramientas más utilizadas para escribir pruebas automáticas en Java.

Sus ventajas son:

- Detectar errores pronto.
- Comprobar que los métodos devuelven los resultados esperados.
- Aportar confianza al modificar el código.
- Documentar mediante ejemplos cómo debe comportarse el programa.

Si las pruebas siguen pasando después de un cambio, existe mayor confianza en que no se ha introducido una regresión.

Adoptar la documentación y las pruebas unitarias desde el principio es una práctica esencial del desarrollo profesional.

---

# Mini proyecto guiado

## Programas que instancian y utilizan objetos

El objetivo es desarrollar programas que utilicen objetos de la biblioteca estándar de Java.

### Paso 1. Leer datos con Scanner

Escribe un programa que instancie un objeto `Scanner` y lea datos del usuario mediante sus métodos.

### Paso 2. Trabajar con String y Math

- Utiliza métodos estáticos de `Math`.
- Crea objetos `String`.
- Utiliza métodos como `length()`, `toUpperCase()` y `substring()`.

### Paso 3. Trabajar con fechas

- Utiliza `LocalDate.now()`.
- Emplea constructores con y sin argumentos cuando corresponda.
- Comprueba cómo se crean y utilizan los objetos de fechas.

### Paso 4. Documentar y probar

- Documenta las clases y los métodos con Javadoc.
- Escribe una prueba unitaria sencilla con JUnit.

**Entregable:** programas sencillos que instancien y utilicen objetos de clases de la biblioteca estándar de Java.

---

# Ejercicio

Escribe programas que utilicen objetos de Java.

## Requisitos

- Instanciar objetos de clases de la biblioteca, como `Scanner`, `String` y `LocalDate`, utilizando `new` o métodos de fábrica cuando corresponda.
- Utilizar métodos y propiedades mediante el operador punto.
- Emplear al menos un método estático.
- Utilizar constructores con y sin argumentos cuando sea aplicable.
- Documentar el código con Javadoc.
- Probar un método mediante una prueba unitaria con JUnit.

---

# Resumen profesionalizante

Al finalizar esta unidad, deberías ser capaz de:

- Comprender qué es un objeto y una clase.
- Instanciar objetos a partir de clases.
- Utilizar los métodos y las propiedades de un objeto.
- Diferenciar los métodos estáticos y los constructores.
- Entender la destrucción de objetos y la liberación de memoria.
- Incorporar y utilizar bibliotecas de clases mediante paquetes e instrucciones `import`.
- Consultar la documentación de la API de Java.
- Explicar cómo se pasan los objetos como parámetros.
- Comparar objetos correctamente mediante `equals()`.
- Comprender el funcionamiento de las clases envoltorio y las conversiones entre tipos primitivos y objetos.
- Identificar los problemas relacionados con `null` y prevenir excepciones.
- Aplicar buenas prácticas de gestión de memoria, documentación y pruebas unitarias.
