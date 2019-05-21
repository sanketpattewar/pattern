create database practicedatabase;
use practicedatabase ;
create table station(Salesman_ID int, Comission int,City varchar(20));

insert into station values(10,20,"bidar");
select *from station;
DELETE FROM station 
where salesman_ID = 10;

create table jobbers ( CUSTOMER_ID int , customer_name varchar(20),adress varchar(30) ,city varchar(25) );


insert into  jobbers values (7 ,'rohan', 'rohan kotalwar' ,'udgir' , 'latur') ;
select * from jobbers ;
insert into  jobbers values (1 ,'mahesh', 'mahesh goushetwar' ,'udgir' , 'latur') ;
insert into  jobbers values (2 ,'tejas', 'tejas otalwar' ,'udgir' , 'latur') ;
insert into  jobbers values (3 ,'amit', 'amit sasdev' ,'bhandara' , 'maharashtra') ;
insert into  jobbers values (4 ,'yash', 'yash chidri' ,'humnabad' , 'maharshtra') ;
insert into  jobbers values (5 ,'ashwin', 'ashwin j' ,'kolhapur' , 'maharashtra') ;
insert into  jobbers values (6 ,'mahesh', 'mahesh goushetwar' ,'udgir' , 'maharashtra') ;

alter table jobbers add(contact_number long );

select* from jobbers ;

update jobbers 
set contact_number=8237517517
where customer_id=1 ;

select* from jobbers;

select distinct * from jobbers ;
delete from  jobbers;
update jobbers 
set customer_id =7 where customer_name='rohan' ;

select distinct * from jobbers ;

delete  from jobbers
where customer_id =7;

select distinct* from jobbers ;

select count(customer_id) from jobbers ;
select min(customer_id ) from jobbers ;
select max(customer_id) from jobbers ;
select max(customer_id) from jobbers ;
select sum(customer_id) from jobbers ;

select * from jobbers ;

select * from jobbers 
order by customer_id desc ;

select city from jobbers
order by customer_id desc ;

select * from jobbers ;

select customer_name, contact_name 
from jobbers where city like 'm%';

select contact_name from jobbers where city like  '%arashtra%' ;
select * from jobbers where adress like '[a-c]%';


select customer_id from jobbers
where city like '%r';

select customer_id from jobbers; 


create table station1( ID int, city varchar(20),state varchar(20),LAt_n int ,Long_w int);
create table states ( ID int , Month int, temp_f int,rain_I int );



