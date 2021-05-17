package com.upgrad.EComApp.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity(name = "ECOM_PRODUCT")
public class Product {

    @Id
    private int id;
    private String productName;
    private int price;
    private int weight;
    private int volume;
    private String category;
    @ManyToOne
    private Order order;
}
