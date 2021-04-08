drop database if exists truy_van_du_lieu_nang_cao;

create database truy_van_du_lieu_nang_cao;

use truy_van_du_lieu_nang_cao;

create table productlines (
	productLine int,
    textDescription varchar(50),
    htmlDescription varchar(50),
    image varchar(50),
    
    constraint pk_productLine primary key productlines(productLine)
);

create table products(
	productCode int,
    productName varchar (50),
    productLine int,
    productScale varchar (50),
    productVendor varchar (50),
    productDescription varchar (50),
    quantityInStock varchar(50),
    buyPrice int,
    MSRP varchar(50),
    
    constraint pk_productCode primary key products(productCode),
	constraint fk_productLine_products foreign key(productLine) references productlines(productLine)

);

select productCode, productName, buyprice, quantityInStock from products
where buyprice > 56.76 and quantityInStock > 10;

SELECT productCode,productName, buyprice, textDescription
FROM products
INNER JOIN productlines
ON products.productline = productlines.productline
WHERE buyprice > 56.76 AND buyprice < 95.59;

select productCode, productName, buyprice, quantityInStock, productVendor, productLine 
from products 
where productLine = 'Classic Cars' or productVendor = 'Min Lin Diecast'





