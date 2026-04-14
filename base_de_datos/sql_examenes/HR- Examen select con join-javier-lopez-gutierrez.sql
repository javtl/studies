USE examen;

/* Ejercicio 1: mostrar para cada tipo de trabajo; (job_id, job_title, max_salary, min_salary), y añadir el sueldo medio de los empleados
que tienen ese tipo de trabajo y cuantos empleados son (renombrar como 'Sueldo medio' y 'Numero empleados'). Ordenar por número de empleados de mayor a menor */

SELECT 
    j.job_id, 
    j.job_title, 
    j.max_salary, 
    j.min_salary, 
    AVG(e.salary) AS 'Sueldo medio', 
    COUNT(e.employee_id) AS 'Numero empleados'
FROM jobs j
LEFT JOIN employees e ON j.job_id = e.job_id
GROUP BY j.job_id, j.job_title, j.max_salary, j.min_salary
ORDER BY COUNT(e.employee_id) DESC;


/* Ejercicio 2: mostrar para cada pais (id, nombre); el número de tipos de trabajo distintos que tienen sus trabajadores ordenados de mayor a menor número de trabajos distintos
que haya */

SELECT 
    c.country_id, 
    c.country_name, 
    COUNT(DISTINCT e.job_id) AS num_trabajos_distintos
FROM countries c
JOIN locations l ON c.country_id = l.country_id
JOIN departments d ON l.location_id = d.location_id
JOIN employees e ON d.department_id = e.department_id
GROUP BY c.country_id, c.country_name
ORDER BY num_trabajos_distintos DESC;


/* Ejercicio 3: Mostrar una lista de departamentos de la región 'Americas' ordenados por numero de empleados de mayor a menor
 (location_id, nombre de ciudad, nombre de pais, nombre de region, id de departamento, nombre de departamento) y añadir; 
   número de empleados de ese departamento y sueldo medio de esos empleados */

SELECT 
    l.location_id, 
    l.city, 
    c.country_name, 
    r.region_name, 
    d.department_id, 
    d.department_name,
    COUNT(e.employee_id) AS num_empleados,
    AVG(e.salary) AS sueldo_medio
FROM regions r
JOIN countries c ON r.region_id = c.region_id
JOIN locations l ON c.country_id = l.country_id
JOIN departments d ON l.location_id = d.location_id
LEFT JOIN employees e ON d.department_id = e.department_id
WHERE r.region_name = 'Americas'
GROUP BY l.location_id, l.city, c.country_name, r.region_name, d.department_id, d.department_name
ORDER BY num_empleados DESC;


/* Ejercicio 4: lista de empleados que cobran actualmente más que el jefe de un departamento al en el cual trabajaron en algún momento;
 mostrar id, nombre, apellido, salario; tanto del empleado, como del jefe del departamento; y añadir fecha de inicio y fecha de fin del periodo en el cual ese 
 empleado trabajó en ese departamento, y nombre del departamento */

SELECT 
    e.employee_id AS 'ID Empleado', 
    e.first_name AS 'Nombre Empleado', 
    e.last_name AS 'Apellido Empleado', 
    e.salary AS 'Salario Empleado',
    jh.start_date AS 'Fecha Inicio', 
    jh.end_date AS 'Fecha Fin',
    d.department_name AS 'Departamento Antiguo',
    m.employee_id AS 'ID Jefe', 
    m.first_name AS 'Nombre Jefe', 
    m.last_name AS 'Apellido Jefe', 
    m.salary AS 'Salario Jefe'
FROM employees e
JOIN job_history jh ON e.employee_id = jh.employee_id
JOIN departments d ON jh.department_id = d.department_id
JOIN employees m ON d.manager_id = m.employee_id
WHERE e.salary > m.salary;