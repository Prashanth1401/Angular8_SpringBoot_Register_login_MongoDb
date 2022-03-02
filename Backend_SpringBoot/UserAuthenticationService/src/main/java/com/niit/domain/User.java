package com.niit.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="godrej")
public class User {

  @Id @GeneratedValue
  private int userId;
  private String username;
  private String password;
  private String emailid;
  private long phonenumber;

  public User() {
  }

  public User(int userId, String username, String password, String emailid, long phonenumber) {
    this.userId = userId;
    this.username = username;
    this.password = password;
    this.emailid = emailid;
    this.phonenumber = phonenumber;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getEmailid() {
    return emailid;
  }

  public void setEmailid(String emailid) {
    this.emailid = emailid;
  }

  public long getPhonenumber() {
    return phonenumber;
  }

  public void setPhonenumber(long phonenumber) {
    this.phonenumber = phonenumber;
  }

  @Override
  public String toString() {
    return "User{" +
            "userId=" + userId +
            ", username='" + username + '\'' +
            ", password='" + password + '\'' +
            ", emailid='" + emailid + '\'' +
            ", phonenumber=" + phonenumber +
            '}';
  }
}
