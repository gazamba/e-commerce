package com.ecommerce.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity (name = "USER")
@Table (name = "USER")
public class User {

    // getters and setters by Lombook
    @Getter
    @Setter

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "PAYMENT_INFO")
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
