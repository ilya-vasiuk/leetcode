select
  user_id,
  concat(UPPER(left(name, 1)), LOWER(right(name, LENGTH(name) - 1))) as name
from
  Users
order by
  user_id