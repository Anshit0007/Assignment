package com.example.demo.Service;

import com.example.demo.Entity.Author;
import com.example.demo.Repository.AuthorRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class AuthorService {
    private final AuthorRepository authorRepo;

    public AuthorService(AuthorRepository authorRepo) {
        this.authorRepo = authorRepo;
    }

    @Transactional
    public Author saveAuthor(Author author) {
        return authorRepo.save(author);
    }

    public Optional<Author> getAuthor(Long id) {
        return authorRepo.findById(id);
    }
}