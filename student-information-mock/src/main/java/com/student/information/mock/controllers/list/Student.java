package com.student.information.mock.controllers.list;

public class Student {
    private String studentId;
    private String name;
    private String action;

    public Student(String studentId, String name, String action) {
        this.studentId = studentId;
        this.name = name;
        this.action = action;
    }


    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getAction() {
        return action;
    }
}
