package dev.vmn.h2_demo.model;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;

@Entity
@Transactional
@Table(name = "Teacher")
public class Teacher {
    @Id
    @Column(name = "teacher_id")
    private Integer teacher_id;

    private String name;
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_teacher_id")
    private Teacher_Department teacher_Department;

    public Teacher(Integer teacher_id, String name, String email) {
        this.teacher_id = teacher_id;
        this.name = name;
        this.email = email;
    }

    public Teacher(){}

    public Integer getTeacher_id() {
        return teacher_id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Teacher_Department getTeacher_Department() {
        return teacher_Department;
    }

    public void setTeacher_id(Integer teacher_id) {
        this.teacher_id = teacher_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTeacher_Department(Teacher_Department teacher_Department) {
        this.teacher_Department = teacher_Department;
    }
}
