package com.manalrzzl.professionalproject.student;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

  @GetMapping
  public List<Student> getAllStudents() {
    List<Student> students = Arrays.asList(
        new Student(1L, "Manal", "manal@spring.com", Gender.FEMALE),
        new Student(2L, "Mohammed", "mohammed@spring.com", Gender.MALE)
    );
    return students;
  }
}

