-- // 2nd migration.


INSERT INTO customers (id, given_name, family_name, email, created_at) VALUES (1, 'Nobita', 'Nobi', 'nobita@example.com', '2019-03-18 12:24:53.632000');
INSERT INTO customers (id, given_name, family_name, email, created_at) VALUES (2, 'Okometubu', 'Maruyama', 'fu-min@example.com', '2019-03-18 12:25:53.181000');
INSERT INTO customers (id, given_name, family_name, email, created_at) VALUES (3, 'Light', 'Yagami', 'light@example.com', '2019-03-18 12:27:01.873000');

INSERT INTO products (id, name, sales_start_date, sales_end_date) VALUES (1, 'note', '2019-03-17 13:42:24.154000', null);
INSERT INTO products (id, name, sales_start_date, sales_end_date) VALUES (2, 'pen', '2017-03-17 13:42:51.066000', '2018-03-18 13:43:02.044000');
INSERT INTO products (id, name, sales_start_date, sales_end_date) VALUES (3, 'pen', '2019-03-18 13:45:16.257000', null);


INSERT INTO customer_favorite_products (customer_id, products_id, comment) VALUES (1, 1, 'Good');

INSERT INTO orders (id, customer_id, total) VALUES (1, 1, 200);
INSERT INTO orders (id, customer_id, total) VALUES (2, 2, 300);
INSERT INTO orders (id, customer_id, total) VALUES (3, 1, 100);

INSERT INTO order_details (id, order_id, product_id, price, quantity, subtotal) VALUES (1, 1, 1, 100, 2, 200);
INSERT INTO order_details (id, order_id, product_id, price, quantity, subtotal) VALUES (2, 2, 1, 100, 1, 100);
INSERT INTO order_details (id, order_id, product_id, price, quantity, subtotal) VALUES (3, 2, 2, 100, 2, 200);
INSERT INTO order_details (id, order_id, product_id, price, quantity, subtotal) VALUES (4, 3, 3, 100, 1, 100);


-- //@UNDO
-- SQL to undo the change goes here.


