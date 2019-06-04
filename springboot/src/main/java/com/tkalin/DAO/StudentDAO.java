package com.tkalin.DAO;

import com.tkalin.entity.Student;

import java.util.Collection;

public interface StudentDAO {
    Collection<Student> getAllStudents();

    Student getStudentByID(int id);

    void deleteUserById(int id);

    void updateStudent(Student student);

    void addStudent(Student student);
}
