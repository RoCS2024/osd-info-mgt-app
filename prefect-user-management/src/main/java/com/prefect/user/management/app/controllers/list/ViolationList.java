package com.prefect.user.management.app.controllers.list;

public class ViolationList {
    private int violationId;
    private String violationName;
    private String violationType;
    private int csHours;

    public ViolationList(int violationId, String violationName, String violationType, int csHours) {
        this.violationId = violationId;
        this.violationName = violationName;
        this.violationType = violationType;
        this.csHours = csHours;
    }

    public int getViolationId() {
        return violationId;
    }

    public void setViolationId(int violationId) {
        this.violationId = violationId;
    }

    public String getViolationName() {
        return violationName;
    }

    public void setViolationName(String violationName) {
        this.violationName = violationName;
    }

    public String getViolationType() {
        return violationType;
    }

    public void setViolationType(String violationType) {
        this.violationType = violationType;
    }

    public int getCsHours() {
        return csHours;
    }

    public void setCsHours(int csHours) {
        this.csHours = csHours;
    }
}
