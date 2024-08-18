package dev.vmn.h2_demo.controller;

import dev.vmn.h2_demo.model.Student;
import dev.vmn.h2_demo.model.Teacher;
import dev.vmn.h2_demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/addStudent")
    public ResponseEntity<String> addStudent (@RequestBody Student student){
        studentRepository.save(student);
        return ResponseEntity.ok("Student controller Data saved");
    }
}
