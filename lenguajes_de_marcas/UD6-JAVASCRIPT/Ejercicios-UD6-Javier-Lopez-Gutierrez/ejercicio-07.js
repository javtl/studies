//Crea una función llamada dimeTuNombre 
// que el pregunte al usuario su nombre 
// y compruebe 
//que  el  valor  introducido  no  está  vacío
//ni  es  un  número.  En  el  caso  de  que  sea  un  nombre  
//válido  se  debe  retornar  dicho  nombre.
// En  caso  contrario  se  debe  imprimir
// una  alerta  que  
//informe al usuario de su error y se le vuelve
//  a pedir el nombre de nuevo 
// hasta que lo meta correctamente.
// Posteriormente, llama a la función que has creado
// e imprime el valor devuelto en la consola. 

function dimeTuNombre() {
    let nombre;
  
    do {
      // Pedimos el nombre al usuario
      nombre = prompt("Por favor, introduce tu nombre:");
  
      // Validamos que no esté vacío y que no sea un número
      if (!nombre || !isNaN(nombre)) {
        alert("Error: El valor introducido no es válido. Por favor, introduce un nombre.");
      }
    } while (!nombre || !isNaN(nombre)); // Repetir mientras sea inválido
  
    return nombre; // Devolver el nombre válido
  }
  
  // Llamamos a la función y mostramos el resultado en consola
  const nombreValido = dimeTuNombre();
  console.log(`Tu nombre es: ${nombreValido}`);
  