package com.yasin.pos.pos.dao;


import com.yasin.pos.pos.repository.SaleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleDao {

    @Autowired
    private SaleRepo saleRepo;
}
