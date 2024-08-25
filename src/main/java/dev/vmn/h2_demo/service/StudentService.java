package dev.vmn.h2_demo.service;

import dev.vmn.h2_demo.model.Student;
import dev.vmn.h2_demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudents(){
        System.out.println("student");

        return studentRepository.findAll();
    }

    public Optional<Student> getStudent(int studentId){
        return studentRepository.findById(studentId);
    }

    public ResponseEntity<String> addStudent (Student student){
        studentRepository.save(student);
        return ResponseEntity.ok("Student controller Data saved");
    }

}
