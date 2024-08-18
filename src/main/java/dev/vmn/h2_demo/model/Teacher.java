package dev.vmn.h2_demo.model;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;

@Entity
@Transactional
@Table(name = "Teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "teacher_id")
    Integer teacher_id;

    String name;
    Integer department_id;

    public Teacher(Integer teacher_id, String name, Integer department_id) {
        this.department_id = department_id;
        this.name = name;
        this.teacher_id = teacher_id;
    }

    public Teacher(){}
}
