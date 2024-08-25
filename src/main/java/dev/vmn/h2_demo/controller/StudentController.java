package dev.vmn.h2_demo.controller;

import dev.vmn.h2_demo.model.Student;
import dev.vmn.h2_demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/getStudents")
    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    @GetMapping ("/getStudent/{studentId}")
    public ResponseEntity getStudent(@PathVariable int studentId){
        return ResponseEntity.ok(studentRepository.findById(studentId));

    }

    @PostMapping("/addStudent")
    public ResponseEntity<String> addStudent (@RequestBody Student student){
        studentRepository.save(student);
        return ResponseEntity.ok("Student controller Data saved");
    }
}
