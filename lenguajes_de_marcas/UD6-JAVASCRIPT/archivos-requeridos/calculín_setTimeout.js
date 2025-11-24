console.log("MENU CALCULÍN");
console.log("1 – Calcular el cuadrado de un número");
console.log("2 – Calcular el 20% de un número");
console.log("3 – Calcular la mitad de un número");

setTimeout(() => {
  let opcion = prompt("Escoge una opción: ");
  let numero = Number(prompt("Dime tu número: "));

  switch(opcion) {
    case "1":
      console.log("El cuadrado de "+numero+" es "+numero*numero);
      break;
    case "2":
      console.log("El 20% de "+numero+" es "+numero*20/100);
      break;
    case "3":
      console.log("La mitad de "+numero+" es "+numero/2);
      break;
    default:
      console.log("Opción incorrecta");
  }
}, 100);