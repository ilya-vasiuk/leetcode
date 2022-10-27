select
  employee_id
from
  (
    select
      e.employee_id as employee_id, e.name as name, s.salary as salary
    from
      Employees e
        left join Salaries s on e.employee_id = s.employee_id
    union all
    select
      s.employee_id as employee_id, e.name as name, s.salary as salary
    from
      Employees e
        right join Salaries s on e.employee_id = s.employee_id
  ) merged
where
  name is null or
  salary is null
order by
  employee_id