package com.monitor.model;

import java.io.Serializable;

/**
 * Created by biezhi on 2017/1/4.
 */
public class UserProfile implements Serializable {

    private String name;
    private String phone;
    private String email;

    public String getName() {
        return name;
    }

    public UserProfile setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public UserProfile setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserProfile setEmail(String email) {
        this.email = email;
        return this;
    }
}
