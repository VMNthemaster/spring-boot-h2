package dev.vmn.h2_demo.model;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;

import java.util.List;

@Entity
@Transactional
@Table(name = "Department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "department_id")
    private Integer department_id;

    private String department_name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_student_id", referencedColumnName = "department_id")
    private List<Student> students;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_teacher_id", referencedColumnName = "department_id")
    private List<Teacher> teachers;

    public Department(){}

    public Department(Integer department_id, String department_name) {
        this.department_id = department_id;
        this.department_name = department_name;
    }

    public Integer getDepartment_id() {
        return department_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setDepartment_id(Integer department_id) {
        this.department_id = department_id;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
}
