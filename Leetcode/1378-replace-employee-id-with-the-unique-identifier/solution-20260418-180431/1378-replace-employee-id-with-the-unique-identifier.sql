# Write your MySQL query statement below
SELECT unique_id, name 
FROM EmployeeUNI as e
RIGHT JOIN Employees as u
ON e.id=u.id;