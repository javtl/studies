-- INSERT
INSERT INTO employees (employee_id, first_name, last_name, email, hire_date, job_id)
VALUES (300, 'Pepe', 'García', 'PGARCIA', SYSDATE, 'IT_PROG');

INSERT INTO employees_copia
SELECT * FROM employees WHERE department_id = 60;

-- UPDATE
UPDATE employees
SET salary = salary * 1.1,
    commission_pct = 0.2
WHERE employee_id = 101;

UPDATE employees
SET salary = salary * 1.1
WHERE department_id = (SELECT department_id FROM departments WHERE department_name = 'IT');

-- DELETE
DELETE FROM employees
WHERE employee_id = 200;