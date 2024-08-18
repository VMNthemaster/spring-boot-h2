package dev.vmn.h2_demo.repository;

import dev.vmn.h2_demo.model.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface TeacherRepository extends CrudRepository<Teacher, Integer> {
}
