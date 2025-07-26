package com.ttn_spring.restfulwebserives.Controller;

import com.ttn_spring.restfulwebserives.Entity.Employee;
import com.ttn_spring.restfulwebserives.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeServiceController {

    @Autowired
    private EmployeeService employeeService;


    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }
    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        return employeeService.updateEmployee(id, employee);
    }
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployeeById(id);
        return "Employee with ID " + id + " has been deleted.";
    }
    @GetMapping("/count")
    public long getEmployeeCount() {
        return employeeService.getEmployeeCount();
    }

    @GetMapping("/page")
    public Page<Employee> getEmployeesByAge(
            @RequestParam int page,
            @RequestParam int size
    ) {
        return employeeService.getEmployeesByAge(page, size);
    }

    @GetMapping("/search")
    public List<Employee> getEmployeesByName(@RequestParam String name) {
        return employeeService.getEmployeesByName(name);
    }

    @GetMapping("/startWithA")
    public List<Employee> getEmployeesStartingWithA() {
        return employeeService.getEmployeesStartingWithA();
    }

    @GetMapping("/ageBetween")
    public List<Employee> getEmployeesBetweenAges(
            @RequestParam int start,
            @RequestParam int end
    ) {
        return employeeService.getEmployeesBetweenAges(start, end);
    }
}
