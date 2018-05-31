package com.vermeg.dependencymanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vermeg.dependencymanagement.entity.User;
import com.vermeg.dependencymanagement.repository.UserRepository;

@RestController
@RequestMapping(value = "/api", consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE})
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/user/{id}",consumes = {MediaType.ALL_VALUE})
    public User getUser(@PathVariable Long id) {
        SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return userRepository.findById(id).get();
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();

    }

    @DeleteMapping("/user/{id}")
    public boolean deleteUser(@PathVariable long id) {
        userRepository.deleteById((long) id);

        return true;
    }


    @PostMapping("/user")
    public User createUser(@RequestBody User user) {

        return userRepository.save(user);

    }

    @PutMapping("/user")
    public User updateUser(@RequestBody User user) {
        return userRepository.save(user);

    }


}
