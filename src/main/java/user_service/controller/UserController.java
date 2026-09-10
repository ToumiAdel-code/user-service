package user_service.controller;

import user_service.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import user_service.service.UserService;


import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public List<User> getUsers() {
        return service.getAllUsers();
    }
    // Create user - colleague modification
    @PostMapping
    public User createUser(@RequestBody User user) {
        return service.createUser(user);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return service.getUserById(id);
    }
}

