package com.yasin.pos.pos.dao;

import com.yasin.pos.pos.entity.ProductEntity;
import com.yasin.pos.pos.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDao {

    @Autowired
    private ProductRepo productRepo;

    // add new product
    public ProductEntity addProduct(ProductEntity product) {
        return this.productRepo.save(product);
    }

    // update new product
    public ProductEntity updateProduct(ProductEntity product) {
        if (product.getProductId() == null) {
            throw new RuntimeException("Product ID must not be null for update.");
        }
        return productRepo.save(product);
    }


    // delete product
    public void deleteProduct(Integer productId) {

        this.productRepo.deleteById(productId);
    }

}
