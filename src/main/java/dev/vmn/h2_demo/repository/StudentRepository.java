package dev.vmn.h2_demo.repository;

import dev.vmn.h2_demo.model.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Integer> {
    List<Student> findAll();
    Student findByStudent_Id(int studentId);
}
