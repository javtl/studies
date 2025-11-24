//Crea una función divideNumeros(a, b) 
// que compruebe que los parámetros a y b 
// son números 
//válidos antes de realizar la suma de ambos.
//  Si todo está correcto se debe devolver 
// la división 
//a/b. Si alguno de los parámetros no es 
// un número o bien b = 0 entonces 
// se debe devolver el 
//valor NaN. Posteriormente en el script, 
// llama a la función que has creado probando
//  los 3 casos posibles.
function divideNumeros(a, b) {
    // Verificar si ambos son números
    if (typeof a !== "number" || typeof b !== "number") {
      return NaN; // Alguno no es un número
    }
    
    // Verificar si b es 0
    if (b === 0) {
      return NaN; // No se puede dividir entre 0
    }
    
    // Realizar la división
    return a / b;
  }
  
  // Probando los 3 casos posibles
  console.log(divideNumeros(10, 2));    // Caso válido: 5
  console.log(divideNumeros(10, 0));    // Caso inválido: NaN (división entre 0)
  console.log(divideNumeros(10, "2"));  // Caso inválido: NaN (b no es un número)
  