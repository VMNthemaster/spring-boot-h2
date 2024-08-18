package dev.vmn.h2_demo.model;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;

@Entity
@Transactional
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_id")
    Integer student_id;

    String name;
    Integer department_id;

    public Student(){}

    public Student(Integer student_id, String name, Integer department_id) {
        this.student_id = student_id;
        this.name = name;
        this.department_id = department_id;
    }
}
