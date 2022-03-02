package com.godrej.repository;

import com.godrej.model.User;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User,Integer> {
    List<User> findByEmail(String email);
}
