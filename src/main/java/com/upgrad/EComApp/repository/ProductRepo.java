package com.upgrad.EComApp.repository;


import com.upgrad.EComApp.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("ProductRepo")
public interface ProductRepo extends JpaRepository<Product, Integer> {

    //public Product findByProductNameAndWeight(String productName,int id);
}
