package com.lanysec.mongodb.po;

import org.springframework.data.annotation.Id;

public class Person{

    @Id
    private String id;
    private String firstname;
    private String lastname;
    private String address;

    public String getAddress() {
        return address;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getId() {
        return id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
