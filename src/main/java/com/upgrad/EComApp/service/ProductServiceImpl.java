package com.upgrad.EComApp.service;

import com.upgrad.EComApp.entity.Product;
import com.upgrad.EComApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    @Qualifier("ProductRepo")
    ProductRepo productRepo;

    @Override
    public Product getProductDetails(int productId) {
        Product savedProduct = productRepo.findById(productId).get();
        return  savedProduct;
    }

    @Override
    public void saveProductDetails(Product product) {
        productRepo.save(product);
    }
}
