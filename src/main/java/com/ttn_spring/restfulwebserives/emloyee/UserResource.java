package com.ttn_spring.restfulwebserives.emloyee;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResource {
    private UserDaoService service;
    @Autowired
    public UserResource(UserDaoService service){
        this.service=service;
    }

    @GetMapping("/emp")
     public List<Employee> retrieveAllUsers(){
        return service.findAll();
     }

    @GetMapping("/emp/{id}")
    public Employee retrieveUser(@PathVariable int id){
        Employee emp=service.findOne(id);
        if(emp==null){
            throw new ResourceNotFound("i=exception occur "+id);
        }
        return service.findOne(id);
    }
    @PostMapping("/emp")
    public Employee createEmployee(@Valid @RequestBody Employee employee){
        return  service.save(employee);

    }

    @DeleteMapping("/emp/{id}")
    public void deleteUser(@PathVariable int id){
        service.deleteById(id);
    }

    @PutMapping("/emp/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee updatedEmp) {
        Employee emp = service.updateEmployee(id, updatedEmp);
        if (emp == null) {
            throw new RuntimeException("Employee not found with id: " + id);
        }
        return emp;
    }

}
