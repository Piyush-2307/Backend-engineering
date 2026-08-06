package com.peeyu.demo.domain;

import com.peeyu.demo.enums.Gender;
import com.peeyu.demo.enums.Role;

public class User {
    private Long id;
    private String userName;
    private String email;
    private String firstName;
    private String lastName;
    private Role role;
    private Gender gender;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Gender getGender() {
        return gender;
    }

    public void  setGender(Gender gender) {
        this.gender = gender;
    }
}
