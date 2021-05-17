package com.upgrad.EComApp.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity(name = "ECOM_USER")
public class User {
    @Id
    private int id;
    private String name;
    private String emailId;
    private String phoneNumber;
    private String address;
    @OneToMany(mappedBy = "user")
    private List<Order> orders;

}
