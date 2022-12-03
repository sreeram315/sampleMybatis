package com.mybatisSample.student.dao;

import com.mybatisSample.student.exceptions.StudentNotFoundException;
import com.mybatisSample.student.mapper.StudentMapper;
import com.mybatisSample.student.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class StudentDao {

    @Autowired
    StudentMapper studentMapper;

    public Optional<Student> getStudent(int id) {
        Student student = studentMapper.getStudent(id);
        return Optional.ofNullable(student);
    }

    public Student insert(int id, String name) {
        studentMapper.insertStudent(id, name);
        Optional<Student> student = this.getStudent(id);
        if(student.isEmpty()) {
            throw new StudentNotFoundException(id);
        }
        return student.get();
    }

    public void insert(Student student) {
        this.insert(student.getId(), student.getName());
    }

    public void delete(int id) {
        studentMapper.deleteStudent(id);
    }
}
