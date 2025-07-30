package com.example.demo.Controller;

import com.example.demo.Entity.Author;
import com.example.demo.Service.AuthorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/authors")
public class AuthorController {
    private final AuthorService service;

    public AuthorController(AuthorService service) {
        this.service = service;
    }

    @PostMapping
    public Author saveAuthor(@RequestBody Author author) {
        return service.saveAuthor(author);
    }

    @GetMapping("/{id}")
    public Author getAuthor(@PathVariable Long id) {
        return service.getAuthor(id).orElse(null);
    }
}