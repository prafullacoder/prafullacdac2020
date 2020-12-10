Create table EMP ( EMPNO int not null, ENAME varchar(30) not null, JOB varchar(10), 
MGR int, HIREDATE date, SAL int, DEPTNO int );  
drop table EMP;	

Insert into EMP (EMPNO ,ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO ) values(1000,  'Manish' , 'SALESMAN', 1003,  '2020-02-18', 600,  30) ;
Insert into EMP (EMPNO ,ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO ) values(1001,  'Manoj' , 'SALESMAN', 1003,  '2018-02-18', 600,  30) ;
Insert into EMP (EMPNO ,ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO ) values(1002 , 'Ashish', 'SALESMAN',1003 , '2013-02-18',  750,  30 );
Insert into EMP (EMPNO ,ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO ) values(1004,  'Rekha', 'ANALYST', 1006 , '2001-02-18', 3000,  10);
Insert into EMP (EMPNO ,ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO ) values(1005 , 'Sachin', 'ANALYST', 1006 ,  '2019-02-18', 3000, 10 );	
Insert into EMP (EMPNO ,ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO) values(1006,  'Pooja',  'MANAGER'  ,     null    , '2000-02-18' ,6000, 10 );
select * from EMP;

Create table dept (dno numeric(4) not null, dname varchar(10) not null,area varchar(30));

Insert into dept(dno,dname,area) values(10,'Store','Mumbai');
Insert into dept(dno,dname,area) values(20,'Purchase','Mumbai');
Insert into dept(dno,dname,area) values(30,'Store', 'Delhi');
Insert into dept(dno,dname,area) values(40,'Marketing','Pune');
Insert into dept(dno,dname,area) values(50,'Finance','Delhi');
Insert into dept(dno,dname,area) values(60,'Accounts','Mumbai');
select * from dept;
--question 1)	1.	Write a Procedure that accepts values of two non-zero numbers using IN parameter and perform addition, subtraction, multiplication, division and print.
delimiter $$
create procedure que1 (in num1 int,num2 int)
begin
declare sum,sub,mul,division int;
set sum=num1+num2;
set sub=num1-num2;
set mul=num1*num2;
set division=num1/num2;
select sum,sub,mul,division;
end $$
call que1(40,20);

--question 3)	3.	Write a Procedure to display top 5 employee based on highest salary and display employee number, employee name and salary.
delimiter $$
create procedure que3 (in num int)
begin
select distinct SAl,EMPNO,ENAME from EMP order by SAL desc limit num;
end $$
call que3(5);

-- question 2)	2.	Write a Procedure to print the string in REVERSE order. Take the input using IN parameter. (Ex .Database , o/p :esabatad)
delimiter $$
create procedure que2 (in str varchar(20))
begin
select reverse (str);
end $$

--question 4)	4.	Write a Procedure to create table emp_test with e_id integer, e_name varchar(10), e_joining_date date as columns
delimiter $$
create procedure que4 ()
begin
create table emp_test1 (e_id int,e_name varchar(10),e_joining_date date);
select * from emp_test1;
desc emp_test1;
end $$
call que4();
show tables;
drop table emp_test1;
drop procedure que4;
--question 5)	5.	Write a Procedure to add a department row in the DEPT table with the following values for columns
delimiter $$
create procedure que5()
begin
Insert into dept(dno,dname,area) values(60,'Education','Pune');
select * from dept;
end $$
call que5();
--question 6)	6.	Write a program that declares an integer variable called num, assigns a value to it and print, the value of the variable itself, its square, and its cube.
delimiter $$
create procedure que6(in num int)
begin
declare value,square,cubes int;
set value=num;
set square=num*num;
set cubes=num*num*num;
select value,square,cubes;
end $$
call que6(2);
--question 7)	7.	Write a program that declares an integer variable assign a value to it and display it using OUT parameter.
delimiter $$
create procedure que7(out num int)
begin
declare value1 int default 5;
set num=value1;
end $$
call que7(@print);
drop procedure que7;
select @print;
--question 8)	8.	Write a program that demonstrates the usage of IN and OUT parameters
delimiter $$
create procedure que8(inout num int)
begin
set num=num*num;
end $$
set @print=2;
call que8(@print);
drop procedure que8;
select @print;





	





