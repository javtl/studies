use examen;

/* EXAMEN 1: Lista de departamentos (id, nombre, nombre y apellido del manager o jefe, [número de empleados del departamento], considerando solo aquellos
que están en una localización que tiene más de 3 departamentos */


/* EXAMEN 2: Lista de los jefes de departamento (employee_id, first_name, last_name, salary) que cobran más que la media de su categoria de trabajo */

SELECT e.employee_id, e.first_name, e.last_name, e.salary
FROM employees e
WHERE e.employee_id IN (
	SELECT manager_id 
	FROM departments WHERE manager_id IS NOT NULL)
	AND e.salary > (
		SELECT AVG(e2.salary) 
		FROM employees e2 
		WHERE e2.job_id = e.job_id
  );
  
/*  EXAMEN 3: Una relación para cada empleado de todos los departamentos en los que trabaja, o ha trabajado y de que fecha a que fecha trabajó allí
 (employee_id, first_name, last_name, salary, department_name, [fecha inicio], [fecha fin] )  ordenados por employee_id*/
 
SELECT e.employee_id, e.first_name, e.last_name, e.salary, d.department_name, jh.start_date, jh.end_date
FROM employees e
INNER JOIN job_history jh ON e.employee_id = jh.employee_id
INNER JOIN departments d ON jh.department_id = d.department_id
ORDER BY e.employee_id ASC;

/* EXAMEN 4: Obtener un listado de los datos actuales de empleados (employee_id, first_name, last_name, job_title, min_salary, [localizaciones]), 
siendo [localizaciones] el número de localizaciones donde ha trabajado que tengan un sueldo medio de empleado que sea mayor que el salario mínimo de la categoría 
que ese empleado tiene actualmente */

/*
SELECT e.employee_id, e.first_name, e.last_name, j.job_title, j.min_salary, COUNT(l.location_id) AS "Localizaciones"
FROM employees e
INNER JOIN jobs j ON e.department_id = j.department_id
INNER JOIN */










