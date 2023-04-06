package com.ecommerce.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity (name="CATEGORY")
@Table (name="CATEGORY")
public class Category {

    @Getter
    @Setter

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name="NAME")
    private String name;

    @Column (name="DESCRIPTION")
    private String description;

}
