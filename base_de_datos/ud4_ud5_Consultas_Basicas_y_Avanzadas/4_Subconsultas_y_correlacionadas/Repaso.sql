-- subconsulta simple
-- Muestra el nombre y el salario del empleado (o empleados) que tiene el sueldo más alto de la tabla.
SELECT first_name, salary
FROM employees
WHERE salary = (
	SELECT MAX(salary) FROM employees
);
-- subconsulta relacionada
-- Muestra a los empleados que ganan más que el salario promedio de su propio departamento.
SELECT first_name, salary, department_id
FROM employees e1
WHERE salary > (
	SELECT AVG(salary) 
    FROM employees e2
    WHERE e1.department_id = e2.department_id
);

-- USO EXIST 
-- Muestra el nombre y apellido de los empleados que tienen al menos un subordinado.
-- 		Un empleado se considera jefe si existe al menos otro empleado cuyo manager_id coincide con su employee_id.

SELECT e1.first_name, e1.last_name
FROM employees e1
WHERE EXISTS (
    SELECT 1 
    FROM employees e2 
    WHERE e2.manager_id = e1.employee_id
);

-- Sácame los datos del empleado que lleva más tiempo en la empresa (el que tiene la HIRE_DATE más antigua

SELECT employee_id, first_name, last_name, hire_date
FROM employees
WHERE hire_date = (
	SELECT MIN(hire_date) 
    FROM employees);

-- Sácame a los empleados que ganan más que el salario medio de su propio departamento
SELECT e1.employee_id, e1.first_name, e1.last_name, e1.hire_date
FROM employees e1
WHERE (
SELECT AVG(e2.salary)
FROM employees e2
WHERE e2.department_id = e1.department_id
);

-- Empleados que ganan más que su jefe
SELECT e1.employee_id, e1.first_name, e1.last_name, e1.salary
FROM employees e1
WHERE (
	SELECT e2.salary
    FROM employees e2
    WHERE e2.employee_id = e1.manager_id
);