package com.ecommerce.model;

import com.ecommerce.security.user.User;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@Entity (name = "order")
@Table (name = "order")
public class Order {

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
