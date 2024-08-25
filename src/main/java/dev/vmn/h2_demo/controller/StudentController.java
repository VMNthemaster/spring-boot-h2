package dev.vmn.h2_demo.controller;

import dev.vmn.h2_demo.model.Student;
import dev.vmn.h2_demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/getStudents")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }


    @GetMapping("/getStudent/{studentId}")
    public ResponseEntity<Student> getStudentById(@PathVariable int studentId){
        Optional<Student> student = studentService.getStudent(studentId);
        System.out.println("student" + student);

        // means if student is present, return student or else return not found
//        return student.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());

        if (student.isPresent()) {
            return ResponseEntity.ok(student.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @PostMapping("/addStudent")
    public ResponseEntity<String> addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

}
