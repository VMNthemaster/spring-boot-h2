package dev.vmn.h2_demo.model;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;

@Entity
@Transactional
@Table(name = "Teacher_Department")
public class Teacher_Department {
    @Id
    @Column(name = "teacher_id")
    Integer teacher_id;

    Integer department_id;

    public Integer getTeacher_id() {
        return teacher_id;
    }

    public Integer getDepartment_id() {
        return department_id;
    }

    public void setTeacher_id(Integer teacher_id) {
        this.teacher_id = teacher_id;
    }

    public void setDepartment_id(Integer department_id) {
        this.department_id = department_id;
    }

    public Teacher_Department(Integer teacher_id, Integer department_id) {
        this.teacher_id = teacher_id;
        this.department_id = department_id;
    }

    public Teacher_Department () {}
}
