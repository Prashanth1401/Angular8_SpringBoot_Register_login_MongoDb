package com.godrej.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="RegistrationTable")
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String username;
    private String email;
    private String password;
    private long phonenumber;

}
