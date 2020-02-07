create database layhoiloi_DB;
use layhoiloi_DB;
create table KHACH_HANG(
MAKH int primary key,
TENKH varchar(50),
DIACHI varchar(50),
SoDT char(11)
);

create table PHONG(
MAPHONG int primary key,
LOAIPHONG  varchar(30),
SoKhachToiDa int,
GiaPhong decimal(6,3),
 MoTA varchar(255)
);

