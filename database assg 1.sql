create table Member(memberid int primary key,membar_name varchar(30),member_address varchar(50),Acc_open_date Date,membership_type varchar(20),penalty_Ammount int);
insert into Member values(101,'prafulla','ar-varose post-lodhivali tal-khalapur dist-raigad','2020-12-01','Lifetime',3000);
insert into Member values(102,'pranit','ar-varose post-lodhivali tal-khalapur dist-raigad','2020-12-02','Annual',4000);
insert into Member values(103,'prabhanshu','ar-varose post-lodhivali tal-khalapur dist-raigad','2020-12-03','Half yearly',5000);
insert into Member values(104,'pranav','ar-varose post-lodhivali tal-khalapur dist-raigad','2020-12-03','Quaterly',5000);
select * from Member;
create table Books1(book_no int,book_name varchar(30),Author_name varchar(30),cost int,category char(10));
insert into Books1 values(1005,'xyz1','xyz2',240,'science');
insert into Books1 values(1006,'xyz3','xyz4',300,'Fiction');
select * from Books1;
create table issue(Lab_Issue_id int,Book_no int,Memberid int,issue_date Date,return_data Date);
insert into issue values(123,5,101,'2020-30-02','2020-30-03');
insert into issue values(124);
insert into issue values(125);
insert into issue values(126);
select * from issue;
create table Member2(member_id int,membe_name varchar(50),member_address varchar(30),Acc_open_date Date,membership_type varchar(30));
insert into Member2 values(101,'richa sharma','pune','10-12-05','lifetime');
insert into Member2 values(109,'garima sen','pune',curdate(),'Annual');
drop table Member2;
select * from Member2;
select curdate();
select member_id,membe_name,member_address,date_format(Acc_open_date,'%d-%b-%Y') as Acc_open_date,membership_type from Member2;
create table Books2(Book_No int(6), Book_Name VarChar(30), Author_name Varchar(30), Cost int(7), Category Char(10));
Insert into Books2 values(101, 'Let us C', 'Denis Ritchie', 450, 'System');
Insert into Books2 values(102, 'Oracle – Complete Ref', ' Loni', 550, 'Database');
Insert into Books2 values(103, 'Mastering SQL', 'Loni', 250, 'Database');
Insert into Books2 values(104, 'PL SQL-Ref', 'ScottUrman', 450, 'Database');
select * from Books2;
update Books2 set Cost = 300 where Book_No = 103;
create table issue1(Lab_issue_id int,Book_no int,Member_id int,issue_date Date,return_date Date);
desc issue1;
insert into issue1 values(7001,101,1,'10-12-06',null);
insert into issue1 values(7002,102,2,'25-12-06',null);
insert into issue1 values(7003,104,1,'15-01-06',null);
insert into issue1 values(7004,101,1,'04-07-06',null);
insert into issue1 values(7005,104,2,'15-11-06',null);
insert into issue1 values(7006,101,3,'18-02-06',null);
select * from issue1;
select date_format(issue_date,'%d-%b-%y') as issue_date from issue1;
select * from issue1;
select Lab_issue_id,Book_no,Member_id,date_format(issue_date,'%d-%b-%y') as issue_date,return_date from issue1;





