/* Write your PL/SQL query statement below */
SELECT c.name 
FROM (
    SELECT a.name, b.managerId 
    FROM Employee a 
    INNER JOIN Employee b ON a.id = b.managerId
) c
HAVING COUNT(c.managerId) >= 5;
