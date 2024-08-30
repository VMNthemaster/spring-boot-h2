package dev.vmn.h2_demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;

import java.util.List;

@Entity
@Transactional
@Table(name = "Student")
public class Student {
    @Id
    @Column(name = "studentId")
    private Integer studentId;

    private String studentName;

    private String email;

    @ManyToOne
    @JoinColumn(name = "departmentId")
    @JsonBackReference
    private Department department;

//    @ManyToMany(mappedBy = "students", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @ManyToMany
    @JoinTable(
            name = "student_teacher",
            joinColumns = @JoinColumn(name = "studentId"),
            inverseJoinColumns = @JoinColumn(name = "teacherId")
    )
    private List<Teacher> teachers;


    public Student(){}

    public Student(Integer studentId, String name, String email) {
        this.studentId = studentId;
        this.studentName = name;
        this.email = email;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return studentName;
    }

    public void setName(String name) {
        this.studentName = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

    public void removeTeacher(Teacher teacher) {
        this.teachers.remove(teacher);
    }
}
