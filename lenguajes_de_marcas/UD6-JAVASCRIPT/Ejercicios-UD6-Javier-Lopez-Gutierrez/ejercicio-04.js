//  Realiza un script que muestre en la consola
//  el siguiente menú al usuario: 
//  MENU CALCULÍN
//  1 – Calcular el cuadrado de un número
//  2 – Calcular el 20% de un número
//  3 – Calcular la mitad de un número  

//  A continuación, se debe hacer uso de un prompt 
//  para pedir la opción escogida por el usuario.  
//  Si el número está comprendido entre 1 y 3 
//  entonces se pedirá al usuario que introduzca el 
//  número y se mostrará en la consola el resultado del cálculo 
//  correspondiente. 
//  Si  el  número  no  era  ninguno  de  los  del  menú  entonces  
//  se  mostrará  el  mensaje  
//  "Opción incorrecta" y el programa terminará. 
// Mostramos el menú al usuario
console.log("MENU CALCULÍN");
console.log("1 – Calcular el cuadrado de un número");
console.log("2 – Calcular el 20% de un número");
console.log("3 – Calcular la mitad de un número");

// Pedimos al usuario que elija una opción
const opcion = Number(prompt("Elige una opción del menú (1, 2 o 3):"));

if (opcion >= 1 && opcion <= 3) {
  // Si la opción es válida, pedimos un número
  const numero = Number(prompt("Introduce un número:"));

  switch (opcion) {
    case 1:
      console.log(`El cuadrado de ${numero} es ${numero ** 2}`);
      break;
    case 2:
      console.log(`El 20% de ${numero} es ${numero * 0.2}`);
      break;
    case 3:
      console.log(`La mitad de ${numero} es ${numero / 2}`);
      break;
  }
} else {
  // Si la opción no es válida
  console.log("Opción incorrecta");
}
