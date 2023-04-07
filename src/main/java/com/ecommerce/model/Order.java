package com.ecommerce.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity (name = "order")
@Table (name = "order")
public class Order {

    // getters and setters by Lombook
    @Getter
    @Setter

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @JsonManagedReference
    @OneToMany
    @JoinColumn(name = "product_id")
    private List<Product> product;

    private int quantity;

    private float price;

    @ManyToOne
    @JoinColumn(name="order_status_id")
    private OrderStatus orderStatus;


}
