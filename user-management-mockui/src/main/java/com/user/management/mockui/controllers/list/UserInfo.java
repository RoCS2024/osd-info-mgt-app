package com.user.management.mockui.controllers.list;

public class UserInfo {
    private String name;
    private String username;
    private String role;
    private String email;
    private String userid;

    public UserInfo(String name, String username, String role, String userid) {
        this.name = name;
        this.username = username;
        this.role = role;

        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }

    public String getUserid() {
        return userid;
    }
}
