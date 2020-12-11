
--question 1)	Write function that accepts a positive number from a user and displays its factorial on the screen.
delimiter $$
create function assg(num int) returns int
begin
declare res int default 1;
factorial : loop
if(num = 0)
then
return res;
leave factorial;
end if;
set res=res * num;
set num=num - 1;
end loop;
end $$
select assg(5);
--////////////////////////////////////////////////////////////////
--question 2)2.	Write a function that accepts a positive number ‘n’ and displays whether that number is a Prime number or not.
delimiter $$
create function assg2(num int) returns varchar(20)
begin
declare count int default 2;
prafulla : loop
if(count > num)
then 
return "prime number";
leave prafulla;
elseif(num % count = 0 && num != count )
then
return "not prime";
leave prafulla;
else
set count=count + 1;
end if;
end loop;
end $$
select assg2(13);
drop function assg2;
--///////////////////////////////////////////////////////////////////
--NOT DONE
delimiter $$
create function assg3(num int) returns int
begin
declare yard int default 0;
declare foot int;
declare inch int;
declare rem1 int;
if((yard=num / 36) != 0)
then 
set yard=num;
set foot=0;
set inch=0;
end if;
return yard;
end $$
select assg3(12);
drop function assg3;
--//////////////////////////////////////////////////////////////////////
create table emp(epm_name varchar(30),salary int,dept_no int);
insert into emp values('prafulla',5000,1);
insert into emp values('pranit',10000,2);
insert into emp values('prabhanshu',20000,3);
insert into emp values('pranav',15000,4);
select * from emp;

	--question 4)4.	Write a function to update salary of the employees of specified dept by 10%. Take dept no as parameter.
delimiter $$
create function assg4(num int) returns varchar(30)
begin
update emp set salary=salary+(salary*0.10) where dept_no = num;
return "update sucessfuly";
end $$
select assg4(3);
select * from emp;
--//////////////////////////////////////////////////////////////////////
--question 5)5.	Create a function named USER_ANNUAL_COMP that has a parameter p_eno for passing on the values of  an employee number of the employee and p_comp for passing the compansation. In the function calculates and returns the annual compensation of the employee by using the following formula.
annual_compensation =  (p_sal+p_comm)*12
If the salary or commission value is NULL then zero should be substituted for it.  Give a call to USER_ANNUAL_COMP.

delimiter $$
create function USER_ANNUAL_COMP (p_eno int,p_coom int) returns int
begin
declare res int;
set res= (select salary from emp where dept_no=p_eno);
return (res + p_coom)*12;
end $$
select USER_ANNUAL_COMP(1,100);
--////////////////////////////////////////////////////////////////////////////////////
--question 6)	Create a procedure called USER_QUERY_EMP that accepts three parameters. Parameter p_myeno is of IN parameter mode which provides the empno value. The other two parameters p_myjob and p_mysal are of OUT mode. The procedure retrieves the salary and job of an employee with the provided employee number and assigns those to the two OUT parameters respectively. The procedure should raise the error if the empno does not exist in the EMP table by displaying an appropriate message
delimiter $$
create procedure USER_QUERY_EMP (in p_myeno int,out p_myjob varchar(20),out p_mysal int)
begin
set p_myjob= (select epm_name from emp where dept_no=p_myeno);
set p_mysal= (select salary from emp where dept_no=p_myeno);
end $$
drop procedure USER_QUERY_EMP;
call USER_QUERY_EMP(2,@job,@salary);
select @job,@salary;
--/////////////////////////////////////////////////////////////////////////////
--question 7)7.	Create a procedure to print the inputted string in reverse order. If  inputted string is null display an appropriate message
delimiter $$
create procedure pr (inout str varchar(30))
begin
set str=reverse(str);
end $$
set @str="prafulla";
call pr(@str);
select @str;
drop procedure pr;
--///////////////////////////////////////////////////////////////////////////////
--question 8)8.	Create a procedure named ‘tabledetails’ which gives all the details of a particular table stored in database.

delimiter $$
create procedure tabledetails()
begin
show tables;
select * from emp;
end$$
call tabledetails();
drop  procedure tabledetails;



 


 







