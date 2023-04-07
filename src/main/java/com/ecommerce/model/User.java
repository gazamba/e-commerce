package com.ecommerce.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity (name = "user")
@Table (name = "user")
public class User {

    // getters and setters by Lombook
    @Getter
    @Setter

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "address")
    private String address;

    @Column(name = "payment_info")
    private String paymentInfo;


    public User() {
    }

    public User(String username, String email, String password, String address, String paymentInfo) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.address = address;
        this.paymentInfo = paymentInfo;
    }

}
