package com.ttn_spring.restfulwebserives.User;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {
    // Simulated in-memory user list
    private static List<User> users = new ArrayList<>();

    private static int usersCount = 0;

    // Static block to initialize dummy users
    static {
        users.add(new User(++usersCount, "Adam", LocalDate.now().minusYears(30), "adam123"));
        users.add(new User(++usersCount, "Eve", LocalDate.now().minusYears(25), "eve123"));
        users.add(new User(++usersCount, "Jim", LocalDate.now().minusYears(20), "jim123"));
    }

    // Get all users
    public List<User> findAll() {
        return users;
    }

    // Save a new user
    public User save(User user) {
        if (user.getId() == null) {
            user.setId(++usersCount);
        }
        users.add(user);
        return user;
    }

    // Find user by ID
    public User findOne(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    // Delete user by ID
    public void deleteById(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        users.removeIf(predicate);
    }
}
