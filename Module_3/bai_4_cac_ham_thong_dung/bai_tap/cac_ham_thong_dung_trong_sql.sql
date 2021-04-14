drop database if exists cac_ham_thong_dung_trong_sql;

create database cac_ham_thong_dung_trong_sql;

use cac_ham_thong_dung_trong_sql;

create table hoc_vien(
	id int ,
	ten varchar(50),
    tuoi int ,
    khoaHoc varchar(50),
    soTien int
);

insert into hoc_vien(id, ten, tuoi, khoaHoc, soTien)value(1, "tung", 20, "a10", 200000);
insert into hoc_vien(id, ten, tuoi, khoaHoc, soTien)value(2, "dung", 21, "a10", 200000);
insert into hoc_vien(id, ten, tuoi, khoaHoc, soTien)value(3, "khach", 22, "a11", 200000);
insert into hoc_vien(id, ten, tuoi, khoaHoc, soTien)value(4, "tung", 23, "a12", 400000);
insert into hoc_vien(id, ten, tuoi, khoaHoc, soTien)value(5, "hang", 24, "a09", 300000);


select * from hoc_vien
where ten = "khach";

select sum(soTien) as tonTien from hoc_vien
where ten = "khach";

select distinct ten from hoc_vien;