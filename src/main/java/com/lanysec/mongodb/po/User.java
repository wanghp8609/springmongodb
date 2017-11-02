package com.lanysec.mongodb.po;

public class User {
    private String id;
    private String name;
    private int age;
    private String address;

    public User(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User:[name=" + this.name + ",age=" + this.age + ",address=" + this.address + "]";
    }
}
