package com.yasin.pos.pos.controller;

import com.yasin.pos.pos.dao.ProductDao;
import com.yasin.pos.pos.entity.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
