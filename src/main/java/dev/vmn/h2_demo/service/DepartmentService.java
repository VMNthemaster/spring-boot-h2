package dev.vmn.h2_demo.service;

import dev.vmn.h2_demo.model.Department;
import dev.vmn.h2_demo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public ResponseEntity<String> addDepartment (Department department){
        departmentRepository.save(department);
        return ResponseEntity.ok("Department controller Data saved");
    }

    public List<Department> getDepartments(){
        return departmentRepository.findAll();
    }
}
