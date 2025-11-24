document.addEventListener("DOMContentLoaded", initializeUI);

function initializeUI() {
    searchBar();
    scrollToTop();
    menuMobile();
    modalLogin();
    carruselConfig();
    contactForm();
    registerForm();
}

/* BARRA DE BÚSQUEDA */
function searchBar() {
    document.querySelector(".fa-search").addEventListener("click", function() {
        let input = document.querySelector("#search-input");
        if(!input.classList.contains("invisible") && input.value !== "") {
            // Cambiamos los espacios por el símbolo +
            let text = input.value.replace(" ", "+");
            window.open('https://www.google.com/search?q=my+company+'+text, '_blank');            
        }
        input.classList.toggle("invisible");
        input.value = "";
    });
}

/* SCROLL TO TOP MOBILE */
function scrollToTop() {
    document.querySelector("#home-btn").addEventListener("click", scroll(0, 0));
}

/* MENU MOBILE */
function menuMobile() {
    document.querySelector("#menu-mobile-btn").addEventListener("click", function () {
        let menu = document.querySelector(".menu-mobile");
        menu.classList.toggle("show-from-left");
    });

    document.querySelector("#mobile-close").addEventListener("click", function () {
        let menu = document.querySelector(".menu-mobile");
        menu.classList.toggle("show-from-left");
    });
}

/* VENTANA MODAL DE LOGIN */
function modalLogin() {
    document.querySelector("#login-button")
        .addEventListener("click", toggleModalVisible);
    document.querySelector(".modal-close")
        .addEventListener("click", toggleModalVisible);
}

function toggleModalVisible() {
    let modal = document.querySelector(".modal-popup");
    modal.classList.toggle("modal-visible");

    let bg = document.querySelector(".modal-background");
    bg.classList.toggle("modal-visible");
}

/* CARRUSEL */
function carruselConfig() {
    let carrusel = document.querySelector("#carrusel");
    // Si la página no contiene este elemento, 
    // salimos de la función
    if(carrusel == null) 
        return;

    const maxImages = 4;
    const path = "images/carrusel/";
    setInterval(function () {
                    changeImg(path, maxImages)
                }, 3000);
}

function changeImg(path, maxImages) {
    let img = document.querySelector(".carrusel img");

    let currentNumber = extractCurrentNumber(img.src);
    if (!isNaN(currentNumber)) {
        let newImg = currentNumber + 1;
        if (newImg > maxImages) {
            newImg = 1;
        }
        img.src = path + newImg + ".jpg";
    }

}

// Extrae el 1 de un texto como "images/carrusel/1.jpg"
function extractCurrentNumber(text) {
    // Troceamos el texto por los "/" y obtenemos un array con los trozos
    let array = text.split("/");
    // Nos quedamos con el último trozo (1.jpg)
    let fileName = array[array.length - 1];
    // Troceamos por el "." y nos quedamos con el primer trozo
    let txtNumber = fileName.split(".")[0];
    return Number(txtNumber);
}


/* CONTACT FORM */
function contactForm() {
    let interest = document.querySelector("select");
    
    // Si la página no contiene este elemento, salimos del método
    if(interest == null) 
        return;

    interest.addEventListener("click", function () {
        const software = ["Spotybar", "B2B Solution", "Text2Voice"];
        const hardware = ["Cloud computing", "Hosting"];

        // Seleccionamos y activamos el selector múltiple 
        // para la carga de datos
        let detail = document.querySelector("#detail-opt");
        detail.disabled=false;

        // Preparamos los datos
        let array = [];
        
        // this se refiere al selector de intereses al que se asocia
        // este manejador de evento
        switch (this.value) {
            case "":
                detail.disabled=true;
                break;
            case "software":
                array = software;
                break;
            case "hardware":
                array = hardware;
                break;
            case "both":
                array = software;
                for(let elem of hardware) {
                    array.push(elem);
                }
                break;
        }
        
        // Clonamos el nodo sin sus hijos
        let clone = detail.cloneNode(false);

        // Rellenamos el elemento clonado con los datos del array
        for(let elem of array) {
            let opt = document.createElement("option");
            opt.value = elem;
            opt.innerText = elem;
            clone.appendChild(opt);
        }

        // Y reemplazamos el que había por el nuevo
        detail.replaceWith(clone);
    })

}

/* REGISTER FORM */
function registerForm() {
    let btn = document.querySelector("#register-submit-btn");
    
    // Si la página no contiene este elemento, salimos de la función
    if(btn == null) 
        return;
    
    btn.addEventListener("click", function(event) {
        let pass1 = document.querySelector("#password1");
        let pass2 = document.querySelector("#password2");
        let error = document.querySelector("#register-error");
        if(pass1.value !== pass2.value) {
            event.preventDefault();
            error.classList.remove("invisible");
        } else {
            error.classList.add("invisible");
        }
    });

    let eye1 = document.querySelector(".pass-eye1");
    eye1.addEventListener("mousedown", function() {
        let pass1 = document.querySelector("#password1");
        pass1.type = "text";
    });

    eye1.addEventListener("mouseup", function() {
        let pass1 = document.querySelector("#password1");
        pass1.type = "password";
    });

    let eye2 = document.querySelector(".pass-eye2");
    eye2.addEventListener("mousedown", function() {
        let pass1 = document.querySelector("#password2");
        pass1.type = "text";
    });

    eye2.addEventListener("mouseup", function() {
        let pass2 = document.querySelector("#password2");
        pass2.type = "password";
    });
}