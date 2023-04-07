package com.ecommerce.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity (name = "payment")
@Table (name = "payment")
public class Payment {

    // getters and setters by Lombook
    @Getter
    @Setter

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name="ORDER_ID")
    private Order order;

    @OneToOne
    @JoinColumn(name="PAYMENT_METHOD")
    private PaymentMethod paymentMethod;

    private float amount;

    @OneToOne
    @JoinColumn(name="PAYMENT_STATUS_ID")
    private PaymentStatus paymentStatus;


}
