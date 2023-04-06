package com.ecommerce.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity (name = "REVIEW")
@Table (name = "REVIEW")
public class Review {

    // getters and setters by Lombook
    @Getter
    @Setter

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="USER_ID")
    private User user;

    @ManyToOne
    @JoinColumn(name="PRODUCT_ID")
    private Product product;

    // 1 to 5;
    private int rating;

    private String comment;


}
