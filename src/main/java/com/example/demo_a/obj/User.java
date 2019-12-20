package com.example.demo_a.obj;

public class User {
    private Long id;
    private String name;
    private String age;
    private String address;
    private String school;

    public User(Long id, String name, String age, String address, String school) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.school = school;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
