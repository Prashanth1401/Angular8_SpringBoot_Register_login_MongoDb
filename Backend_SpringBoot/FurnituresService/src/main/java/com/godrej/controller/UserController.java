package com.godrej.controller;

import com.godrej.repository.UserRepository;
import com.godrej.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v2")
public class UserController {
    @Autowired
    private UserRepository repository;

    @PostMapping("/register")
    public String register(@RequestBody User user)
    {
        repository.save(user);
        return "Hi your Furniture Detail's successfully uploaded";
    }

    @GetMapping("/getAllUsers")
    public List<User> findAllUsers() {
        return repository.findAll();
    }

    @GetMapping("/findUser/{email}")
    public List<User> findUser(@PathVariable String email) {
        return repository.findByEmail(email);
    }


}
