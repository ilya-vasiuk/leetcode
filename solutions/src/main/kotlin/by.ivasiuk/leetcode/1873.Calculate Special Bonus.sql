select
    employee_id,
    if(name like 'M%' or mod(employee_id, 2) = 0, 0, salary) as bonus
from
    Employees
order by
    employee_id