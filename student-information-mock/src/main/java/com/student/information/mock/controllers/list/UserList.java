package com.student.information.mock.controllers.list;

import java.util.Date;

public class UserList {
    private int userid;

    private String username;

    private String entityId;

    private Date dateCreated;

    private Date dateModified;

    private String action;

    public UserList(int userid, String username, String entityId, Date dateCreated, Date dateModified, String action) {
        this.userid = userid;
        this.username = username;
        this.entityId = entityId;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.action = action;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
