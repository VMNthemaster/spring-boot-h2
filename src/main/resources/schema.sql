create table Department (
    department_id int,
    department_name varchar(255),
    primary key (department_id)
);

create table Teacher (
    teacher_id int,
    name varchar(255),
    department_id int,
    primary key (teacher_id),
    foreign key (department_id) references Department (department_id)
);

create table Teacher_Department (

);

create table Student (
    student_id int,
    student_name varchar(255),
    department_id int,
    primary key (student_id),
    foreign key (department_id) references Department (department_id)
);

create table Student_Teacher (
    student_id int,
    teacher_id int,
    primary key (student_id, teacher_id),
    foreign key (student_id) references Student (student_id),
    foreign key (teacher_id) references Teacher (teacher_id)
);