drop database if exists bai_1;

create database bai_1;

use bai_1;

create table customerPRIMARYsys_config_insert_set_usersys_config_update_set_user(
	id int primary key auto_increment,
	customer_name varchar(50),
    phone  INTEGER,
    city varchar(20),
    country varchar(20)
);

insert into customer 
values(1, 'tung', 0905333111, 'danang', 'vietnam');

insert into customer (customer_name, phone, city,country) values
('tung',45613278, 'hoahai', 'vietnam'),
('dung',12456789,  'hoaqui', 'vietnam') ;

select customer_name from customer where id= 2;
