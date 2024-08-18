package dev.vmn.h2_demo.repository;

import dev.vmn.h2_demo.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}
