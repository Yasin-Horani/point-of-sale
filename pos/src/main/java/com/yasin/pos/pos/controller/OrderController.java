package com.yasin.pos.pos.controller;

import com.yasin.pos.pos.dao.OrderDao;
import com.yasin.pos.pos.dao.SaleDao;
import com.yasin.pos.pos.dto.OrderDto;
import com.yasin.pos.pos.entity.OrderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    // get all orders
    @GetMapping(path = "/all-orders")
    public List<OrderEntity> getAllOrders() {
        return this.orderDao.getAllOrders();
    }
}
