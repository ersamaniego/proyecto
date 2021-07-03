package com.example.usuarios.controllers;

import com.example.usuarios.model.User;
import com.example.usuarios.repositories.UserRepository;
import com.example.usuarios.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> index(){
        Iterable<User> usersIterable = userService.getUsers();
        List<User> userList = new ArrayList<>();
        usersIterable.forEach(a -> userList.add(a));
        return userList;
    }

    @GetMapping(value = "/id/{value}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<User> getById(@PathVariable("value") long id) {
        Optional<User> user = userService.getUserById(id);
        return user;
    }
}
