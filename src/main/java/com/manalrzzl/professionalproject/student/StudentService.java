package com.manalrzzl.professionalproject.student;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class StudentService {

  private final StudentRepository studentRepository;

  public List<Student> getAllStudents() {
    return studentRepository.findAll();
  }

  public void addStudent(Student student) {
    // check if email is taken
    studentRepository.save(student);
  }
}
