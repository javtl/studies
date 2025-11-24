//let 
let edad = 33;

//const - declara una variable que no puede cambiar
const pi = 3.14;

//var - fuera de uso 

// DATOS PRIMITIVOS
let numero = 5;

let cadena ="Hola esto es una frase";

let verdadero = true;
let falso = false;
let sinValor; // existe pero no tiene valor = null

//COMPARADORES
"5" == 5; // true -> compara solo valor
"5" === 5; // false -> compara valor y tipo 

//VENTANAS EN EL NAVEGADOR
alert("Hola"); // muestra un mensaje 
confirm("¿Estás seguro?"); // devuelve true ó false
prompt("Dime tu edad: "); // devuelve un string

//  FUNCIONES
function muestraSuma(num1, num2){
    let suma = num1 + num2;

    console.log(suma);
}
    //llamar a la función 
    let a = 1, b = 2;
    muestraSuma(a,b);

    // usar return
    function sumaReturn(num1, num2){
        return num1 + num2;

    }
    let resultado = returnSuma(4,5);


//OBJETOS
let usuario = { name: "Juan", age:30};
console.log(usuario);
console.log(usuario.age);

    // Usar propiedades con espacios
    let usuarioCompleto = {'nombre completo': "Juan Pérez"};
    console.log(usuarioCompleto['nombre completo']);

//ARRAYS
 let array=[1,2,3,4];
 for (let i = 0;i<array.length;i++){
    console.log("posición: " + i +" = "+ array[i]);
 }
    //MÉTODOS COMUNES
    
    let numeros =[1,2,3,4,5];

    //push()
    numeros.push(6); // añade elemento al final

    //pop()
    numeros.pop(); //elimina el ultimo elemento 

    //unshift()
    numeros.unshift(0); // añade al principio

    //shift()
    numeros.shift() //elimina el primer elemento

    //indexOf()
    let colores = [ "rojo", "verde", "azul"];
    colores.indexOf("rojo"); // devuelve la posición 1
    colores.indexOf("amarillo"); // devuelve -1 por qué no se encuentra







