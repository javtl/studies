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

/*  Ejemplo 8: quiero saber para cada trabajador una lista de los tipos de trabajo en los que podría ganar un salario mayor que el 
que gana actualmente */         
            
/*  Ejemplo 9:  para cada departamento muestra el nombre de departamento y el sueldo medio
de sus trabajadores */

/*  Ejemplo 10:  quiero una lista de todas las localizaciones de la region 'Europe' mostrando además cuantos departamentos hay en cada localización */


/*  Ejemplo 11:  quiero ver para cada uno de los trabajos que ha tenido un empleado:
 (first_name, last_name, [job_title de su trabajo actual], [salary actual], [job_title de trabajo anterior], [start_date trabajo anterior], [end_date
 trabajo anterior])


/*  Ejemplo 12:  lista de todos los empleados, su departamento y nombre de su jefe */
select e.employee_id, e.first_name, e.last_name, e.hire_date, e.salary, e.department_id, d.department_id, 
	d.department_name, m.first_name, m.last_name
from (employees e join departments d on e.department_id = d.department_id)
			join employees m on d.manager_id = m.employee_id;