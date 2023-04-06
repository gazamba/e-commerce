package com.ecommerce.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity (name = "ORDER")
@Table (name = "ORDER")
public class Order {

    // getters and setters by Lombook
    @Getter
    @Setter

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @JsonManagedReference
    @OneToMany
    @JoinColumn(name = "PRODUCT_ID")
    private List<Product> product;

    private int quantity;

    private float price;

    @ManyToOne
    @JoinColumn(name="ORDER_STATUS_ID")
    private OrderStatus orderStatus;


}
