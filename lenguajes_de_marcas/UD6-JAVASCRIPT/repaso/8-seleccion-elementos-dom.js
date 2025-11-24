
//document.querySelector("selectorCSS")
document.querySelector("p");
document.querySelector(".nav-bar");
document.querySelector("#footer");

//document.querySelectorAll("selectorCSS")
let parrafos = document.querySelectorAll("p");
parrafos.forEach(p => console.log(p.innerText));

//document.getElementById("id")
let titulo = document.getElementById("titulo-principal");
console.log(titulo.innerText);


//document.getElementsByTagName("nombreEtiqueta")
let imagenes = document.getElementsByTagName("img");
console.log(imagenes.length);

//document.getElementsByClassName("nombreClase")
let botones = document.getElementsByClassName("btn");
console.log(botones[0]);




