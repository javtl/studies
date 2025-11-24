const botones = document.querySelectorAll('.seleccionable');

botones.forEach(boton => {
    boton.addEventListener('click', (event) => {
        if (!event.ctrlKey) {
            botones.forEach(b => b.classList.remove('seleccionado'));
        }
        boton.classList.toggle('seleccionado');
    });
});