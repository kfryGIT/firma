package com.example.demo.user;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
public class UserF {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 45)
    private String email;//sprawdzany czy admin po email-u

    @Column(nullable = false, length = 64)
    private String password;

    public UserF(Long id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public UserF(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public UserF() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}

