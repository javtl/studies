// window - representa toda la ventana del Navegador 
console.log(window.innerWidth) // ancho de la ventana
console.log(window.location.href) // URL actual

//navigator 
console.log(navigator.userAgent);

//location - URL actual
console.log(location.href);

//XMLHttpRequest
    //peticiones sin recargar la página

    let xhr = new XMLHttpRequest();
    xhr.open("GET", "https://api.github.com/users/octocat");
    xhr.onload = function(){
        console.log(xhr.responseText);
    };
    xhr.send();
    