-- para mariadb dame estos ejercicios corregidos nivel alumno en un unico script para copiar y pegar con el enunciado y la consulta solucionada 

use examen;

/* EXAMEN 1: Lista de departamentos (id, nombre, nombre y apellido del manager o jefe, [número de empleados del departamento], considerando solo aquellos
que están en una localización que tiene más de 3 departamentos */

SELECT d.department_id, d.department_name, d.manager_id
FROM departments d
JOIN employees m ON d.manager_id = m.employee_id
WHERE d.location_id IN (
	SELECT locations_id
    FROM locations l
    WHERE d.department_id = l.locations_id
    );

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
 

/* EXAMEN 4: Obtener un listado de los datos actuales de empleados (employee_id, first_name, last_name, job_title, min_salary, [localizaciones]), 
siendo [localizaciones] el número de localizaciones donde ha trabajado que tengan un sueldo medio de empleado que sea mayor que el salario mínimo de la categoría 
que ese empleado tiene actualmente */

