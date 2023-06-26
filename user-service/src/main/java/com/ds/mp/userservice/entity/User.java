package com.ds.mp.userservice.entity;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    private String username;

    public User() {
    }

    public User(String username) {
        this.username = username;
    }

    public Long getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "[\n\tuserID: " + this.userId +
                "\n\t" +
                "username: " + this.username +
                "\n]";
    }
}
