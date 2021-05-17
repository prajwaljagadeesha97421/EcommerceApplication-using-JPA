package com.upgrad.EComApp.service;

import com.upgrad.EComApp.entity.Product;
import org.springframework.stereotype.Component;

@Component
public interface ProductService {

     Product getProductDetails(int productId);
     void saveProductDetails(Product product);
}
