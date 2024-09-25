package com.example.demo.user;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public void save(User user) {
        userRepository.save(user);
    }
    public void delete(User user) {
        userRepository.delete(user);
    }
    public User findById(Long id) {
      return userRepository.findById(id).orElse(null);
    }
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
    public void update(User user) {
        userRepository.save(user);
    }
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
