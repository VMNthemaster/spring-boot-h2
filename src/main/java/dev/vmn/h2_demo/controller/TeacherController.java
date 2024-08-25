package dev.vmn.h2_demo.controller;

import dev.vmn.h2_demo.model.Teacher;
import dev.vmn.h2_demo.repository.TeacherRepository;
import dev.vmn.h2_demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @GetMapping("/getTeachers")
    public List<Teacher> getAllTeachers(){
        return teacherService.getTeachers();
    }

    @GetMapping("/getTeacher/{teacherId}")
    public ResponseEntity<Teacher> getTeacherById(@PathVariable int teacherId){
        Optional<Teacher> teacher = teacherService.getTeacher(teacherId);

        return teacher.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/addTeacher")
    public ResponseEntity<String> addTeacher(@RequestBody Teacher teacher){
        return teacherService.addTeacher(teacher);
    }

}
