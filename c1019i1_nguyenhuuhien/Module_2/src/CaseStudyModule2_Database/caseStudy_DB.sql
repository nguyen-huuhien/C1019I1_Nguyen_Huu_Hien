create database casestudy_module2_db;
use casestudy_module2_db;

create table `casestudy_module2_db`.type_customer(
type_customer_id int auto_increment primary key not null,
type_customer_name varchar(45) 
);

create table `casestudy_module2_db`.customer(
customer_id int auto_increment primary key not null,
typecustomer_id int ,
 foreign key (typecustomer_id) references type_customer(type_customer_id),
customer_name varchar(45),
customer_date date,
customer_CMNDnumber varchar(45),
customer_phoneNumber varchar(45),
customer_email varchar(45),
customer_address varchar(45)
);

create table `casestudy_module2_db`.type_rent(
type_rent_id int auto_increment primary key not null,
type_rent_name varchar(45),
type_rent_price int
);

create table `casestudy_module2_db`.type_service(
type_service_id int auto_increment primary key not null,
type_service_name varchar(45)
);

create table `casestudy_module2_db`.service(
service_id int auto_increment primary key not null,
service_name varchar(45),
service_area int,
service_floor int,
service_maxnumber varchar(45),
service_priceRent varchar(45),
type_rent_id int,
foreign key(type_rent_id) references type_rent(type_rent_id),
type_service_id int,
foreign key(type_service_id) references type_service(type_service_id),
service_status varchar(45)
);

create table `casestudy_module2_db`.employee_job(
employee_job_id int auto_increment primary key not null,
employee_job_name varchar(45)
);

create table `casestudy_module2_db`.employee_level(
employee_level_id int auto_increment primary key not null,
employee_level varchar(45)
);

create table `casestudy_module2_db`.employee_workingParts(
employee_workingParts_id int auto_increment not null primary key,
employee_workingParts_name varchar(45)
);

create table `casestudy_module2_db`.employee(
employee_id int primary key auto_increment not null,
employee_name varchar(45),
employee_job_id int, foreign key(employee_job_id) references employee_job(employee_job_id),
employee_level_id int , foreign key(employee_level_id) references employee_level(employee_level_id),
employee_workingParts_id int, foreign key(employee_workingParts_id) references employee_workingParts(employee_workingParts_id),
employee_date date,
employee_cmndNumber varchar(45),
employee_salary varchar(45),
employee_sdt varchar(45),
employee_email varchar(45),
employee_address varchar(45)
);

create table `casestudy_module2_db`.accompaniedservice(
accompaniedservice_id int auto_increment primary key not null,
accompaniedservice_name varchar(45),
accompaniedservice_price varchar(45),
accompaniedservice_number int,
accompaniedservice_status varchar(45)
);

create table `casestudy_module2_db`.contract(
contract_id int auto_increment primary key not null,
employee_id int, foreign key(employee_id) references employee(employee_id),
customer_id int , foreign key(customer_id) references customer(customer_id),
service_id int , foreign key(service_id) references service(service_id),
contract_date_begin date,
contract_date_end date,
contract_deposits int,
contract_totalMoney int
);


create table `casestudy_module2_db`.contractdetails(
contractdetails_id int auto_increment primary key not null,
contract_id int,foreign key(contract_id) references contract(contract_id),
accompaniedservice_id int, foreign key(accompaniedservice_id) references accompaniedservice(accompaniedservice_id),
contractdetails_number int
);



insert into type_customer (type_customer_id,type_customer_name)
values(1,"Tuan");
insert into type_customer (type_customer_id,type_customer_name)
values(2,"gold");
insert into type_customer (type_customer_id,type_customer_name)
values(3,"dinamon");
insert into type_customer (type_customer_id,type_customer_name)
values(4,"vip");
update type_customer set type_customer_name = "sliver" where type_customer_id = 1 ;

insert into employee_workingparts (employee_workingparts_id,employee_workingparts_name)
value(1,"bep");
insert into employee_workingparts (employee_workingparts_id,employee_workingparts_name)
value(2,"it");
insert into employee_workingparts (employee_workingparts_id,employee_workingparts_name)
value(3,"room");
insert into employee_workingparts (employee_workingparts_id,employee_workingparts_name)
value(4,"service");
insert into employee_workingparts (employee_workingparts_id,employee_workingparts_name)
value(5,"manager");

