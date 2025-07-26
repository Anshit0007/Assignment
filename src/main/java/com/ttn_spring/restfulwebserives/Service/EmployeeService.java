package com.ttn_spring.restfulwebserives.Service;


import com.ttn_spring.restfulwebserives.Entity.Employee;
import com.ttn_spring.restfulwebserives.Repository.EmployeeRepository;
import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;


import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Long id, Employee updatedEmployee) {
        Employee employee = employeeRepository.findById(id).get();
        employee.setName(updatedEmployee.getName());
        employee.setAge(updatedEmployee.getAge());
        employee.setLocation(updatedEmployee.getLocation());
        return employeeRepository.save(employee);

    }

    public Employee getEmployeeById(Long id) {
        Employee employee = employeeRepository.findById(id).get();
        return employee;
    }
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
    public void deleteEmployeeById(Long id) {
        if (employeeRepository.existsById(id)) {
            employeeRepository.deleteById(id);
        }

    }

    public long getEmployeeCount() {
        return employeeRepository.count();
    }

    public Page<Employee> getEmployeesByAge(int page, int size) {
        Pageable pageable = PageRequest.of(page, size, Sort.by("age"));
        return employeeRepository.findAll(pageable);
    }

    public List<Employee> getEmployeesByName(String name) {
        return employeeRepository.findByName(name);
    }

    public List<Employee> getEmployeesStartingWithA() {
        return employeeRepository.findByNameStartingWith("A");
    }

    public List<Employee> getEmployeesBetweenAges(int startAge, int endAge) {
        return employeeRepository.findByAgeBetween(startAge, endAge);
    }


}