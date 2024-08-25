package dev.vmn.h2_demo.controller;

import dev.vmn.h2_demo.model.Department;
import dev.vmn.h2_demo.repository.DepartmentRepository;
import dev.vmn.h2_demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/getDepartments")
    public List<Department> getAllDepartments(){
        return departmentService.getDepartments();
    }

    @PostMapping("/addDepartment")
    public ResponseEntity<String> addDepartment(@RequestBody Department department){
        return departmentService.addDepartment(department);
    }
}
