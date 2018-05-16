package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students = new ArrayList<>();
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public University(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student getStudentWithAverageGrade(double grade) {
        //TODO:
        Student res = null;
        for (Student s:students) {
            if (s.getAverageGrade() == grade) {
                res = s;
            }
        }
        return res;
    }

    public Student getStudentWithMaxAverageGrade() {
        Student res = null;
        for (Student s:students) {
            if (res == null) {
                res = s;
                continue;
            }
            else {
                if (s.getAverageGrade() > res.getAverageGrade()) {
                    res = s;
                }
            }
        }
        return res;
    }

    public Student getStudentWithMinAverageGrade() {
        //TODO:
        Student res = null;
        for (Student s:students) {
            if (res == null) {
                res = s;
                continue;
            }
            else {
                if (s.getAverageGrade() < res.getAverageGrade()) {
                    res = s;
                }
            }
        }
        return res;
    }

    public void expel(Student student) {
        //TODO:
        students.remove(student);
    }

}