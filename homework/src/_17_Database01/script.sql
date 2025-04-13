-- Select các bản ghi theo 3 giá trị category
SELECT * FROM products
WHERE category IN ('BOOKS', 'ELECTRONICS', 'CLOTHING');

-- Select các bản ghi users có fullname bắt đầu bằng chữ "a"
SELECT * FROM users
WHERE fullname LIKE 'a%';

-- Kiểm tra xem có bao nhiêu users có status là "ACTIVE"
SELECT COUNT(*) AS active_users_count
FROM users
WHERE status = 'ACTIVE';

-- Kiểm tra xem có bao nhiêu products có stock <= 0
SELECT COUNT(*) AS out_of_stock_products
FROM products
WHERE stock <= 0;

-- Lấy ra 10 products có giá cao nhất
SELECT * FROM products
ORDER BY price DESC
LIMIT 10;
