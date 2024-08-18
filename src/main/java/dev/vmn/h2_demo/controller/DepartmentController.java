package dev.vmn.h2_demo.controller;

import dev.vmn.h2_demo.model.Department;
import dev.vmn.h2_demo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentRepository departmentRepository;

    @PostMapping("/addDepartment")
    public ResponseEntity<String> addDepartment (@RequestBody Department department){
        departmentRepository.save(department);
        return ResponseEntity.ok("Department controller Data saved");
    }
}
