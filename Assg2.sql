create table Publisher(pubid int(3) primary key,pname varchar(30),emailid varchar(50) unique,phone varchar(20));
desc publisher;
create table subject(subid varchar(20) primary key,sname varchar(30));
drop table subject;
desc subject;
create table Authors(auid int(5) primary key,Aname varchar(30),email varchar(50) unique,phone varchar(30));
desc Authors;
create table Titles(titleid int(5) primary key,title varchar(30),pudate DATE,prize int,pubid int(3),subid varchar(5),cover char(1) check (cover in ('P','H','p','h')),
constraint pubid_fk foreign key (pubid) references publisher (pubid), CONSTRAINT subid_fk FOREIGN KEY (subid) REFERENCES subject(subid));
create table titleauthors(TITLEID int(5),AUID int(5),IMPORTANCE int(2));
insert into subject values('pee','jee');
insert into subject values('jee','oracle');
insert into subject values('jpp','java');
insert into subject values('java','.net');
insert into subject values('sql','gambler');
select sname from subject where sname='oracle';
select sname from subject where sname='.net';
select sname from subject where sname like '%er';
desc Publisher;
insert into Publisher values(1,'prafulla','email1','9561365485');
insert into Publisher values(2,'hii','email2','9561365154');
insert into Publisher values(3,'pranit','email3','95613654578');
select pname from Publisher where pname='hii';
drop table Publisher;
desc Titles;
drop table Titles;
insert into Titles values(101,'title1','2020-04-03',200);
insert into Titles values(102,'title1','2020-04-02',400);
insert into Titles values(103,'title1','2020-10-12',600);
insert into Titles values(104,'title1','2020-10-12',800);
insert into Titles values(105,'title1','2020-10-12',1000);
select title from Titles where prize<500;
select * from subject where subid='java' or subid='jee';
insert into Authors values(101,'aname1','email1','1242545875');
insert into Authors values(102,'aname2','email2','12425485875');
insert into Authors values(103,'aname3','email3','1242485875');
insert into Authors values(104,'aname4','email4','1244545875');
insert into Authors values(105,'aname5','email5','1225545875');
select Aname from Authors where auid>103;






