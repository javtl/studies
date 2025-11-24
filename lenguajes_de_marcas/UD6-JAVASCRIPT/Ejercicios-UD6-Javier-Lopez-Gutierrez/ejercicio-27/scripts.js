
acceptBtn.addEventListener('click', () => {
    const task = taskInput.value.trim();
    if (task) {
        const listItem = document.createElement('li');
        listItem.textContent = task;

        // Agrega un botón para eliminar
        const deleteBtn = document.createElement('button');
        deleteBtn.textContent = 'Eliminar';
        deleteBtn.style.marginLeft = '10px';
        
        deleteBtn.addEventListener('click', () => {
            listItem.remove();
        });

        listItem.appendChild(deleteBtn);
        taskList.appendChild(listItem);
        inputContainer.style.display = 'none';
    } else {
        alert('Por favor, escribe una tarea válida.');
    }
});