insert into employee_level(employee_level_id,employee_level)
values(1,"khong");
insert into employee_level(employee_level_id,employee_level)
values(2,"pho thong");
insert into employee_level(employee_level_id,employee_level)
values(3,"cao dang");
insert into employee_level(employee_level_id,employee_level)
values(4,"dai hoc");

insert into employee_job(employee_job_id,employee_job_name)
values(1,"internship");
insert into employee_job(employee_job_id,employee_job_name)
values(2,"fresher");
insert into employee_job(employee_job_id,employee_job_name)
values(3,"employee");
insert into employee_job(employee_job_id,employee_job_name)
values(4,"leader");
insert into employee_job(employee_job_id,employee_job_name)
values(5,"manager");

insert into customer(customer_id, typecustomer_id, customer_name, customer_date, customer_CMNDnumber, customer_phoneNumber, customer_email, customer_address)
values(1, 2,"Nguyen Huu Hien", 30/10/1998, 245654523, 52412541, "huuhien@gmail.com" , "Quang Nam");
insert into customer(customer_id, typecustomer_id, customer_name, customer_date, customer_CMNDnumber, customer_phoneNumber, customer_email, customer_address)
values(2, 4,"Tran Anh Tuan", 05/05/1999, 523641254, 335897555, "tuanngu@gmail.com" , "Quang Tri");
insert into customer(customer_id, typecustomer_id, customer_name, customer_date, customer_CMNDnumber, customer_phoneNumber, customer_email, customer_address)
values(3, 4,"Tran Tran",'1999-05-05', 523641254, 335897555, "tuanngu@gmail.com" , "Quang Tri");
insert into customer(customer_id, typecustomer_id, customer_name, customer_date, customer_CMNDnumber, customer_phoneNumber, customer_email, customer_address)
values(4, 1,"Nguyen Hong Son", '2000-10-05', 846568632, 515376, "sonml@gmail.com" , "earth");
insert into customer(customer_id, typecustomer_id, customer_name, customer_date, customer_CMNDnumber, customer_phoneNumber, customer_email, customer_address)
values(4, 1,"Nguyen Hong Son", '2000-10-05', 846568632, 515376, "sonml@gmail.com" , "earth");
insert into customer(customer_id, typecustomer_id, customer_name, customer_date, customer_CMNDnumber, customer_phoneNumber, customer_email, customer_address)
values(5, 1,"Tran Thanh", '1992-03-05', 87915715, 2351468714, "thanhmlvcl@gmail.com" , "jumpiter");
insert into customer( typecustomer_id, customer_name, customer_date, customer_CMNDnumber, customer_phoneNumber, customer_email, customer_address)
values(1,"Nguyen Kien", '2002-09-26', 55756756, 46456345345, "jsdjkhelj@gmail.com" , "jumpiter");
insert into customer( typecustomer_id, customer_name, customer_date, customer_CMNDnumber, customer_phoneNumber, customer_email, customer_address)
values(3,"Tran Dan", '1965-10-23', 069746546, 052173520, "trandankute@gmail.com" , "usa");
insert into customer( typecustomer_id, customer_name, customer_date, customer_CMNDnumber, customer_phoneNumber, customer_email, customer_address)
values(4,"Nguyen Dung", '1995-02-01', 678786786, 346456461, "dkjjbzzxkjc@gmail.com" , "jumpiter");
insert into customer( typecustomer_id, customer_name, customer_date, customer_CMNDnumber, customer_phoneNumber, customer_email, customer_address)
values(2,"vo xuan", '1980-10-29', 8745231456, 987456123, "vuivelenhihi@gmail.com" , "quan cam");
insert into customer( typecustomer_id, customer_name, customer_date, customer_CMNDnumber, customer_phoneNumber, customer_email, customer_address)
values(2,"vo xuan", '1980-10-29', 8745231456, 987456123, "vuivelenhihi@gmail.com" , "Quang Tri");



insert into type_service(type_service_name)
values("Room");
insert into type_service(type_service_name)
values("House");
insert into type_service(type_service_name)
values("Villa");

