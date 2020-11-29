create database ptest ; 
use ptest ; 
drop table buyer;
create table buyer ( idbuyer int, name text not null, familyname text not null, username text not null, password text not null, primary key (idbuyer)) ; 
insert into buyer values ( 01,'Thomas', 'Poulain', 'thomaspln', 'password') ; 
insert into buyer values ( 02,'Capucine', 'Plantecoste', 'capuplt', 'thisismypassword'); 
insert into buyer values ( 03,'Emmanuel', 'Macron', 'manu', 'president') ; 
insert into buyer values ( 04,'Franck', 'Poulain', 'franckpln', 'microsoft123') ; 
insert into buyer values ( 05,'Laurence', 'Godnair', 'laurencegdr', 'melann!') ; 
insert into buyer values ( 06,'Killian', 'Poulain', 'killianpln', '123456') ; 
delete from buyer where idbuyer='7';
select * from buyer ;

drop table employee;
create table employee (idemployee int, name text not null, familyname text not null, username text not null, password text not null, primary key (idemployee)) ; 
insert into employee values ( 1001,'Pauline', 'Durand', 'paulinedrd', '12345') ; 
insert into employee values ( 1002,'Cathleen', 'West', 'cathwest', 'heyhey'); 
insert into employee values ( 1003,'John', 'Dalton', 'joedltn', 'ineedapassword') ; 
insert into employee values ( 1004,'Marie', 'Lebourg', 'marielbg', 'secret') ; 
insert into employee values ( 1005,'Therese', 'Marcoux', 'thmarcoux', 'changeme') ; 
insert into employee values ( 1006,'Joe', 'Biden', 'joebdn', 'usapresident') ; 
select * from employee ;



drop table property;
create table property (id int not null, type text, description text, price double not null, location text not null, numberrooms int not null, numberbedrooms int not null, timevisited int not null, numberfloors int not null, surface double not null, gardensurface double, swimmingpool bool, elevator bool, floornumber int, parking bool, idseller int, sold boolean, foreign key(idseller) references Seller(idseller), primary key (id));
insert into property values (01, 'House', 'House in Paris with a small garden', 170000, 'Paris', 4, 2, 3 , 2 , 120, 40, false,null,null,null,10002,false);
insert into property values( 02, 'House', ' House near the sea in Baden',1000000, 'Baden', 8, 5, 10, 3, 1000, 200, false,null,null,null,10001,false);
insert into property values (03, 'House', 'Big House with swimming pool in Nice',1300000, 'Nice', 6, 3, 5, 3, 1200, 500, true,null,null,null,10003,false);
insert into property values (04, 'House', ' Tiny house in Trouville',230000, 'Trouville', 5, 3, 7, 5, 40, 5, false,null,null,null,10004,false);
insert into property values (05, 'House', 'Large house in Saint-Tropez',6000000, 'Saint-Tropez', 6, 4, 35, 2, 500, 200, true,null,null,null,10005, false);
insert into property values (06, 'House', 'Big house in a quiet place in Le Pecq',900000, 'Le Pecq', 6, 3, 17, 3, 1000, 700, false,null,null,null,10006, false);
insert into property values (07, 'Apartment', 'Small appartment in Paris ',245000, 'Paris', 3, 2, 3, 1, 50,null,null, false, 3, false,10002, false) ; 
insert into property values (08, 'Apartment', 'Beautiful apartment in Nantes',1000000, 'Nantes', 5, 3, 10, 1, 75, null,null,true, 2, false,10006, false); 
insert into property values (09, 'Apartment', 'Big apartment in Lyon',1300000, 'Lyon', 6, 3, 32, 2, 95,null,null, true, 3, true,10001, false) ; 
insert into property values (10, 'Apartment','Small appartment near the sea',250000, 'Marseille', 3, 2, 7, 1, 35, null,null,false, 1, false,10003, false) ; 
insert into property values (11, 'Apartment', 'Very large apartment in Bordeaux',6000000, 'Bordeaux', 6, 4, 5, 2, 120, null,null, true, 5, true,10005, false) ; 
insert into property values (12, 'Apartment','Nice apartment in Lille',900000, 'Lille', 4, 2, 17, 1, 102,null,null, true, 4, false,10004, false) ; 


select * from property;

drop table seller;
create table seller ( idseller int,name text, familyname text, username text, password text, primary key (idseller)) ; 
insert into seller values ( 10001,'Apolline', 'Cherrey', 'apocherrey', 'lili123') ; 
insert into seller values ( 10002,'Lilian', 'Biscarrat', 'lilibisc', 'thais'); 
insert into seller values ( 10003,'Henri', 'Petrelli', 'henriptl', 'corsica') ; 
insert into seller values ( 10004,'Thierry', 'Cancelier', 'thierryplt', 'trouville') ; 
insert into seller values ( 10005,'Delphine', 'Fontaine', 'delphineplt', 'jetmonchat') ; 
insert into seller values ( 10006,'Cassandre', 'Ferrand', 'cassandreplt', '123456') ; 

select * from seller ;

drop table offer;
create table offer(idoffer int, idbuyer int, idproperty int, price double, accepted bool, declined bool, foreign key(idproperty) references Property(id), foreign key (idbuyer) references Buyer(idbuyer),primary key(idoffer));
insert into offer values (01, 01, 01, 150000, false, false);
insert into offer values(02, 02, 01, 140000, false, false);
select * from offer;
drop table visit;
create table visit(idvisit int, schedule datetime , idemployee int, idbuyer int, idproperty int, duration int,  foreign key (idproperty) references Property(id), foreign key (idemployee) references Employee(idemployee), foreign key (idbuyer) references Buyer(idbuyer), primary key (idvisit));
insert into visit values(01, '2000-01-01 18:00:00', 1001, 01, 01, 30);
insert into visit values (02, '2000-01-02 19:00:00', 1001, null, 01,30);
delete from visit where idvisit='6';
select * from visit;
