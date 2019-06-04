package com.tkalin.DAO;

import com.tkalin.entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
@Qualifier("fake")
public class FakeStudentDAOImpl implements StudentDAO {

    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>(){
            {
                put(1, new Student(1, "Said", "Computer science"));
                put(2, new Student(2, "Alex", "Finance"));
                put(3, new Student(3, "Anna", "Maths"));
            }
        };
    }

    @Override
    public Collection<Student> getAllStudents() {
        return this.students.values();
    }

    @Override
    public Student getStudentByID(int id) {
        return this.students.get(id);
    }

    @Override
    public void deleteUserById(int id) {
        this.students.remove(id);
    }

    @Override
    public void updateStudent(Student student) {
        Student s = students.get(student.getId());
        s.setCourse(student.getCourse());
        s.setName(student.getName());
        students.put(student.getId(), student);
    }

    @Override
    public void addStudent(Student student) {
        this.students.put(student.getId(), student);

    }
}
