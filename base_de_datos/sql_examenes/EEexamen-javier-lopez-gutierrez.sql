USE examen;

-- ---------------------------------------------------------
-- EXAMEN 1: Departamentos en localizaciones con más de 3 depts.
-- Incluye ID, nombre, nombre del manager y total de empleados.
-- ---------------------------------------------------------
SELECT 
    d.department_id, 
    d.department_name, 
    CONCAT(m.first_name, ' ', m.last_name) AS manager_name,
    COUNT(e.employee_id) AS total_empleados
FROM departments d
JOIN employees m ON d.manager_id = m.employee_id
LEFT JOIN employees e ON d.department_id = e.department_id
WHERE d.location_id IN (
    SELECT location_id 
    FROM departments 
    GROUP BY location_id 
    HAVING COUNT(*) > 3
)
GROUP BY d.department_id;


-- ---------------------------------------------------------
-- EXAMEN 2: Jefes de departamento que ganan más que la media
-- de su propia categoría (job_id).
-- ---------------------------------------------------------
SELECT e.employee_id, e.first_name, e.last_name, e.salary
FROM employees e
JOIN departments d ON e.employee_id = d.manager_id
WHERE e.salary > (
    SELECT AVG(e2.salary) 
    FROM employees e2 
    WHERE e2.job_id = e.job_id
);


-- ---------------------------------------------------------
-- EXAMEN 3: Historial completo de departamentos (Actual y Pasado).
-- Relación de dónde trabaja o ha trabajado cada empleado.
-- ---------------------------------------------------------
SELECT 
    e.employee_id, e.first_name, e.last_name, e.salary, 
    d.department_name, 
    'Actual' AS fecha_inicio, 
    'Actual' AS fecha_fin
FROM employees e
JOIN departments d ON e.department_id = d.department_id

UNION ALL

SELECT 
    e.employee_id, e.first_name, e.last_name, e.salary, 
    d.department_name, 
    CAST(jh.start_date AS CHAR), 
    CAST(jh.end_date AS CHAR)
FROM job_history jh
JOIN employees e ON jh.employee_id = e.employee_id
JOIN departments d ON jh.department_id = d.department_id
ORDER BY employee_id;


SELECT 
    e.employee_id, 
    e.first_name, 
    e.last_name, 
    j.job_title, 
    j.min_salary,
    (
        SELECT COUNT(DISTINCT d.location_id)
        FROM job_history jh
        JOIN departments d ON jh.department_id = d.department_id
        WHERE jh.employee_id = e.employee_id
          AND (
            SELECT AVG(e3.salary)
            FROM employees e3
            WHERE e3.department_id IN (SELECT department_id FROM departments WHERE location_id = d.location_id)
          ) > j.min_salary
    ) AS localizaciones
FROM employees e
JOIN jobs j ON e.job_id = j.job_id;