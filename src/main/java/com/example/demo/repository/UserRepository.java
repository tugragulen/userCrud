package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public class UserRepository {
    private final Map<Long, User> userMap;

    public UserRepository() {
        this.userMap = new HashMap<>();
    }

    public User save(User user) {
        userMap.put(user.getId(), user);
        return user;
    }

    public List<User> findAll() {
        return userMap.values().stream().toList();
    }

    public Optional<User> findByName(String name) {
        return findAll()
                .stream()
                .filter(user -> user.getName().equals(name))
                .findFirst();
    }

    public void delete(long id) {
        userMap.remove(id);
    }

    public boolean isExist(long id) {
        return userMap.containsKey(id);
    }
}
