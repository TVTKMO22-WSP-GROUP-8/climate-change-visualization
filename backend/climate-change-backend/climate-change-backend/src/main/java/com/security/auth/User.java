package com.security.auth;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    public String username;
    public String password;
    
    public User() {
    }

    public User(String uname, String pw) {
        this.username = uname;
        this.password = pw;
    }

}
 

