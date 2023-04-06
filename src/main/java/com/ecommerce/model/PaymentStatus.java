package com.ecommerce.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity (name = "PAYMENT_STATUS")
@Table (name = "PAYMENT_STATUS")
public class PaymentStatus {

    // getters and setters by Lombook
    @Getter
    @Setter

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "NAME")
    private String name;


}
