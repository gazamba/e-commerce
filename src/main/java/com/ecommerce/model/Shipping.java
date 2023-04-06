package com.ecommerce.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity (name = "SHIPPING")
@Table (name = "SHIPPING")
public class Shipping {

    // getters and setters by Lombook
    @Getter
    @Setter

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn (name = "ORDER_ID")
    private Order order;

    @OneToOne
    @JoinColumn (name = "SHIPPING_METHOD_ID")
    private ShippingMethod shippingMethod;

    @OneToOne
    @JoinColumn (name = "SHIPPING_METHOD_STATUS")
    private ShippingStatus shippingStatus;

}
