
-- question 2
select * from employee where (employee_name like 'h%' or employee_name like 'k%' or employee_name like 't%') and length(employee_name)<15;

-- question 3
select * from customer where customer_address in('Quang Tri','Da Nang') and (curdate()-customer_date>(18*30*365) and curdate()-customer_date<(50*30*365));

-- question 4
select customer.customer_name, 
count(contract.contract_id) as so_lan_dat_phong 
from customer inner join contract on customer.customer_id = contract.customer_id
inner join type_customer on customer.customer_id = type_customer.type_customer_id 
where type_customer.type_customer_name = "dinamon"
group by customer.customer_id order by so_lan_dat_phong;

-- question 5

select customer.customer_id, customer.customer_name, type_customer.type_customer_name, contract.contract_id, contract.contract_date_begin, contract.contract_date_end, service.service_name,
sum(service.service_priceRent + contractdetails.contractdetails_number * accompaniedservice.accompaniedservice_price) as Total_pay 
from customer 
left join type_customer on customer.typecustomer_id = type_customer.type_customer_id
left join contract on customer.customer_id = contract.customer_id
left join service on contract.service_id = service.service_id
left join contractdetails on contract.contract_id = contractdetails.contract_id
left join accompaniedservice on contractdetails.accompaniedservice_id = accompaniedservice.accompaniedservice_id
group by contract.contract_id;

-- question 6

select service.service_id, service.service_name, service.service_area, service.service_priceRent, type_service.type_service_name
from service inner join type_service on service.type_service_id = type_service.type_service_id
where not exists(select contract.contract_id from contract where(contract.contract_date_begin between '2019-01-01' and '2019-03-31')and contract.service_id = service.service_id );

-- question 7

select service.service_id, service.service_name, service.service_area, service.service_maxnumber, service.service_priceRent, type_service.type_service_name
from service inner join type_service on service.type_service_id = type_service.type_service_id
where exists(select contract.contract_id from contract where year(contract.contract_date_begin) = '2018' and contract. service_id = service.service_id)
and not exists(select contract.contract_id from contract where year(contract.contract_date_begin) = '2019' and contract.service_id = service.service_id);

-- question 8.1
select distinct customer.customer_name from customer;
-- question 8.2
select customer.customer_name from customer group by customer.customer_name;
-- question 8.3
select customer.customer_name from customer union select customer.customer_name from customer;

-- question 9 
select temp.month, count(month(contract.contract_date_begin)) as so_khach_hang_dang_ky, sum(contract.contract_totalMoney) as tong_tien from
(select 1 as month
union select 2 as month
union select 3 as month
union select 4 as month
union select 5 as month
union select 6 as month
union select 7 as month
union select 8 as month
union select 9 as month
union select 10 as month
union select 11 as month
union select 12 as month) as temp 	
left join contract on month(contract.contract_date_begin)=temp.month
left join customer on customer.customer_id = contract.customer_id
where year(contract.contract_date_begin)='2019' or year (contract.contract_date_begin) is null or month(contract.contract_date_begin) is null
group by temp.month; 

-- question 10

select contract.contract_id, contract.contract_date_end, contract.contract_deposits, count(contractdetails.accompaniedservice_id) as so_luong_dich_vu_di_kem
from contract inner join contractdetails on contract.contract_id = contractdetails.contract_id group by contract.contract_id;

-- question 11

select distinct accompaniedservice.accompaniedservice_name, accompaniedservice.accompaniedservice_price, accompaniedservice.accompaniedservice_number from contract
inner join contractdetails on contract.contract_id = contractdetails.contract_id
inner join accompaniedservice on contractdetails.accompaniedservice_id = accompaniedservice.accompaniedservice_id
inner join customer on customer.customer_id = contract.customer_id
inner join type_customer on customer.typecustomer_id = type_customer.type_customer_id
where type_customer.type_customer_name = 'dinamon' and customer.customer_address in ('vinh','quang ngai');

-- question 12

select contract.contract_id, contract.contract_totalMoney, contract.contract_deposits, employee.employee_name, customer.customer_name, customer.customer_phoneNumber, service.service_name,
count(contractdetails.accompaniedservice_id) as so_lan_su_dung
from contract
inner join employee on contract.employee_id = employee.employee_id
inner join customer on contract.customer_id = customer.customer_id
inner join service on contract.service_id = service.service_id
inner join contractdetails on contract.contract_id = contractdetails.contract_id
where not exists(select contract.contract_id where contract.contract_date_begin between '2019-01-01' and '2019-06-31')
and not exists(select contract.contract_id where contract.contract_date_begin between '2019-09-01' and '2019-12-31');

