package com.yasin.pos.pos.controller;

import com.yasin.pos.pos.dao.ProductDao;
import com.yasin.pos.pos.entity.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/products")
public class ProductController {
    @Autowired
    private ProductDao productDao;


    //add new product
    @PostMapping(path = "/add-product")
    public ProductEntity addProduct(@RequestBody ProductEntity product) {
        return this.productDao.addProduct(product);
    }

    //update new product
    @PostMapping(path = "/update-product")
    public ProductEntity updateProduct(@RequestBody ProductEntity product) {
        return this.productDao.updateProduct(product);
    }

    //Delete product
    @DeleteMapping(path = "/delete-product")
    public String deleteProduct(@RequestParam Integer productId) {
        this.productDao.deleteProduct(productId);
        return "Product deleted" + productId;
    }
}
