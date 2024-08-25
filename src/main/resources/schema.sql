create table Department (
    departmentId int,
    departmentName varchar(255),
    primary key (departmentId)
);

create table Teacher (
    teacherId int,
    name varchar(255),
    email varchar(255),
    departmentId int,
    primary key (teacherId),
    foreign key (departmentId) references Department (departmentId)
);

create table Student (
    studentId int,
    studentName varchar(255),
    email varchar(255),
    departmentId int,
    primary key (studentId),
    foreign key (departmentId) references Department (departmentId)
);
