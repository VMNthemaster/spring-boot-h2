package dev.vmn.h2_demo.repository;

import dev.vmn.h2_demo.model.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department, Integer> {
}
