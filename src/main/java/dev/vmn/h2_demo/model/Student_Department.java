package dev.vmn.h2_demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;

@Entity
@Transactional
@Table(name = "Student_Department")
public class Student_Department {
    @Id
    @Column(name = "student_id")
    Integer student_id;

    Integer department_id;

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public Integer getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Integer department_id) {
        this.department_id = department_id;
    }

    public Student_Department(Integer student_id, Integer department_id) {
        this.student_id = student_id;
        this.department_id = department_id;
    }

    public Student_Department(){}
}
