package com.ttn_spring.restfulwebserives.User;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDate;

@Schema(description = "User entity storing ID, name, birth date and password (excluded from JSON)")
public class User {

    @Schema(description = "Unique identifier for the user")
    private Integer id;
    @Schema(description = "Name of the user")
    private String name;
    @Schema(description = "Birth date of the user")
    private LocalDate birthDate;
    @JsonIgnore
    @Schema(description = "User password (ignored in output)")
    private String password;

    // ✅ ✅ ADD THIS
    public User() {
    }

    public User(Integer id, String name, LocalDate birthDate, String password) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.password = password;
    }

    // Getters and Setters...

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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
    }
}
