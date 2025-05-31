package com.yasin.pos.pos.controller;

import com.yasin.pos.pos.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/orders")
public class OrderController {
    @Autowired
    private OrderDao orderDao;
}
