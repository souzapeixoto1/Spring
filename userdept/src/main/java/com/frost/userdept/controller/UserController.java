package com.frost.userdept.controller;

import com.frost.userdept.entitie.User;
import com.frost.userdept.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @PostMapping
    public User insert (@RequestBody User user){
        User result = repository.save(user);
        return result;
    }

    @GetMapping
    public List<User> findAll(){
       List<User> result = repository.findAll();
       return result;
    }

    @GetMapping("{id}")
    public Optional<User> findId(@PathVariable(required = true)long id){
        return repository.findById(id);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteUser(@PathVariable Long id){
        repository.deleteById(id);
    }

}
