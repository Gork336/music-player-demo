package com.example.demo.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/all")
    public List<User> getAll() {
        return userService.findAll();
    }

    @PostMapping("/user/addUser")
    public String addUser(@RequestParam String username, @RequestParam String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        try {
            userService.save(user);
            return "success";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @GetMapping("/user/deleteUser")
    public String deleteUser(@RequestParam String username) {
        try {
            User user = userService.findByUsername(username);
            userService.delete(user);
            return "success";
        } catch (Exception e) {
            return e.getMessage();
        }

    }

}