insert into type_rent(type_rent_name, type_rent_price)
values("gio", 20000);
insert into type_rent(type_rent_name, type_rent_price)
values("ngay", 200000);
insert into type_rent(type_rent_name, type_rent_price)
values("tuan", 1400000);
insert into type_rent(type_rent_name, type_rent_price)
values("thang", 5600000);
insert into type_rent(type_rent_name, type_rent_price)
values("nam", 67200000);

insert into service(service_name, service_area, service_floor, service_maxnumber, service_priceRent, type_rent_id, type_service_id, service_status)
values('wedding', 200, 3, 300, 500000000, 3,3, 'checked');
insert into service(service_name, service_area, service_floor, service_maxnumber, service_priceRent, type_rent_id, type_service_id, service_status)
values('metting', 100, 1, 50, 30000000, 2,1, 'unchecked');
insert into service(service_name, service_area, service_floor, service_maxnumber, service_priceRent, type_rent_id, type_service_id, service_status)
values('wedding tuan', 500, 2, 300, 100000000, 2,3, 'checked');
insert into service(service_name, service_area, service_floor, service_maxnumber, service_priceRent, type_rent_id, type_service_id, service_status)
values('dam do', 100, 1, 50, 15000000, 3,1, 'checked');
insert into service(service_name, service_area, service_floor, service_maxnumber, service_priceRent, type_rent_id, type_service_id, service_status)
values('tie cuoi nam', 500, 1, 300, 720000000, 3,3, 'checked');


insert into accompaniedservice(accompaniedservice_name, accompaniedservice_price, accompaniedservice_number, accompaniedservice_status)
values('water bottle', '20k', 1, 'delivered');
update accompaniedservice
set accompaniedservice_status = 'stocking'
where accompaniedservice_id=1;
insert into accompaniedservice(accompaniedservice_name, accompaniedservice_price, accompaniedservice_number, accompaniedservice_status)
values('coca cola', '50k', 1, 'stocking');
insert into accompaniedservice(accompaniedservice_name, accompaniedservice_price, accompaniedservice_number, accompaniedservice_status)
values('water bottle', '20k', 1, 'Out of stock');
insert into accompaniedservice(accompaniedservice_name, accompaniedservice_price, accompaniedservice_number, accompaniedservice_status)
values('massage', '500k', 1, 'Ready');
insert into accompaniedservice(accompaniedservice_name, accompaniedservice_price, accompaniedservice_number, accompaniedservice_status)
values('TV', '20k', 1, 'on');
insert into accompaniedservice(accompaniedservice_name, accompaniedservice_price, accompaniedservice_number, accompaniedservice_status)
values('dieu hoa', '20k', 1, 'ON');
insert into accompaniedservice(accompaniedservice_name, accompaniedservice_price, accompaniedservice_number, accompaniedservice_status)
values('water bottle', '20k', 1, 'Out of stock');



insert into employee_job(employee_job_name)
values('intern'),('fresher'),('employee'),('leader'),('manager'),('br'),('ba'),('president');

