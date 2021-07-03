package com.example.usuarios.service;

import com.example.usuarios.model.User;
import com.example.usuarios.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepo;

    public Optional<User> getUserById(long id){
        return userRepo.findById(Long.valueOf(id));
    }

    public List<User> getUsers(){
        return (List<User>) userRepo.findAll();
    }

}
