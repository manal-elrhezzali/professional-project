package com.manalrzzl.professionalproject.student;

import com.manalrzzl.professionalproject.student.exception.BadRequestException;
import com.manalrzzl.professionalproject.student.exception.NotFoundException;
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
    //TODO:check if email is taken
    if (studentRepository.selectExistsEmail(student.getEmail())) {
      throw new BadRequestException("Email already taken");
    }
    studentRepository.save(student);
  }

  public void deleteStudent(Long id) {
    if(!studentRepository.existsById(id)) {
      throw new NotFoundException("Student not found");
    }
    studentRepository.deleteById(id);
  }
}
