# Write your SQL query statement below
SELECT * FROM cinema c
WHERE c.description != 'boring'
AND MOD(c.id, 2) = 1
ORDER BY c.rating DESC;
