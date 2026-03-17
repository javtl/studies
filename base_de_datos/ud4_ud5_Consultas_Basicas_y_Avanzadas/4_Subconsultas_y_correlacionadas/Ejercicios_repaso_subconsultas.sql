USE examen;
-- Ejercicio 1 — Salario máximo
-- Muestra el nombre y el salario del empleado que tiene el salario más alto de la empresa.
-- Usa una subconsulta.
SELECT first_name, salary 
FROM employees 
WHERE salary = (SELECT MAX(salary) FROM employees);

-- Ejercicio 2 — Salario mayor que el promedio
-- Muestra los empleados que ganan más que el salario promedio de todos los empleados.
SELECT first_name, last_name, salary 
FROM employees 
WHERE salary > (SELECT AVG(salary) FROM employees);

-- Ejercicio 3 — Departamentos con salarios altos
-- Muestra los nombres de los empleados que trabajan en departamentos
-- donde existe al menos un empleado que gana más de 10000.
-- Usa una subconsulta con IN.
SELECT first_name, last_name 
FROM employees 
WHERE department_id IN (
    SELECT DISTINCT department_id 
    FROM employees 
    WHERE salary > 10000
);

-- Ejercicio 4 — Empleados del mismo departamento
-- Muestra los empleados que trabajan en el mismo departamento
-- que el empleado llamado 'Steven'.
SELECT first_name, last_name, department_id 
FROM employees 
WHERE department_id IN (
    SELECT department_id 
    FROM employees 
    WHERE first_name = 'Steven'
);

-- Ejercicio 5 — Salario mayor que su departamento
-- Muestra los empleados que ganan más que el salario promedio
-- de su propio departamento.
-- Usa una subconsulta correlacionada.
SELECT e1.first_name, e1.salary, e1.department_id
FROM employees e1
WHERE e1.salary > (
    SELECT AVG(e2.salary) 
    FROM employees e2 
    WHERE e2.department_id = e1.department_id
);

-- Ejercicio 6 — Empleados con subordinados
-- Muestra el nombre y apellido de los empleados que tienen al menos un subordinado.
-- Usa EXISTS.
SELECT e1.first_name, e1.last_name
FROM employees e1
WHERE EXISTS (
    SELECT 1 
    FROM employees e2 
    WHERE e2.manager_id = e1.employee_id
);

-- Ejercicio 7 — Empleados sin subordinados
-- Muestra los empleados que no tienen subordinados.
-- Usa NOT EXISTS.
SELECT first_name, last_name
FROM employees e1
WHERE NOT EXISTS (
    SELECT 1 
    FROM employees e2 
    WHERE e2.manager_id = e1.employee_id
);

-- Ejercicio 8 — Departamentos con empleados
-- Muestra los departamentos donde existe al menos un empleado.
-- Usa EXISTS.
SELECT d.department_name
FROM departments d
WHERE EXISTS (
    SELECT 1 
    FROM employees e 
    WHERE e.department_id = d.department_id
);

-- Ejercicio 9 — Salario superior al promedio global
-- Muestra los empleados cuyo salario es mayor
-- que el salario promedio de toda la empresa.
-- (Nota: Es funcionalmente idéntico al Ejercicio 2)
SELECT first_name, last_name, salary 
FROM employees 
WHERE salary > (SELECT AVG(salary) FROM employees);

-- Ejercicio 10 — Jefes con subordinados mejor pagados
-- Muestra los empleados que tienen al menos un subordinado
-- cuyo salario es mayor que el salario del propio jefe.
-- Usa EXISTS con una subconsulta correlacionada.
SELECT e_jefe.first_name, e_jefe.salary
FROM employees e_jefe
WHERE EXISTS (
    SELECT 1 
    FROM employees e_sub 
    WHERE e_sub.manager_id = e_jefe.employee_id 
    AND e_sub.salary > e_jefe.salary
);