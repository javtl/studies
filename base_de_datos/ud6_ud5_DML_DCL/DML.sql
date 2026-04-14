use examen;

/* Ejercicio 1: Muestra todos los empleados [employees] que tengan como First_name "John" o "Peter" ordenados de mayor a menor 
	antiguedad [HIRE_DATE]*/
    
SELECT * FROM employees 
WHERE FIRST_NAME = 'John' OR FIRST_NAME = 'Peter'
ORDER BY HIRE_DATE ASC;

/* Ejercicio 2: Quiero obtener una lista de los apellidos [Last_name] de los empleados, mostranto también cuantos empleados tienen
 ese apellido y ordenados empezando por el apellido que se repita más veces.  ORDER BY Total DESC; E*/

SELECT LAST_NAME, COUNT(*) AS Total
FROM employees
GROUP BY LAST_NAME;


/* Ejercicio 3: Muestra los EMPLOYEE_ID y el numero de trabajos distintos que han tenido de los empleados que han tenido más de un 
trabajo en job_history  */

SELECT EMPLOYEE_ID, COUNT(DISTINCT JOB_ID) AS Numero_Trabajos
FROM job_history
GROUP BY EMPLOYEE_ID
HAVING COUNT(DISTINCT JOB_ID) > 1;

/* Ejercicio 4: Quiero saber cuales son los tipos de trabajo (job_id, [total de empleados], [media de salario de esos empleados]) donde 
haya al menos 10 empleados que tienen un salario menor a 10000 */

SELECT JOB_ID, COUNT(*) AS Total_Empleados, AVG(SALARY) AS Media_Salario
FROM employees
WHERE SALARY < 10000
GROUP BY JOB_ID
HAVING COUNT(*) >= 10;

/* Ejercicio 5: Quiero saber los departamentos [department_id] donde haya más de 1 empleado que cobren un salario de al menos 10000 */

SELECT DEPARTMENT_ID
FROM employees
WHERE SALARY >= 10000
GROUP BY DEPARTMENT_ID
HAVING COUNT(*) > 1;

/* Ejercicio 6: Quiero saber para cada departamento, cuantos empleados tienen un salario por encima de la media de todos los empleados,
 mostrar solo los departamentos donde el salario máximo sea más del doble del salario medio de todos los empleados */

SELECT DEPARTMENT_ID, COUNT(*) AS Cantidad_Empleados
FROM employees
WHERE SALARY > (SELECT AVG(SALARY) FROM employees)
GROUP BY DEPARTMENT_ID
HAVING MAX(SALARY) > (SELECT AVG(SALARY) * 2 FROM employees);

/* Ejercicio 7: Muestra los tipos de trabajo (job_id, [total de empleados en ese trabajo], [media de salario de esos trabajadores])
 donde el salario medio de los que trabajan de ese tipo de trabajo es mayor o igual al salario medio de todos los empleados  */

SELECT JOB_ID, COUNT(*) AS Total_Empleados, AVG(SALARY) AS Media_Salario
FROM employees
GROUP BY JOB_ID
HAVING AVG(SALARY) >= (SELECT AVG(SALARY) FROM employees);

/* Ejercicio 8: Muestra todos los datos de la tabla employees de aquellos empleados que han tenido más de un trabajo en job_history
 ordenados del más antiguo al menos antiguo [HIRE_DATE] */



/* Ejercicio 9: Muestra cuantas localizaciones hay en cada pais que contenga la palabra "United" en su nombre */

