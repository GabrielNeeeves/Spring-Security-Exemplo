package com.ganeves.SpringSecEx.controller;

import com.ganeves.SpringSecEx.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private List<Student> students = List.of(
            new Student(1, "Di Pierro", 9),
            new Student(2, "Romero", 8),
            new Student(3, "Darlene", 10)
    );

    @GetMapping("/students")
    public List<Student> get() {
        return students;
    }

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @PostMapping("/students")
    public Student post(@RequestBody Student student) {
        students.add(student);
        return student;
    }

}
