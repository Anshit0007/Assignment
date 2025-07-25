package com.ttn_spring.restfulwebserives.Question5;

import java.time.LocalDate;

public class UserV2 {
    private Integer id;
    private String name;
    private LocalDate birthDate;
    private String password;

    public UserV2() {}

    public UserV2(Integer id, String name, LocalDate birthDate, String password) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.password = password;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserV2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", password='" + password + '\'' +
                '}';
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getPassword() {
        return password;
    }
// Getters & Setters
}