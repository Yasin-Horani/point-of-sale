package com.yasin.pos.pos.controller;

import com.yasin.pos.pos.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/products")
public class ProductController {
    @Autowired
    private ProductDao productDao;
}
