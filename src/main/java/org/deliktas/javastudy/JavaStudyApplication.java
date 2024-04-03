package org.deliktas.javastudy;

import org.deliktas.javastudy.models.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.Serializable;
import java.util.*;

@SpringBootApplication
public class JavaStudyApplication {

    public static void main(String[] args) {

        SpringApplication.run(JavaStudyApplication.class, args);

        compareStudents();

    }

    public static void compareStudents() {

        List<Student> studentList = new ArrayList<>();

        // Create some Student objects and add them to the list
        Student student1 = new Student("1", "John", "Computer Science", 120);
        Student student2 = new Student("2", "Alice", "Mathematics", 100);
        Student student3 = new Student("3", "Bob", "Physics", 110);

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        Collections.sort(studentList);

        // Print the list of students
        for (Student student : studentList) {
            System.out.println(student.getStudentName());
        }

    }

}
