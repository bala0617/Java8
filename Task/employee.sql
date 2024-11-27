create table Employee(
Name varchar(20),
Age int,
EmpID int,
Role varchar(30),
salary int
);




insert into Employee values('sathana',22,1948,'Software Engineer',15000);
insert into Employee values('karishma',24,1949,'Software Enginner',15000);
insert into Employee values('niranjana',23,1950,'Software Engineer',15000);
insert into Employee values('arulprakash',23,1951,'Software Enginner',15000);
insert into Employee values('vasim Akram',23,1952,'Software Engineer',15000);
insert into Employee values('mahesh kumar',24,1953,'Software Enginner',15000);
insert into Employee values('thaarun',22,1954,'Software Engineer',15000);
insert into Employee values('joseph',27,1955,'Software Enginner',15000);
insert into Employee values('aswin',24,1956,'Software Engineer',15000);
insert into Employee values('balaji',21,1961,'Software Enginner',15000);
insert into Employee values('mukesh',24,1962,'Software Engineer',15000);

select * from Employee;

DELETE FROM Employee WHERE Name = 'balaji';