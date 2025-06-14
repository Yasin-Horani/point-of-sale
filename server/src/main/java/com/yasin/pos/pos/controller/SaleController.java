package com.yasin.pos.pos.controller;

import com.yasin.pos.pos.dao.SaleDao;
import com.yasin.pos.pos.entity.SaleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(path = "/sales")
public class SaleController {
    @Autowired
    private SaleDao saleDao;

    // get all sales
    @GetMapping(path = "/all-sales")
    public List<SaleEntity> getSales(){
       return this.saleDao.getSales();
    }
}
