drop database if exists furamaresort;

create database furamaresort;

use furamaresort;

create table ViTri(
	idViTri int,
    TenViTri varchar(45) not null,
    constraint pk_idViTri primary key ViTri(idViTri)
);

create table TrinhDo(
	idTrinhDo int,
    TrinhDo varchar(45) not null,
    constraint pk_idTrinhDo primary key TrinhDo(idTrinhDo)
);

create table BoPhan(
	idBoPhan int,
    TenBoPhan varchar(45) not null,
    constraint pk_idBoPhan primary key BoPhan(idBoPhan)
);

create table LoaiKhach(
	idLoaiKhach int,
    TenLoaiKhach varchar(45) not null,
    constraint pk_idLoaiKhach primary key LoaiKhach(idLoaiKhach)
);

create table LoaiDichVu(
	idLoaiDichVu int,
    TenLoaiDichVu varchar(45) not null,
    constraint pk_idLoaiDichVu primary key LoaiDichVu(idLoaiDichVu)
);

create table KieuThue(
	idKieuThue int,
    TenKieuThue varchar(45) not null,
    Gia int not null,
    constraint pk_idKieuThue primary key KieuThue(idKieuThue)
);

create table DichVuDiKem(
	idDichVuDiKem int,
    TenDichVuDiKem varchar(45) not null,
    Gia int not null,
    DonVi int not null,
    TrangThaiKhaDung varchar(45) not null,
    constraint pk_idDichVuDiKem primary key DichVuDiKem(idDichVuDiKem)
);

create table NhanVien(
	idNhanVien int,
    HoTen varchar(45) not null,
    idBoPhan int not null,
    idTrinhDo int not null,
    idViTri int not null,
    NgaySinh date not null,
    CMND varchar(45) not null,
    Luong varchar(45) not null,
    SDT varchar(45) not null,
    Email varchar(45) not null,
    DiaChi varchar(45) not null,   
    constraint fk_idBoPhan_NhanVien foreign key(idBoPhan) references BoPhan(idBoPhan),
    constraint fk_idTrinhDo_NhanVien foreign key(idTrinhDo) references TrinhDo(idTrinhDo),
    constraint fk_idViTri_NhanVien foreign key(idViTri) references ViTri(idViTri),
	constraint pk_idNhanVien primary key NhanVien(idNhanVien)
);

create table KhachHang(
	idKhachHang int,
    idLoaiKhach int not null,
    HoTen varchar(45) not null,
    NgaySinh date not null,
    CMND varchar(45) not null,
    SDT varchar(45) not null,
    Email varchar(45) not null,
    DiaChi varchar(45) not null,    
    constraint fk_idLoaiKhach_KhachHang foreign key(idLoaiKhach) references LoaiKhach(idLoaiKhach),
    constraint pk_idKhachHang primary key KhachHang(idKhachHang)
);

create table DichVu(
	idDichVu int,
    TenDichVu varchar(45) not null,
    DienTich int not null,
    SoTang int not null,
    SoNguoiToiDa varchar(45) not null,
    ChiPhiThue varchar(45) not null,
    idLoaiDichVu int not null,
    idKieuThue int not null,
    
    constraint fk_idLoaiDichVu_DichVu foreign key(idLoaiDichVu) references LoaiDichVu(idLoaiDichVu),
    constraint fk_idKieuThue_DichVu foreign key(idKieuThue) references KieuThue(idKieuThue),
    constraint pk_idDichVu primary key DichVu(idDichVu)
);


create table HopDong(
	idHopDong int,
    NgayLamHopDong date not null,
    NgayKetThuc date not null,
    TienDatCoc int not null,
    TongTien int not null,
    idNhanVien int not null,
    idDichVu int not null,
    idKhachHang int not null,
    
    constraint fk_idNhanVien_HopDong foreign key(idNhanVien) references NhanVien(idNhanVien),
    constraint fk_idDichVu_HopDong foreign key(idDichVu) references DichVu(idDichVu),
	constraint fk_idKhachHang_HopDong foreign key(idKhachHang) references KhachHang(idKhachHang),
    constraint pk_idHopDong primary key HopDong(idHopDong)
);

create table HopDongChiTiet(
	idHopDongChiTiet int,
    SoLuong int not null,
    idHopDong int not null,
    idDichVuDiKem int not null,
    
    constraint fk_idHopDong_HopDongChiTiet foreign key (idHopDong) references HopDong(idHopDong),
    constraint fk_idDichVuDiKem_HopDongChiTiet foreign key(idDichVuDiKem) references DichVuDiKem(idDichVuDiKem),
    constraint pk_idHopDongChiTiet primary key HopDongChiTiet(idHopDongChiTiet)
);
