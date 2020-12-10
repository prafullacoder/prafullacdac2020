create table EMP1(emp_no int,emp_name char);
create table EMP2(emp_no int,emp_name char);
insert into EMP1 values(1,'A'),(2,'B');
insert into EMP1 values(3,'c');
select * from EMP1;
drop table EMP2;
insert into EMP2 values(1,'A'),(2,'B'),(4,'D'),(5,'E');
select * from EMP2;
create table employee1 as select * from employee;
select * from employee1;
create table department1 as select * from department;
select * from department1;
update department1 set dept_name='max' where dept_id=2;
desc department1;
desc employee1;
select * from department1;
select * from employee1;
alter table department1 add primary key (dept_id); 
alter table employee1 add constraint fk foreign key (dept_id) references department1(dept_id);

select dept_name, emp_name from employee1, department1 where employee1.dept_id = department1.dept_id;
select * from employee1,department1 where employee1.dept_id = department1.dept_id;
select dept_id,sum(salary) from employee1 group by dept_id;
select dept_name,emp_name from employee1 left outer join department1 on employee1.dept_id = department1.dept_id;
select dept_name,emp_name from employee1 right outer join department1 on  employee1.dept_id = department1.dept_id;
select emp_name,manager from employee1;
select emp_name,dept_name from employee1,department1 where employee1.dept_id = department1.dept_id;

select * from employee1 where salary=(select salary from employee1 where emp_name = 'arun');
select * from employee1 where dept_id=(select dept_id from employee1 where emp_name='jack'); 
select * from employee1 where salary=(select min(salary) from employee1);
update employee1 set salary=15000 where dept_id=(select dept_id from department1 where dept_name='max');
select * from employee1;
desc employee1;









