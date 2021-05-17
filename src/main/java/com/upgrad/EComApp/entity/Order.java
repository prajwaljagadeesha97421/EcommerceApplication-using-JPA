package com.upgrad.EComApp.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity(name = "ECOM_ORDER")
public class Order {

    @Id
    private int id;
    private int amount;
    private int quantity;

    @OneToMany(mappedBy = "order")
    private List<Product> products;
    @ManyToOne
    private  User user;
}
