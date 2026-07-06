# Write your MySQL query statement below

-- Users : userId, userName
-- Register : contest_id, user_id

-- Find percentage of users registered in each contests
-- Return ordered percent in DESC, in case of tie, order by ASC

SELECT 
    contest_id,
    ROUND((COUNT(user_id) / (SELECT COUNT(*) FROM Users)) * 100, 2)AS percentage
FROM 
    Register
GROUP BY
    contest_id
ORDER BY
    percentage DESC,
    contest_id ASC;
