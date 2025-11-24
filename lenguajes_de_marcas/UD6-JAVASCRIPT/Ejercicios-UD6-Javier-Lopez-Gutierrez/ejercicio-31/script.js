document.addEventListener("DOMContentLoaded", () => {
    const provinciasSelect = document.getElementById("provincias");
    const municipiosSelect = document.getElementById("municipios");
    const municipioContainer = document.getElementById("municipio-container");
    const codMunicBtn = document.getElementById("codMunicBtn");
    const codMunicTxt = document.getElementById("codMunicTxt");
    
    let ultimaProvinciaSeleccionada = "";

    provinciasSelect.addEventListener("change", () => {
        const provinciaSeleccionada = provinciasSelect.value;
        municipiosSelect.innerHTML = "";
        
        if (provinciaSeleccionada === "") {
            municipioContainer.classList.add("invisible");
        } else {
            municipioContainer.classList.remove("invisible");
            cargarMunicipios(provinciaSeleccionada);
        }

        ultimaProvinciaSeleccionada = provinciaSeleccionada;
        codMunicTxt.textContent = "";
    });
    
    codMunicBtn.addEventListener("click", () => {
        const municipioSeleccionado = municipiosSelect.value;
        if (municipioSeleccionado) {
            const municipio = municArray.find(m => m.municipio === municipioSeleccionado);
            codMunicTxt.textContent = `Código postal: ${municipio.cod_postal}`;
        }
    });
    
    function cargarMunicipios(provincia) {
        const municipios = municArray.filter(m => m.provincia === provincia);
        municipios.forEach(m => {
            const option = document.createElement("option");
            option.value = m.municipio;
            option.textContent = m.municipio;
            municipiosSelect.appendChild(option);
        });
    }
});
