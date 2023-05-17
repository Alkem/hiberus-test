

DROP TABLE IF EXISTS grupos;
DROP TABLE IF EXISTS prices;

CREATE TABLE grupos (
	id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	cadena CHARACTER(100) NOT NULL
);


INSERT INTO grupos (cadena) VALUES('ZARA');


CREATE TABLE prices (

	id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	brand_id BIGINT NOT NULL,
	start_date DATETIME NOT NULL,
    end_date DATETIME NOT NULL,
    price_list BIGINT NOT NULL,
    product_id BIGINT NOT NULL,
    priority INTEGER NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    curr CHARACTER(4) NOT NULL,

    CONSTRAINT FK_brandId FOREIGN KEY (brand_id) REFERENCES grupos(id)
);


INSERT INTO prices
(brand_id, start_date, end_date, price_list, product_id, priority, price, curr)
VALUES(1, '2020-06-14 00:00:00', '2020-12-31 23:59:59', 1, 35455, 0, 35.50, 'EUR');


INSERT INTO prices
(brand_id, start_date, end_date, price_list, product_id, priority, price, curr)
VALUES(1, '2020-06-14 15:00:00', '2020-06-14 18:30:00', 2, 35455, 1, 25.45, 'EUR');

INSERT INTO prices
(brand_id, start_date, end_date, price_list, product_id, priority, price, curr)
VALUES(1, '2020-06-15 00:00:00', '2020-06-15 11:00:00', 3, 35455, 1, 30.50, 'EUR');

INSERT INTO prices
(brand_id, start_date, end_date, price_list, product_id, priority, price, curr)
VALUES(1, '2020-06-15 16:00:00', '2020-12-31 23:59:59', 4, 35455, 1, 38.95, 'EUR');

