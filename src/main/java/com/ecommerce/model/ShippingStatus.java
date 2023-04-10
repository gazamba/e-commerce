package com.ecommerce.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity (name = "shipping_status")
@Table (name = "shipping_status")
public class ShippingStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // getters and setters by Lombook

    @Column(name = "name")
    private String name;


}
