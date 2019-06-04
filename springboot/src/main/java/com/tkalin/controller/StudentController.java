package com.tkalin.controller;

import com.tkalin.entity.Student;
import com.tkalin.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudents() {
        return this.studentService.getAllStudents();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Student getStudentByID(@PathVariable("id") int id) {
        return this.studentService.getStudentByID(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteStudentById(@PathVariable("id") int id) {
        this.studentService.deleteStudentById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateStudent(@RequestBody Student student) {
        this.studentService.updateStudent(student);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addStudent(@RequestBody Student student) {
        this.studentService.addStudent(student);
    }

}
