/* Write your PL/SQL query statement below */
select employeeuni.unique_id, employees.name from employees left join employeeuni on employees.id = employeeuni.id;
