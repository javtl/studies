# 📌 Chuleta rápida SQL – 16 puntos

| Punto                             | Concepto clave                                             | Ejemplo representativo                                                                                                                                                                                              |
| --------------------------------- | ---------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **1. SELECT básico**              | Selección y filtrado de filas                              | `SELECT first_name, last_name FROM employees WHERE department_id = 10;`                                                                                                                                             |
| **2. ORDER BY**                   | Ordenar resultados                                         | `SELECT first_name, salary FROM employees ORDER BY salary DESC;`                                                                                                                                                    |
| **3. Funciones básicas**          | Resumen de datos                                           | `SELECT COUNT(*), AVG(salary), MAX(salary) FROM employees;`                                                                                                                                                         |
| **4. GROUP BY**                   | Agrupar filas                                              | `SELECT department_id, AVG(salary) FROM employees GROUP BY department_id;`                                                                                                                                          |
| **5. HAVING**                     | Filtrar grupos                                             | `SELECT department_id, AVG(salary) FROM employees GROUP BY department_id HAVING AVG(salary) > 5000;`                                                                                                                |
| **6. INNER JOIN**                 | Combinar tablas con coincidencias                          | `SELECT e.first_name, d.department_name FROM employees e INNER JOIN departments d ON e.department_id = d.department_id;`                                                                                            |
| **7. LEFT / RIGHT / SELF JOIN**   | Mantener filas sin coincidencia o unir tabla consigo misma | `SELECT e1.first_name AS empleado, e2.first_name AS jefe FROM employees e1 LEFT JOIN employees e2 ON e1.manager_id = e2.employee_id;`                                                                               |
| **8. Subconsulta simple**         | Subconsulta independiente que devuelve un valor            | `SELECT first_name FROM employees WHERE salary = (SELECT MAX(salary) FROM employees);`                                                                                                                              |
| **9. Subconsulta correlacionada** | Depende de cada fila externa                               | `SELECT first_name FROM employees e1 WHERE salary > (SELECT AVG(salary) FROM employees e2 WHERE e2.department_id = e1.department_id);`                                                                              |
| **10. EXISTS / NOT EXISTS**       | Verifica existencia de filas                               | `SELECT first_name FROM employees e1 WHERE EXISTS (SELECT 1 FROM employees e2 WHERE e2.manager_id = e1.employee_id);`                                                                                               |
| **11. IN / ANY / ALL**            | Comparación con subconsulta múltiple                       | `SELECT first_name FROM employees WHERE department_id IN (SELECT department_id FROM employees WHERE salary > 6000);`                                                                                                |
| **12. UNION / UNION ALL**         | Combina resultados de varias consultas                     | `SELECT first_name FROM employees WHERE department_id=10 UNION SELECT first_name FROM employees WHERE department_id=20;`                                                                                            |
| **13. Subconsulta en FROM**       | Tabla derivada temporal                                    | `SELECT department_id, avg_salary FROM (SELECT department_id, AVG(salary) AS avg_salary FROM employees GROUP BY department_id) t;`                                                                                  |
| **14. CASE**                      | Condición dentro de columna                                | `SELECT first_name, CASE WHEN salary>5000 THEN 'Alto' ELSE 'Bajo' END AS nivel_salarial FROM employees;`                                                                                                            |
| **15. CTE (WITH)**                | Subconsulta reutilizable                                   | `WITH dept_avg AS (SELECT department_id, AVG(salary) AS avg_salary FROM employees GROUP BY department_id) SELECT e.first_name, d.avg_salary FROM employees e JOIN dept_avg d ON e.department_id = d.department_id;` |
| **16. Funciones de ventana**      | Agregados por fila / ranking                               | `SELECT first_name, ROW_NUMBER() OVER(PARTITION BY department_id ORDER BY salary DESC) AS fila FROM employees;`                                                                                                     |

---

💡 **Tips de memoria rápida**

* `WHERE` filtra filas individuales.
* `HAVING` filtra **grupos**.
* `INNER JOIN` → solo coincidencias.
* `LEFT JOIN` → todas filas izquierda, incluso sin coincidencia.
* `EXISTS` → pregunta “¿existe al menos una fila?”.
* `CASE` → clasifica datos en columnas nuevas.
* `CTE` → “tabla temporal reutilizable”.
* Funciones de ventana → cálculos por fila sin perder filas.

---

