package dev.vmn.h2_demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;

import java.util.List;

@Entity
@Transactional
@Table(name = "Teacher")
public class Teacher {
    @Id
    @Column(name = "teacherId")
    private Integer teacherId;

    private String name;
    private String email;

    @ManyToOne
    @JoinColumn(name = "departmentId")
    @JsonBackReference
    private Department department;

//    @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
//    @JoinTable(
//            name = "student_teacher",
//            joinColumns = @JoinColumn(name = "teacherId"),
//            inverseJoinColumns = @JoinColumn(name = "studentId")
//    )
    @ManyToMany(mappedBy = "teachers")
    List<Student> students;

    public Teacher(Integer teacherId, String name, String email) {
        this.teacherId = teacherId;
        this.name = name;
        this.email = email;
    }

    public Teacher(){}

    public Integer getTeacherId() {
        return teacherId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public void setName(String name) {
        this.name = name;
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

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void removeStudent(Student student) {
        this.students.remove(student);
    }
}
