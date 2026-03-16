/* Ejercicio 17: lista empleados que pertenecen a un departamento con mas de 6 empleados */
select e.employee_id, e.first_name, e.last_name, d.department_id, d.department_name
from employees e join departments d using (department_id)
where department_id IN (
				select d2.department_id
				from employees e2 join departments d2 using (department_id)
				group by d2.department_id
				having count(e2.employee_id) > 6
                );
                
                
/* Ejercicio 20: lista empleados que pertenecen a un departamento donde hay al menos otro empleado 
con el mismo apellido */
SELECT e1.first_name, e1.last_name, e1.department_id
FROM employees e1
WHERE EXISTS (
    SELECT 1 
    FROM employees e2 
    WHERE e1.last_name = e2.last_name 
      AND e1.employee_id <> e2.employee_id
      AND e1.department_id = e2.department_id
);
/* Ejemplo 21:  lista de empleados que tienen un jefe directo que tiene más de 5 subordinados */

SELECT e.employee_id, e.first_name, e.last_name, e.manager_id
FROM eemployees e
WHERE e.manager_id in(
	SELECT manager_id
    FROM employees e2
    GROUP BY e2.manager_id
    HAVING COUNT(e2.employee_id) > 5
);
/* Ejemplo 22:  lista de empleados, con sus jefes de departamento, donde se cumpla que el jefe de departamento
ha trabajado alguna vez de la misma categoria que el empleado. */
SELECT 
    e.FIRST_NAME AS Empleado, 
    e.JOB_ID AS Puesto_Empleado,
    jefe.FIRST_NAME AS Nombre_Jefe
FROM employees e
JOIN departments d ON e.DEPARTMENT_ID = d.DEPARTMENT_ID
JOIN employees jefe ON d.MANAGER_ID = jefe.EMPLOYEE_ID
WHERE EXISTS (
    -- Buscamos si el ID del puesto del empleado aparece en el historial del jefe
    SELECT 1 
    FROM job_history jh 
    WHERE jh.EMPLOYEE_ID = jefe.EMPLOYEE_ID 
      AND jh.JOB_ID = e.JOB_ID
);
/* Ejemplo 23: lista de empleados que trabajan en un pais donde el salario medio es superior a 5000  */

SELECT e.first_name, e.last_name, e.salary
FROM employees e
JOIN departments d ON e.department_id = d.department_id
JOIN locations l ON d.location_id = l.location_id
WHERE l.country_id IN (
    SELECT l2.country_id
    FROM employees e2
    JOIN departments d2 ON e2.department_id = d2.department_id
    JOIN locations l2 ON d2.location_id = l2.location_id
    GROUP BY l2.country_id
    HAVING AVG(e2.salary) > 5000
);

/* Ejemplo 24: lista de empleados que trabajan en un trabajo donde el salario mínimo sea superior al salario medio de su pais */
SELECT e.first_name, e.last_name, j.min_salary
FROM employees e
JOIN jobs j ON e.job_id = j.job_id
JOIN departments d ON e.department_id = d.department_id
JOIN locations l ON d.location_id = l.location_id
WHERE j.min_salary > (
    
    SELECT AVG(e2.salary)
    FROM employees e2
    JOIN departments d2 ON e2.department_id = d2.department_id
    JOIN locations l2 ON d2.location_id = l2.location_id
    WHERE l2.country_id = l.country_id  -- Aquí está la conexión con el "exterior"
);
/* Ejercicio 25: Realiza una consulta que obtenga los datos de empleados 
[EMPLOYEE_ID, FIRST_NAME, LAST_NAME, JOB_TITLE, DEPARTMENT_NAME,
 CITY, COUNTRY_NAME] pero solo que los que trabajen en paises en los que 
 estén localizados no más de 3 departamentos
*/

SELECT e.employee_id, e.first_name, e.last_name, j.job_title, d.department_name, l.city, c.country_name
FROM employees e
JOIN jobs j ON e.job_id = j.job_id
JOIN departments d ON e.department_id = d.department_id
JOIN locations l ON d.location_id = l.location_id
JOIN countries c ON l.country_id = c.country_id
WHERE c.country_id IN (
    SELECT l2.country_id
    FROM locations l2
    JOIN departments d2 ON l2.location_id = d2.location_id
    GROUP BY l2.country_id
    HAVING COUNT(d2.department_id) <= 3
); 

/* Ejercicio 26: Realiza una consulta que obtenga los datos de los departamentos
 [DEPARTMENT_ID, DEPARTMENT_NAME, CITY, COUNTRY_NAME, número total de empleados del departamento] 
 donde haya algún empleado que haya tenido más de un trabajo anterior al actual
   (más de 1 trabajo en job_history)
*/    
SELECT d.DEPARTMENT_ID, d.DEPARTMENT_NAME, l.CITY, c.COUNTRY_NAME, COUNT(e.EMPLOYEE_ID) AS total_empleados
FROM departments d
JOIN locations l ON d.LOCATION_ID = l.LOCATION_ID
JOIN countries c ON l.COUNTRY_ID = c.COUNTRY_ID
JOIN employees e ON d.DEPARTMENT_ID = e.DEPARTMENT_ID
WHERE d.DEPARTMENT_ID IN (
    SELECT e2.DEPARTMENT_ID
    FROM employees e2
    JOIN job_history jh ON e2.EMPLOYEE_ID = jh.EMPLOYEE_ID
    GROUP BY e2.EMPLOYEE_ID, e2.DEPARTMENT_ID
    HAVING COUNT(jh.JOB_ID) > 1
)
GROUP BY d.DEPARTMENT_ID, d.DEPARTMENT_NAME, l.CITY, c.COUNTRY_NAME;
/*
Ejercicio 27:Muestra en una sala tabla los trabajos que ha tenido y tiene cada empleado
employee_id, first_name, last_name, start_date, end_date job_id, job_title, department_id, department_name
*/
SELECT e.employee_id, e.first_name, e.last_name, e.hire_date AS start_date, NULL AS end_date, j.job_title, d.department_name
FROM employees e
JOIN jobs j ON e.job_id = j.job_id
JOIN departments d ON e.department_id = d.department_id

UNION

SELECT e.employee_id, e.first_name, e.last_name, jh.start_date, jh.end_date, j.job_title, d.department_name
FROM job_history jh
JOIN employees e ON jh.employee_id = e.employee_id
JOIN jobs j ON jh.job_id = j.job_id
JOIN departments d ON jh.department_id = d.department_id;


