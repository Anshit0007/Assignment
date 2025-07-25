package com.ttn_spring.restfulwebserives.Question5;

import java.time.LocalDate;

public class UserV1 {
    private Integer id;
    private String name;
    private LocalDate birthDate;

    public UserV1() {}

    public UserV1(Integer id, String name, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    // Getters & Setters

    @Override
    public String toString() {
        return "UserV1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
}