# Write your MySQL query statement below

SELECT
    Visits.customer_id,
    COUNT(Visits.visit_id) AS count_no_trans
FROM 
    Transactions
RIGHT JOIN
    Visits
ON Transactions.visit_id = Visits.visit_id 
    
WHERE
    Transactions.transaction_id IS NULL
GROUP BY
    Visits.customer_id;
 # customer_id - visit_id = transaction(visit_id) = where transaction IS NULL