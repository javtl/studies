document.addEventListener("DOMContentLoaded", function () {
    const textarea = document.getElementById("textbox");
    const counter = document.getElementById("counter");
    const warning = document.getElementById("warning");
    const maxChars = 50;

    textarea.addEventListener("input", function () {
        const remaining = maxChars - textarea.value.length;
        counter.textContent = `${remaining} caracteres restantes`;

        if (remaining < 0) {
            warning.style.display = "block";
        } else {
            warning.style.display = "none";
        }
    });
});
