package com.example.demo.controller;

import com.example.demo.user.User;

import java.util.List;

public class UserResponse {

    private String app;

    private List<User> userList;

    public UserResponse(final String app, final List<User> userList) {
        this.app = app;
        this.userList = userList;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "UserResponse{" +
                "app='" + app + '\'' +
                ", userList=" + userList +
                '}';
    }
}
