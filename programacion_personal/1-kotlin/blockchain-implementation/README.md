# kCoin 🪙  
**Implementación básica de una Blockchain en Kotlin**  

Proyecto basado en el artículo de [Vasily Fomin: *Let’s implement a cryptocurrency in Kotlin. Part 1: Blockchain*](https://medium.com/@vasilyf/lets-implement-a-cryptocurrency-in-kotlin-part-1-blockchain-8704069f8580).  

El objetivo es construir una blockchain sencilla, funcional y educativa que sirva como punto de partida para comprender los fundamentos de las criptomonedas.  

---

## ✨ Características  
- Implementación en **Kotlin**  
- Uso de **clases de datos** para modelar bloques  
- Hashing con **SHA-256**  
- Implementación de **minado (Proof of Work)** con dificultad ajustable  
- Validación de la cadena de bloques  
- < 100 líneas de código 🎉  

---

## 📂 Estructura básica
- `Block` → modelo de bloque con `previousHash`, `data`, `timestamp`, `hash` y `nonce`.  
- `Blockchain` → contenedor de bloques + funciones de validación.  
- `HashUtils` → extensión de `String` para generar SHA-256 en formato hexadecimal.  
- `Mining` → algoritmo de prueba de trabajo (nonce + dificultad).  

---

## ⚙️ Instalación y ejecución

### 1. Requisitos previos
- [IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/download/)  
- JDK 8+  
- Kotlin configurado en el IDE  

### 2. Clonar el repositorio
```bash
git clone https://github.com/VasilyFomin/kCoin.git
cd kCoin
````

### 3. Ejecutar

Abrir el proyecto en IntelliJ y ejecutar la clase principal (`Main.kt`).

---

## 🏗️ Ejemplo de salida

```text
Block(previousHash=0, data=I'm the first, timestamp=1530024961908, hash=dc5e733f548bc8240d04f02884ead8c2ddb4a2add0606277bd8ec7c75983d793)
Block(previousHash=dc5e733f548bc8240d04f02884ead8c2ddb4a2add0606277bd8ec7c75983d793, data=I'm the second, timestamp=1530024961935, hash=1621970956c63d89e077a9122e122fa45ba86d5f478f4fa2b4d7b6cf3f39efa7)
Block(previousHash=1621970956c63d89e077a9122e122fa45ba86d5f478f4fa2b4d7b6cf3f39efa7, data=I'm the third, timestamp=1530024961936, hash=d5a1d82930d157013adb2f8bfb90449dbae66b768c211a207202a80f478d4f64)
```

---

## ✅ Validación

Una blockchain es válida si:

1. Está vacía o tiene un solo bloque válido.
2. Todos los bloques fueron minados.
3. Cada bloque tiene un `hash` válido.
4. Cada `previousHash` corresponde al bloque anterior.

---

## 📖 Próximos pasos (Parte 2 del artículo)

* Añadir **transacciones** dentro de los bloques.
* Implementar una **criptomoneda simple** basada en la blockchain.

---

## 🔗 Recursos

* Artículo original: [Medium - Let’s implement a cryptocurrency in Kotlin (Part 1)](https://medium.com/@vasilyf/lets-implement-a-cryptocurrency-in-kotlin-part-1-blockchain-8704069f8580)
* Código fuente: [GitHub - VasilyFomin/kCoin](https://github.com/VasilyFomin/kCoin)
* Inspirado en: [Build your own X](https://github.com/codecrafters-io/build-your-own-x)

---

## 🧑‍💻 Autor original

**Vasily Fomin** – [@vasilyf](https://medium.com/@vasilyf)

---

## 📜 Licencia

MIT License © 2018 Vasily Fomin



---

👉 Te lo he dejado listo para poner directamente en tu carpeta del proyecto como `README.md`.  

¿Quieres que lo adapte **más a ti** (por ejemplo, indicando que es un **fork/estudio personal** en lugar de un simple mirror del repo original)?
```
