package com.ttn_spring.restfulwebserives.User;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.xml.bind.annotation.XmlRootElement;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@XmlRootElement
@Tag(name = "User Management", description = "APIs for managing users")
public class UserResource {

    private final UserDaoService service;

    public UserResource(UserDaoService service) {
        this.service = service;
    }
    @Operation(summary = "Create a new user (static endpoint)", description = "Save user using static JSON input")
    @PostMapping("/users-static")
    public User createUserStatic(@RequestBody User user) {
        return service.save(user); // password will be ignored in JSON response
    }


    @Operation(summary = "Retrieve all users", description = "Fetch all users from the system")
    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return service.findAll();
    }

    @Operation(summary = "Retrieve user by ID", description = "Provide an ID to fetch a specific user")
    @GetMapping("/{id}")
    public User retrieveUser(@PathVariable int id) {
        return service.findOne(id);
    }

    @Operation(summary = "Delete a user", description = "Deletes a user by their ID")
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id) {
        service.deleteById(id);
    }

    @Operation(summary = "Create a new user (JSON)", description = "Save user using JSON payload")
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User savedUser = service.save(user);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }

    @Operation(summary = "Create a new user (XML)", description = "Save user using XML payload")
    @PostMapping(value = "/xml", consumes = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<String> createUserWithXml(@RequestBody User user) {
        service.save(user);
        return ResponseEntity.ok("User created: " + user.getName() + " (DOB: " + user.getBirthDate() + ")");
    }
}
