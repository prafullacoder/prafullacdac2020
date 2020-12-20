
use assignment_6;


-- question 1
delimiter $$
create procedure disp_name_sal()
begin
declare finished int  default 0;
declare emp_name varchar(30);
declare emp_sal int ;

declare sa_cur cursor for select ename , sal from emp;
declare continue handler for not found set finished=1;

open sa_cur;
 getnasa : loop
 fetch sa_cur into emp_name,emp_sal;
  
 if finished=1 then
 leave getnasa;
 end if;
select ename,sal from emp where ename=emp_name;
 end loop;
 close sa_cur;
end$$

call disp_name_sal();
select * from emp;
drop procedure disp_name_sal;

-- question 2
delimiter $$
create procedure top_five ()
begin
declare eid int;
declare enm varchar(30);
declare esal int;
declare done int default 0;
declare rowcount int default 0;
declare cur cursor for select empno,ename, sal from emp order by sal desc limit 5; 
 declare continue handler for not found set rowcount=1;
open cur;
getsal: loop
fetch cur into eid,enm,esal;
if(rowcount=1)then
leave getsal;
end if;
select empno,ename,sal from emp where empno=eid; 
end loop;
end$$

call top_five();

--  by sal desc limit 5
-- if(rowcount=5)then
-- drop procedure top_five;

select * from emp;
-- alter table emp add column last_name varchar(30);

-- update emp set last_name='kale' where empno=1000;
-- update emp set last_name='lele' where empno=1001;
-- update emp set last_name='pile' where empno=1002;
-- update emp set last_name='hile' where empno=1003;
 -- update emp set last_name='tule' where empno=1004;
-- update emp set last_name='mule' where empno=1005;


-- question 3
delimiter $$
create procedure fname_lname()
begin
declare f_na varchar(30);
declare l_na varchar(30);
declare done int default 0;
-- declare no1 int default 0 ;
declare cur cursor for select ename,last_name from emp;
-- declare exit handler for not found select 'done with execution';
declare exit handler for not found set done=1; 
open cur;
repeat
fetch cur into f_na,l_na;
select ename,last_name from emp where ename=f_na and last_name=l_na;
-- select ename,last_name from emp ;
until done
end repeat;
end$$
select * from emp;
insert into emp (empno,ename,last_name)values(1007,"hjl","jkli");
call fname_lname();
-- drop procedure fname_lname;

select * from emp;

-- Question 4
delimiter $$
create procedure name_ma ()
begin
declare name1 varchar(200) default "";
declare done int default 0;
declare cur cursor for select ename from emp;
declare exit handler for not found set done=1;
open cur;
e:loop
 fetch cur into name1;
 if(done=1)then
 leave e;
 end if;
 if(name1="pooja")then
 select * from emp where ename=name1;
 leave e;
 end if;
end loop;
end$$
drop procedure name_ma;
call name_ma();



-- que 4
delimiter $$
create procedure emp_data ()
begin
declare name1 varchar(100);
declare done int default 0;
declare cur cursor for select ename from emp ;
declare continue handler for not found set done=1;
open cur;
st:loop
fetch cur into name1;
if(name1='Manoj')then
select * from emp where ename=name1;
leave st;
end if;

end loop;
end$$

drop procedure emp_data;

call emp_data();

-- Question 5

delimiter $$
create procedure salgreat1()
begin
declare eid int default 0;
declare sal1 int default 0;
declare done int default 0;
declare cur cursor for select empno,sal from emp where sal>3000;
declare continue handler for sqlexception select 'done with excution' as message;
declare exit handler for not found set done=1;
open cur;
repeat
fetch cur into eid,sal1;
delete from emp where empno=eid;
until done
end repeat;
end$$

call salgreat1();
drop procedure salgreat1;
select * from emp;

use data_base;
select * from emp;
desc emp;
insert into emp (empno,ename,sal,deptno) values(1008,"prtu",80000,40);
insert into emp (empno,ename,sal,deptno) values(1003,"vedu",90000,20);
