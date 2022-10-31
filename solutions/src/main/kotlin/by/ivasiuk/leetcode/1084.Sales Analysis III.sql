select distinct
  p.product_id,
  p.product_name
from
  Product p
    join Sales s on s.product_id = p.product_id
group by
  p.product_id
having
  min(year(sale_date)) = 2019 and max(month(sale_date)) < 4