package com.ecommerce.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity (name = "CART")
@Table (name = "CART")
public class Cart {

    // getters and setters by Lombook
    @Getter
    @Setter

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @JsonManagedReference
    @OneToMany
    @JoinColumn(name="PRODUCT_ID")
    private List<Product> product;

    private float quantity;

    @OneToOne
    @JoinColumn(name="CART_STATUS_ID")
    private CartStatus cartStatus;

}
