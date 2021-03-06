create database ptest ; 
use ptest ; 
drop table buyer;
create table buyer ( idbuyer int, name text not null, familyname text not null, username text not null, password text not null, primary key (idbuyer)) ; 
insert into buyer values ( 01,'Thomas', 'Poulain', 'thomaspln@gmail.com', 'password') ; 
insert into buyer values ( 02,'Capucine', 'Plantecoste', 'capuplt@outlook.fr', 'thisismypassword'); 
insert into buyer values ( 03,'Emmanuel', 'Macron', 'manu@europe.com', 'president') ; 
insert into buyer values ( 04,'Franck', 'Poulain', 'franckpln@gmail.com', 'microsoft123') ; 
insert into buyer values ( 05,'Laurence', 'Godnair', 'laurencegdr@lol.fr', 'melann!') ; 
insert into buyer values ( 06,'Killian', 'Poulain', 'killianpln@ri.fr', '123456') ; 
insert into buyer values ( 07,'Jean-Pierre', 'Segado', 'jpsegado@ece.fr', 'info') ;
insert into buyer values ( 08,'Inès', 'Lambert', 'ineslambert@live.fr', 'lilalila') ;
insert into buyer values ( 09,'Annick', 'Fontaine', 'annick.fontaine@ri.fr', 'bretagne') ;   
insert into buyer values ( 10,'Michel', 'Ferrand', 'michelferrand@orange.fr', 'bretagne') ;

select * from buyer ;

drop table employee;
create table employee (idemployee int, name text not null, familyname text not null, username text not null, password text not null, primary key (idemployee)) ; 
insert into employee values ( 1001,'Pauline', 'Durand', 'paulinedrd@gmail.com', '12345') ; 
insert into employee values ( 1002,'Cathleen', 'West', 'cathwest@live.fr', 'heyhey'); 
insert into employee values ( 1003,'John', 'Dalton', 'joedltn@lucky.luke', 'ineedapassword') ; 
insert into employee values ( 1004,'Marie', 'Lebourg', 'marielbg@lpc.fr', 'secret') ; 
insert into employee values ( 1005,'Therese', 'Marcoux', 'thmarcoux@gmail.com', 'changeme') ; 
insert into employee values ( 1006,'Joe', 'Biden', 'joebdn@usa.usa', 'usapresident') ; 
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
insert into seller values ( 10001,'Apolline', 'Cherrey', 'apocherrey@ece.fr', 'lili123') ; 
insert into seller values ( 10002,'Lilian', 'Biscarrat', 'lilibisc@live.com', 'thais'); 
insert into seller values ( 10003,'Henri', 'Petrelli', 'henriptl@gmail.fr', 'corsica') ; 
insert into seller values ( 10004,'Thierry', 'Cancelier', 'thierryplt@titi.fr', 'trouville') ; 
insert into seller values ( 10005,'Delphine', 'Fontaine', 'delphineplt@dedel.com', 'jetmonchat') ; 
insert into seller values ( 10006,'Cassandre', 'Ferrand', 'cassandreplt@cass.fr', '123456') ; 
insert into seller values ( 10007,'Thomas', 'Dieu', 'thomasdieu@gmail.com', 'design') ;
insert into seller values ( 10008,'Franck', 'Sinatra', 'francks@orange.com', 'music') ;
insert into seller values ( 10009,'Catherine', 'Daklia', 'cathda@ece.fr', 'yes') ;
insert into seller values ( 10010,'Zoe', 'Ceverin', 'zozo@ceverin@ece.fr', 'zozozo') ;   

select * from seller ;

drop table offer;
create table offer(idoffer int, idbuyer int, idproperty int, price double, accepted bool, declined bool, foreign key(idproperty) references Property(id), foreign key (idbuyer) references Buyer(idbuyer),primary key(idoffer));
insert into offer values (01, 01, 01, 150000, false, false);
insert into offer values (02, 02, 02, 900000, false, false);
insert into offer values (03, 03, 03, 1200000, false, false);
insert into offer values (04, 04, 04, 200000, false, false);
insert into offer values (05, 05, 05, 5500000, false, false);
insert into offer values (06, 06, 06, 800000, false, false);
insert into offer values (07, 07, 07, 230000, false, false);
insert into offer values (08, 08, 08, 900000, false, false);
insert into offer values (09, 09, 09, 1200000, false, false);
insert into offer values (10, 10, 10, 230000, false, false);
insert into offer values (11, 01, 11, 5500000, false, false);
insert into offer values (12, 02, 12, 850000, false, false);
insert into offer values (13, 03, 01, 155000, false, false);
insert into offer values (14, 04, 02, 950000, false, false);
insert into offer values (15, 05, 03, 1250000, false, false);

select * from offer;

drop table visit;
create table visit(idvisit int, schedule datetime , idemployee int, idbuyer int, idproperty int, duration int,  foreign key (idproperty) references Property(id), foreign key (idemployee) references Employee(idemployee), foreign key (idbuyer) references Buyer(idbuyer), primary key (idvisit));
insert into  visit values (01, '2020-12-30 10:00:00', 1001, 01, 01,30);
insert into  visit values (02, '2020-12-30 11:00:00', 1002, null, 02,30);
insert into  visit values (03, '2021-01-02 12:00:00', 1003, 03, 03,30);
insert into  visit values (04, '2021-01-03 13:00:00', 1004, null, 04,30);
insert into  visit values (05, '2021-01-04 14:00:00', 1005, 05, 05,30);
insert into  visit values (06, '2021-01-05 15:00:00', 1006, null, 06,30);
insert into  visit values (07, '2021-01-06 16:00:00', 1001, 07, 07,30);
insert into  visit values (08, '2021-01-07 17:00:00', 1002, null, 08,30);
insert into  visit values (09, '2020-12-20 18:00:00', 1003, 09, 09,30);
insert into  visit values (10, '2020-12-21 10:00:00', 1004, null, 10,30);
insert into  visit values (11, '2020-12-22 11:00:00', 1005, 01, 11,30);
insert into  visit values (12, '2020-12-23 12:00:00', 1006, null, 12,30);
insert into  visit values (13, '2020-12-26 13:00:00', 1001, 03, 01,30);
insert into  visit values (14, '2020-12-27 14:00:00', 1002, null, 02,30);
insert into  visit values (15, '2020-12-28 15:00:00', 1003, 05, 03,30);

select * from visit;
