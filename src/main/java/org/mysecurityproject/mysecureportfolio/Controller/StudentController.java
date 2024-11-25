package org.mysecurityproject.mysecureportfolio.Controller;

import org.mysecurityproject.mysecureportfolio.Entity.Student;
import org.mysecurityproject.mysecureportfolio.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public Student save(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @GetMapping("/students")
     public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

}
