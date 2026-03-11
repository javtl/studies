/*Ejercicio 1: 
Muestra el nombre del empleado (FIRST_NAME), su apellido (LAST_NAME) y el nombre de su departamento (DEPARTMENT_NAME).*/

SELECT e.FIRST_NAME, e.LAST_NAME, d.DEPARTMENT_NAME
FROM employees AS e
JOIN department AS d ON d.department_id = e.department_id;

/*Ejercicio 2:
Muestra el nombre del empleado (FIRST_NAME) y el título de su trabajo (JOB_TITLE) para los que ganan más de 15.000€.*/

SELECT e.FIRST_NAME, j.JOB_TITLE
FROM employees AS e
INNER JOIN jobs AS j ON e.JOB_ID = j.JOB_ID
WHERE e.salary > 15000
ORDER BY salary ASC;

/*Ejercicio 3:
Muestra el Apellido (LAST_NAME) del empleado, el nombre de su Departamento (DEPARTMENT_NAME) y la Ciudad (CITY) donde está ese departamento*/

SELECT e.LAST_NAME, d.DEPARTMENT_NAME, l.CITY
FROM employees AS e
JOIN departments AS d ON e.DEPARTMENT_ID = d.DEPARTMENT_ID
JOIN locations AS l ON d.LOCATION_ID = l.LOCATION_ID
ORDER BY CITY;

/*Ejercicio 4:
Muestra todos los departamentos (DEPARTMENT_NAME) y el apellido de los empleados que trabajan en ellos. Queremos ver TODOS los departamentos, incluso los que están vacíos (sin empleados)*/

SELECT d.DEPARTMENT_NAME, e.LAST_NAME
FROM departments AS d
LEFT JOIN employees AS e ON d.DEPARTMENT_ID = e.DEPARTMENT_ID;