insert into employee(employee_name, employee_job_id, employee_level_id, employee_workingParts_id, employee_date, employee_cmndNumber, employee_salary, employee_sdt, employee_email, employee_address)
values('nguyen huu hien', 4, 3, 2, '1998/10/30', '3432154254','244346846', '0382780099', 'jbckjshdf@sdmcsdcm.com', 'quang nam');
insert into employee(employee_name, employee_job_id, employee_level_id, employee_workingParts_id, employee_date, employee_cmndNumber, employee_salary, employee_sdt, employee_email, employee_address)
values('tran dan', 2, 2, 2, '2000/05/30', '8754120','985623451', '0245664512', 'nkjvhvuie@sdmcsdcm.com', 'hue');
insert into employee(employee_name, employee_job_id, employee_level_id, employee_workingParts_id, employee_date, employee_cmndNumber, employee_salary, employee_sdt, employee_email, employee_address)
values('kien nguyen', 6, 4, 2, '1990/06/22', '50.000','845216212', '8794512321564', 'kien12121212@sdmcsdcm.com', 'da nang');
insert into employee(employee_name, employee_job_id, employee_level_id, employee_workingParts_id, employee_date, employee_cmndNumber, employee_salary, employee_sdt, employee_email, employee_address)
values('hong son', 6, 3, 4, '1995/11/05', '9.000.000','9654684754', '21212154798', 'son8347fdk@sdmcsdcm.com', 'unknown');
insert into employee(employee_name, employee_job_id, employee_level_id, employee_workingParts_id, employee_date, employee_cmndNumber, employee_salary, employee_sdt, employee_email, employee_address)
values('anh tuan', 2, 4, 2, '1997/05/05', '8.500.000','3132987422', '0123456987', 'weboodabest@sdmcsdcm.com', 'japan');
insert into employee(employee_name, employee_job_id, employee_level_id, employee_workingParts_id, employee_date, employee_cmndNumber, employee_salary, employee_sdt, employee_email, employee_address)
values('tran dung', 2, 4, 2, '2000/01/15', '3.000.000','206145126', '01254397854', 'dungdung@gmail.com', 'dong lao');
insert into employee(employee_name, employee_job_id, employee_level_id, employee_workingParts_id, employee_date, employee_cmndNumber, employee_salary, employee_sdt, employee_email, employee_address)
values('thanh thanh', 7, 4, 2, '1990/09/12', '30.000.000','106452354', '0987451234', 'thanhthanhBB@gmail.com', 'ha loi');
insert into employee(employee_name, employee_job_id, employee_level_id, employee_workingParts_id, employee_date, employee_cmndNumber, employee_salary, employee_sdt, employee_email, employee_address)
values('hai du', 8, 4, 2, '1985/05/15', '80.000.000','102354128', '0325452168', 'thangdozanqua@gmail.com', 'quan cam');
insert into employee(employee_name, employee_job_id, employee_level_id, employee_workingParts_id, employee_date, employee_cmndNumber, employee_salary, employee_sdt, employee_email, employee_address)
values('linda', 7, 4, 2, '1980/06/28', '15.000.000','206874545', '035123642', 'cogairungtram@gmail.com', 'sai gon');

insert into contract(employee_id, customer_id, service_id, contract_date_begin, contract_date_end, contract_deposits ,contract_totalMoney)
values(1,2,1,'2020/01/01','2020/01/20',2000000,5000000);
insert into contract(employee_id, customer_id, service_id, contract_date_begin, contract_date_end, contract_deposits ,contract_totalMoney)
values(3,4,2,'1998/01/01','2020/01/01',5000000,100000000);
insert into contract(employee_id, customer_id, service_id, contract_date_begin, contract_date_end, contract_deposits ,contract_totalMoney)
values(6,6,5,'2020/01/05','2020/01/10',1000000,10000000);
insert into contract(employee_id, customer_id, service_id, contract_date_begin, contract_date_end, contract_deposits ,contract_totalMoney)
values(7,6,3,'2019/10/15','2019/10/20',2000000,5000000);

insert into contractdetails(contract_id, accompaniedservice_id, contractdetails_number)
values(1, 2, 1);
insert into contractdetails(contract_id, accompaniedservice_id, contractdetails_number)
values(2, 1, 1);
insert into contractdetails(contract_id, accompaniedservice_id, contractdetails_number)
values(3, 4, 1);
insert into contractdetails(contract_id, accompaniedservice_id, contractdetails_number)
values(4, 1, 1);
insert into contractdetails(contract_id, accompaniedservice_id, contractdetails_number)
values(5, 2, 1);

alter table `casestudy_module2_db`.accompaniedservice
drop column accompaniedservice_price;
alter table `casestudy_module2_db`.accompaniedservice
add accompaniedservice_price int;
update `casestudy_module2_db`.accompaniedservice
set accompaniedservice_price = 40000
where accompaniedservice_id=1;
update `casestudy_module2_db`.accompaniedservice
set accompaniedservice_price = 50000
where accompaniedservice_id=2;
update `casestudy_module2_db`.accompaniedservice
set accompaniedservice_price = 60000
where accompaniedservice_id=3;
update `casestudy_module2_db`.accompaniedservice
set accompaniedservice_price = 6000000
where accompaniedservice_id=4;

alter table service
modify column service_priceRent int;








































