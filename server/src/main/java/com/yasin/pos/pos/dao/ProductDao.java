package com.yasin.pos.pos.dao;

import com.yasin.pos.pos.entity.ProductEntity;
import com.yasin.pos.pos.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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


    // delete product by id
    public void deleteProduct(Integer productId) {
        this.productRepo.deleteById(productId);
    }

    // get product by barcode
    public ProductEntity findByProductBarcode(String barcode) {
        Optional<ProductEntity> optional = Optional.ofNullable(this.productRepo.findByProductBarcode(barcode));
        return optional.isPresent() ? optional.get() : null;
    }

    //get product by id
    public ProductEntity findByProductId(Integer productId) {
        Optional<ProductEntity> optional = this.productRepo.findById(productId);
        return optional.isPresent() ? optional.get() : null;
    }

    // get all products
    public List<ProductEntity> getAllProducts() {
        return this.productRepo.findAll();
    }

}
