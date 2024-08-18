create table Department (
    department_id int,
    department_name varchar(255),
    primary key (department_id)
);

create table Teacher (
    teacher_id int,
    name varchar(255),
    email varchar(255),
    primary key (teacher_id)
);

create table Teacher_Department (
    teacher_id int,
    department_id int,
    primary key (teacher_id)
);

create table Student (
    student_id int,
    student_name varchar(255),
    email varchar(255),
    primary key (student_id)
);

create table Student_Department (
    student_id int,
    department_id int,
    primary key (student_id)
);