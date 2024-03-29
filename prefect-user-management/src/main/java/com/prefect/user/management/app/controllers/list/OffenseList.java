package com.prefect.user.management.app.controllers.list;

import java.time.LocalDate;
import java.util.Date;

public class OffenseList {

    private String studentId;
    private int violationId;
    private LocalDate offenseDate;
    private String action;

    public OffenseList(String studentId, int violationId, LocalDate offenseDate, String action) {
        this.studentId = studentId;
        this.violationId = violationId;
        this.offenseDate = offenseDate;
        this.action = action;
    }

    public String getStudentId() {
        return studentId;
    }

    public int getViolationId() {
        return violationId;
    }

    public LocalDate getOffenseDate() {
        return offenseDate;
    }

    public String getAction() {
        return action;
    }
}
