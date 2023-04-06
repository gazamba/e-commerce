package com.ecommerce.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity (name = "PRODUCT")
@Table (name = "PRODUCT")
public class Product {

    // getters and setters by Lombook
    @Getter
    @Setter

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "STOCK")
    private int stock;

    @Column(name = "PRICE")
    private float price;

    @OneToOne
    @JoinColumn(name = "CATEGORY_ID")
    Category category;


}
