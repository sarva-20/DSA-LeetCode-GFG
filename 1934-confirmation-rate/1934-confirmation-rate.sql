# Write your MySQL query statement below

SELECT
    s.user_id,
    ROUND(IFNULL(AVG(IF(c.action = 'confirmed', 1, 0)), 0), 2) AS confirmation_rate

FROM
    Confirmations c
RIGHT JOIN 
    Signups s
ON 
    c.user_id = s.user_id
GROUP BY
    s.user_id;

