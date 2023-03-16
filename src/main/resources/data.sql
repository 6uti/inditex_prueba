create table prices
(
   brand_id integer not null,
   start_date TIMESTAMP not null,
   end_date TIMESTAMP not null,
   price_list integer not null,
   product_id integer not null,
   priority integer not null,
   price DECIMAL(5,2)  not null,
   curr varchar(5) not null
);

INSERT INTO prices (brand_id, start_date, end_date, price_list, product_id, priority, price, curr) VALUES (1, parsedatetime('2020-06-14-00.00.00', 'yyyy-MM-dd-HH.mm.ss'), parsedatetime('2020-12-31-23.59.59', 'yyyy-MM-dd-HH.mm.ss'), 1, 35455, 0, 35.50, 'EUR');
INSERT INTO prices (brand_id, start_date, end_date, price_list, product_id, priority, price, curr) VALUES (1, parsedatetime('2020-06-14-15.00.00', 'yyyy-MM-dd-HH.mm.ss'), parsedatetime('2020-06-14-18.30.00', 'yyyy-MM-dd-HH.mm.ss'), 2, 35455, 1, 25.45, 'EUR');
INSERT INTO prices (brand_id, start_date, end_date, price_list, product_id, priority, price, curr) VALUES (1, parsedatetime('2020-06-15-00.00.00', 'yyyy-MM-dd-HH.mm.ss'), parsedatetime('2020-06-15-11.00.00', 'yyyy-MM-dd-HH.mm.ss'), 3, 35455, 1, 30.50, 'EUR');
INSERT INTO prices (brand_id, start_date, end_date, price_list, product_id, priority, price, curr) VALUES (1, parsedatetime('2020-06-15-16.00.00', 'yyyy-MM-dd-HH.mm.ss'), parsedatetime('2020-12-31-23.59.59', 'yyyy-MM-dd-HH.mm.ss'), 4, 35455, 1, 38.95, 'EUR');