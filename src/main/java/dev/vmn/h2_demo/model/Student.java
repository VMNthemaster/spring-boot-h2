package dev.vmn.h2_demo.model;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;

@Entity
@Transactional
@Table(name = "Student")
public class Student {
    @Id
    @Column(name = "student_id")
    private Integer student_id;

    private String name;

    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_student_id")
    private Student_Department student_department;

    public Student(){}

    public Student(Integer student_id, String name, String email) {
        this.student_id = student_id;
        this.name = name;
        this.email = email;
    }

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Student_Department getStudent_department() {
        return student_department;
    }

    public void setStudent_department(Student_Department student_department) {
        this.student_department = student_department;
    }
}
