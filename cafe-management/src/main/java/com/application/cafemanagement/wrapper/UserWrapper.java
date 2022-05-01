package com.application.cafemanagement.wrapper;

import com.application.cafemanagement.model.User;

import javax.persistence.Column;

public class UserWrapper {

    private Integer id;

    private String name;

    private String contactNumber;

    private String email;

    private String status;

    public UserWrapper() {
    }

    public UserWrapper(Integer id, String name, String contactNumber, String email, String status) {
        this.id = id;
        this.name = name;
        this.contactNumber = contactNumber;
        this.email = email;
        this.status = status;
    }

    public UserWrapper(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.contactNumber = user.getContactNumber();
        this.email = user.getEmail();
        this.status = user.getStatus();
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
