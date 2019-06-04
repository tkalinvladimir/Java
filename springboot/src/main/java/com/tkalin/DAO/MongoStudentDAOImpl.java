package com.tkalin.DAO;

import com.tkalin.entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
@Qualifier("mongo")
public class MongoStudentDAOImpl implements StudentDAO {

    //Connection mongoConnection blabla

    @Override
    public Collection<Student> getAllStudents() {
        return null;
    }

    @Override
    public Student getStudentByID(int id) {
        return null;
    }

    @Override
    public void deleteUserById(int id) {

    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void addStudent(Student student) {

    }
}
