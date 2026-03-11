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

/* Ejemplo 23: lista de empleados que trabajan en un pais donde el salario medio es superior a 5000  */

SELECT e.employee_id, e .first_name, e.last_name
FROM (employees e join departments d ON e.department_id = d.department_id)
/* Ejemplo 24: lista de empleados que trabajan en un trabajo donde el salario mínimo sea superior al salario medio de su pais */

/* Ejemplo 25: