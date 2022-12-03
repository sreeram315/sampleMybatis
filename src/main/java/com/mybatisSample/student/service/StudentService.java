package com.mybatisSample.student.service;

import com.mybatisSample.student.dao.StudentDao;
import com.mybatisSample.student.exceptions.StudentNotFoundException;
import com.mybatisSample.student.models.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class StudentService {
    private final Logger LOG = LoggerFactory.getLogger(StudentService.class);

    @Autowired
    StudentDao studentDao;

    @GetMapping("/student/get")
    Student getStudent(Integer id) {
        LOG.info("Get student with id: {}", id);
        Optional<Student> student = studentDao.getStudent(id);
        if(student.isEmpty()) {
            throw new StudentNotFoundException(id);
        }
        return student.get();
    }

    @GetMapping("/student/add")
    Student addStudent(int id, String name) {
        LOG.info("inserting student : {}, {}", id, name);
        return studentDao.insert(id, name);
    }

}
