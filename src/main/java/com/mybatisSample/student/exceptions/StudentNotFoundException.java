package com.mybatisSample.student.exceptions;

public class StudentNotFoundException extends RuntimeException {

    public StudentNotFoundException(int id) {
        super(String.format("Student not found for id: %s", id));
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
