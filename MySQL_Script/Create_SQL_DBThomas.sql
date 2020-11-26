create database DBThomas;
use DBThomas;
create table student (studentid int, studentname varchar (10), primary key ( studentid));
insert into student values (101, "Killian");
insert into student values (102, "Thomas");
Select * from student; 
drop table student;