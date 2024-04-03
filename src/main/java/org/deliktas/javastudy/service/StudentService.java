package org.deliktas.javastudy.service;


import org.deliktas.javastudy.models.Student;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public interface StudentService {

    List<Student> getAllStudents();

    Student saveAStudent(@RequestBody Student student);

    Student getAStudentById(String id);

    Student getAStudentByName(String name);
}
