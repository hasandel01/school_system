package org.deliktas.javastudy.controller;


import org.deliktas.javastudy.models.Student;
import org.deliktas.javastudy.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping("/students")
    private List<Student> getStudents( ) {
        return studentService.getAllStudents();
    }

    @PostMapping("/add-student")
    private Student saveStudent(@RequestBody Student student) {
        return studentService.saveAStudent(student);
    }


    @GetMapping("/students/{student-id}")
    private Student getStudentById(@PathVariable("student-id") String id) {
        return studentService.getAStudentById(id);
    }

    @GetMapping("/students/{student-name}")
    private Student getStudentByName(@PathVariable("student-name") String name) {
        return studentService.getAStudentByName(name);
    }

}
