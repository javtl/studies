
USE examen;
/* EXAMEN 1: Lista de departamentos (id, nombre, nombre y apellido del manager o jefe, 
[número de empleados del departamento]), considerando solo aquellos que están en una 
localización que tiene más de 3 departamentos */
SELECT d.department_id, d.department_name, CONCAT(m.first_name, ' ', m.last_name) AS manager_name,
    (SELECT COUNT(*) FROM employees e WHERE e.department_id = d.department_id) AS total_empleados
FROM departments d
JOIN employees m ON d.manager_id = m.employee_id
WHERE d.location_id IN (
    SELECT location_id 
    FROM departments 
    GROUP BY location_id 
    HAVING COUNT(department_id) > 3
);

/* EXAMEN 2: Lista de los jefes de departamento (employee_id, first_name, last_name, salary) 
que cobran más que la media de su categoria de trabajo (job_id) */

SELECT e.employee_id, e.first_name, e.last_name, e.salary
FROM employees e
WHERE e.employee_id IN (SELECT manager_id FROM departments WHERE manager_id IS NOT NULL)
  AND e.salary > (
      SELECT AVG(e2.salary) 
      FROM employees e2 
      WHERE e2.job_id = e.job_id
  );
/* EXAMEN 3: Una relación para cada empleado de todos los departamentos en los que trabaja, 
o ha trabajado y de que fecha a que fecha trabajó allí (employee_id, first_name, last_name, 
salary, department_name, [fecha inicio], [fecha fin] ) ordenados por employee_id */

(
    SELECT e.employee_id, e.first_name, e.last_name, e.salary, d.department_name, 'Actual' AS fecha_inicio, 'Actual' AS fecha_fin
    FROM employees e
    JOIN departments d ON e.department_id = d.department_id
)
UNION
(
    SELECT 
        e.employee_id, e.first_name, e.last_name, e.salary, 
        d.department_name, 
        jh.start_date, jh.end_date
    FROM job_history jh
    JOIN employees e ON jh.employee_id = e.employee_id
    JOIN departments d ON jh.department_id = d.department_id
)
ORDER BY employee_id;


/* EXAMEN 4: Obtener un listado de los datos actuales de empleados (employee_id, first_name, 
last_name, job_title, min_salary, [localizaciones]), siendo [localizaciones] el número de 
localizaciones donde ha trabajado que tengan un sueldo medio de empleado que sea mayor que 
el salario mínimo de la categoría que ese empleado tiene actualmente */

SELECT e.employee_id, e.first_name, e.last_name, j.job_title, j.min_salary,
    (
        SELECT COUNT(DISTINCT d.location_id)
        FROM job_history jh
        JOIN departments d ON jh.department_id = d.department_id
        WHERE jh.employee_id = e.employee_id
          AND (
              SELECT AVG(e3.salary)
              FROM employees e3
              JOIN departments d2 ON e3.department_id = d2.department_id
              WHERE d2.location_id = d.location_id
          ) > j.min_salary
    ) AS localizaciones_especificas
FROM employees e
JOIN jobs j ON e.job_id = j.job_id;