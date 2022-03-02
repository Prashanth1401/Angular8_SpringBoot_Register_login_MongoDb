package com.godrej.repository;

import com.godrej.model.User;
import org.aspectj.apache.bcel.classfile.Module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {
    List<User> findByEmail(String email);
   // List<User> fetchUserBymail(String email);
}
