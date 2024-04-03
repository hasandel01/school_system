package org.deliktas.javastudy.service_impl;


import org.deliktas.javastudy.models.Student;
import org.deliktas.javastudy.repository.StudentRepository;
import org.deliktas.javastudy.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;


    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
            return studentRepository.findAll();
    }

    @Override
    public Student saveAStudent(@RequestBody Student student) {
            return studentRepository.save(student);
    }

    @Override
    public Student getAStudentById(String id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public Student getAStudentByName(String name) {
        return studentRepository.findAllByStudentName(name);
    }

}
