package com.godrej.controller;

import com.godrej.repository.UserRepository;
import com.godrej.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "*")

public class UserController {
    @Autowired
    private UserRepository repository;

    @PostMapping("/register")

    public String register(@RequestBody User user)throws Exception {
       // GetMapping ("/registeruser")
       //  public User registerUser (RequestBody User user) throws Exception
//         String tempEmailId = user.getEmail();
//         if (tempEmailId != null && !"".equals (tempEmailId))
//        {
//        User userobj = (User) repository. fetchUserBymail(tempEmailId);
//         if(userobj != null) {
//        throw new Exception ("user with "+tempEmailId+" is already exist");
//    }}
        repository.save(user);
        return "Hi " + user.getUsername() + " your Registration process successfully completed";
    }

    @GetMapping("/getAllUsers")
    public List<User> findAllUsers() {
        return repository.findAll();
    }

    @GetMapping("/findUser/{email}")
    public List<User> findUser(@PathVariable String email) {
        return repository.findByEmail(email);
    }

    @DeleteMapping("/cancel/{id}")
    public List<User> cancelRegistration(@PathVariable int id) {
        repository.deleteById(id);
        return repository.findAll();
    }
}

