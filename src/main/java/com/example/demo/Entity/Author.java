package com.example.demo.Entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Embedded
    private Address address;

    @ElementCollection
    private List<String> subjects;

    @OneToOne(cascade = CascadeType.ALL)
    private Book bookOneToOne;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Book> booksUnidirectional;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<Book> booksBidirectional;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Book> booksManyToMany;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public Book getBookOneToOne() {
        return bookOneToOne;
    }

    public void setBookOneToOne(Book bookOneToOne) {
        this.bookOneToOne = bookOneToOne;
    }

    public List<Book> getBooksUnidirectional() {
        return booksUnidirectional;
    }

    public void setBooksUnidirectional(List<Book> booksUnidirectional) {
        this.booksUnidirectional = booksUnidirectional;
    }

    public List<Book> getBooksManyToMany() {
        return booksManyToMany;
    }

    public void setBooksManyToMany(List<Book> booksManyToMany) {
        this.booksManyToMany = booksManyToMany;
    }

    public List<Book> getBooksBidirectional() {
        return booksBidirectional;
    }

    public void setBooksBidirectional(List<Book> booksBidirectional) {
        this.booksBidirectional = booksBidirectional;
    }
}