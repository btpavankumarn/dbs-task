DROP TABLE IF EXISTS ORDERS;

CREATE TABLE IF NOT EXISTS ORDERS (
  id INT PRIMARY KEY AUTO_INCREMENT,
  customer_name VARCHAR(250) NOT NULL,
  shipping_address varchar(250) NOT NULL,
  order_date timestamp NOT NULL,
  total_val double NOT NULL
);