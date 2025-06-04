package com.yasin.pos.pos.controller;

import com.yasin.pos.pos.dao.ProductDao;
import com.yasin.pos.pos.entity.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
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

    // get product by barcode
    @GetMapping(path = "/find-product-by-barcode")
    public ProductEntity findByProductBarcode(@RequestParam String barcode) {
        return this.productDao.findByProductBarcode(barcode);
    }

    // get product by barcode
    @GetMapping(path = "/find-product-by-id")
    public ProductEntity findByProductId(@RequestParam Integer productId) {
        return this.productDao.findByProductId(productId);
    }

    // get all products
    @GetMapping(path = "/all-products")
    public List<ProductEntity> getAllProducts() {
        return this.productDao.getAllProducts();
    }
}
