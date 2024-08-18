package dev.vmn.h2_demo.controller;

import dev.vmn.h2_demo.model.Teacher;
import dev.vmn.h2_demo.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {
    @Autowired
    private TeacherRepository teacherRepository;

    @PostMapping("/addTeacher")
    public ResponseEntity<String> addTeacher (@RequestBody Teacher teacher){
        teacherRepository.save(teacher);
        return ResponseEntity.ok("Teacher controller Data saved");
    }
}
