package com.garv.ecomm.service;

import com.garv.ecomm.model.Product;
import com.garv.ecomm.model.Category;
import com.garv.ecomm.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProducts(){return productRepository.findAll();}
}
