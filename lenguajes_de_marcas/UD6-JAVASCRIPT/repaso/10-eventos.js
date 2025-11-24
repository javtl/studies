// ESCUCHAR EVENTOS
let clon = parrafoNuevo.cloneNode(true);
document.body.appendChild(clon);

//ejemplos
document.addEventListener("DOMContentLoaded", function() {
    console.log("La página ha terminado de cargar el HTML");
});

window.addEventListener("load", function() {
    console.log("Toda la página (incluidas imágenes) ha cargado");
});

let input = document.querySelector("input");

input.addEventListener("focus", function() {
    console.log("El input está activo");
});

input.addEventListener("blur", function() {
    console.log("El input dejó de estar activo");
});

