package com.ttn_spring.restfulwebserives.Question6;


import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hateoas")
public class PersonHateoasController {

    private final PersonDaoService service;

    public PersonHateoasController(PersonDaoService service) {
        this.service = service;
    }

    @GetMapping("/persons/{id}")
    public EntityModel<Person> getPersonById(@PathVariable int id) {
        Person person = service.findOne(id);
        if (person == null) {
            throw new RuntimeException("Person not found with id " + id);
        }

        EntityModel<Person> model = EntityModel.of(person);

        WebMvcLinkBuilder linkToAllPersons =
                WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).getAllPersons());

        model.add(linkToAllPersons.withRel("all-persons"));

        return model;
    }

    @GetMapping("/persons")
    public List<Person> getAllPersons() {
        return service.findAll();
    }
}