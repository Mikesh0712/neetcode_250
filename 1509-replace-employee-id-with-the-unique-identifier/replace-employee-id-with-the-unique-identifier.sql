# Write your MySQL query statement below
#use left join as we keep every employee and attach their unique_id if exists
select eu.unique_id,e.name from employees e left join employeeuni eu on e.id=eu.id 