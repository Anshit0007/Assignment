package com.ttn_spring.restfulwebserives.Entity.employee;

import jakarta.persistence.*;

@Entity
@Table(name = "employeeTable")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "empId")
    private Long id;

    @Column(name = "empFirstName")
    private String firstName;

    @Column(name = "empLastName")
    private String lastName;

    @Column(name = "empSalary")
    private Double salary;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public SalaryDetails getSalaryDetails() {
        return salaryDetails;
    }

    public void setSalaryDetails(SalaryDetails salaryDetails) {
        this.salaryDetails = salaryDetails;
    }

    @Column(name = "empAge")
    private Integer age;

    @Embedded
    private SalaryDetails salaryDetails;


}
