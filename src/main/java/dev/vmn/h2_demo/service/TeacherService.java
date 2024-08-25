package dev.vmn.h2_demo.service;

import dev.vmn.h2_demo.model.Teacher;
import dev.vmn.h2_demo.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    public ResponseEntity<String> addTeacher (Teacher teacher){
        teacherRepository.save(teacher);
        return ResponseEntity.ok("Teacher controller Data saved");
    }

    public List<Teacher> getTeachers(){
        return teacherRepository.findAll();
    }

    public Optional<Teacher> getTeacher(int teacherId){
        return teacherRepository.findById(teacherId);
    }
}
