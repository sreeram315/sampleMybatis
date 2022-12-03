package com.typehandler.utils;

import com.typehandler.student.dao.StudentDao;
import com.typehandler.student.models.Student;

import java.util.ArrayList;
import java.util.List;

public class PopulateData {
    public static void init(StudentDao studentDao) {
        List<Student> students = List.of(
                Student.with(1, "Dam"),
                Student.with(2, "Wie")
        );
        students.forEach(studentDao::insert);
    }
}
