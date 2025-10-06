package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        System.out.println("Tüm kullanıcılar listeleniyor");
        return userRepository.findAll();
    }

    public Optional<User> findByName(String name) {
        System.out.println(name + " adındaki kullanıcı çağrılıyor");
        return userRepository.findByName(name);
    }

    public User save(User user) {
        if (userRepository.isExist(user.getId())) {
            System.out.println("Kullanıcı güncelleniyor " + user);
        } else {
            System.out.println("Kullanıcı kaydediliyor " + user);
        }
        return userRepository.save(user);
    }

    public void delete(long id) {
        System.out.println(id + " id li kullanıcı siliniyor");
        userRepository.delete(id);
    }
}
