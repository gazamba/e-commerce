package com.ecommerce.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity (name = "shipping")
@Table (name = "shipping")
public class Shipping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn (name = "order_id")
    private Order order;

    @OneToOne
    @JoinColumn (name = "shipping_method_id")
    private ShippingMethod shippingMethod;

    @OneToOne
    @JoinColumn (name = "shipping_method_status")
    private ShippingStatus shippingStatus;

}
