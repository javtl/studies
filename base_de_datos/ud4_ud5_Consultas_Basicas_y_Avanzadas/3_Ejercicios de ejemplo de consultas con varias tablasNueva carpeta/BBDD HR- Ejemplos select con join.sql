/* EJEMPLOS DE CONSULTAS CON JOIN EN LA BBDD HR (la del examen de select con una sola tabla)
use examen;

/* Ejemplo 1: mostrar una lista de todas localizaciones con el nombre del pais al que pertenecen */
select location_id, street_address, postal_code, city, state_province, 
		c.country_id, country_name
from locations l join countries c on l.country_id = c.country_id;


/*  Ejemplo 2:  añadir a la consulta anterior el nombre de la region a la que pertenece esa localización */
select location_id, street_address, postal_code, city, state_province, 
		c.country_id, country_name, region_name
from (locations l join countries c on l.country_id=c.country_id)
		join regions r on c.region_id= r.region_id;


select * from employees;
/*  Ejemplo 3:  datos de trabajador */
select employee_id, first_name, last_name, job_id, salary, department_id
from employees;

/*  Ejemplo 4:  añadir nombre del tipo de trabajo */
select employee_id, first_name, last_name, job_title, salary, 
		department_name
from (employees e join jobs j on e.job_id=j.job_id)
		join departments d on e.department_id = d.department_id;
        
        
/*  Ejemplo 5:  lista de todos los trabajos realizados (en job_history) mostrando
(employee_id, first_name, last_name, start_date, end_date, job_title, 
department_name) */
select e.employee_id, e.first_name, e.last_name, jh.start_date, jh.end_date,
	j.job_title, d.department_name
from ((employees e join job_history jh on e.employee_id = jh.employee_id)
		join jobs j on j.job_id = jh.job_id)
			join departments d on d.department_id = jh.department_id;
            
            
/*  Ejemplo 6:  lista de todos los empleados (employee_id, first_name, last_name, hire_date, salary, department_name) */

select e.employee_id, e.first_name, e.last_name, e.hire_date, e.salary, e.department_id, d.department_id, 
	d.department_name
from (employees e join departments d on e.department_id = d.department_id);

/*  Ejemplo 7:  quiero obtener una lista de los trabajadores que ya cobran el salario máximo para su tipo de trabajo */

SELECT e.first_name, e.last_name, j.job_title, e.salary
FROM employees e
JOIN jobs j ON e.job_id = j.job_id
WHERE e.salary = j.max_salary;

/*  Ejemplo 8: quiero saber para cada trabajador una lista de los tipos de trabajo en los que podría ganar un salario mayor que el 
que gana actualmente */   
      
SELECT e.first_name, e.last_name, e.salary AS salario_actual, j.job_title AS trabajo_potencial, j.max_salary
FROM employees e
CROSS JOIN jobs j 
WHERE j.max_salary > e.salary 
AND e.job_id <> j.job_id;

/*  Ejemplo 9:  para cada departamento muestra el nombre de departamento y el sueldo medio
de sus trabajadores */

SELECT d.department_name, AVG(e.salary) AS sueldo_medio
FROM departments d
JOIN employees e ON d.department_id = e.department_id
GROUP BY d.department_id, d.department_name;

/*  Ejemplo 10:  quiero una lista de todas las localizaciones de la region 'Europe' mostrando además cuantos departamentos hay en cada localización */

SELECT l.city, l.street_address, COUNT(d.department_id) AS num_departamentos
FROM locations l
JOIN countries c ON l.country_id = c.country_id
JOIN regions r ON c.region_id = r.region_id
LEFT JOIN departments d ON l.location_id = d.location_id
WHERE r.region_name = 'Europe'
GROUP BY l.location_id, l.city, l.street_address;

/*  Ejemplo 11:  quiero ver para cada uno de los trabajos que ha tenido un empleado:
 (first_name, last_name, [job_title de su trabajo actual], [salary actual], [job_title de trabajo anterior], [start_date trabajo anterior], [end_date
 trabajo anterior])*/
 
 SELECT 
    e.first_name, 
    e.last_name, 
    j_actual.job_title AS job_title_actual, 
    e.salary AS salary_actual,
    j_anterior.job_title AS job_title_anterior,
    jh.start_date AS start_date_anterior,
    jh.end_date AS end_date_anterior
FROM employees e
JOIN jobs j_actual ON e.job_id = j_actual.job_id
JOIN job_history jh ON e.employee_id = jh.employee_id
JOIN jobs j_anterior ON jh.job_id = j_anterior.job_id;


/*  Ejemplo 12:  lista de todos los empleados, su departamento y nombre de su jefe */

select e.employee_id, 
	e.first_name, 
	e.last_name, 
	e.hire_date, 
	e.salary, 
	e.department_id, 
	d.department_id, 
	d.department_name, 
	m.first_name, 
	m.last_name
from (employees e join departments d on e.department_id = d.department_id)
			join employees m on d.manager_id = m.employee_id;
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            






-- EJERCICIO 10
-- Localizaciones en 'Europe' y el conteo de departamentos en cada una.


-- EJERCICIO 11
-- Historial de trabajos: Datos actuales del empleado comparados con sus puestos anteriores.


-- EJERCICIO 12
-- Lista de empleados con su departamento y el nombre de su jefe inmediato.
-- (Se realiza un SELF JOIN en la tabla employees para obtener al manager).
SELECT 
    e.first_name AS empleado_nombre, 
    e.last_name AS empleado_apellido, 
    d.department_name, 
    m.first_name AS jefe_nombre, 
    m.last_name AS jefe_apellido
FROM employees e
LEFT JOIN departments d ON e.department_id = d.department_id
LEFT JOIN employees m ON e.manager_id = m.employee_id;