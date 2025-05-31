package com.yasin.pos.pos.dao;

import com.yasin.pos.pos.entity.ProductEntity;
import com.yasin.pos.pos.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDao {

    @Autowired
    private ProductRepo productRepo;

    public ProductEntity addProduct(ProductEntity product) {
        return this.productRepo.save(product);
    }
}
