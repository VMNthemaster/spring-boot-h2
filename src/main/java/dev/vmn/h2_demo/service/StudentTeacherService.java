package dev.vmn.h2_demo.service;

import dev.vmn.h2_demo.model.Student;
import dev.vmn.h2_demo.model.Teacher;
import dev.vmn.h2_demo.repository.StudentRepository;
import dev.vmn.h2_demo.repository.TeacherRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentTeacherService {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private TeacherRepository teacherRepository;

    @Transactional
    public ResponseEntity<String> assignStudentsToTeacher(int teacherId, List<Integer> studentIds){
        Optional<Teacher> teacher = teacherRepository.findById(teacherId);
        List<Student> students = new ArrayList<>();

        if (teacher.isEmpty()){
            return ResponseEntity.ok("Teacher not found");
        }

        for (int studentId: studentIds){
            Optional<Student> student = studentRepository.findById(studentId);
            if (student.isEmpty()){
                return ResponseEntity.ok("Student with id " + studentId + " not found");
            }
            else{
                students.add(student.get());

            }
        }

        for (Student student : students) {
            student.addTeacher(teacher.get());
            teacher.get().addStudent(student);
        }

        studentRepository.saveAll(students);
        teacherRepository.save(teacher.get());

        return ResponseEntity.ok("Students assigned to teacher successfully");
    }

}
