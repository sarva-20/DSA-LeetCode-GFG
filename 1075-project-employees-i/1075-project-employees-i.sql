# Write your MySQL query statement below

-- Project : projId emplId
-- Employee : emp_id, name, experience

-- query to average exp years of all emp for each proj rounded to 2 digits

SELECT
    p.project_id,
    ROUND(AVG(e.experience_years),2) AS average_years

FROM
    Employee as e
RIGHT JOIN
    Project as p
ON
    e.employee_id = p.employee_id
GROUP BY
    p.project_id;