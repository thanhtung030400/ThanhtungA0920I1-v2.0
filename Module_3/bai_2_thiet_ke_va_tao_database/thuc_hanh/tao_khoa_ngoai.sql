drop database if exists customers_1;

create database customers_1;

use customers_1;

create table customers_1(
	id int auto_increment primary key,
    name varchar (40),
    address varchar(255),
    email varchar(255)
);

create table orders(
	id int auto_increment,
    staff varchar(50),
	primary key(id),
    customer_id int,
    foreign key(customer_id) references customers_1(id)
);


