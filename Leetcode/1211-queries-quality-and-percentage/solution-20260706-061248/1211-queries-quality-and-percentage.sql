# Write your MySQL query statement below

-- Query quality = Average of ratio between rating & postion
-- Poor Query Percent = Percentage of all queries with rating < 3
-- Solution : QueryName, query_quality, poor_query_percent -- ROUNDED to 2 decimals


SELECT 
    query_name,
    ROUND(AVG(rating / position),2) AS quality,
    ROUND(AVG(rating<3) * 100, 2) AS poor_query_percentage
FROM 
    Queries
WHERE
    query_name IS NOT NULL
GROUP BY 
    query_name;