package com.ttn_spring.restfulwebserives.Entity;


import jakarta.persistence.*;


@Entity
@Table(name = "employee_db")
public class Employee {

    @Id
    private Long id;
    private String name;
    private int age;
    private String location;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }
}