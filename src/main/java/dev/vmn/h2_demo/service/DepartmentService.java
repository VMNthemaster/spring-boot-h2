package dev.vmn.h2_demo.service;

import dev.vmn.h2_demo.model.Department;
import dev.vmn.h2_demo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<Department> getDepartment(int departmentId){
        return departmentRepository.findById(departmentId);
    }

    public ResponseEntity<String> addDepartmentDetails(Department departmentDetails){
        Optional<Department> department = getDepartment(departmentDetails.getDepartmentId());

        if (department.isEmpty()){
            return ResponseEntity.ok("Department not found");
        }

        System.out.println(department.get().getDepartmentName());

        department.get().setTeachers(departmentDetails.getTeachers());
        department.get().setStudents(departmentDetails.getStudents());

        departmentRepository.save(department.get());

        return ResponseEntity.ok("Added department details");
    }
}
