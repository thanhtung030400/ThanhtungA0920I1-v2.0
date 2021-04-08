drop database if exists truy_van_du_lieu_tu_nhieu_bang;

create database truy_van_du_lieu_tu_nhieu_bang;

use truy_van_du_lieu_tu_nhieu_bang;

create table customers(
	customerNumeber int,
    customerName varchar(50),
    contactLastName varchar(50),
    contactFirstName varchar (50),
    phone int ,
	addressLine1 varchar (50),
	addressLine2 varchar (50),
    city varchar (50),
    state varchar (50),
    postalCode varchar(50),
    country varchar (50),
    salesRepEmployeeNumber int,
    credittLimit int
);

create table payments(
	customerNumber int,
    checkNumber int,
    paymentDate date,
    amount int
);

create table orders(
	orderNummber int,
    orderDate date,
    requirmentDate date,
    shippedDate date,
    `status` varchar (50),
    comments varchar(50),
    customerNumber int
);
