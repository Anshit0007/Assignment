package com.ttn_spring.restfulwebserives.Question6;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class PersonDaoService {

    private static List<Person> people = new ArrayList<>();
    private static int personCount = 0;

    static {
        people.add(new Person(++personCount, "Anshit", LocalDate.now().minusYears(22)));
        people.add(new Person(++personCount, "Meena", LocalDate.now().minusYears(25)));
        people.add(new Person(++personCount, "Ravi", LocalDate.now().minusYears(30)));
    }

    public List<Person> findAll() {
        return people;
    }

    public Person findOne(int id) {
        Predicate<? super Person> predicate = person -> person.getId().equals(id);
        return people.stream().filter(predicate).findFirst().orElse(null);
    }
}

