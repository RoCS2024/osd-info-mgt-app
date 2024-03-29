package com.prefect.user.management.app.controllers.list;

import java.time.LocalDate;
import java.util.Date;

public class HistoryList {
    private String studentId;

    private LocalDate dateRendered;

    private int hoursRendered;

    public HistoryList(String studentId, LocalDate dateRendered, int hoursRendered) {
        this.studentId = studentId;
        this.dateRendered = dateRendered;
        this.hoursRendered = hoursRendered;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public LocalDate getDateRendered() {
        return dateRendered;
    }

    public void setDateRendered(LocalDate dateRendered) {
        this.dateRendered = dateRendered;
    }

    public int getHoursRendered() {
        return hoursRendered;
    }

    public void setHoursRendered(int hoursRendered) {
        this.hoursRendered = hoursRendered;
    }
}
