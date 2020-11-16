create database ptest ; 
use ptest ; 
create table buyer (id int, name text, familyname text, username text, password text, primary key (id)) ; 
insert into buyer values (01, 'Thomas', 'Poulain', 'thomaspln', 'password') ; 
insert into buyer values (02, 'Capucine', 'Plantecoste', 'capuplt', 'thisismypassword'); 
insert into buyer values (03, 'Emmanuel', 'Macron', 'manu', 'president') ; 
insert into buyer values (04, 'Franck', 'Poulain', 'franckpln', 'microsoft123') ; 
insert into buyer values (05, 'Laurence', 'Godnair', 'laurencegdr', 'melann!') ; 
insert into buyer values (06, 'Killian', 'Poulain', 'killianpln', '123456') ; 
select * from buyer ;

create table employee (id int, name text, familyname text, username text, password text, primary key (id)) ; 
insert into employee values (200, 'Pauline', 'Durand', 'paulinedrd', '12345') ; 
insert into employee values (201, 'Cathleen', 'West', 'cathwest', 'heyhey'); 
insert into employee values (202, 'John', 'Dalton', 'joedltn', 'ineedapassword') ; 
insert into employee values (203, 'Marie', 'Lebourg', 'marielbg', 'secret') ; 
insert into employee values (204, 'Therese', 'Marcoux', 'thmarcoux', 'changeme') ; 
insert into employee values (205, 'Joe', 'Biden', 'joebdn', 'usapresident') ; 
select * from employee ;

create table apartment (id int, price double, location text, numberrooms int, numberbedrooms int, timevisited int, numberfloors int, surface double, elevator bool, floornumber int, parking bool, primary key (id)) ; 
insert into apartment values (100, 245000, 'Paris 15', 3, 2, 3, 1, 50, false, 3, false) ; 
insert into apartment values (101, 1000000, 'Paris 1', 5, 3, 10, 1, 75, false, 2, false); 
insert into apartment values (102, 1300000, 'Paris 2', 6, 3, 32, 2, 95, true, 3, true) ; 
insert into apartment values (103, 250000, 'Paris 6', 3, 2, 7, 1, 35, false, 1, false) ; 
insert into apartment values (104, 6000000, 'Paris 3', 6, 4, 5, 2, 120, true, 5, true) ; 
insert into apartment values (105, 900000, 'Paris 4', 4, 2, 17, 1, 102, true, 4, false) ; 
select * from apartment ;

create table house (id int, price double, location text, numberrooms int, numberbedrooms int, timevisited int, numberfloors int, surface double, gardensurface double, swimmingpool bool, primary key (id)) ; 
insert into house values (01, 170000, 'Paris 12', 4, 2, 3, 2, 120, 40, false) ; 
insert into house values (02, 1000000, 'Baden', 8, 5, 10, 3, 1000, 200, false); 
insert into house values (03, 1300000, 'Nice', 6, 3, 5, 3, 1200, 500, true) ; 
insert into house values (04, 230000, 'Trouville', 5, 3, 7, 5, 40, 5, false) ; 
insert into house values (05, 6000000, 'Saint-Tropez', 6, 4, 35, 2, 500, 200, true) ; 
insert into house values (06, 900000, 'Le Pecq', 6, 3, 17, 3, 1000, 700, false) ; 
select * from house ;

create table seller (id int, name text, familyname text, username text, password text, primary key (id)) ; 
insert into seller values (100, 'Apolline', 'Cherrey', 'apocherrey', 'lili123') ; 
insert into seller values (101, 'Lilian', 'Biscarrat', 'lilibisc', 'thais'); 
insert into seller values (102, 'Henri', 'Petrelli', 'henriptl', 'corsica') ; 
insert into seller values (103, 'Thierry', 'Cancelier', 'thierryplt', 'trouville') ; 
insert into seller values (104, 'Delphine', 'Fontaine', 'delphineplt', 'jetmonchat') ; 
insert into seller values (105, 'Cassandre', 'Ferrand', 'cassandreplt', '123456') ; 
select * from seller ;