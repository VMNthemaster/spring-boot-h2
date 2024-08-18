package dev.vmn.h2_demo.model;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;

@Entity
@Transactional
@Table(name = "Department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "department_id")
    Integer department_id;

    String department_name;

    public Department(){

    }

    public Department(Integer department_id, String department_name) {
        this.department_id = department_id;
        this.department_name = department_name;
    }
}
