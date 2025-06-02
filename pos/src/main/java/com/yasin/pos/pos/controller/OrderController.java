package com.yasin.pos.pos.controller;

import com.yasin.pos.pos.dao.OrderDao;
import com.yasin.pos.pos.dao.SaleDao;
import com.yasin.pos.pos.dto.OrderDto;
import com.yasin.pos.pos.entity.OrderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/orders")
public class OrderController {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private SaleDao saleDao;

    // save order
    @PostMapping(path = "/save-order")
    public OrderEntity saveOrder(@RequestBody List<OrderDto> order) {
        return this.saleDao.savaSale(order);
    }
}
