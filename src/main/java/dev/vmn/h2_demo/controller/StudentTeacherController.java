package dev.vmn.h2_demo.controller;

import dev.vmn.h2_demo.service.StudentTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentTeacherController {
    @Autowired
    private StudentTeacherService studentTeacherService;

    @PostMapping("/teacher/{teacherId}/assignStudents")
    public ResponseEntity<String> assignStudentsToTeacher(@PathVariable int teacherId, @RequestBody List<Integer> studentIds){
        return studentTeacherService.assignStudentsToTeacher(teacherId, studentIds);
    }
}
