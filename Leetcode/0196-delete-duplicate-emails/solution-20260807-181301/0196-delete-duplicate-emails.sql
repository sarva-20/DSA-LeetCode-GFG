# Write your MySQL query statement below


DELETE
    p1
FROM
    Person p
JOIN
    Person p1
ON
    p.email = p1.email
WHERE
    p1.id > p.id;