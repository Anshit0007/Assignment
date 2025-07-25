package com.ttn_spring.restfulwebserives.Question6;



import java.time.LocalDate;

public class Person {
    private Integer id;
    private String name;
    private LocalDate dob;

    public Person() {}

    public Person(Integer id, String name, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
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

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", dob=" + dob + "]";
    }
}
