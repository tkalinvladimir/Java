package com.tkalin.service;

import com.tkalin.DAO.FakeStudentDAOImpl;
import com.tkalin.DAO.StudentDAO;
import com.tkalin.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    @Qualifier("fake")
    private StudentDAO studentDAO;

    public Collection<Student> getAllStudents() {
        return this.studentDAO.getAllStudents();
    }

    public Student getStudentByID(int id) {
        return this.studentDAO.getStudentByID(id);
    }

    public void deleteStudentById(int id) {
        this.studentDAO.deleteUserById(id);
    }

    public void updateStudent(Student student) {
        this.studentDAO.updateStudent(student);
    }

    public void addStudent(Student student) {
        this.studentDAO.addStudent(student);
    }
}
