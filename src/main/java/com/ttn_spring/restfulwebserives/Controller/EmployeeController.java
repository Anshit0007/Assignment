package com.ttn_spring.restfulwebserives.Controller;

import com.ttn_spring.restfulwebserives.Entity.employee.Employee;
import com.ttn_spring.restfulwebserives.Service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @PostMapping
    public Employee save(@RequestBody Employee emp) {
        return service.save(emp);
    }

    @GetMapping
    public List<Employee> getAll() {
        return service.findAll();
    }

    @GetMapping("/above-average")
    public List<Object[]> getAboveAverage() {
        return service.findAboveAverageOrdered();
    }

    @PutMapping("/update-below-avg")
    public String updateBelowAverage(@RequestParam Double newSalary) {
        int count = service.updateSalary(newSalary);
        return count + " employee(s) updated";
    }

    @DeleteMapping("/delete-min-salary")
    public String deleteMinSalary() {
        int count = service.deleteMinSalaryEmployees();
        return count + " employee(s) deleted";
    }

    @GetMapping("/lastname-ends-with")
    public List<Object[]> lastNameSingh() {
        return service.findLastNameSingh();
    }

    @DeleteMapping("/delete-by-age")
    public String deleteAge(@RequestParam int age) {
        int count = service.deleteByAge(age);
        return count + " employee(s) deleted";
    }
}