-- question 13
create temporary table temp
select accompaniedservice.accompaniedservice_name as ten_dich_vu_di_kem,
count(contractdetails.accompaniedservice_id) as so_lan_su_dung
from contractdetails
inner join accompaniedservice on accompaniedservice.accompaniedservice_id = contractdetails.accompaniedservice_id
group by accompaniedservice.accompaniedservice_name;
select*from temp;

create temporary table temp1
select max(temp.so_lan_su_dung)  as max_so_lan_su_dung from temp;
select*from temp1;

select temp.ten_dich_vu_di_kem, temp.so_lan_su_dung from temp inner join temp1 on temp.so_lan_su_dung = temp1.max_so_lan_su_dung;
drop temporary table temp;
drop temporary table temp1;

-- question 14

select contract.contract_id, type_service.type_service_name, accompaniedservice.accompaniedservice_name, count(contractdetails.contractdetails_number) as so_lan_su_dung
from contract inner join service on contract.service_id = service.service_id
inner join type_service on service.type_service_id = type_service.type_service_id
inner join contractdetails on contract.contract_id = contractdetails.contract_id
inner join accompaniedservice on accompaniedservice.accompaniedservice_id = contractdetails.accompaniedservice_id
group by(accompaniedservice.accompaniedservice_name) having so_lan_su_dung=1;

-- question 15

select employee.employee_id, employee.employee_name, employee_level.employee_level, employee_workingparts.employee_workingParts_name, employee.employee_sdt, employee.employee_address , count(contract.employee_id) as so_lan_tao_hop_dong
from employee 
inner join employee_level on employee.employee_level_id = employee_level.employee_level_id
inner join employee_workingparts on employee_workingparts.employee_workingParts_id = employee.employee_workingParts_id
inner join contract on contract.employee_id = employee.employee_id
where contract.contract_date_begin between '2018-01-01' and '2019-12-31'
group by employee.employee_name
having so_lan_tao_hop_dong <4;

-- question 16

select * from employee 
where not exists (select contract.contract_id from contract inner join contractdetails where (contract.contract_date_begin between '2017-01-01' and '2019-12-31') and contract.contract_id = contractdetails.contract_id);
select * from contractdetails;

-- chua xong!!!!!!!!!!!!

-- question 17

update customer,
(select contract.customer_id as id, 
sum(contract.contract_totalMoney) as tong_tien from contract
where year(contract.contract_date_begin)=2019
group by contract.customer_id
having tong_tien>1000) as temp 
set customer.typecustomer_id=(select type_customer.type_customer_id from type_customer where type_customer.type_customer_name='dinamon')
where customer.customer_id = (select type_customer.type_customer_id from type_customer where type_customer.type_customer_name='platium')
and temp.id=customer.customer_id;

-- question 18

delete customer,contract,contractdetails 	
from customer
inner join contract on customer.customer_id = contract.customer_id
inner join contractdetails on contract.customer_id = contractdetails.contract_id
where not exists(select contract.contract_id where year(contract.contract_date_begin)>2016 and customer.customer_id = contract.customer_id);


-- question 19 

-- SET SQL_SAFE_UPDATES = 0;
update accompaniedservice inner join(select accompaniedservice.accompaniedservice_name as ten_dich_vu_di_kem
from contractdetails inner join accompaniedservice on accompaniedservice.accompaniedservice_id = contractdetails.accompaniedservice_id
group by accompaniedservice.accompaniedservice_id
having count(contractdetails.accompaniedservice_id) > 3) as temp set accompaniedservice.accompaniedservice_price = accompaniedservice.accompaniedservice_price*2 
where accompaniedservice.accompaniedservice_name = temp.ten_dich_vu_di_kem;
-- SET SQL_SAFE_UPDATES = 1;

-- question 20

select employee.employee_id  as id, employee.employee_name, employee.employee_email, employee.employee_sdt, employee.employee_date, employee.employee_address, "nhan vien" as Fromtable
from employee
union all
select customer.customer_id as id, customer.customer_name, customer.customer_email, customer.customer_phoneNumber, customer.customer_date, customer.customer_address,"khach hang" as Fromtable
from customer;























