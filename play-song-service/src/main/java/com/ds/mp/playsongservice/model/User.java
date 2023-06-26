package com.ds.mp.playsongservice.model;


public class User {
    private Long userId;
    private String userName;

    public User() {
    }

    public User(String userName) {
        this.userName = userName;
    }

    public Long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "[\tUser ID: " + this.userId +
                "\n\t" +
                "User NAME: " + this.userName +
                "\n]";
    }
}
