package com.mybatisSample.student.dao;

import com.mybatisSample.student.mapper.StudentMapper;
import com.mybatisSample.student.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentDao {

    @Autowired
    StudentMapper studentMapper;

    public Student getStudent(int id) {
        return studentMapper.getStudent(id);
    }

    public Student insert(int id, String name) {
        Student student = Student.with(id, name);
        return student;
    }

    public Student insert(Student student) {
        return this.insert(student.getId(), student.getName());
    }
}
