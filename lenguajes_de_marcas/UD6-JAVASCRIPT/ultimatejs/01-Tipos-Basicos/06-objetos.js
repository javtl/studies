//Personaje de TV
let nombre = "Tanjiro";
let anime = "Demos Slayer";
let edad = 16;

let personaje={
    nombre: "Tanjiro",
    anime: "Demon Slayer",
    edad: 16,
};

console.log(personaje);
console.log(personaje.nombre);
console.log(personaje['anime']);

personaje.edad=17;
personaje['edad']=18;
