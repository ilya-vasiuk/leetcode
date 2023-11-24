select
  u.name,
  ifnull(sum(r.distance)) as travelled_distance
from
  Users u
    left join Rides r on u.id = r. user_id
group by
  u.id, u.name
order by
  travelled_distance desc, u.name asc