-- // 2nd migration.

create table customers
(
  id         bigint       not null,
  given_name  varchar(255) not null,
  family_name varchar(255) not null,
  email varchar(255) not null,
  created_at timestamp with time zone    not null,
  primary key (id),
  unique (email)
);

create table products
(
  id   bigint       not null,
  name varchar(255) not null,
  sales_start_date timestamp with time zone not null,
  sales_end_date timestamp with time zone,
  primary key (id)
);

create table customer_favorite_products
(
  customer_id bigint not null,
  products_id bigint not null,
  comment varchar(255),
  primary key (customer_id, products_id),
  foreign key (customer_id) references customers (id),
  foreign key (products_id) references products (id)
);

create table orders
(
  id   bigint       not null,
  customer_id bigint not null,
  total bigint not null,
  primary key (id),
  foreign key (customer_id) references customers (id)
);

create table order_details
(
  id   bigint       not null,
  order_id bigint not null,
  product_id bigint not null,
  price int not null,
  quantity int not null,
  subtotal int not null,
  primary key (id),
  foreign key (order_id) references orders (id),
  foreign key (product_id) references products (id)
);


-- //@UNDO
-- SQL to undo the change goes here.


