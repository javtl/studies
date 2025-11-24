//CAMBIAR CONTENIDO ELEMENTOS
let titulo = document.querySelector("h1");

titulo.innerText = "Nuevo título";        // Cambia solo el texto
titulo.innerHTML = "<em>Nuevo título</em>"; // Cambia incluyendo HTML

// MODIFICAR CLASE CSS 

let boton = document.querySelector(".btn");

boton.classList.add("activo");
boton.classList.remove("inactivo");
boton.classList.toggle("visible");
console.log(boton.classList.contains("activo"));

//MODIFICAR PROPIEDADES DIRECTAS

boton.className = "btn-grande"; // Sobrescribe las clases
boton.style.backgroundColor = "blue";
boton.style.fontSize = "20px";

// INSERTAR Y ELIMINAR
    //crear
    let parrafoNuevo = document.createElement("p");
    parrafoNuevo.innerText = "Soy un nuevo párrafo";


    //insertar 
    document.body.appendChild(parrafoNuevo);


    //eliminar 
    let viejoParrafo = document.querySelector("p");
    document.body.removeChild(viejoParrafo);

// OTRAS OPERACIONES DE NODOS
let clon = parrafoNuevo.cloneNode(true);
document.body.appendChild(clon);

