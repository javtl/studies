document.addEventListener("DOMContentLoaded", () => {
    const questions = document.querySelectorAll(".faq-question");
    const answers = document.querySelectorAll(".faq-answer");
    const expandAllBtn = document.getElementById("expand-all");
    const reduceAllBtn = document.getElementById("reduce-all");

    questions.forEach(question => {
        question.addEventListener("click", () => {
            answers.forEach(answer => answer.classList.add("hidden"));
            const answer = question.nextElementSibling;
            answer.classList.toggle("hidden");
        });
    });

    expandAllBtn.addEventListener("click", () => {
        answers.forEach(answer => answer.classList.remove("hidden"));
    });

    reduceAllBtn.addEventListener("click", () => {
        answers.forEach(answer => answer.classList.add("hidden"));
    });
});
